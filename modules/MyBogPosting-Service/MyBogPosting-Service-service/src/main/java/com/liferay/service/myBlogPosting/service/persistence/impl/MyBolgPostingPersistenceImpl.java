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

package com.liferay.service.myBlogPosting.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUID;
import com.liferay.service.myBlogPosting.exception.NoSuchMyBolgPostingException;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;
import com.liferay.service.myBlogPosting.model.MyBolgPostingTable;
import com.liferay.service.myBlogPosting.model.impl.MyBolgPostingImpl;
import com.liferay.service.myBlogPosting.model.impl.MyBolgPostingModelImpl;
import com.liferay.service.myBlogPosting.service.persistence.MyBolgPostingPersistence;
import com.liferay.service.myBlogPosting.service.persistence.MyBolgPostingUtil;
import com.liferay.service.myBlogPosting.service.persistence.impl.constants.SchedulerPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the my bolg posting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MyBolgPostingPersistence.class)
public class MyBolgPostingPersistenceImpl
	extends BasePersistenceImpl<MyBolgPosting>
	implements MyBolgPostingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MyBolgPostingUtil</code> to access the my bolg posting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MyBolgPostingImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching my bolg postings
	 */
	@Override
	public List<MyBolgPosting> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MyBolgPosting> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<MyBolgPosting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<MyBolgPosting> list = null;

		if (useFinderCache) {
			list = (List<MyBolgPosting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MyBolgPosting myBolgPosting : list) {
					if (!uuid.equals(myBolgPosting.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MyBolgPostingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<MyBolgPosting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting findByUuid_First(
			String uuid, OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByUuid_First(
			uuid, orderByComparator);

		if (myBolgPosting != null) {
			return myBolgPosting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMyBolgPostingException(sb.toString());
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUuid_First(
		String uuid, OrderByComparator<MyBolgPosting> orderByComparator) {

		List<MyBolgPosting> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting findByUuid_Last(
			String uuid, OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByUuid_Last(uuid, orderByComparator);

		if (myBolgPosting != null) {
			return myBolgPosting;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMyBolgPostingException(sb.toString());
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUuid_Last(
		String uuid, OrderByComparator<MyBolgPosting> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MyBolgPosting> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MyBolgPosting[] findByUuid_PrevAndNext(
			long myBlogPostingId, String uuid,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		uuid = Objects.toString(uuid, "");

		MyBolgPosting myBolgPosting = findByPrimaryKey(myBlogPostingId);

		Session session = null;

		try {
			session = openSession();

			MyBolgPosting[] array = new MyBolgPostingImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, myBolgPosting, uuid, orderByComparator, true);

			array[1] = myBolgPosting;

			array[2] = getByUuid_PrevAndNext(
				session, myBolgPosting, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyBolgPosting getByUuid_PrevAndNext(
		Session session, MyBolgPosting myBolgPosting, String uuid,
		OrderByComparator<MyBolgPosting> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_MYBOLGPOSTING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MyBolgPostingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						myBolgPosting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MyBolgPosting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the my bolg postings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MyBolgPosting myBolgPosting :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(myBolgPosting);
		}
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching my bolg postings
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"myBolgPosting.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(myBolgPosting.uuid IS NULL OR myBolgPosting.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting
	 * @throws NoSuchMyBolgPostingException if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting findByUUID_G(String uuid, long groupId)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByUUID_G(uuid, groupId);

		if (myBolgPosting == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMyBolgPostingException(sb.toString());
		}

		return myBolgPosting;
	}

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the my bolg posting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof MyBolgPosting) {
			MyBolgPosting myBolgPosting = (MyBolgPosting)result;

			if (!Objects.equals(uuid, myBolgPosting.getUuid()) ||
				(groupId != myBolgPosting.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<MyBolgPosting> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MyBolgPosting myBolgPosting = list.get(0);

					result = myBolgPosting;

					cacheResult(myBolgPosting);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (MyBolgPosting)result;
		}
	}

	/**
	 * Removes the my bolg posting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the my bolg posting that was removed
	 */
	@Override
	public MyBolgPosting removeByUUID_G(String uuid, long groupId)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = findByUUID_G(uuid, groupId);

		return remove(myBolgPosting);
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching my bolg postings
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"myBolgPosting.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(myBolgPosting.uuid IS NULL OR myBolgPosting.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"myBolgPosting.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching my bolg postings
	 */
	@Override
	public List<MyBolgPosting> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<MyBolgPosting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<MyBolgPosting> list = null;

		if (useFinderCache) {
			list = (List<MyBolgPosting>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MyBolgPosting myBolgPosting : list) {
					if (!uuid.equals(myBolgPosting.getUuid()) ||
						(companyId != myBolgPosting.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MyBolgPostingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<MyBolgPosting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public MyBolgPosting findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (myBolgPosting != null) {
			return myBolgPosting;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMyBolgPostingException(sb.toString());
	}

	/**
	 * Returns the first my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		List<MyBolgPosting> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MyBolgPosting findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (myBolgPosting != null) {
			return myBolgPosting;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMyBolgPostingException(sb.toString());
	}

	/**
	 * Returns the last my bolg posting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching my bolg posting, or <code>null</code> if a matching my bolg posting could not be found
	 */
	@Override
	public MyBolgPosting fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MyBolgPosting> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public MyBolgPosting[] findByUuid_C_PrevAndNext(
			long myBlogPostingId, String uuid, long companyId,
			OrderByComparator<MyBolgPosting> orderByComparator)
		throws NoSuchMyBolgPostingException {

		uuid = Objects.toString(uuid, "");

		MyBolgPosting myBolgPosting = findByPrimaryKey(myBlogPostingId);

		Session session = null;

		try {
			session = openSession();

			MyBolgPosting[] array = new MyBolgPostingImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, myBolgPosting, uuid, companyId, orderByComparator,
				true);

			array[1] = myBolgPosting;

			array[2] = getByUuid_C_PrevAndNext(
				session, myBolgPosting, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MyBolgPosting getByUuid_C_PrevAndNext(
		Session session, MyBolgPosting myBolgPosting, String uuid,
		long companyId, OrderByComparator<MyBolgPosting> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_MYBOLGPOSTING_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(MyBolgPostingModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						myBolgPosting)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MyBolgPosting> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the my bolg postings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MyBolgPosting myBolgPosting :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(myBolgPosting);
		}
	}

	/**
	 * Returns the number of my bolg postings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching my bolg postings
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MYBOLGPOSTING_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"myBolgPosting.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(myBolgPosting.uuid IS NULL OR myBolgPosting.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"myBolgPosting.companyId = ?";

	public MyBolgPostingPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MyBolgPosting.class);

		setModelImplClass(MyBolgPostingImpl.class);
		setModelPKClass(long.class);

		setTable(MyBolgPostingTable.INSTANCE);
	}

	/**
	 * Caches the my bolg posting in the entity cache if it is enabled.
	 *
	 * @param myBolgPosting the my bolg posting
	 */
	@Override
	public void cacheResult(MyBolgPosting myBolgPosting) {
		entityCache.putResult(
			MyBolgPostingImpl.class, myBolgPosting.getPrimaryKey(),
			myBolgPosting);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {myBolgPosting.getUuid(), myBolgPosting.getGroupId()},
			myBolgPosting);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the my bolg postings in the entity cache if it is enabled.
	 *
	 * @param myBolgPostings the my bolg postings
	 */
	@Override
	public void cacheResult(List<MyBolgPosting> myBolgPostings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (myBolgPostings.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MyBolgPosting myBolgPosting : myBolgPostings) {
			if (entityCache.getResult(
					MyBolgPostingImpl.class, myBolgPosting.getPrimaryKey()) ==
						null) {

				cacheResult(myBolgPosting);
			}
		}
	}

	/**
	 * Clears the cache for all my bolg postings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MyBolgPostingImpl.class);

		finderCache.clearCache(MyBolgPostingImpl.class);
	}

	/**
	 * Clears the cache for the my bolg posting.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MyBolgPosting myBolgPosting) {
		entityCache.removeResult(MyBolgPostingImpl.class, myBolgPosting);
	}

	@Override
	public void clearCache(List<MyBolgPosting> myBolgPostings) {
		for (MyBolgPosting myBolgPosting : myBolgPostings) {
			entityCache.removeResult(MyBolgPostingImpl.class, myBolgPosting);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MyBolgPostingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MyBolgPostingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MyBolgPostingModelImpl myBolgPostingModelImpl) {

		Object[] args = new Object[] {
			myBolgPostingModelImpl.getUuid(),
			myBolgPostingModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, myBolgPostingModelImpl);
	}

	/**
	 * Creates a new my bolg posting with the primary key. Does not add the my bolg posting to the database.
	 *
	 * @param myBlogPostingId the primary key for the new my bolg posting
	 * @return the new my bolg posting
	 */
	@Override
	public MyBolgPosting create(long myBlogPostingId) {
		MyBolgPosting myBolgPosting = new MyBolgPostingImpl();

		myBolgPosting.setNew(true);
		myBolgPosting.setPrimaryKey(myBlogPostingId);

		String uuid = _portalUUID.generate();

		myBolgPosting.setUuid(uuid);

		myBolgPosting.setCompanyId(CompanyThreadLocal.getCompanyId());

		return myBolgPosting;
	}

	/**
	 * Removes the my bolg posting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting that was removed
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting remove(long myBlogPostingId)
		throws NoSuchMyBolgPostingException {

		return remove((Serializable)myBlogPostingId);
	}

	/**
	 * Removes the my bolg posting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the my bolg posting
	 * @return the my bolg posting that was removed
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting remove(Serializable primaryKey)
		throws NoSuchMyBolgPostingException {

		Session session = null;

		try {
			session = openSession();

			MyBolgPosting myBolgPosting = (MyBolgPosting)session.get(
				MyBolgPostingImpl.class, primaryKey);

			if (myBolgPosting == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMyBolgPostingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(myBolgPosting);
		}
		catch (NoSuchMyBolgPostingException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected MyBolgPosting removeImpl(MyBolgPosting myBolgPosting) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(myBolgPosting)) {
				myBolgPosting = (MyBolgPosting)session.get(
					MyBolgPostingImpl.class, myBolgPosting.getPrimaryKeyObj());
			}

			if (myBolgPosting != null) {
				session.delete(myBolgPosting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (myBolgPosting != null) {
			clearCache(myBolgPosting);
		}

		return myBolgPosting;
	}

	@Override
	public MyBolgPosting updateImpl(MyBolgPosting myBolgPosting) {
		boolean isNew = myBolgPosting.isNew();

		if (!(myBolgPosting instanceof MyBolgPostingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(myBolgPosting.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					myBolgPosting);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in myBolgPosting proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MyBolgPosting implementation " +
					myBolgPosting.getClass());
		}

		MyBolgPostingModelImpl myBolgPostingModelImpl =
			(MyBolgPostingModelImpl)myBolgPosting;

		if (Validator.isNull(myBolgPosting.getUuid())) {
			String uuid = _portalUUID.generate();

			myBolgPosting.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (myBolgPosting.getCreateDate() == null)) {
			if (serviceContext == null) {
				myBolgPosting.setCreateDate(date);
			}
			else {
				myBolgPosting.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!myBolgPostingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				myBolgPosting.setModifiedDate(date);
			}
			else {
				myBolgPosting.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(myBolgPosting);
			}
			else {
				myBolgPosting = (MyBolgPosting)session.merge(myBolgPosting);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MyBolgPostingImpl.class, myBolgPostingModelImpl, false, true);

		cacheUniqueFindersCache(myBolgPostingModelImpl);

		if (isNew) {
			myBolgPosting.setNew(false);
		}

		myBolgPosting.resetOriginalValues();

		return myBolgPosting;
	}

	/**
	 * Returns the my bolg posting with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMyBolgPostingException {

		MyBolgPosting myBolgPosting = fetchByPrimaryKey(primaryKey);

		if (myBolgPosting == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMyBolgPostingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return myBolgPosting;
	}

	/**
	 * Returns the my bolg posting with the primary key or throws a <code>NoSuchMyBolgPostingException</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting
	 * @throws NoSuchMyBolgPostingException if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting findByPrimaryKey(long myBlogPostingId)
		throws NoSuchMyBolgPostingException {

		return findByPrimaryKey((Serializable)myBlogPostingId);
	}

	/**
	 * Returns the my bolg posting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param myBlogPostingId the primary key of the my bolg posting
	 * @return the my bolg posting, or <code>null</code> if a my bolg posting with the primary key could not be found
	 */
	@Override
	public MyBolgPosting fetchByPrimaryKey(long myBlogPostingId) {
		return fetchByPrimaryKey((Serializable)myBlogPostingId);
	}

	/**
	 * Returns all the my bolg postings.
	 *
	 * @return the my bolg postings
	 */
	@Override
	public List<MyBolgPosting> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<MyBolgPosting> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<MyBolgPosting> findAll(
		int start, int end,
		OrderByComparator<MyBolgPosting> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<MyBolgPosting> findAll(
		int start, int end, OrderByComparator<MyBolgPosting> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<MyBolgPosting> list = null;

		if (useFinderCache) {
			list = (List<MyBolgPosting>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MYBOLGPOSTING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MYBOLGPOSTING;

				sql = sql.concat(MyBolgPostingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MyBolgPosting>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the my bolg postings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MyBolgPosting myBolgPosting : findAll()) {
			remove(myBolgPosting);
		}
	}

	/**
	 * Returns the number of my bolg postings.
	 *
	 * @return the number of my bolg postings
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MYBOLGPOSTING);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "myBlogPostingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MYBOLGPOSTING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MyBolgPostingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the my bolg posting persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_setMyBolgPostingUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setMyBolgPostingUtilPersistence(null);

		entityCache.removeCache(MyBolgPostingImpl.class.getName());
	}

	private void _setMyBolgPostingUtilPersistence(
		MyBolgPostingPersistence myBolgPostingPersistence) {

		try {
			Field field = MyBolgPostingUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, myBolgPostingPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = SchedulerPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SchedulerPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SchedulerPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MYBOLGPOSTING =
		"SELECT myBolgPosting FROM MyBolgPosting myBolgPosting";

	private static final String _SQL_SELECT_MYBOLGPOSTING_WHERE =
		"SELECT myBolgPosting FROM MyBolgPosting myBolgPosting WHERE ";

	private static final String _SQL_COUNT_MYBOLGPOSTING =
		"SELECT COUNT(myBolgPosting) FROM MyBolgPosting myBolgPosting";

	private static final String _SQL_COUNT_MYBOLGPOSTING_WHERE =
		"SELECT COUNT(myBolgPosting) FROM MyBolgPosting myBolgPosting WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "myBolgPosting.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MyBolgPosting exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MyBolgPosting exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MyBolgPostingPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PortalUUID _portalUUID;

}