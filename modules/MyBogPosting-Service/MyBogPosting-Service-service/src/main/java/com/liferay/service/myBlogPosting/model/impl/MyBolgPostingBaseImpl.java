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

import com.liferay.service.myBlogPosting.model.MyBolgPosting;
import com.liferay.service.myBlogPosting.service.MyBolgPostingLocalServiceUtil;

/**
 * The extended model base implementation for the MyBolgPosting service. Represents a row in the &quot;Scheduler_MyBolgPosting&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MyBolgPostingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPostingImpl
 * @see MyBolgPosting
 * @generated
 */
public abstract class MyBolgPostingBaseImpl
	extends MyBolgPostingModelImpl implements MyBolgPosting {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a my bolg posting model instance should use the <code>MyBolgPosting</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			MyBolgPostingLocalServiceUtil.addMyBolgPosting(this);
		}
		else {
			MyBolgPostingLocalServiceUtil.updateMyBolgPosting(this);
		}
	}

}