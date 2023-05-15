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

package com.liferay.service.myBlogPosting.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MyBolgPosting}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPosting
 * @generated
 */
public class MyBolgPostingWrapper
	extends BaseModelWrapper<MyBolgPosting>
	implements ModelWrapper<MyBolgPosting>, MyBolgPosting {

	public MyBolgPostingWrapper(MyBolgPosting myBolgPosting) {
		super(myBolgPosting);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("myBlogPostingId", getMyBlogPostingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("heading", getHeading());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long myBlogPostingId = (Long)attributes.get("myBlogPostingId");

		if (myBlogPostingId != null) {
			setMyBlogPostingId(myBlogPostingId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String heading = (String)attributes.get("heading");

		if (heading != null) {
			setHeading(heading);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public MyBolgPosting cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this my bolg posting.
	 *
	 * @return the company ID of this my bolg posting
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this my bolg posting.
	 *
	 * @return the create date of this my bolg posting
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this my bolg posting.
	 *
	 * @return the description of this my bolg posting
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this my bolg posting.
	 *
	 * @return the group ID of this my bolg posting
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the heading of this my bolg posting.
	 *
	 * @return the heading of this my bolg posting
	 */
	@Override
	public String getHeading() {
		return model.getHeading();
	}

	/**
	 * Returns the modified date of this my bolg posting.
	 *
	 * @return the modified date of this my bolg posting
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the my blog posting ID of this my bolg posting.
	 *
	 * @return the my blog posting ID of this my bolg posting
	 */
	@Override
	public long getMyBlogPostingId() {
		return model.getMyBlogPostingId();
	}

	/**
	 * Returns the primary key of this my bolg posting.
	 *
	 * @return the primary key of this my bolg posting
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this my bolg posting.
	 *
	 * @return the user ID of this my bolg posting
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this my bolg posting.
	 *
	 * @return the user name of this my bolg posting
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this my bolg posting.
	 *
	 * @return the user uuid of this my bolg posting
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this my bolg posting.
	 *
	 * @return the uuid of this my bolg posting
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this my bolg posting.
	 *
	 * @param companyId the company ID of this my bolg posting
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this my bolg posting.
	 *
	 * @param createDate the create date of this my bolg posting
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this my bolg posting.
	 *
	 * @param description the description of this my bolg posting
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this my bolg posting.
	 *
	 * @param groupId the group ID of this my bolg posting
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the heading of this my bolg posting.
	 *
	 * @param heading the heading of this my bolg posting
	 */
	@Override
	public void setHeading(String heading) {
		model.setHeading(heading);
	}

	/**
	 * Sets the modified date of this my bolg posting.
	 *
	 * @param modifiedDate the modified date of this my bolg posting
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the my blog posting ID of this my bolg posting.
	 *
	 * @param myBlogPostingId the my blog posting ID of this my bolg posting
	 */
	@Override
	public void setMyBlogPostingId(long myBlogPostingId) {
		model.setMyBlogPostingId(myBlogPostingId);
	}

	/**
	 * Sets the primary key of this my bolg posting.
	 *
	 * @param primaryKey the primary key of this my bolg posting
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this my bolg posting.
	 *
	 * @param userId the user ID of this my bolg posting
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this my bolg posting.
	 *
	 * @param userName the user name of this my bolg posting
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this my bolg posting.
	 *
	 * @param userUuid the user uuid of this my bolg posting
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this my bolg posting.
	 *
	 * @param uuid the uuid of this my bolg posting
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MyBolgPostingWrapper wrap(MyBolgPosting myBolgPosting) {
		return new MyBolgPostingWrapper(myBolgPosting);
	}

}