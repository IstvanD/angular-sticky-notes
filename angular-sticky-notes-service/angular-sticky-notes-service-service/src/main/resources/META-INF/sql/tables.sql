create table Notes_Note (
	noteId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	content VARCHAR(75) null,
	priority INTEGER
);