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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;Panasonic_KycDetails&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see KycDetails
 * @generated
 */
public class KycDetailsTable extends BaseTable<KycDetailsTable> {

	public static final KycDetailsTable INSTANCE = new KycDetailsTable();

	public final Column<KycDetailsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> kycDetailId = createColumn(
		"kycDetailId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<KycDetailsTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, String> address = createColumn(
		"address", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, String> panNumber = createColumn(
		"panNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, String> gstnNumber = createColumn(
		"gstnNumber", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, String> typeOfBusiness = createColumn(
		"typeOfBusiness", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> addressProofId = createColumn(
		"addressProofId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> panProofId = createColumn(
		"panProofId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> gstnProofId = createColumn(
		"gstnProofId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<KycDetailsTable, Long> typeOfBusinessId = createColumn(
		"typeOfBusinessId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private KycDetailsTable() {
		super("Panasonic_KycDetails", KycDetailsTable::new);
	}

}