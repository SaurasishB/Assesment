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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.testing.service.exception.NoSuchKycDetailsException;
import com.liferay.testing.service.model.KycDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the kyc details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KycDetailsUtil
 * @generated
 */
@ProviderType
public interface KycDetailsPersistence extends BasePersistence<KycDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link KycDetailsUtil} to access the kyc details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the kyc detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching kyc detailses
	 */
	public java.util.List<KycDetails> findByUuid(String uuid);

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
	public java.util.List<KycDetails> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<KycDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

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
	public java.util.List<KycDetails> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

	/**
	 * Returns the kyc detailses before and after the current kyc details in the ordered set where uuid = &#63;.
	 *
	 * @param kycDetailId the primary key of the current kyc details
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public KycDetails[] findByUuid_PrevAndNext(
			long kycDetailId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Removes all the kyc detailses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of kyc detailses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching kyc detailses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchKycDetailsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUUID_G(String uuid, long groupId)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the kyc details where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the kyc details where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the kyc details that was removed
	 */
	public KycDetails removeByUUID_G(String uuid, long groupId)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the number of kyc detailses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching kyc detailses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching kyc detailses
	 */
	public java.util.List<KycDetails> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

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
	public java.util.List<KycDetails> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the first kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the last kyc details in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

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
	public KycDetails[] findByUuid_C_PrevAndNext(
			long kycDetailId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Removes all the kyc detailses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of kyc detailses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching kyc detailses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the kyc detailses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching kyc detailses
	 */
	public java.util.List<KycDetails> findByUserId(long userId);

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
	public java.util.List<KycDetails> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<KycDetails> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

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
	public java.util.List<KycDetails> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the first kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

	/**
	 * Returns the last kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details
	 * @throws NoSuchKycDetailsException if a matching kyc details could not be found
	 */
	public KycDetails findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the last kyc details in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching kyc details, or <code>null</code> if a matching kyc details could not be found
	 */
	public KycDetails fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

	/**
	 * Returns the kyc detailses before and after the current kyc details in the ordered set where userId = &#63;.
	 *
	 * @param kycDetailId the primary key of the current kyc details
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public KycDetails[] findByUserId_PrevAndNext(
			long kycDetailId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
				orderByComparator)
		throws NoSuchKycDetailsException;

	/**
	 * Removes all the kyc detailses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of kyc detailses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching kyc detailses
	 */
	public int countByUserId(long userId);

	/**
	 * Caches the kyc details in the entity cache if it is enabled.
	 *
	 * @param kycDetails the kyc details
	 */
	public void cacheResult(KycDetails kycDetails);

	/**
	 * Caches the kyc detailses in the entity cache if it is enabled.
	 *
	 * @param kycDetailses the kyc detailses
	 */
	public void cacheResult(java.util.List<KycDetails> kycDetailses);

	/**
	 * Creates a new kyc details with the primary key. Does not add the kyc details to the database.
	 *
	 * @param kycDetailId the primary key for the new kyc details
	 * @return the new kyc details
	 */
	public KycDetails create(long kycDetailId);

	/**
	 * Removes the kyc details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details that was removed
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public KycDetails remove(long kycDetailId) throws NoSuchKycDetailsException;

	public KycDetails updateImpl(KycDetails kycDetails);

	/**
	 * Returns the kyc details with the primary key or throws a <code>NoSuchKycDetailsException</code> if it could not be found.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details
	 * @throws NoSuchKycDetailsException if a kyc details with the primary key could not be found
	 */
	public KycDetails findByPrimaryKey(long kycDetailId)
		throws NoSuchKycDetailsException;

	/**
	 * Returns the kyc details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param kycDetailId the primary key of the kyc details
	 * @return the kyc details, or <code>null</code> if a kyc details with the primary key could not be found
	 */
	public KycDetails fetchByPrimaryKey(long kycDetailId);

	/**
	 * Returns all the kyc detailses.
	 *
	 * @return the kyc detailses
	 */
	public java.util.List<KycDetails> findAll();

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
	public java.util.List<KycDetails> findAll(int start, int end);

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
	public java.util.List<KycDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator);

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
	public java.util.List<KycDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<KycDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the kyc detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of kyc detailses.
	 *
	 * @return the number of kyc detailses
	 */
	public int countAll();

}