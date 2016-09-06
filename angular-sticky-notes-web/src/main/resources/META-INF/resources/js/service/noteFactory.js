angular.module('app.services').
	factory('noteFactory', function($q, $http) {
		var getNotes = function() {
			var deferred = $q.defer();

			Liferay.Service(
					'/notes.note/get-user-notes',
					{
						userId: Liferay.ThemeDisplay.getUserId(),
						start: -1,
						end: -1
					},
					function(obj) {
						deferred.resolve(obj);
					}
				);

			return deferred.promise;
		};
		
		var addNote = function(noteContent, priority) {
			var deferred = $q.defer();

			Liferay.Service(
				'/notes.note/add-note',
				{
					groupId: Liferay.ThemeDisplay.getScopeGroupId(),
					content: noteContent,
					priority: priority,
					serviceContext: {}
				},
				function(obj) {
					deferred.resolve(obj);
				}
			);

			return deferred.promise;
		};
		
		var deleteNote = function(note) {
			var deferred = $q.defer();

			Liferay.Service(
				'/notes.note/delete-note',
				{
					noteId: note.noteId
				},
				function(obj) {
					deferred.resolve(obj);
				}
			);

			return deferred.promise;
		};

		var updateNote = function(note) {
			var deferred = $q.defer();

			Liferay.Service(
				'/notes.note/update-note',
				{
					noteId: note.noteId,
					content: note.content,
					priority: note.priority
				},
				function(obj) {
					deferred.resolve(obj);
				}
			);

			return deferred.promise;
		};

		return {
			getNotes: getNotes,
			addNote: addNote,
			deleteNote: deleteNote,
			updateNote: updateNote
		};
	}
);