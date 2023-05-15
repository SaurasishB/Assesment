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

package com.liferay.service.myBlogPosting.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MyBolgPosting in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MyBolgPostingCacheModel
	implements CacheModel<MyBolgPosting>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MyBolgPostingCacheModel)) {
			return false;
		}

		MyBolgPostingCacheModel myBolgPostingCacheModel =
			(MyBolgPostingCacheModel)object;

		if (myBlogPostingId == myBolgPostingCacheModel.myBlogPostingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, myBlogPostingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", myBlogPostingId=");
		sb.append(myBlogPostingId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", heading=");
		sb.append(heading);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MyBolgPosting toEntityModel() {
		MyBolgPostingImpl myBolgPostingImpl = new MyBolgPostingImpl();

		if (uuid == null) {
			myBolgPostingImpl.setUuid("");
		}
		else {
			myBolgPostingImpl.setUuid(uuid);
		}

		myBolgPostingImpl.setMyBlogPostingId(myBlogPostingId);
		myBolgPostingImpl.setGroupId(groupId);
		myBolgPostingImpl.setCompanyId(companyId);
		myBolgPostingImpl.setUserId(userId);

		if (userName == null) {
			myBolgPostingImpl.setUserName("");
		}
		else {
			myBolgPostingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			myBolgPostingImpl.setCreateDate(null);
		}
		else {
			myBolgPostingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			myBolgPostingImpl.setModifiedDate(null);
		}
		else {
			myBolgPostingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (heading == null) {
			myBolgPostingImpl.setHeading("");
		}
		else {
			myBolgPostingImpl.setHeading(heading);
		}

		if (description == null) {
			myBolgPostingImpl.setDescription("");
		}
		else {
			myBolgPostingImpl.setDescription(description);
		}

		myBolgPostingImpl.resetOriginalValues();

		return myBolgPostingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		myBlogPostingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		heading = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(myBlogPostingId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (heading == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(heading);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long myBlogPostingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String heading;
	public String description;

}