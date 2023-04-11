<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib prefix="liferay-forntend" uri="http://liferay.com/tld/frontend" %>
<%@page import ="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import ="com.liferay.portal.kernel.model.User" %>
<%@page import ="com.liferay.portal.kernel.model.Phone" %>
<%@page import ="com.liferay.portal.kernel.model.Role" %>
<%@page import ="java.util.List" %>
<%@page import ="java.util.HashMap" %>
<%@page import = "com.liferay.portal.kernel.service.PhoneLocalServiceUtil"%>
<%@page import = "com.liferay.portal.kernel.service.RoleLocalServiceUtil"%>
<%@page import = "com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />