angular.module("app.services").

	factory('i18nErrorMessageResolver', ['$q', '$translate',
		function($q, $translate) {

			var resolve = function(errorType, el) {
				var defer = $q.defer();

				var prefix = "validation.";
				$translate(prefix + errorType).then(function(message) {
					if (el && el.attr) {
						try {
							var parameters = [];
							var parameter = el.attr('ng-' + errorType);
							if (parameter === undefined) {
								parameter = el.attr('data-ng-' + errorType) || el.attr(errorType);
							}

							parameters.push(parameter || '');

							message = message.format(parameters);
						} catch (e) {}
					}

					defer.resolve(message);
				});

				return defer.promise;
			};

			return {
				resolve: resolve
			};
		}
	]
);