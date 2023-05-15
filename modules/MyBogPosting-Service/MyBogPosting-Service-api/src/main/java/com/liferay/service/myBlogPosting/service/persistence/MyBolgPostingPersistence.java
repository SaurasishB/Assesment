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

import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.service.myBlogPosting.exception.NoSuchMyBolgPostingException;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the my bolg posting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPostingUtil
 * @generated
 */
@ProviderType
public interface MyBolgPostingPersistence
	extends BasePersistence<MyBolgPosting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MyBolgPostingUtil} to access the my bolg posting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching my bolg postings
	 */
	public java.util.List<MyBolgPosting> findByUuid(String uuid);

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
	public java.util.List<MyBolgPosting> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

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
	public java.util.List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public MyBolgPosting findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public MyBolgPosting findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

	/**
	 * Returns the my bolg postings before and after the current my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param myBlogPostingId the primary key of the current my bolg posting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public MyBolgPosting[] findByUuid_PrevAndNext(
			long myBlogPostingId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Removes all the my bolg postings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching my bolg postings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public MyBolgPosting findByUUID_G(String uuid, long groupId)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the my bolg posting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the my bolg posting that was removed
	 */
	public MyBolgPosting removeByUUID_G(String uuid, long groupId)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching my bolg postings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching my bolg postings
	 */
	public java.util.List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

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
	public java.util.List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public MyBolgPosting findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	public MyBolgPosting findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	public MyBolgPosting fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

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
	public MyBolgPosting[] findByUuid_C_PrevAndNext(
			long myBlogPostingId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
				orderByComparator)
		throws NoSuchMyBolgPostingException;

	/**
	 * Removes all the my bolg postings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching my bolg postings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the my bolg posting in the entity cache if it is enabled.
	 *
	 * @param myBolgPosting the my bolg posting
	 */
	public void cacheResult(MyBolgPosting myBolgPosting);

	/**
	 * Caches the my bolg postings in the entity cache if it is enabled.
	 *
	 * @param myBolgPostings the my bolg postings
	 */
	public void cacheResult(java.util.List<MyBolgPosting> myBolgPostings);

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	public MyBolgPosting create(long myBlogPostingId);

	/**
	 * Removes the my bolg posting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting that was removed
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public MyBolgPosting remove(long myBlogPostingId)
		throws NoSuchMyBolgPostingException;

	public MyBolgPosting updateImpl(MyBolgPosting myBolgPosting);

	/**
	 * Returns the my bolg posting with the primary key or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	public MyBolgPosting findByPrimaryKey(long myBlogPostingId)
		throws NoSuchMyBolgPostingException;

	/**
	 * Returns the my bolg posting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting, or <code>null</code> if a my bolg posting with the primary key could not be found
	 */
	public MyBolgPosting fetchByPrimaryKey(long myBlogPostingId);

	/**
	 * Returns all the my bolg postings.
	 *
	 * @return the my bolg postings
	 */
	public java.util.List<MyBolgPosting> findAll();

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
	public java.util.List<MyBolgPosting> findAll(int start, int end);

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
	public java.util.List<MyBolgPosting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator);

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
	public java.util.List<MyBolgPosting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MyBolgPosting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the my bolg postings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	public int countAll();

}