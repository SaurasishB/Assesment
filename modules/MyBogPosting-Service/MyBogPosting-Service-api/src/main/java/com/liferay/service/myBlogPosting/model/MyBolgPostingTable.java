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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Scheduler_MyBolgPosting&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see MyBolgPosting
 * @generated
 */
public class MyBolgPostingTable extends BaseTable<MyBolgPostingTable> {

	public static final MyBolgPostingTable INSTANCE = new MyBolgPostingTable();

	public final Column<MyBolgPostingTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, Long> myBlogPostingId =
		createColumn(
			"myBlogPostingId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MyBolgPostingTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, String> heading = createColumn(
		"heading", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MyBolgPostingTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MyBolgPostingTable() {
		super("Scheduler_MyBolgPosting", MyBolgPostingTable::new);
	}

}