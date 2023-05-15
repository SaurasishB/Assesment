/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.service.myBlogPosting.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;
import com.liferay.service.myBlogPosting.service.MyBolgPostingLocalService;
import com.liferay.service.myBlogPosting.service.MyBolgPostingLocalServiceUtil;
import com.liferay.service.myBlogPosting.service.persistence.MyBolgPostingPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the my bolg posting local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.service.myBlogPosting.service.impl.MyBolgPostingLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.service.myBlogPosting.service.impl.MyBolgPostingLocalServiceImpl
 * @generated
 */
public abstract class MyBolgPostingLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService, MyBolgPostingLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>MyBolgPostingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>MyBolgPostingLocalServiceUtil</code>.
	 */

	/**
	 * Adds the my bolg posting to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MyBolgPostingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param myBolgPosting the my bolg posting
	 * @return the my bolg posting that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MyBolgPosting addMyBolgPosting(MyBolgPosting myBolgPosting) {
		myBolgPosting.setNew(true);

		return myBolgPostingPersistence.update(myBolgPosting);
	}

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	@Override
	@Transactional(enabled = false)
	public MyBolgPosting createMyBolgPosting(long myBlogPostingId) {
		return myBolgPostingPersistence.create(myBlogPostingId);
	}

	/**
	 * Deletes the my bolg posting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MyBolgPostingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting that was removed
	 * @throws PortalException if a my bolg posting with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MyBolgPosting deleteMyBolgPosting(long myBlogPostingId)
		throws PortalException {

		return myBolgPostingPersistence.remove(myBlogPostingId);
	}

	/**
	 * Deletes the my bolg posting from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MyBolgPostingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param myBolgPosting the my bolg posting
	 * @return the my bolg posting that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public MyBolgPosting deleteMyBolgPosting(MyBolgPosting myBolgPosting) {
		return myBolgPostingPersistence.remove(myBolgPosting);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return myBolgPostingPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			MyBolgPosting.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return myBolgPostingPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.service.myBlogPosting.model.impl.MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return myBolgPostingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.service.myBlogPosting.model.impl.MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return myBolgPostingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return myBolgPostingPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return myBolgPostingPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public MyBolgPosting fetchMyBolgPosting(long myBlogPostingId) {
		return myBolgPostingPersistence.fetchByPrimaryKey(myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting matching the UUID and group.
	 *
	 * @param uuid the my bolg posting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchMyBolgPostingByUuidAndGroupId(
		String uuid, long groupId) {

		return myBolgPostingPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the my bolg posting with the primary key.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws PortalException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting getMyBolgPosting(long myBlogPostingId)
		throws PortalException {

		return myBolgPostingPersistence.findByPrimaryKey(myBlogPostingId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(myBolgPostingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MyBolgPosting.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("myBlogPostingId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			myBolgPostingLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(MyBolgPosting.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"myBlogPostingId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(myBolgPostingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(MyBolgPosting.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("myBlogPostingId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<MyBolgPosting>() {

				@Override
				public void performAction(MyBolgPosting myBolgPosting)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, myBolgPosting);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(MyBolgPosting.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return myBolgPostingPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement MyBolgPostingLocalServiceImpl#deleteMyBolgPosting(MyBolgPosting) to avoid orphaned data");
		}

		return myBolgPostingLocalService.deleteMyBolgPosting(
			(MyBolgPosting)persistedModel);
	}

	@Override
	public BasePersistence<MyBolgPosting> getBasePersistence() {
		return myBolgPostingPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return myBolgPostingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the my bolg postings matching the UUID and company.
	 *
	 * @param uuid the UUID of the my bolg postings
	 * @param companyId the primary key of the company
	 * @return the matching my bolg postings, or an empty list if no matches were found
	 */
	@Override
	public List<MyBolgPosting> getMyBolgPostingsByUuidAndCompanyId(
		String uuid, long companyId) {

		return myBolgPostingPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of my bolg postings matching the UUID and company.
	 *
	 * @param uuid the UUID of the my bolg postings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching my bolg postings, or an empty list if no matches were found
	 */
	@Override
	public List<MyBolgPosting> getMyBolgPostingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return myBolgPostingPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the my bolg posting matching the UUID and group.
	 *
	 * @param uuid the my bolg posting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching my bolg posting
	 * @throws PortalException if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting getMyBolgPostingByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return myBolgPostingPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the my bolg postings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.service.myBlogPosting.model.impl.MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @return the range of my bolg postings
	 */
	@Override
	public List<MyBolgPosting> getMyBolgPostings(int start, int end) {
		return myBolgPostingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	@Override
	public int getMyBolgPostingsCount() {
		return myBolgPostingPersistence.countAll();
	}

	/**
	 * Updates the my bolg posting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MyBolgPostingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param myBolgPosting the my bolg posting
	 * @return the my bolg posting that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public MyBolgPosting updateMyBolgPosting(MyBolgPosting myBolgPosting) {
		return myBolgPostingPersistence.update(myBolgPosting);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			MyBolgPostingLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		myBolgPostingLocalService = (MyBolgPostingLocalService)aopProxy;

		_setLocalServiceUtilService(myBolgPostingLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return MyBolgPostingLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return MyBolgPosting.class;
	}

	protected String getModelClassName() {
		return MyBolgPosting.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = myBolgPostingPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		MyBolgPostingLocalService myBolgPostingLocalService) {

		try {
			Field field = MyBolgPostingLocalServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, myBolgPostingLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	protected MyBolgPostingLocalService myBolgPostingLocalService;

	@Reference
	protected MyBolgPostingPersistence myBolgPostingPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		MyBolgPostingLocalServiceBaseImpl.class);

}