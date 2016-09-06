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

package com.example.notes.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Note}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Note
 * @generated
 */
@ProviderType
public class NoteWrapper implements Note, ModelWrapper<Note> {
	public NoteWrapper(Note note) {
		_note = note;
	}

	@Override
	public Class<?> getModelClass() {
		return Note.class;
	}

	@Override
	public String getModelClassName() {
		return Note.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("noteId", getNoteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("content", getContent());
		attributes.put("priority", getPriority());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long noteId = (Long)attributes.get("noteId");

		if (noteId != null) {
			setNoteId(noteId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Integer priority = (Integer)attributes.get("priority");

		if (priority != null) {
			setPriority(priority);
		}
	}

	@Override
	public Note toEscapedModel() {
		return new NoteWrapper(_note.toEscapedModel());
	}

	@Override
	public Note toUnescapedModel() {
		return new NoteWrapper(_note.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _note.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _note.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _note.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _note.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Note> toCacheModel() {
		return _note.toCacheModel();
	}

	@Override
	public int compareTo(Note note) {
		return _note.compareTo(note);
	}

	/**
	* Returns the priority of this note.
	*
	* @return the priority of this note
	*/
	@Override
	public int getPriority() {
		return _note.getPriority();
	}

	@Override
	public int hashCode() {
		return _note.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _note.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NoteWrapper((Note)_note.clone());
	}

	/**
	* Returns the content of this note.
	*
	* @return the content of this note
	*/
	@Override
	public java.lang.String getContent() {
		return _note.getContent();
	}

	/**
	* Returns the user uuid of this note.
	*
	* @return the user uuid of this note
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _note.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _note.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _note.toXmlString();
	}

	/**
	* Returns the company ID of this note.
	*
	* @return the company ID of this note
	*/
	@Override
	public long getCompanyId() {
		return _note.getCompanyId();
	}

	/**
	* Returns the group ID of this note.
	*
	* @return the group ID of this note
	*/
	@Override
	public long getGroupId() {
		return _note.getGroupId();
	}

	/**
	* Returns the note ID of this note.
	*
	* @return the note ID of this note
	*/
	@Override
	public long getNoteId() {
		return _note.getNoteId();
	}

	/**
	* Returns the primary key of this note.
	*
	* @return the primary key of this note
	*/
	@Override
	public long getPrimaryKey() {
		return _note.getPrimaryKey();
	}

	/**
	* Returns the user ID of this note.
	*
	* @return the user ID of this note
	*/
	@Override
	public long getUserId() {
		return _note.getUserId();
	}

	@Override
	public void persist() {
		_note.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_note.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this note.
	*
	* @param companyId the company ID of this note
	*/
	@Override
	public void setCompanyId(long companyId) {
		_note.setCompanyId(companyId);
	}

	/**
	* Sets the content of this note.
	*
	* @param content the content of this note
	*/
	@Override
	public void setContent(java.lang.String content) {
		_note.setContent(content);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_note.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_note.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_note.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this note.
	*
	* @param groupId the group ID of this note
	*/
	@Override
	public void setGroupId(long groupId) {
		_note.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_note.setNew(n);
	}

	/**
	* Sets the note ID of this note.
	*
	* @param noteId the note ID of this note
	*/
	@Override
	public void setNoteId(long noteId) {
		_note.setNoteId(noteId);
	}

	/**
	* Sets the primary key of this note.
	*
	* @param primaryKey the primary key of this note
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_note.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_note.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the priority of this note.
	*
	* @param priority the priority of this note
	*/
	@Override
	public void setPriority(int priority) {
		_note.setPriority(priority);
	}

	/**
	* Sets the user ID of this note.
	*
	* @param userId the user ID of this note
	*/
	@Override
	public void setUserId(long userId) {
		_note.setUserId(userId);
	}

	/**
	* Sets the user uuid of this note.
	*
	* @param userUuid the user uuid of this note
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_note.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NoteWrapper)) {
			return false;
		}

		NoteWrapper noteWrapper = (NoteWrapper)obj;

		if (Objects.equals(_note, noteWrapper._note)) {
			return true;
		}

		return false;
	}

	@Override
	public Note getWrappedModel() {
		return _note;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _note.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _note.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_note.resetOriginalValues();
	}

	private final Note _note;
}