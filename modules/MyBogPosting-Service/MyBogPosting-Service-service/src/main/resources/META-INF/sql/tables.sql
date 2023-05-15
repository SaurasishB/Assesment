create table Scheduler_MyBolgPosting (
	uuid_ VARCHAR(75) null,
	myBlogPostingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	heading VARCHAR(75) null,
	description VARCHAR(75) null
);