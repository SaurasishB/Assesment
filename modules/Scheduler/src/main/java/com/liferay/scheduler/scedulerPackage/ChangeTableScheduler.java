package com.liferay.scheduler.scedulerPackage;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryLocalServiceUtil;
import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.SchedulerEntryImpl;
import com.liferay.portal.kernel.scheduler.SchedulerException;
import com.liferay.portal.kernel.scheduler.StorageType;
import com.liferay.portal.kernel.scheduler.StorageTypeAware;
import com.liferay.portal.kernel.scheduler.Trigger;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.service.myBlogPosting.service.MyBolgPostingLocalServiceUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

@Component(
		  immediate = true, property = {"cron.expression=0 */5 * ? * *"},
		  service = ChangeTableScheduler.class
		)

public class ChangeTableScheduler extends BaseMessageListener {
	
	private List<BlogsEntry> blogEntries = new ArrayList<>();

	@Override
	protected void doReceive(Message message) throws Exception {
		
		System.out.println("start coping!!!!!");
		// TODO Auto-generated method stub
		for(BlogsEntry blogsEntry : blogEntries) {
			MyBolgPostingLocalServiceUtil.addOrUpdateMyBolgPosting(blogsEntry.getGroupId(), blogsEntry.getCompanyId(), blogsEntry.getUserId(), blogsEntry.getUserName(), blogsEntry.getTitle(), blogsEntry.getDescription(), blogsEntry.getEntryId());
		}
	}
	
	  @Activate
	  @Modified
	  protected void activate(Map<String,Object> properties) throws SchedulerException {
		
		  blogEntries = BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());

		  String cronExpressioncustomer = GetterUtil.getString(properties.get("cron.expression"),_DEFAULT_CRON_EXPRESSION);

			// create a new trigger definition for the jobs.
			//create a trigger for saleshierarchy job
			
			String listenerClass = getClass().getName();
		
			Trigger jobTrigger = _triggerFactory.createTrigger(listenerClass, listenerClass, new Date(), null,
					cronExpressioncustomer);
			
			_schedulerEntryImpl = new SchedulerEntryImpl(listenerClass, jobTrigger);
			// if we were initialized (i.e. if this is called due to CA modification)
			if (_initialized) {
				// first deactivate the current job before we schedule.
				deactivate();
			
			}

			// register the scheduled task
			_schedulerEngineHelper.register(this, _schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
		
			// set the initialized flag.
			_initialized = true;
		}
		/**
		 * deactivate: Called when OSGi is deactivating the component.
		 */
		@Deactivate
		protected void deactivate() {
			if (_initialized) {
				// unregister this listener
				_schedulerEngineHelper.unregister(this);
	          

			}

			// clear the initialized flag
			_initialized = false;
		}

		/**
		 * getStorageType: Utility method to get the storage type from the scheduler
		 * entry wrapper.
		 * 
		 * @return StorageType The storage type to use.
		 */
		protected StorageType getStorageType() {
			if (_schedulerEntryImpl instanceof StorageTypeAware) {
				return ((StorageTypeAware) _schedulerEntryImpl).getStorageType();
			}

			return StorageType.MEMORY_CLUSTERED;
		}

		/**
		 * setModuleServiceLifecycle: So this requires some explanation...
		 * 
		 * OSGi will start a component once all of it's dependencies are satisfied.
		 * However, there are times where you want to hold off until the portal is
		 * completely ready to go.
		 * 
		 * This reference declaration is waiting for the ModuleServiceLifecycle's
		 * PORTAL_INITIALIZED component which will not be available until, surprise
		 * surprise, the portal has finished initializing.
		 * 
		 * With this reference, this component activation waits until portal
		 * initialization has completed.
		 * 
		 * @param moduleServiceLifecycle
		 */
		@Reference(target = ModuleServiceLifecycle.SYSTEM_CHECK, unbind = "-")
		protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
		}
		
		@Reference(unbind = "-")
		protected void setTriggerFactory(TriggerFactory triggerFactory) {
			_triggerFactory = triggerFactory;
		}

		@Reference(unbind = "-")
		protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {
			_schedulerEngineHelper = schedulerEngineHelper;
		}
		// the default cron expression is to run daily at midnight
			private static final String _DEFAULT_CRON_EXPRESSION = "0 */5 * ? * *";

			private volatile boolean _initialized;
			private TriggerFactory _triggerFactory;
			private SchedulerEngineHelper _schedulerEngineHelper;
			private SchedulerEntryImpl _schedulerEntryImpl;
}
