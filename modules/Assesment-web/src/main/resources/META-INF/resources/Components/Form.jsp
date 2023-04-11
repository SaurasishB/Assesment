<%@include file="../init.jsp" %> 

<portlet:renderURL var ="viewUrl">
	<portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addEntry" var="addEntryURL" />

<aui:form action="<%= addEntryURL %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input label="First name" name="firstName">
			<aui:validator name="required"/>
		</aui:input>
	    <aui:input name="lastName" label = "Last Name" >
	    	<aui:validator name="required"/>
	    </aui:input>
	    <aui:input name="emailId" lable="Email Id">
	    	<aui:validator name="required"/>
	    </aui:input>
	    <aui:input lable="Phnone Number" name="phoneNumber">
	    	<aui:validator name="required"/>
	    </aui:input>
	    <aui:input name="userName" lable ="User Name">
	    	<aui:validator name="required"/>
	    </aui:input>
	    <aui:select name="role" lable="add Role">
	    	<aui:option value="Dealer">Dealer</aui:option>
	    </aui:select>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" value="Submit"></aui:button>
		<aui:button type="cancel" onClick="<%= viewUrl.toString() %>" value= "Cancel"></aui:button>
	</aui:button-row>
</aui:form>