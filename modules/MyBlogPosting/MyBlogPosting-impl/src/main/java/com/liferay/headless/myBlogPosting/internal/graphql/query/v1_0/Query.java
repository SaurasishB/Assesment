package com.liferay.headless.myBlogPosting.internal.graphql.query.v1_0;

import com.liferay.headless.myBlogPosting.dto.v1_0.MyBlogPosting;
import com.liferay.headless.myBlogPosting.resource.v1_0.MyBlogPostingResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.pagination.Page;

import java.util.Map;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Query {

	public static void setMyBlogPostingResourceComponentServiceObjects(
		ComponentServiceObjects<MyBlogPostingResource>
			myBlogPostingResourceComponentServiceObjects) {

		_myBlogPostingResourceComponentServiceObjects =
			myBlogPostingResourceComponentServiceObjects;
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {allMyBlogPost{items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Gets a list of BlogPost")
	public MyBlogPostingPage allMyBlogPost() throws Exception {
		return _applyComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource -> new MyBlogPostingPage(
				myBlogPostingResource.getAllMyBlogPost()));
	}

	/**
	 * Invoke this method with the command line:
	 *
	 * curl -H 'Content-Type: text/plain; charset=utf-8' -X 'POST' 'http://localhost:8080/o/graphql' -d $'{"query": "query {myBlogPost(myBlogPostingId: ___){items {__}, page, pageSize, totalCount}}"}' -u 'test@liferay.com:test'
	 */
	@GraphQLField(description = "Gets a list of BlogPost")
	public MyBlogPostingPage myBlogPost(
			@GraphQLName("myBlogPostingId") Long myBlogPostingId)
		throws Exception {

		return _applyComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource -> new MyBlogPostingPage(
				myBlogPostingResource.getMyBlogPost(myBlogPostingId)));
	}

	@GraphQLName("MyBlogPostingPage")
	public class MyBlogPostingPage {

		public MyBlogPostingPage(Page myBlogPostingPage) {
			actions = myBlogPostingPage.getActions();

			items = myBlogPostingPage.getItems();
			lastPage = myBlogPostingPage.getLastPage();
			page = myBlogPostingPage.getPage();
			pageSize = myBlogPostingPage.getPageSize();
			totalCount = myBlogPostingPage.getTotalCount();
		}

		@GraphQLField
		protected Map<String, Map> actions;

		@GraphQLField
		protected java.util.Collection<MyBlogPosting> items;

		@GraphQLField
		protected long lastPage;

		@GraphQLField
		protected long page;

		@GraphQLField
		protected long pageSize;

		@GraphQLField
		protected long totalCount;

	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			MyBlogPostingResource myBlogPostingResource)
		throws Exception {

		myBlogPostingResource.setContextAcceptLanguage(_acceptLanguage);
		myBlogPostingResource.setContextCompany(_company);
		myBlogPostingResource.setContextHttpServletRequest(_httpServletRequest);
		myBlogPostingResource.setContextHttpServletResponse(
			_httpServletResponse);
		myBlogPostingResource.setContextUriInfo(_uriInfo);
		myBlogPostingResource.setContextUser(_user);
		myBlogPostingResource.setGroupLocalService(_groupLocalService);
		myBlogPostingResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<MyBlogPostingResource>
		_myBlogPostingResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private BiFunction<Object, String, Filter> _filterBiFunction;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}