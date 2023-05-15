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

package com.liferay.service.myBlogPosting.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the my bolg posting service. This utility wraps <code>com.liferay.service.myBlogPosting.service.persistence.impl.MyBolgPostingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPostingPersistence
 * @generated
 */
public class MyBolgPostingUtil {

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
	public static void clearCache(MyBolgPosting myBolgPosting) {
		getPersistence().clearCache(myBolgPosting);
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
	public static Map<Serializable, MyBolgPosting> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MyBolgPosting> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MyBolgPosting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MyBolgPosting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MyBolgPosting update(MyBolgPosting myBolgPosting) {
		return getPersistence().update(myBolgPosting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MyBolgPosting update(
		MyBolgPosting myBolgPosting, ServiceContext serviceContext) {

		return getPersistence().update(myBolgPosting, serviceContext);
	}

	/**
	 * Returns all the my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the my bolg postings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @return the range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the my bolg postings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the my bolg postings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting findByUuid_First(
			String uuid, OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUuid_First(
		String uuid, OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting findByUuid_Last(
			String uuid, OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUuid_Last(
		String uuid, OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the my bolg postings before and after the current my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param myBlogPostingId the primary key of the current my bolg posting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting[] findByUuid_PrevAndNext(
			long myBlogPostingId, String uuid,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_PrevAndNext(
			myBlogPostingId, uuid, orderByComparator);
	}

	/**
	 * Removes all the my bolg postings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching my bolg postings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting findByUUID_G(String uuid, long groupId)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the my bolg posting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the my bolg posting that was removed
	 */
	public static MyBolgPosting removeByUUID_G(String uuid, long groupId)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching my bolg postings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @return the range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching my bolg postings
	 */
	public static List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public static MyBolgPosting fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the my bolg postings before and after the current my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param myBlogPostingId the primary key of the current my bolg posting
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting[] findByUuid_C_PrevAndNext(
			long myBlogPostingId, String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByUuid_C_PrevAndNext(
			myBlogPostingId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the my bolg postings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching my bolg postings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the my bolg posting in the entity cache if it is enabled.
	 *
	 * @param myBolgPosting the my bolg posting
	 */
	public static void cacheResult(MyBolgPosting myBolgPosting) {
		getPersistence().cacheResult(myBolgPosting);
	}

	/**
	 * Caches the my bolg postings in the entity cache if it is enabled.
	 *
	 * @param myBolgPostings the my bolg postings
	 */
	public static void cacheResult(List<MyBolgPosting> myBolgPostings) {
		getPersistence().cacheResult(myBolgPostings);
	}

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	public static MyBolgPosting create(long myBlogPostingId) {
		return getPersistence().create(myBlogPostingId);
	}

	/**
	 * Removes the my bolg posting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting that was removed
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting remove(long myBlogPostingId)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().remove(myBlogPostingId);
	}

	public static MyBolgPosting updateImpl(MyBolgPosting myBolgPosting) {
		return getPersistence().updateImpl(myBolgPosting);
	}

	/**
	 * Returns the my bolg posting with the primary key or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting findByPrimaryKey(long myBlogPostingId)
		throws com.liferay.service.myBlogPosting.exception.
			NoSuchMyBolgPostingException {

		return getPersistence().findByPrimaryKey(myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting, or <code>null</code> if a my bolg posting with the primary key could not be found
	 */
	public static MyBolgPosting fetchByPrimaryKey(long myBlogPostingId) {
		return getPersistence().fetchByPrimaryKey(myBlogPostingId);
	}

	/**
	 * Returns all the my bolg postings.
	 *
	 * @return the my bolg postings
	 */
	public static List<MyBolgPosting> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the my bolg postings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @return the range of my bolg postings
	 */
	public static List<MyBolgPosting> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the my bolg postings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of my bolg postings
	 */
	public static List<MyBolgPosting> findAll(
		int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the my bolg postings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MyBolgPostingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of my bolg postings
	 * @param end the upper bound of the range of my bolg postings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of my bolg postings
	 */
	public static List<MyBolgPosting> findAll(
		int start, int end, OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the my bolg postings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MyBolgPostingPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MyBolgPostingPersistence _persistence;

}