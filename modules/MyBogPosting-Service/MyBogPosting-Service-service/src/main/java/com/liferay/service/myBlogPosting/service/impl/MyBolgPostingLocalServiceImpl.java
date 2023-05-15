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

package com.liferay.service.myBlogPosting.service.impl;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.aop.AopService;
import com.liferay.service.myBlogPosting.model.MyBolgPosting;
import com.liferay.service.myBlogPosting.service.MyBolgPostingLocalServiceUtil;
import com.liferay.service.myBlogPosting.service.base.MyBolgPostingLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.service.myBlogPosting.model.MyBolgPosting",
	service = AopService.class
)
public class MyBolgPostingLocalServiceImpl extends MyBolgPostingLocalServiceBaseImpl {
	
	@Override
	public void addOrUpdateMyBolgPosting( long groupId, long companyId, long userId, String userName, String heading, String description,long myBlogPostingId) {
		MyBolgPosting myBlogPosting=null;
		try {
		myBlogPosting = getMyBolgPosting(myBlogPostingId);
		myBlogPosting.setCompanyId(companyId);
		myBlogPosting.setGroupId(groupId);
		myBlogPosting.setHeading(heading);
		myBlogPosting.setUserName(userName);
		myBlogPosting.setDescription(description);
		myBlogPosting.setUserId(userId);
		updateMyBolgPosting(myBlogPosting);
		}catch(Exception e) {
			myBlogPosting = MyBolgPostingLocalServiceUtil.createMyBolgPosting(myBlogPostingId);
			myBlogPosting.setCompanyId(companyId);
			myBlogPosting.setGroupId(groupId);
			myBlogPosting.setHeading(heading);
			myBlogPosting.setUserName(userName);
			myBlogPosting.setDescription(description);
			myBlogPosting.setUserId(userId);
			addMyBolgPosting(myBlogPosting);
		}
	}
	
}

