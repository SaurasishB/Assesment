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

package com.liferay.testing.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link KycDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KycDetails
 * @generated
 */
public class KycDetailsWrapper
	extends BaseModelWrapper<KycDetails>
	implements KycDetails, ModelWrapper<KycDetails> {

	public KycDetailsWrapper(KycDetails kycDetails) {
		super(kycDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("kycDetailId", getKycDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("address", getAddress());
		attributes.put("panNumber", getPanNumber());
		attributes.put("gstnNumber", getGstnNumber());
		attributes.put("typeOfBusiness", getTypeOfBusiness());
		attributes.put("addressProofId", getAddressProofId());
		attributes.put("panProofId", getPanProofId());
		attributes.put("gstnProofId", getGstnProofId());
		attributes.put("typeOfBusinessId", getTypeOfBusinessId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long kycDetailId = (Long)attributes.get("kycDetailId");

		if (kycDetailId != null) {
			setKycDetailId(kycDetailId);
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

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String panNumber = (String)attributes.get("panNumber");

		if (panNumber != null) {
			setPanNumber(panNumber);
		}

		String gstnNumber = (String)attributes.get("gstnNumber");

		if (gstnNumber != null) {
			setGstnNumber(gstnNumber);
		}

		String typeOfBusiness = (String)attributes.get("typeOfBusiness");

		if (typeOfBusiness != null) {
			setTypeOfBusiness(typeOfBusiness);
		}

		Long addressProofId = (Long)attributes.get("addressProofId");

		if (addressProofId != null) {
			setAddressProofId(addressProofId);
		}

		Long panProofId = (Long)attributes.get("panProofId");

		if (panProofId != null) {
			setPanProofId(panProofId);
		}

		Long gstnProofId = (Long)attributes.get("gstnProofId");

		if (gstnProofId != null) {
			setGstnProofId(gstnProofId);
		}

		Long typeOfBusinessId = (Long)attributes.get("typeOfBusinessId");

		if (typeOfBusinessId != null) {
			setTypeOfBusinessId(typeOfBusinessId);
		}
	}

	@Override
	public KycDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this kyc details.
	 *
	 * @return the address of this kyc details
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the address proof ID of this kyc details.
	 *
	 * @return the address proof ID of this kyc details
	 */
	@Override
	public long getAddressProofId() {
		return model.getAddressProofId();
	}

	/**
	 * Returns the company ID of this kyc details.
	 *
	 * @return the company ID of this kyc details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this kyc details.
	 *
	 * @return the create date of this kyc details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this kyc details.
	 *
	 * @return the group ID of this kyc details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the gstn number of this kyc details.
	 *
	 * @return the gstn number of this kyc details
	 */
	@Override
	public String getGstnNumber() {
		return model.getGstnNumber();
	}

	/**
	 * Returns the gstn proof ID of this kyc details.
	 *
	 * @return the gstn proof ID of this kyc details
	 */
	@Override
	public long getGstnProofId() {
		return model.getGstnProofId();
	}

	/**
	 * Returns the kyc detail ID of this kyc details.
	 *
	 * @return the kyc detail ID of this kyc details
	 */
	@Override
	public long getKycDetailId() {
		return model.getKycDetailId();
	}

	/**
	 * Returns the modified date of this kyc details.
	 *
	 * @return the modified date of this kyc details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pan number of this kyc details.
	 *
	 * @return the pan number of this kyc details
	 */
	@Override
	public String getPanNumber() {
		return model.getPanNumber();
	}

	/**
	 * Returns the pan proof ID of this kyc details.
	 *
	 * @return the pan proof ID of this kyc details
	 */
	@Override
	public long getPanProofId() {
		return model.getPanProofId();
	}

	/**
	 * Returns the primary key of this kyc details.
	 *
	 * @return the primary key of this kyc details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the type of business of this kyc details.
	 *
	 * @return the type of business of this kyc details
	 */
	@Override
	public String getTypeOfBusiness() {
		return model.getTypeOfBusiness();
	}

	/**
	 * Returns the type of business ID of this kyc details.
	 *
	 * @return the type of business ID of this kyc details
	 */
	@Override
	public long getTypeOfBusinessId() {
		return model.getTypeOfBusinessId();
	}

	/**
	 * Returns the user ID of this kyc details.
	 *
	 * @return the user ID of this kyc details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this kyc details.
	 *
	 * @return the user name of this kyc details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this kyc details.
	 *
	 * @return the user uuid of this kyc details
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this kyc details.
	 *
	 * @return the uuid of this kyc details
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
	 * Sets the address of this kyc details.
	 *
	 * @param address the address of this kyc details
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the address proof ID of this kyc details.
	 *
	 * @param addressProofId the address proof ID of this kyc details
	 */
	@Override
	public void setAddressProofId(long addressProofId) {
		model.setAddressProofId(addressProofId);
	}

	/**
	 * Sets the company ID of this kyc details.
	 *
	 * @param companyId the company ID of this kyc details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this kyc details.
	 *
	 * @param createDate the create date of this kyc details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this kyc details.
	 *
	 * @param groupId the group ID of this kyc details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the gstn number of this kyc details.
	 *
	 * @param gstnNumber the gstn number of this kyc details
	 */
	@Override
	public void setGstnNumber(String gstnNumber) {
		model.setGstnNumber(gstnNumber);
	}

	/**
	 * Sets the gstn proof ID of this kyc details.
	 *
	 * @param gstnProofId the gstn proof ID of this kyc details
	 */
	@Override
	public void setGstnProofId(long gstnProofId) {
		model.setGstnProofId(gstnProofId);
	}

	/**
	 * Sets the kyc detail ID of this kyc details.
	 *
	 * @param kycDetailId the kyc detail ID of this kyc details
	 */
	@Override
	public void setKycDetailId(long kycDetailId) {
		model.setKycDetailId(kycDetailId);
	}

	/**
	 * Sets the modified date of this kyc details.
	 *
	 * @param modifiedDate the modified date of this kyc details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pan number of this kyc details.
	 *
	 * @param panNumber the pan number of this kyc details
	 */
	@Override
	public void setPanNumber(String panNumber) {
		model.setPanNumber(panNumber);
	}

	/**
	 * Sets the pan proof ID of this kyc details.
	 *
	 * @param panProofId the pan proof ID of this kyc details
	 */
	@Override
	public void setPanProofId(long panProofId) {
		model.setPanProofId(panProofId);
	}

	/**
	 * Sets the primary key of this kyc details.
	 *
	 * @param primaryKey the primary key of this kyc details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the type of business of this kyc details.
	 *
	 * @param typeOfBusiness the type of business of this kyc details
	 */
	@Override
	public void setTypeOfBusiness(String typeOfBusiness) {
		model.setTypeOfBusiness(typeOfBusiness);
	}

	/**
	 * Sets the type of business ID of this kyc details.
	 *
	 * @param typeOfBusinessId the type of business ID of this kyc details
	 */
	@Override
	public void setTypeOfBusinessId(long typeOfBusinessId) {
		model.setTypeOfBusinessId(typeOfBusinessId);
	}

	/**
	 * Sets the user ID of this kyc details.
	 *
	 * @param userId the user ID of this kyc details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this kyc details.
	 *
	 * @param userName the user name of this kyc details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this kyc details.
	 *
	 * @param userUuid the user uuid of this kyc details
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this kyc details.
	 *
	 * @param uuid the uuid of this kyc details
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
	protected KycDetailsWrapper wrap(KycDetails kycDetails) {
		return new KycDetailsWrapper(kycDetails);
	}

}