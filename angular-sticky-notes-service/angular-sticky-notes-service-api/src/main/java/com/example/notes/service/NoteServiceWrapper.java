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

package com.example.notes.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NoteService}.
 *
 * @author Brian Wing Shun Chan
 * @see NoteService
 * @generated
 */
@ProviderType
public class NoteServiceWrapper implements NoteService,
	ServiceWrapper<NoteService> {
	public NoteServiceWrapper(NoteService noteService) {
		_noteService = noteService;
	}

	@Override
	public com.example.notes.model.Note addNote(long groupId,
		java.lang.String content, int priority,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteService.addNote(groupId, content, priority, serviceContext);
	}

	@Override
	public com.example.notes.model.Note deleteNote(long noteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteService.deleteNote(noteId);
	}

	@Override
	public com.example.notes.model.Note updateNote(long noteId,
		java.lang.String content, int priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _noteService.updateNote(noteId, content, priority);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _noteService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List<com.example.notes.model.Note> getNotes(int start,
		int end) {
		return _noteService.getNotes(start, end);
	}

	@Override
	public java.util.List<com.example.notes.model.Note> getUserNotes(
		long userId, int start, int end) {
		return _noteService.getUserNotes(userId, start, end);
	}

	@Override
	public NoteService getWrappedService() {
		return _noteService;
	}

	@Override
	public void setWrappedService(NoteService noteService) {
		_noteService = noteService;
	}

	private NoteService _noteService;
}