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

package com.example.notes.service.http;

import aQute.bnd.annotation.ProviderType;

import com.example.notes.service.NoteServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link NoteServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.example.notes.model.NoteSoap}.
 * If the method in the service utility returns a
 * {@link com.example.notes.model.Note}, that is translated to a
 * {@link com.example.notes.model.NoteSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NoteServiceHttp
 * @see com.example.notes.model.NoteSoap
 * @see NoteServiceUtil
 * @generated
 */
@ProviderType
public class NoteServiceSoap {
	public static com.example.notes.model.NoteSoap addNote(long groupId,
		java.lang.String content, int priority,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.example.notes.model.Note returnValue = NoteServiceUtil.addNote(groupId,
					content, priority, serviceContext);

			return com.example.notes.model.NoteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.example.notes.model.NoteSoap deleteNote(long noteId)
		throws RemoteException {
		try {
			com.example.notes.model.Note returnValue = NoteServiceUtil.deleteNote(noteId);

			return com.example.notes.model.NoteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.example.notes.model.NoteSoap[] getNotes(int start, int end)
		throws RemoteException {
		try {
			java.util.List<com.example.notes.model.Note> returnValue = NoteServiceUtil.getNotes(start,
					end);

			return com.example.notes.model.NoteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.example.notes.model.NoteSoap[] getUserNotes(long userId,
		int start, int end) throws RemoteException {
		try {
			java.util.List<com.example.notes.model.Note> returnValue = NoteServiceUtil.getUserNotes(userId,
					start, end);

			return com.example.notes.model.NoteSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.example.notes.model.NoteSoap updateNote(long noteId,
		java.lang.String content, int priority) throws RemoteException {
		try {
			com.example.notes.model.Note returnValue = NoteServiceUtil.updateNote(noteId,
					content, priority);

			return com.example.notes.model.NoteSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(NoteServiceSoap.class);
}