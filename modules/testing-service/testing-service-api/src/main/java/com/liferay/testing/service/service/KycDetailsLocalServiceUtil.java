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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.testing.service.model.KycDetails;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for KycDetails. This utility wraps
 * <code>com.liferay.testing.service.service.impl.KycDetailsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see KycDetailsLocalService
 * @generated
 */
public class KycDetailsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.testing.service.service.impl.KycDetailsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static KycDetails addKycDetails(KycDetails kycDetails) {
		return getService().addKycDetails(kycDetails);
	}

	public static KycDetails addKycDetails(
		long groupId, long companyId, long userId, String userName,
		String address, String panNumber, String gstnNumber,
		String typeOfBusiness, long addressProofId, long panProofId,
		long gstnProofId, long typeOfBusinessId) {

		return getService().addKycDetails(
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
	public static KycDetails createKycDetails(long kycDetailId) {
		return getService().createKycDetails(kycDetailId);
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
	 * Deletes the kyc details from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetails the kyc details
	 * @return the kyc details that was removed
	 */
	public static KycDetails deleteKycDetails(KycDetails kycDetails) {
		return getService().deleteKycDetails(kycDetails);
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
	public static KycDetails deleteKycDetails(long kycDetailId)
		throws PortalException {

		return getService().deleteKycDetails(kycDetailId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testing.service.model.impl.KycDetailsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.testing.service.model.impl.KycDetailsModelImpl</code>.
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

	public static KycDetails fetchKycDetails(long kycDetailId) {
		return getService().fetchKycDetails(kycDetailId);
	}

	/**
	 * Returns the kyc details matching the UUID and group.
	 *
	 * @param uuid the kyc details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchKycDetailsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchKycDetailsByUuidAndGroupId(uuid, groupId);
	}

	public static List<KycDetails> findByUserId(long userId) {
		return getService().findByUserId(userId);
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
	 * Returns the kyc details with the primary key.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details
	 * @throws PortalException if a kyc details with the primary key could not be found
	 */
	public static KycDetails getKycDetails(long kycDetailId)
		throws PortalException {

		return getService().getKycDetails(kycDetailId);
	}

	/**
	 * Returns the kyc details matching the UUID and group.
	 *
	 * @param uuid the kyc details's UUID
	 * @param groupId the primary key of the group
	 * @return the matching kyc details
	 * @throws PortalException if a matching kyc details could not be found
	 */
	public static KycDetails getKycDetailsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getKycDetailsByUuidAndGroupId(uuid, groupId);
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
	public static List<KycDetails> getKycDetailses(int start, int end) {
		return getService().getKycDetailses(start, end);
	}

	/**
	 * Returns all the kyc detailses matching the UUID and company.
	 *
	 * @param uuid the UUID of the kyc detailses
	 * @param companyId the primary key of the company
	 * @return the matching kyc detailses, or an empty list if no matches were found
	 */
	public static List<KycDetails> getKycDetailsesByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getKycDetailsesByUuidAndCompanyId(uuid, companyId);
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
	public static List<KycDetails> getKycDetailsesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<KycDetails> orderByComparator) {

		return getService().getKycDetailsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of kyc detailses.
	 *
	 * @return the number of kyc detailses
	 */
	public static int getKycDetailsesCount() {
		return getService().getKycDetailsesCount();
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
	 * Updates the kyc details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect KycDetailsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param kycDetails the kyc details
	 * @return the kyc details that was updated
	 */
	public static KycDetails updateKycDetails(KycDetails kycDetails) {
		return getService().updateKycDetails(kycDetails);
	}

	public static KycDetails updateKycDetails(
		long kycDetailId, long groupId, long companyId, long userId,
		String userName, String address, String panNumber, String gstnNumber,
		String typeOfBusiness, long addressProofId, long panProofId,
		long gstnProofId, long typeOfBusinessId) {

		return getService().updateKycDetails(
			kycDetailId, groupId, companyId, userId, userName, address,
			panNumber, gstnNumber, typeOfBusiness, addressProofId, panProofId,
			gstnProofId, typeOfBusinessId);
	}

	public static KycDetailsLocalService getService() {
		return _service;
	}

	private static volatile KycDetailsLocalService _service;

}