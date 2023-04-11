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

package com.liferay.testing.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KycDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see KycDetailsLocalService
 * @generated
 */
public class KycDetailsLocalServiceWrapper
	implements KycDetailsLocalService, ServiceWrapper<KycDetailsLocalService> {

	public KycDetailsLocalServiceWrapper() {
		this(null);
	}

	public KycDetailsLocalServiceWrapper(
		KycDetailsLocalService kycDetailsLocalService) {

		_kycDetailsLocalService = kycDetailsLocalService;
	}

	/**
	 * Adds the kyc details to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetails the kyc details
	 * @return the kyc details that was added
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails addKycDetails(
		com.liferay.testing.service.model.KycDetails kycDetails) {

		return _kycDetailsLocalService.addKycDetails(kycDetails);
	}

	@Override
	public com.liferay.testing.service.model.KycDetails addKycDetails(
		long groupId, long companyId, long userId, String userName,
		String address, String panNumber, String gstnNumber,
		String typeOfBusiness, long addressProofId, long panProofId,
		long gstnProofId, long typeOfBusinessId) {

		return _kycDetailsLocalService.addKycDetails(
			groupId, companyId, userId, userName, address, panNumber,
			gstnNumber, typeOfBusiness, addressProofId, panProofId, gstnProofId,
			typeOfBusinessId);
	}

	/**
	 * Creates a new kyc details with the primary key. Does not add the kyc details to the database.
	 *
	 * @param kycDetailId the primary key for the new kyc details
	 * @return the new kyc details
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails createKycDetails(
		long kycDetailId) {

		return _kycDetailsLocalService.createKycDetails(kycDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the kyc details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetails the kyc details
	 * @return the kyc details that was removed
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails deleteKycDetails(
		com.liferay.testing.service.model.KycDetails kycDetails) {

		return _kycDetailsLocalService.deleteKycDetails(kycDetails);
	}

	/**
	 * Deletes the kyc details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details that was removed
	 * @throws PortalException if a kyc details with the primary key could not be found
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails deleteKycDetails(
			long kycDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.deleteKycDetails(kycDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _kycDetailsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _kycDetailsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _kycDetailsLocalService.dynamicQuery();
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

		return _kycDetailsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testing.service.model.impl.KycDetailsModelImpl</code>.
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

		return _kycDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testing.service.model.impl.KycDetailsModelImpl</code>.
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

		return _kycDetailsLocalService.dynamicQuery(
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

		return _kycDetailsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _kycDetailsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.liferay.testing.service.model.KycDetails fetchKycDetails(
		long kycDetailId) {

		return _kycDetailsLocalService.fetchKycDetails(kycDetailId);
	}

	/**
	 * Returns the kyc details matching the UUID and group.
	 *
	 * @param uuid the kyc details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails
		fetchKycDetailsByUuidAndGroupId(String uuid, long groupId) {

		return _kycDetailsLocalService.fetchKycDetailsByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<com.liferay.testing.service.model.KycDetails>
		findByUserId(long userId) {

		return _kycDetailsLocalService.findByUserId(userId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _kycDetailsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _kycDetailsLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _kycDetailsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the kyc details with the primary key.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details
	 * @throws PortalException if a kyc details with the primary key could not be found
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails getKycDetails(
			long kycDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.getKycDetails(kycDetailId);
	}

	/**
	 * Returns the kyc details matching the UUID and group.
	 *
	 * @param uuid the kyc details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching kyc details
	 * @throws PortalException if a matching kyc details could not be found
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails
			getKycDetailsByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.getKycDetailsByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the kyc detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testing.service.model.impl.KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @return the range of kyc detailses
	 */
	@Override
	public java.util.List<com.liferay.testing.service.model.KycDetails>
		getKycDetailses(int start, int end) {

		return _kycDetailsLocalService.getKycDetailses(start, end);
	}

	/**
	 * Returns all the kyc detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the kyc detailses
	 * @param companyId the primary key of the company
	 * @return the matching kyc detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.testing.service.model.KycDetails>
		getKycDetailsesByUuidAndCompanyId(String uuid, long companyId) {

		return _kycDetailsLocalService.getKycDetailsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of kyc detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the kyc detailses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching kyc detailses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.testing.service.model.KycDetails>
		getKycDetailsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.testing.service.model.KycDetails>
					orderByComparator) {

		return _kycDetailsLocalService.getKycDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of kyc detailses.
	 *
	 * @return the number of kyc detailses
	 */
	@Override
	public int getKycDetailsesCount() {
		return _kycDetailsLocalService.getKycDetailsesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _kycDetailsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _kycDetailsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the kyc details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetails the kyc details
	 * @return the kyc details that was updated
	 */
	@Override
	public com.liferay.testing.service.model.KycDetails updateKycDetails(
		com.liferay.testing.service.model.KycDetails kycDetails) {

		return _kycDetailsLocalService.updateKycDetails(kycDetails);
	}

	@Override
	public com.liferay.testing.service.model.KycDetails updateKycDetails(
		long kycDetailId, long groupId, long companyId, long userId,
		String userName, String address, String panNumber, String gstnNumber,
		String typeOfBusiness, long addressProofId, long panProofId,
		long gstnProofId, long typeOfBusinessId) {

		return _kycDetailsLocalService.updateKycDetails(
			kycDetailId, groupId, companyId, userId, userName, address,
			panNumber, gstnNumber, typeOfBusiness, addressProofId, panProofId,
			gstnProofId, typeOfBusinessId);
	}

	@Override
	public KycDetailsLocalService getWrappedService() {
		return _kycDetailsLocalService;
	}

	@Override
	public void setWrappedService(
		KycDetailsLocalService kycDetailsLocalService) {

		_kycDetailsLocalService = kycDetailsLocalService;
	}

	private KycDetailsLocalService _kycDetailsLocalService;

}