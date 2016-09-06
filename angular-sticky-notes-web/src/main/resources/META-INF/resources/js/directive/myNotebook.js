angular.module('app.directives').
	directive('myNotebook', ['url',
    	function (url) {
        	return {
        		restrict:"E",
        		scope:{
        			notes:'=',
        			ondelete:'&',
        			onupdate:'&'
        		},
        		templateUrl: url.createRenderUrl('notebook-directive'),
        		controller:function ($scope, $attrs) {
        			$scope.deleteNote = function (note) {
        				$scope.ondelete({note:note});
        			}
        			$scope.updateNote = function (note) {
        				$scope.onupdate({note:note});
        			}
        			$scope.priorities = [
        			    {value: 1, text: 'High'},
        			    {value: 2, text: 'Medium'},
        			    {value: 3, text: 'Low'}
        			]; 
        		}
        	};
		}
	]
);