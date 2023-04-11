create table Panasonic_KycDetails (
	uuid_ VARCHAR(75) null,
	kycDetailId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	address VARCHAR(75) null,
	panNumber VARCHAR(75) null,
	gstnNumber VARCHAR(75) null,
	typeOfBusiness VARCHAR(75) null,
	addressProofId LONG,
	panProofId LONG,
	gstnProofId LONG,
	typeOfBusinessId LONG
);