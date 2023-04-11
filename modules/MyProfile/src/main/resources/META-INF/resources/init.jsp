<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@page import ="com.liferay.portal.kernel.theme.ThemeDisplay" %>
<%@page import ="com.liferay.portal.kernel.model.User" %>
<%@page import ="com.liferay.portal.kernel.model.Phone" %>
<%@page import ="com.liferay.portal.kernel.model.Contact" %>
<%@page import ="java.util.List" %>S
<%@page import = "com.liferay.portal.kernel.service.PhoneLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@page import="com.liferay.petra.string.StringPool" %>
<liferay-theme:defineObjects />

<portlet:defineObjects />