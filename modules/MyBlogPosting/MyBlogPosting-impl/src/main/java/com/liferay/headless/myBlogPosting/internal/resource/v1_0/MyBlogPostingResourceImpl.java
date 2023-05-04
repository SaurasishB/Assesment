package com.liferay.headless.myBlogPosting.internal.resource.v1_0;

import com.liferay.blogs.model.BlogsEntry;
import com.liferay.blogs.service.BlogsEntryLocalServiceUtil;
import com.liferay.blogs.service.BlogsEntryServiceUtil;
import com.liferay.blogs.service.persistence.BlogsEntryUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.headless.myBlogPosting.dto.v1_0.MyBlogPosting;
import com.liferay.headless.myBlogPosting.resource.v1_0.MyBlogPostingResource;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author me
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/my-blog-posting.properties",
	scope = ServiceScope.PROTOTYPE, service = MyBlogPostingResource.class
)
public class MyBlogPostingResourceImpl extends BaseMyBlogPostingResourceImpl {
	
	@Override
	public MyBlogPosting postMyBlogPost(MyBlogPosting body){
		try {
			System.out.println("post");
		long entryId = CounterLocalServiceUtil.increment();
		BlogsEntry blogsEntry =BlogsEntryUtil.create(entryId);
		ServiceContext scontext = new ServiceContext();

		scontext.setScopeGroupId(20121L);
		//BlogsEntryLocalServiceUtil.addBlogsEntry(blogsEntry);

		BlogsEntryServiceUtil.addEntry(	body.getTitle(), body.getTitle(), body.getBody(), "this is content", new Date().getMonth(),	new Date().getDay(), new Date().getYear(), new Date().getHours(), new Date().getMinutes(),	true, false, new String [0] , null,
				null, null, scontext);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return body;
	}
	
	@Override
	public Page<MyBlogPosting> getAllMyBlogPost(){
		List<MyBlogPosting> myBlogPostings = new ArrayList<>();
		try {
			System.out.println("get all");
			List<BlogsEntry> blogsEntries = BlogsEntryLocalServiceUtil.getBlogsEntries(0, BlogsEntryLocalServiceUtil.getBlogsEntriesCount());
			for(BlogsEntry blogEntry : blogsEntries) {
				MyBlogPosting myBlogPosting = new MyBlogPosting();
				myBlogPosting.setBody(blogEntry.getDescription());
				myBlogPosting.setTitle(blogEntry.getTitle());
				myBlogPosting.setId(blogEntry.getEntryId());
				myBlogPostings.add(myBlogPosting);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		Page<MyBlogPosting> ans = Page.of(myBlogPostings);
		return ans;
	}
	
	@Override
	public void deleteMyBlogPosting(Long myBlogPostingId) {
		try {
			System.out.println("delete");
//			BlogsEntryLocalServiceUtil.deleteBlogsEntry(myBlogPostingId);
			BlogsEntryServiceUtil.deleteEntry(myBlogPostingId);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Page<MyBlogPosting> getMyBlogPost(Long myBlogPostingId){
		List<MyBlogPosting> myBlogPostings = new ArrayList<>();
		try {
			System.out.println("get by id");
//			BlogsEntry blogsEntry = BlogsEntryLocalServiceUtil.getBlogsEntry(myBlogPostingId);
			BlogsEntry blogsEntry = BlogsEntryServiceUtil.getEntry(myBlogPostingId);
				MyBlogPosting myBlogPosting = new MyBlogPosting();
				myBlogPosting.setBody(blogsEntry.getDescription());
				myBlogPosting.setTitle(blogsEntry.getTitle());
				myBlogPosting.setId(blogsEntry.getEntryId());
				myBlogPostings.add(myBlogPosting);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		Page<MyBlogPosting> ans = Page.of(myBlogPostings);
		return ans;
	}
	
	@Override
	public MyBlogPosting updateMyBlogPosting(Long myBlogPostingId,	MyBlogPosting myBlogPosting) {
		try {
			System.out.println("update");
			ServiceContext scontext = new ServiceContext();
			scontext.setScopeGroupId(20121L);
			BlogsEntryServiceUtil.updateEntry(myBlogPostingId, myBlogPosting.getTitle(), myBlogPosting.getTitle(), myBlogPosting.getBody(), "this is updated content", new Date().getMonth(),	new Date().getDay(), new Date().getYear(), new Date().getHours(), new Date().getMinutes(),	true, false, new String [0] , null,
				null, null, scontext);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return myBlogPosting;
	}
	
}