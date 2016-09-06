package com.example;

import javax.portlet.Portlet;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;


@Component(
	immediate = true,
	property = {
			"com.liferay.portlet.portlet-name=angularstickynotes",	
			"com.liferay.portlet.display-category=category.sample",
			"com.liferay.portlet.instanceable=true",
			"com.liferay.portlet.ajaxable=false",
			"com.liferay.portlet.header-portlet-css=/o/angular-sticky-notes-web/bootstrap/css/bootstrap.css",
			"com.liferay.portlet.header-portlet-css=/o/angular-sticky-notes-web/xeditable/css/xeditable.css",
			"com.liferay.portlet.header-portlet-css=/o/angular-sticky-notes-web/bootstrap/css/bootstrap-responsive.css",
			"com.liferay.portlet.header-portlet-css=/o/angular-sticky-notes-web/css/app.css",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/bootstrap/js/bootstrap.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/angular.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/angular-ui-router.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/angular-translate.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/angular-translate-loader-url.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/jcs-auto-validate.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/jquery.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/jquery-ui.js",
			"com.liferay.portlet.footer-portal-javascript=/o/angular-sticky-notes-web/js/xeditable.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/service/Init.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/service/ErrorMessageResolver.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/service/releaseFactory.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/service/urlFactory.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/service/noteFactory.js",	
			"com.liferay.portlet.footer-portlet-javascript=/js/controller/Init.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/controller/NotebookCtrl.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/directive/Init.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/directive/myNotebook.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/directive/myNote.js",
			"com.liferay.portlet.footer-portlet-javascript=/js/main.js",
			"com.liferay.portlet.css-class-wrapper=angular-sticky-notes",
			"javax.portlet.display-name=Angular Sticky Notes",
			"javax.portlet.init-param.template-path=/",
			"javax.portlet.init-param.valid-paths=/partials/notebook.html,/partials/notebook-directive.html",
			"javax.portlet.init-param.view-template=/jsp/view.jsp",
			"javax.portlet.resource-bundle=content.Language",
			"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AngularStickyNotesPortlet extends MVCPortlet {
}