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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MyBolgPostingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPostingLocalService
 * @generated
 */
public class MyBolgPostingLocalServiceWrapper
	implements MyBolgPostingLocalService,
			   ServiceWrapper<MyBolgPostingLocalService> {

	public MyBolgPostingLocalServiceWrapper() {
		this(null);
	}

	public MyBolgPostingLocalServiceWrapper(
		MyBolgPostingLocalService myBolgPostingLocalService) {

		_myBolgPostingLocalService = myBolgPostingLocalService;
	}

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
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		addMyBolgPosting(
			com.liferay.service.myBlogPosting.model.MyBolgPosting
				myBolgPosting) {

		return _myBolgPostingLocalService.addMyBolgPosting(myBolgPosting);
	}

	@Override
	public void addOrUpdateMyBolgPosting(
		long groupId, long companyId, long userId, String userName,
		String heading, String description, long myBlogPostingId) {

		_myBolgPostingLocalService.addOrUpdateMyBolgPosting(
			groupId, companyId, userId, userName, heading, description,
			myBlogPostingId);
	}

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		createMyBolgPosting(long myBlogPostingId) {

		return _myBolgPostingLocalService.createMyBolgPosting(myBlogPostingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
			deleteMyBolgPosting(long myBlogPostingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.deleteMyBolgPosting(myBlogPostingId);
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
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		deleteMyBolgPosting(
			com.liferay.service.myBlogPosting.model.MyBolgPosting
				myBolgPosting) {

		return _myBolgPostingLocalService.deleteMyBolgPosting(myBolgPosting);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _myBolgPostingLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _myBolgPostingLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _myBolgPostingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _myBolgPostingLocalService.dynamicQuery(dynamicQuery);
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _myBolgPostingLocalService.dynamicQuery(
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
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _myBolgPostingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _myBolgPostingLocalService.dynamicQueryCount(dynamicQuery);
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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _myBolgPostingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		fetchMyBolgPosting(long myBlogPostingId) {

		return _myBolgPostingLocalService.fetchMyBolgPosting(myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting matching the UUID and group.
	 *
	 * @param uuid the my bolg posting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		fetchMyBolgPostingByUuidAndGroupId(String uuid, long groupId) {

		return _myBolgPostingLocalService.fetchMyBolgPostingByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _myBolgPostingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _myBolgPostingLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _myBolgPostingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the my bolg posting with the primary key.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws PortalException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
			getMyBolgPosting(long myBlogPostingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.getMyBolgPosting(myBlogPostingId);
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
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
			getMyBolgPostingByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.getMyBolgPostingByUuidAndGroupId(
			uuid, groupId);
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
	public java.util.List<com.liferay.service.myBlogPosting.model.MyBolgPosting>
		getMyBolgPostings(int start, int end) {

		return _myBolgPostingLocalService.getMyBolgPostings(start, end);
	}

	/**
	 * Returns all the my bolg postings matching the UUID and company.
	 *
	 * @param uuid the UUID of the my bolg postings
	 * @param companyId the primary key of the company
	 * @return the matching my bolg postings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.service.myBlogPosting.model.MyBolgPosting>
		getMyBolgPostingsByUuidAndCompanyId(String uuid, long companyId) {

		return _myBolgPostingLocalService.getMyBolgPostingsByUuidAndCompanyId(
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
	@Override
	public java.util.List<com.liferay.service.myBlogPosting.model.MyBolgPosting>
		getMyBolgPostingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.service.myBlogPosting.model.MyBolgPosting>
					orderByComparator) {

		return _myBolgPostingLocalService.getMyBolgPostingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	@Override
	public int getMyBolgPostingsCount() {
		return _myBolgPostingLocalService.getMyBolgPostingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _myBolgPostingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _myBolgPostingLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.liferay.service.myBlogPosting.model.MyBolgPosting
		updateMyBolgPosting(
			com.liferay.service.myBlogPosting.model.MyBolgPosting
				myBolgPosting) {

		return _myBolgPostingLocalService.updateMyBolgPosting(myBolgPosting);
	}

	@Override
	public MyBolgPostingLocalService getWrappedService() {
		return _myBolgPostingLocalService;
	}

	@Override
	public void setWrappedService(
		MyBolgPostingLocalService myBolgPostingLocalService) {

		_myBolgPostingLocalService = myBolgPostingLocalService;
	}

	private MyBolgPostingLocalService _myBolgPostingLocalService;

}