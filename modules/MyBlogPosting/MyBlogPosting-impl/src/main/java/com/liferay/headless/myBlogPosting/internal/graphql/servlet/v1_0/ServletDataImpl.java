package com.liferay.headless.myBlogPosting.internal.graphql.servlet.v1_0;

import com.liferay.headless.myBlogPosting.internal.graphql.mutation.v1_0.Mutation;
import com.liferay.headless.myBlogPosting.internal.graphql.query.v1_0.Query;
import com.liferay.headless.myBlogPosting.internal.resource.v1_0.MyBlogPostingResourceImpl;
import com.liferay.headless.myBlogPosting.resource.v1_0.MyBlogPostingResource;
import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author me
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.setMyBlogPostingResourceComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects);

		Query.setMyBlogPostingResourceComponentServiceObjects(
			_myBlogPostingResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "MyBlogPosting";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/MyBlogPosting-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#createMyBlogPost",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class, "postMyBlogPost"));
					put(
						"mutation#deleteMyBlogPosting",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class,
							"deleteMyBlogPosting"));
					put(
						"mutation#deleteMyBlogPostingBatch",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class,
							"deleteMyBlogPostingBatch"));
					put(
						"mutation#updateMyBlogPosting",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class,
							"updateMyBlogPosting"));

					put(
						"query#allMyBlogPost",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class,
							"getAllMyBlogPost"));
					put(
						"query#myBlogPost",
						new ObjectValuePair<>(
							MyBlogPostingResourceImpl.class, "getMyBlogPost"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<MyBlogPostingResource>
		_myBlogPostingResourceComponentServiceObjects;

}