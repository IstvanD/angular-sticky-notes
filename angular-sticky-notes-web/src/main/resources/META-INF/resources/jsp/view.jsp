<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<div id="<portlet:namespace />main" ng-cloak>
	<div ng-hide="liferay.loggedIn">You need to be logged in to use this portlet</div>
	<div ui-view ng-show="liferay.loggedIn"></div>
</div>


<aui:script use="liferay-portlet-url,liferay-service,liferay-language,aui-base">

	bootstrap('<portlet:namespace />main', '<portlet:namespace />');

</aui:script>