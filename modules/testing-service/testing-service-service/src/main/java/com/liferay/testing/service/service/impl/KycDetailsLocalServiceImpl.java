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

package com.liferay.testing.service.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.testing.service.model.KycDetails;
import com.liferay.testing.service.service.base.KycDetailsLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(property = "model.class.name=com.liferay.testing.service.model.KycDetails", service = AopService.class)
public class KycDetailsLocalServiceImpl extends KycDetailsLocalServiceBaseImpl {

	public KycDetails addKycDetails(long groupId, long companyId, long userId, String userName, String address,
			String panNumber, String gstnNumber, String typeOfBusiness, long addressProofId, long panProofId,
			long gstnProofId, long typeOfBusinessId) {
		try {
			long kycDetailId = CounterLocalServiceUtil.increment(KycDetails.class.getName());

			KycDetails kycDetails = createKycDetails(kycDetailId);
			kycDetails.setGroupId(groupId);
			kycDetails.setCompanyId(companyId);
			kycDetails.setUserId(userId);
			kycDetails.setUserName(userName);
			kycDetails.setCreateDate(new Date());
			kycDetails.setModifiedDate(new Date());

			// custom fields
			kycDetails.setAddress(address);
			kycDetails.setPanNumber(panNumber);
			kycDetails.setGstnNumber(gstnNumber);
			kycDetails.setTypeOfBusiness(typeOfBusiness);
			kycDetails.setAddressProofId(addressProofId);
			kycDetails.setPanProofId(panProofId);
			kycDetails.setGstnProofId(gstnProofId);
			kycDetails.setTypeOfBusinessId(typeOfBusinessId);

			super.addKycDetails(kycDetails);
			return kycDetails;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public KycDetails updateKycDetails(long kycDetailId, long groupId, long companyId, long userId, String userName,
			String address, String panNumber, String gstnNumber, String typeOfBusiness, long addressProofId,
			long panProofId, long gstnProofId, long typeOfBusinessId) {
		try {
			KycDetails kycDetails = getKycDetails(kycDetailId);
			kycDetails.setGroupId(groupId);
			kycDetails.setCompanyId(companyId);
			kycDetails.setUserId(userId);
			kycDetails.setUserName(userName);
			kycDetails.setModifiedDate(new Date());

			// custom fields
			kycDetails.setAddress(address);
			kycDetails.setPanNumber(panNumber);
			kycDetails.setGstnNumber(gstnNumber);
			kycDetails.setTypeOfBusiness(typeOfBusiness);
			kycDetails.setAddressProofId(addressProofId);
			kycDetails.setPanProofId(panProofId);
			kycDetails.setGstnProofId(gstnProofId);
			kycDetails.setTypeOfBusinessId(typeOfBusinessId);

			super.updateKycDetails(kycDetails);
			return kycDetails;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public List<KycDetails> findByUserId(long userId) {
		return kycDetailsPersistence.findByUserId(userId);

	}
}