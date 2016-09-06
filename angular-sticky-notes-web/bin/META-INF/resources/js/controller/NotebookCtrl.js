angular.module("app.controllers").
	controller('NotebookCtrl', ['$scope', 'noteFactory', function ($scope, noteFactory) {

		$scope.notes = [];

		$scope.getNotes = function () {
			noteFactory.getNotes().then(function(result) {
				$scope.notes = result;
	        });
		};

		$scope.addNote = function (noteContent, priority) {
			if (!priority) {
				priority = 2;
			}
			if(noteContent != '') {
				noteFactory.addNote(noteContent, priority).then(function(result) {
					console.log("Note added!");

					$scope.notes.push(result);
		        });	
			}
		};

		$scope.updateNote = function (note) {
			noteFactory.updateNote(note).then(function(result) {
				console.log("Note updated!");
			}
		)};

		$scope.deleteNote = function (note) {
			noteFactory.deleteNote(note).then(function(result) {
				console.log("Note deleted!");
				
				var oldNotes = $scope.notes;
				$scope.notes = [];
				
				angular.forEach(oldNotes, function (iNote) {
	                if (iNote.noteId !== note.noteId) $scope.notes.push(iNote);
	            });
			}		
		)};

		$scope.resetForm = function() {
			$scope.noteContent = '';
			$scope.priority = 2;
		};

		Liferay.on('reloadNotes', function(event) {
			console.log("Reload event");
			$scope.getNotes();
		});
		
		$scope.getNotes();
	}
]);