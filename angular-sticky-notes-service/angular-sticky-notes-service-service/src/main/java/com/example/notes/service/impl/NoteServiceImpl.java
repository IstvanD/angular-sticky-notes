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
import com.example.notes.service.base.NoteServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the note remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.notes.service.NoteService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NoteServiceBaseImpl
 * @see com.example.notes.service.NoteServiceUtil
 */
@ProviderType
public class NoteServiceImpl extends NoteServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.example.notes.service.NoteServiceUtil} to access the note remote service.
	 */
	
	@Override
	public Note addNote(
			long groupId, String content, int priority,
			ServiceContext serviceContext)
		throws PortalException {

		return noteLocalService.addNote(
			getUserId(), groupId, content, priority, 
			serviceContext);
	}

	@Override
	public Note deleteNote(long noteId) throws PortalException {
		return noteLocalService.deleteNote(noteId);
	}

	@Override
	public List<Note> getNotes(int start, int end) {
		return notePersistence.findAll(start, end);
	}

	@Override
	public List<Note> getUserNotes(
		long userId, int start, int end) {

		return notePersistence.findByUserId(
			userId, start, end);
	}
	
	@Override
	public Note updateNote(long noteId, String content, int priority) throws PortalException {
		return noteLocalService.updateNote(noteId, content, priority);
	}
}