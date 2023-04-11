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

package com.liferay.testing.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.testing.service.model.KycDetails;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing KycDetails in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KycDetailsCacheModel
	implements CacheModel<KycDetails>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof KycDetailsCacheModel)) {
			return false;
		}

		KycDetailsCacheModel kycDetailsCacheModel =
			(KycDetailsCacheModel)object;

		if (kycDetailId == kycDetailsCacheModel.kycDetailId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, kycDetailId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", kycDetailId=");
		sb.append(kycDetailId);
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
		sb.append(", address=");
		sb.append(address);
		sb.append(", panNumber=");
		sb.append(panNumber);
		sb.append(", gstnNumber=");
		sb.append(gstnNumber);
		sb.append(", typeOfBusiness=");
		sb.append(typeOfBusiness);
		sb.append(", addressProofId=");
		sb.append(addressProofId);
		sb.append(", panProofId=");
		sb.append(panProofId);
		sb.append(", gstnProofId=");
		sb.append(gstnProofId);
		sb.append(", typeOfBusinessId=");
		sb.append(typeOfBusinessId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public KycDetails toEntityModel() {
		KycDetailsImpl kycDetailsImpl = new KycDetailsImpl();

		if (uuid == null) {
			kycDetailsImpl.setUuid("");
		}
		else {
			kycDetailsImpl.setUuid(uuid);
		}

		kycDetailsImpl.setKycDetailId(kycDetailId);
		kycDetailsImpl.setGroupId(groupId);
		kycDetailsImpl.setCompanyId(companyId);
		kycDetailsImpl.setUserId(userId);

		if (userName == null) {
			kycDetailsImpl.setUserName("");
		}
		else {
			kycDetailsImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			kycDetailsImpl.setCreateDate(null);
		}
		else {
			kycDetailsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			kycDetailsImpl.setModifiedDate(null);
		}
		else {
			kycDetailsImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (address == null) {
			kycDetailsImpl.setAddress("");
		}
		else {
			kycDetailsImpl.setAddress(address);
		}

		if (panNumber == null) {
			kycDetailsImpl.setPanNumber("");
		}
		else {
			kycDetailsImpl.setPanNumber(panNumber);
		}

		if (gstnNumber == null) {
			kycDetailsImpl.setGstnNumber("");
		}
		else {
			kycDetailsImpl.setGstnNumber(gstnNumber);
		}

		if (typeOfBusiness == null) {
			kycDetailsImpl.setTypeOfBusiness("");
		}
		else {
			kycDetailsImpl.setTypeOfBusiness(typeOfBusiness);
		}

		kycDetailsImpl.setAddressProofId(addressProofId);
		kycDetailsImpl.setPanProofId(panProofId);
		kycDetailsImpl.setGstnProofId(gstnProofId);
		kycDetailsImpl.setTypeOfBusinessId(typeOfBusinessId);

		kycDetailsImpl.resetOriginalValues();

		return kycDetailsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		kycDetailId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		address = objectInput.readUTF();
		panNumber = objectInput.readUTF();
		gstnNumber = objectInput.readUTF();
		typeOfBusiness = objectInput.readUTF();

		addressProofId = objectInput.readLong();

		panProofId = objectInput.readLong();

		gstnProofId = objectInput.readLong();

		typeOfBusinessId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(kycDetailId);

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

		if (address == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (panNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(panNumber);
		}

		if (gstnNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gstnNumber);
		}

		if (typeOfBusiness == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(typeOfBusiness);
		}

		objectOutput.writeLong(addressProofId);

		objectOutput.writeLong(panProofId);

		objectOutput.writeLong(gstnProofId);

		objectOutput.writeLong(typeOfBusinessId);
	}

	public String uuid;
	public long kycDetailId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String address;
	public String panNumber;
	public String gstnNumber;
	public String typeOfBusiness;
	public long addressProofId;
	public long panProofId;
	public long gstnProofId;
	public long typeOfBusinessId;

}