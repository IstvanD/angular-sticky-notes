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

package com.example.notes.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.example.notes.model.Note;
import com.example.notes.service.base.NoteLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the note local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.notes.service.NoteLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NoteLocalServiceBaseImpl
 * @see com.example.notes.service.NoteLocalServiceUtil
 */
@ProviderType
public class NoteLocalServiceImpl extends NoteLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.example.notes.service.NoteLocalServiceUtil} to access the note local service.
	 */

	@Override
	public Note addNote(
			long userId, long groupId, String content, int priority,
			ServiceContext serviceContext)
		throws PortalException {

		User user = userPersistence.findByPrimaryKey(userId);

		long noteId = counterLocalService.increment();

		Note note = notePersistence.create(noteId);

		note.setGroupId(groupId);
		note.setCompanyId(user.getCompanyId());
		note.setUserId(user.getUserId());
		note.setContent(content);
		note.setPriority(priority);

		notePersistence.update(note);

		return note;
	}
	
	@Override
	public List<Note> getUserNotes(
		long userId, int start, int end) {

		return notePersistence.findByUserId(
			userId, start, end);
		
	}

	@Override
	public Note updateNote(long noteId, String content, int priority) throws PortalException {
		Note note = notePersistence.findByPrimaryKey(noteId);

		note.setContent(content);
		note.setPriority(priority);

		notePersistence.update(note);

		return note;
	}
}