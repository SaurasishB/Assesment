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

package com.liferay.service.myBlogPosting.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MyBolgPosting. This utility wraps
 * <code>com.liferay.service.myBlogPosting.service.impl.MyBolgPostingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPostingLocalService
 * @generated
 */
public class MyBolgPostingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.service.myBlogPosting.service.impl.MyBolgPostingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
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
	public static MyBolgPosting addMyBolgPosting(MyBolgPosting myBolgPosting) {
		return getService().addMyBolgPosting(myBolgPosting);
	}

	public static void addOrUpdateMyBolgPosting(
		long groupId, long companyId, long userId, String userName,
		String heading, String description, long myBlogPostingId) {

		getService().addOrUpdateMyBolgPosting(
			groupId, companyId, userId, userName, heading, description,
			myBlogPostingId);
	}

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	public static MyBolgPosting createMyBolgPosting(long myBlogPostingId) {
		return getService().createMyBolgPosting(myBlogPostingId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static MyBolgPosting deleteMyBolgPosting(long myBlogPostingId)
		throws PortalException {

		return getService().deleteMyBolgPosting(myBlogPostingId);
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
	public static MyBolgPosting deleteMyBolgPosting(
		MyBolgPosting myBolgPosting) {

		return getService().deleteMyBolgPosting(myBolgPosting);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MyBolgPosting fetchMyBolgPosting(long myBlogPostingId) {
		return getService().fetchMyBolgPosting(myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting matching the UUID and group.
	 *
	 * @param uuid the my bolg posting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchMyBolgPostingByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMyBolgPostingByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the my bolg posting with the primary key.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws PortalException if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting getMyBolgPosting(long myBlogPostingId)
		throws PortalException {

		return getService().getMyBolgPosting(myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting matching the UUID and group.
	 *
	 * @param uuid the my bolg posting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching my bolg posting
	 * @throws PortalException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting getMyBolgPostingByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMyBolgPostingByUuidAndGroupId(uuid, groupId);
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
	public static List<MyBolgPosting> getMyBolgPostings(int start, int end) {
		return getService().getMyBolgPostings(start, end);
	}

	/**
	 * Returns all the my bolg postings matching the UUID and company.
	 *
	 * @param uuid the UUID of the my bolg postings
	 * @param companyId the primary key of the company
	 * @return the matching my bolg postings, or an empty list if no matches were found
	 */
	public static List<MyBolgPosting> getMyBolgPostingsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMyBolgPostingsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<MyBolgPosting> getMyBolgPostingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getService().getMyBolgPostingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	public static int getMyBolgPostingsCount() {
		return getService().getMyBolgPostingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static MyBolgPosting updateMyBolgPosting(
		MyBolgPosting myBolgPosting) {

		return getService().updateMyBolgPosting(myBolgPosting);
	}

	public static MyBolgPostingLocalService getService() {
		return _service;
	}

	private static volatile MyBolgPostingLocalService _service;

}