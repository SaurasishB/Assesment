<%@ include file="/init.jsp" %>
<%
List<Role> roleList = RoleLocalServiceUtil.getRoles(themeDisplay.getCompanyId());
long dealerRoleId = 0l;
long managerRoleId = 0l;
for (Role rolesingle : roleList) {
	if (rolesingle.getName().equals("dealer")) {
		dealerRoleId = rolesingle.getRoleId();
	}
	else if(rolesingle.getName().equals("manager")){
		managerRoleId = rolesingle.getRoleId();
		break;
	}	
}
List<User> userData = UserLocalServiceUtil.getRoleUsers(dealerRoleId); 
List<Phone> phoneData = PhoneLocalServiceUtil.getPhones();

List<User> managerData = UserLocalServiceUtil.getRoleUsers(managerRoleId);

List<Role> userRoles1=themeDisplay.getUser().getRoles();
for(Role role : userRoles1){
if((role.getName()).equals("manager")){ %>

<portlet:renderURL var ="addUrl">
	<portlet:param name="mvcPath" value="/Components/Form.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row>
    <aui:button  onClick="<%= addUrl.toString() %>" value="Add Entry"></aui:button>
</aui:button-row>

<table class="table table-striped">
	<thead>
	<tr>
		<th>First Nmae</th>
		<th>Last Nmae</th>
		<th>Email Id</th>
		<th>User Name</th>
		<th>Phone no.</th>
		<th>Action</th>
	</tr>
	</thead>
	<tbody>
		<%for (int i=0;i<userData.size();i++) {%>
			<tr>
				<th><%=userData.get(i).getFirstName() %></th>
				<th><%= userData.get(i).getLastName()%></th>
				<th><%= userData.get(i).getEmailAddress()%></th>
				<th><%=userData.get(i).getScreenName()%></th>
				<th><%=phoneData.get(i).getNumber() %></th>
				<th><liferay-ui:icon-menu>

			        <portlet:renderURL var="editURL">
			            <portlet:param name="userId"
			                value="<%= String.valueOf(userData.get(i).getUserId()) %>" />
			            <portlet:param name="phoneId"
			                value="<%= String.valueOf(phoneData.get(i).getPhoneId()) %>" />
			            <portlet:param name="mvcPath" value="/Components/Edit.jsp" />
			        </portlet:renderURL>
			        <liferay-ui:icon image="edit" message="Edit"
			            url="<%=editURL.toString() %>" />
			
			        <portlet:actionURL name="deleteEntry" var="deleteURL">
			            <portlet:param name="userId"
			                value="<%= String.valueOf(userData.get(i).getUserId()) %>" />
			            <portlet:param name="phoneId"
			                value="<%= String.valueOf(phoneData.get(i).getPhoneId()) %>" />
			        </portlet:actionURL>
			        <liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />

					</liferay-ui:icon-menu>
				</th>
			</tr>
		<%} %>
	</tbody>
</table>
<%}}%>

<%if((userRoles1.get(0).getName()).equals("Administrator")) {%>
<h1>Dealer Info</h1>
<table class="table table-striped">
	<thead>
	<tr>
		<th>First Nmae</th>
		<th>Last Nmae</th>
		<th>Email Id</th>
		<th>User Name</th>
		<th>Phone no.</th>
	</tr>
	</thead>
	<tbody>
		<%for (int i=0;i<userData.size();i++) {%>
			<tr>
				<th><%=userData.get(i).getFirstName() %></th>
				<th><%= userData.get(i).getLastName()%></th>
				<th><%= userData.get(i).getEmailAddress()%></th>
				<th><%=userData.get(i).getScreenName()%></th>
				<th><%=phoneData.get(i).getNumber() %></th>
			</tr>
		<%} %>
	</tbody>
</table>

<h1>Manager Info</h1>
<table class="table table-striped">
	<thead>
	<tr>
		<th>First Nmae</th>
		<th>Last Nmae</th>
		<th>Email Id</th>
		<th>User Name</th>
	</tr>
	</thead>
	<tbody>
		<%for (int i=0;i<managerData.size();i++) {%>
			<tr>
				<th><%=managerData.get(i).getFirstName() %></th>
				<th><%= managerData.get(i).getLastName()%></th>
				<th><%= managerData.get(i).getEmailAddress()%></th>
				<th><%=managerData.get(i).getScreenName()%></th>
			</tr>
		<%} %>
	</tbody>
</table>
<%} %>

<%for(Role role : userRoles1){
if((role.getName()).equals("dealer")){
	Phone phone=PhoneLocalServiceUtil.getPhone(user.getUserId());
%>
<aui:form>
	<aui:fieldset>
		<aui:input label="First name" name="firstName" value="<%=user.getFirstName()%>" disabled="true">
			
		</aui:input>
	    <aui:input name="lastName" label = "Last Name" value="<%=user.getLastName()%>" disabled="true">
	    	
	    </aui:input>
	    <aui:input name="emailId" lable="Email Id" value="<%=user.getEmailAddress()%>" disabled="true">
	    	
	    </aui:input>
	    <aui:input name="phoneNumber" lable="Phone Number" value="<%=phone.getNumber()%>" disabled="true">
	    
	    
	    </aui:input>
	    <aui:input name="userName" lable ="User Name" value="<%=user.getScreenName()%>" disabled="true">
	    	
	    </aui:input>
	    <aui:input name="role" lable ="Role" value="Dealer" disabled="true">
	    	
	    </aui:input>
	  
	</aui:fieldset>

</aui:form>

<%}} %>
