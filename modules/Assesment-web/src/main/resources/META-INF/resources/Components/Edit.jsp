<%@ include file= "../init.jsp" %>

<%
long userId = ParamUtil.getLong(request,"userId");
User user1 = UserLocalServiceUtil.getUser(userId);
long phoneId = ParamUtil.getLong(request,"phoneId");
Phone phone = PhoneLocalServiceUtil.getPhone(phoneId);
%>

<portlet:renderURL var ="viewUrl">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="updateEntry" var="updateEntryURL" >
	<portlet:param name="userId" value="<%=String.valueOf(userId) %>"/>
	<portlet:param name="phoneId" value="<%=String.valueOf(phoneId) %>"/>
</portlet:actionURL>

<aui:form action="<%= updateEntryURL %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input label="First name" name="firstName" value="<%=user1.getFirstName()%>" >
			
		</aui:input>
	    <aui:input name="lastName" label = "Last Name" value="<%=user1.getLastName()%>" >
	    	
	    </aui:input>
	    <aui:input name="emailId" lable="Email Id" value="<%=user1.getEmailAddress()%>" >
	    	
	    </aui:input>
	    <aui:input lable="Phnone Number" name="phoneNumber" value="<%=phone.getNumber()%>" >
	    	
	    </aui:input>
	    <aui:input name="userName" lable ="User Name" value="<%=user1.getScreenName()%>">
	    	
	    </aui:input>
	  
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" value="Submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewUrl.toString() %>" value= "Cancel"></aui:button>
	</aui:button-row>
</aui:form>