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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for Note. This utility wraps
 * {@link com.example.notes.service.impl.NoteServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see NoteService
 * @see com.example.notes.service.base.NoteServiceBaseImpl
 * @see com.example.notes.service.impl.NoteServiceImpl
 * @generated
 */
@ProviderType
public class NoteServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.example.notes.service.impl.NoteServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.example.notes.model.Note addNote(long groupId,
		java.lang.String content, int priority,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().addNote(groupId, content, priority, serviceContext);
	}

	public static com.example.notes.model.Note deleteNote(long noteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteNote(noteId);
	}

	public static com.example.notes.model.Note updateNote(long noteId,
		java.lang.String content, int priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().updateNote(noteId, content, priority);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.example.notes.model.Note> getNotes(
		int start, int end) {
		return getService().getNotes(start, end);
	}

	public static java.util.List<com.example.notes.model.Note> getUserNotes(
		long userId, int start, int end) {
		return getService().getUserNotes(userId, start, end);
	}

	public static NoteService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NoteService, NoteService> _serviceTracker = ServiceTrackerFactory.open(NoteService.class);
}