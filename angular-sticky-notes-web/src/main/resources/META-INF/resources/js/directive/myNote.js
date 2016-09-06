angular.module('app.directives').
	directive('myNote', function () {
		return {
			restrict:'E',
			scope:{
				delete:'&',
				update:'&',
				note:'='
			},
			link:function (scope, element, attrs) {
				element.hide().fadeIn('slow');

				$('.thumbnails').sortable({
					placeholder:"ui-state-highlight", forcePlaceholderSize:true
				});
			}
		};
	}
);