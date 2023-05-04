package com.liferay.headless.myBlogPosting.internal.graphql.mutation.v1_0;

import com.liferay.headless.myBlogPosting.dto.v1_0.MyBlogPosting;
import com.liferay.headless.myBlogPosting.resource.v1_0.MyBlogPostingResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.batch.engine.resource.VulcanBatchEngineImportTaskResource;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setMyBlogPostingResourceComponentServiceObjects(
		ComponentServiceObjects<MyBlogPostingResource>
			myBlogPostingResourceComponentServiceObjects) {

		_myBlogPostingResourceComponentServiceObjects =
			myBlogPostingResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Creates a new BlogPost")
	public MyBlogPosting createMyBlogPost(
			@GraphQLName("myBlogPosting") MyBlogPosting myBlogPosting)
		throws Exception {

		return _applyComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource -> myBlogPostingResource.postMyBlogPost(
				myBlogPosting));
	}

	@GraphQLField
	public boolean deleteMyBlogPosting(
			@GraphQLName("myBlogPostingId") Long myBlogPostingId)
		throws Exception {

		_applyVoidComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource -> myBlogPostingResource.deleteMyBlogPosting(
				myBlogPostingId));

		return true;
	}

	@GraphQLField
	public Response deleteMyBlogPostingBatch(
			@GraphQLName("callbackURL") String callbackURL,
			@GraphQLName("object") Object object)
		throws Exception {

		return _applyComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource ->
				myBlogPostingResource.deleteMyBlogPostingBatch(
					callbackURL, object));
	}

	@GraphQLField
	public MyBlogPosting updateMyBlogPosting(
			@GraphQLName("myBlogPostingId") Long myBlogPostingId,
			@GraphQLName("myBlogPosting") MyBlogPosting myBlogPosting)
		throws Exception {

		return _applyComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects,
			this::_populateResourceContext,
			myBlogPostingResource -> myBlogPostingResource.updateMyBlogPosting(
				myBlogPostingId, myBlogPosting));
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

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
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

		myBlogPostingResource.setVulcanBatchEngineImportTaskResource(
			_vulcanBatchEngineImportTaskResource);
	}

	private static ComponentServiceObjects<MyBlogPostingResource>
		_myBlogPostingResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;
	private VulcanBatchEngineImportTaskResource
		_vulcanBatchEngineImportTaskResource;

}