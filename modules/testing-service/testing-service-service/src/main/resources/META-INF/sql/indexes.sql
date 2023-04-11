create index IX_5B46C64 on Panasonic_KycDetails (userId);
create index IX_DF2DE99E on Panasonic_KycDetails (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_7C03FA0 on Panasonic_KycDetails (uuid_[$COLUMN_LENGTH:75$], groupId);