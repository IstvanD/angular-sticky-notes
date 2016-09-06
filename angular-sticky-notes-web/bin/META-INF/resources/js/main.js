'use strict';

function bootstrap(id, portletId) {

	var app = angular.module(id, ["ui.router", "app.services", "app.controllers", "app.directives", "pascalprecht.translate", "jcs-autoValidate", "xeditable"]);

	app.run(['$rootScope', 'releaseFactory', 'url', 'validator', 'i18nErrorMessageResolver',
		function($rootScope, releaseFactory, url, validator, i18nErrorMessageResolver) {

			$rootScope.portletId = portletId.substr(1, portletId.length - 2);

			$rootScope.liferay = {
				token: Liferay.authToken,
				companyId: Liferay.ThemeDisplay.getCompanyId(),
				loggedIn: Liferay.ThemeDisplay.isSignedIn()
			};

			releaseFactory.getRelease().then(function(release) {
				$rootScope.liferay.release = release;
			});

			$rootScope.$on('$stateChangeStart', function(event, toState, toParams, fromState, fromParams) {
				if (!toState.hasOwnProperty('fixedUrl')) {
					toState.templateUrl = url.createRenderUrl(toState.templateUrl);
					toState.fixedUrl = true;
				}
			});

			validator.setErrorMessageResolver(i18nErrorMessageResolver.resolve);
		}
	]);

	app.config(['$urlRouterProvider', '$stateProvider', '$locationProvider', '$translateProvider', 'urlProvider',
		function($urlRouterProvider, $stateProvider, $locationProvider, $translateProvider, urlProvider) {

			urlProvider.setPid(portletId);

			$translateProvider.useUrlLoader(urlProvider.$get().createResourceUrl('language', 'locale', Liferay.ThemeDisplay.getBCP47LanguageId()));
			$translateProvider.preferredLanguage(Liferay.ThemeDisplay.getBCP47LanguageId());

			// No # when routing!
			$locationProvider.html5Mode({
				  enabled: true,
				  requireBase: false
				}
			);

			var currentPageUrl = Liferay.ThemeDisplay.getLayoutURL();
			currentPageUrl = currentPageUrl.substr(currentPageUrl.indexOf('/', 10));
			$urlRouterProvider.otherwise(currentPageUrl);

			$stateProvider
				.state("notebook", {
					url: currentPageUrl,
					templateUrl: 'notebook',
					controller: 'NotebookCtrl'
				});
		}
	]);

	angular.bootstrap(document.getElementById(id), [id]);
}