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

package com.example.notes.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.example.notes.exception.NoSuchNoteException;
import com.example.notes.model.Note;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the note service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.notes.service.persistence.impl.NotePersistenceImpl
 * @see NoteUtil
 * @generated
 */
@ProviderType
public interface NotePersistence extends BasePersistence<Note> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NoteUtil} to access the note persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the notes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching notes
	*/
	public java.util.List<Note> findByCompanyId(long companyId);

	/**
	* Returns a range of all the notes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of matching notes
	*/
	public java.util.List<Note> findByCompanyId(long companyId, int start,
		int end);

	/**
	* Returns an ordered range of all the notes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns an ordered range of all the notes where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first note in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the first note in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the last note in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the last note in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the notes before and after the current note in the ordered set where companyId = &#63;.
	*
	* @param noteId the primary key of the current note
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note[] findByCompanyId_PrevAndNext(long noteId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Removes all the notes where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of notes where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching notes
	*/
	public int countByCompanyId(long companyId);

	/**
	* Returns all the notes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching notes
	*/
	public java.util.List<Note> findByGroupId(long groupId);

	/**
	* Returns a range of all the notes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of matching notes
	*/
	public java.util.List<Note> findByGroupId(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the notes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns an ordered range of all the notes where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first note in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the first note in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the last note in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the last note in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the notes before and after the current note in the ordered set where groupId = &#63;.
	*
	* @param noteId the primary key of the current note
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note[] findByGroupId_PrevAndNext(long noteId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Removes all the notes where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of notes where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching notes
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the notes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching notes
	*/
	public java.util.List<Note> findByUserId(long userId);

	/**
	* Returns a range of all the notes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of matching notes
	*/
	public java.util.List<Note> findByUserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the notes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns an ordered range of all the notes where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first note in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the first note in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the last note in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the last note in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the notes before and after the current note in the ordered set where userId = &#63;.
	*
	* @param noteId the primary key of the current note
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note[] findByUserId_PrevAndNext(long noteId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Removes all the notes where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of notes where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching notes
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the notes where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching notes
	*/
	public java.util.List<Note> findByG_U(long groupId, long userId);

	/**
	* Returns a range of all the notes where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of matching notes
	*/
	public java.util.List<Note> findByG_U(long groupId, long userId, int start,
		int end);

	/**
	* Returns an ordered range of all the notes where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByG_U(long groupId, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns an ordered range of all the notes where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching notes
	*/
	public java.util.List<Note> findByG_U(long groupId, long userId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first note in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByG_U_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the first note in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByG_U_First(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the last note in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note
	* @throws NoSuchNoteException if a matching note could not be found
	*/
	public Note findByG_U_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Returns the last note in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching note, or <code>null</code> if a matching note could not be found
	*/
	public Note fetchByG_U_Last(long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns the notes before and after the current note in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param noteId the primary key of the current note
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note[] findByG_U_PrevAndNext(long noteId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator)
		throws NoSuchNoteException;

	/**
	* Removes all the notes where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	*/
	public void removeByG_U(long groupId, long userId);

	/**
	* Returns the number of notes where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching notes
	*/
	public int countByG_U(long groupId, long userId);

	/**
	* Caches the note in the entity cache if it is enabled.
	*
	* @param note the note
	*/
	public void cacheResult(Note note);

	/**
	* Caches the notes in the entity cache if it is enabled.
	*
	* @param notes the notes
	*/
	public void cacheResult(java.util.List<Note> notes);

	/**
	* Creates a new note with the primary key. Does not add the note to the database.
	*
	* @param noteId the primary key for the new note
	* @return the new note
	*/
	public Note create(long noteId);

	/**
	* Removes the note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param noteId the primary key of the note
	* @return the note that was removed
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note remove(long noteId) throws NoSuchNoteException;

	public Note updateImpl(Note note);

	/**
	* Returns the note with the primary key or throws a {@link NoSuchNoteException} if it could not be found.
	*
	* @param noteId the primary key of the note
	* @return the note
	* @throws NoSuchNoteException if a note with the primary key could not be found
	*/
	public Note findByPrimaryKey(long noteId) throws NoSuchNoteException;

	/**
	* Returns the note with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param noteId the primary key of the note
	* @return the note, or <code>null</code> if a note with the primary key could not be found
	*/
	public Note fetchByPrimaryKey(long noteId);

	@Override
	public java.util.Map<java.io.Serializable, Note> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the notes.
	*
	* @return the notes
	*/
	public java.util.List<Note> findAll();

	/**
	* Returns a range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of notes
	*/
	public java.util.List<Note> findAll(int start, int end);

	/**
	* Returns an ordered range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notes
	*/
	public java.util.List<Note> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator);

	/**
	* Returns an ordered range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of notes
	*/
	public java.util.List<Note> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Note> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the notes from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of notes.
	*
	* @return the number of notes
	*/
	public int countAll();
}