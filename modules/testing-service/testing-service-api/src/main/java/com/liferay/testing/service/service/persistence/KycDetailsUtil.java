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

package com.liferay.testing.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.testing.service.model.KycDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the kyc details service. This utility wraps <code>com.liferay.testing.service.service.persistence.impl.KycDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KycDetailsPersistence
 * @generated
 */
public class KycDetailsUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(KycDetails kycDetails) {
		getPersistence().clearCache(kycDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, KycDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KycDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KycDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KycDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static KycDetails update(KycDetails kycDetails) {
		return getPersistence().update(kycDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static KycDetails update(
		KycDetails kycDetails, ServiceContext serviceContext) {

		return getPersistence().update(kycDetails, serviceContext);
	}

	/**
	 * Returns all the kyc detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching kyc detailses
	 */
	public static List<KycDetails> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the kyc detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @return the range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<KycDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUuid_First(
			String uuid, OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUuid_First(
		String uuid, OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUuid_Last(
			String uuid, OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUuid_Last(
		String uuid, OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the kyc detailses before and after the current kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param kycDetailId the primary key of the current kyc details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public static KycDetails[] findByUuid_PrevAndNext(
			long kycDetailId, String uuid,
			OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_PrevAndNext(
			kycDetailId, uuid, orderByComparator);
	}

	/**
	 * Removes all the kyc detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of kyc detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching kyc detailses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchKycDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUUID_G(String uuid, long groupId)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the kyc details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the kyc details that was removed
	 */
	public static KycDetails removeByUUID_G(String uuid, long groupId)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of kyc detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching kyc detailses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching kyc detailses
	 */
	public static List<KycDetails> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @return the range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<KycDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the kyc detailses before and after the current kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param kycDetailId the primary key of the current kyc details
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public static KycDetails[] findByUuid_C_PrevAndNext(
			long kycDetailId, String uuid, long companyId,
			OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			kycDetailId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the kyc detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching kyc detailses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the kyc detailses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching kyc detailses
	 */
	public static List<KycDetails> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the kyc detailses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @return the range of matching kyc detailses
	 */
	public static List<KycDetails> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUserId(
		long userId, int start, int end,
		OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the kyc detailses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching kyc detailses
	 */
	public static List<KycDetails> findByUserId(
		long userId, int start, int end,
		OrderByComparator<KycDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUserId_First(
			long userId, OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUserId_First(
		long userId, OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public static KycDetails findByUserId_Last(
			long userId, OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public static KycDetails fetchByUserId_Last(
		long userId, OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the kyc detailses before and after the current kyc details in the ordered set where userId = &#63;.
	 *
	 * @param kycDetailId the primary key of the current kyc details
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public static KycDetails[] findByUserId_PrevAndNext(
			long kycDetailId, long userId,
			OrderByComparator<KycDetails> orderByComparator)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByUserId_PrevAndNext(
			kycDetailId, userId, orderByComparator);
	}

	/**
	 * Removes all the kyc detailses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of kyc detailses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching kyc detailses
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Caches the kyc details in the entity cache if it is enabled.
	 *
	 * @param kycDetails the kyc details
	 */
	public static void cacheResult(KycDetails kycDetails) {
		getPersistence().cacheResult(kycDetails);
	}

	/**
	 * Caches the kyc detailses in the entity cache if it is enabled.
	 *
	 * @param kycDetailses the kyc detailses
	 */
	public static void cacheResult(List<KycDetails> kycDetailses) {
		getPersistence().cacheResult(kycDetailses);
	}

	/**
	 * Creates a new kyc details with the primary key. Does not add the kyc details to the database.
	 *
	 * @param kycDetailId the primary key for the new kyc details
	 * @return the new kyc details
	 */
	public static KycDetails create(long kycDetailId) {
		return getPersistence().create(kycDetailId);
	}

	/**
	 * Removes the kyc details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details that was removed
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public static KycDetails remove(long kycDetailId)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().remove(kycDetailId);
	}

	public static KycDetails updateImpl(KycDetails kycDetails) {
		return getPersistence().updateImpl(kycDetails);
	}

	/**
	 * Returns the kyc details with the primary key or throws a <code>NoSuchKycDetailsException</code> if it could not be found.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public static KycDetails findByPrimaryKey(long kycDetailId)
		throws com.liferay.testing.service.exception.NoSuchKycDetailsException {

		return getPersistence().findByPrimaryKey(kycDetailId);
	}

	/**
	 * Returns the kyc details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details, or <code>null</code> if a kyc details with the primary key could not be found
	 */
	public static KycDetails fetchByPrimaryKey(long kycDetailId) {
		return getPersistence().fetchByPrimaryKey(kycDetailId);
	}

	/**
	 * Returns all the kyc detailses.
	 *
	 * @return the kyc detailses
	 */
	public static List<KycDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the kyc detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @return the range of kyc detailses
	 */
	public static List<KycDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the kyc detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of kyc detailses
	 */
	public static List<KycDetails> findAll(
		int start, int end, OrderByComparator<KycDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the kyc detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>KycDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of kyc detailses
	 * @param end the upper bound of the range of kyc detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of kyc detailses
	 */
	public static List<KycDetails> findAll(
		int start, int end, OrderByComparator<KycDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the kyc detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of kyc detailses.
	 *
	 * @return the number of kyc detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static KycDetailsPersistence getPersistence() {
		return _persistence;
	}

	private static volatile KycDetailsPersistence _persistence;

}