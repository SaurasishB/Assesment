<%@ include file="/init.jsp"%>

<%@ include file="/init.jsp"%>
<%
	List<Phone> phoneList = user.getPhones();
	long phoneId = 0L;
	String phoneNumber = StringPool.BLANK;
	if (phoneList != null && !phoneList.isEmpty()) {
		for (Phone phone : phoneList) {
			phoneNumber = phone.getNumber();
			phoneId = phone.getPhoneId();
			break;
		}
	}
	String pan = (String) renderRequest.getAttribute("pan");
	String address = (String) renderRequest.getAttribute("address");
	String gstn = (String) renderRequest.getAttribute("gstn");
	String business = (String) renderRequest.getAttribute("business");
%>

<portlet:actionURL name="updateUser" var="updateUserURL">
	<portlet:param name="phoneId" value="<%=String.valueOf(phoneId)%>" />
</portlet:actionURL>
<portlet:actionURL name="addorUpdateDetail" var="addOrUpdateKycURL" />
<portlet:renderURL var="KYCDetail">
	<portlet:param name="mvcPath" value="/Componets/model.jsp" />
</portlet:renderURL>

<script type="text/javascript">
	function reload(){
		setTimeout(() => {
			  window.location.reload();
			}, 500);
	}
</script>

<div class="row mt-2">
	<div class="col-4">
		<!--to uploda th profile pic-->
		<div class="card">
			<div class="card-header">
				<h3>Profile Picture</h3>
			</div>
			<div class="card-body">
				<input class="form-control" name="profileImage" type="file"
					accept="image/png,image/gif,image/jpge"><img
					src="https://www.aceshowbiz.com/images/photo/leonardo_dicaprio.jpg"
					name="profileImage" alt="" class="round mx-auto d-block"
					id="profile-image" /></input>
				<button type="submit" class="btn btn-primary">Upload</button>
			</div>
		</div>
	</div>
	<div class="col-8">
		<!--  disabled form-->
		<div class="card form">
			<div class="card-header">
				<h1>Detail</h1>
			</div>
			<div class="card-body">

				<aui:form action="<%=updateUserURL%>"
					name="<portlet:namespace/>userDetail">
					<div class="mb-3">
						<label for="firstName" class="form-label">Dealer Id</label> <input
							type="text" class="form-control" id="firstName"
							value="<%=user.getUserId()%>" disabled />
					</div>
					<div class="row">
						<div class="col-6">
							<div class="mb-3">
								<label for="firstName" class="form-label">First Name</label> <input
									type="text" class="form-control" id="firstName"
									value="<%=user.getFirstName()%>" disabled />
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email
									address</label> <input type="email" class="form-control"
									name="<portlet:namespace/>emailAddress" id="exampleInputEmail1"
									value="<%=user.getEmailAddress()%>" />
							</div>
						</div>
						<div class="col-6">
							<div class="mb-3">
								<label for="lastName" class="form-label">Last Name</label> <input
									type="text" class="form-control" id="lastName"
									value="<%=user.getLastName()%>" disabled />
							</div>
							<div class="mb-3">
								<label for="phoneNumber" class="form-label">Contact
									Number</label> <input type="text" class="form-control"
									name="<portlet:namespace/>phoneNumber" id="phoneNumbr"
									maxlength="10" value="<%=phoneNumber%>" />
							</div>
						</div>
					</div>
					<button type="submit" class="btn btn-primary" onClick="reload()">Submit</button>
				</aui:form>
			</div>
		</div>
	</div>
</div>

<div class="container">
	<div class="card">
		<div class="card-header">
			<h3>KYC Detail</h3>
		</div>
		<div class="card-body">
			<div class="mb-3">
				<label for="address" class="form-label">Address</label> <input
					type="text" class="form-control" id="address" value="<%=address%>"
					disabled />
			</div>
			<div class="row">

				<div class="col-6">
					<div class="mb-3">
						<label for="panNumber" class="form-label">PAN Number</label> <input
							type="text" class="form-control" id="panNumber" value="<%=pan%>"
							disabled />
					</div>
				</div>
				<div class="col-6">
					<div class="mb-3">
						<label for="gstnNumber" class="form-label">GSTN Number</label> <input
							type="text" class="form-control" id="gstnNumber"
							value="<%=gstn%>" disabled />
					</div>

				</div>
			</div>
			<div class="mb-3">
				<label for="businessType" class="form-label">Business Type</label> <input
					type="text" class="form-control" id="businessType"
					value="<%=business%>" disabled />
			</div>
			<button type="submit" class="btn btn-primary" data-toggle="modal"
				data-target="#testModal">KYC Update</button>
		</div>
	</div>
</div>




<!-- modal thing -->

<div class="modal modal-dialog-centered" role="dialog" id="testModal"
	tabindex="-1" aria-labelledby="commentModalLabel"
	style="display: none;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h1 class="modal-title">KYC Update1</h1>
			</div>
			<div class="modal-body">
				<aui:form action="<%=addOrUpdateKycURL%>"
					name="<portlet:namespace/>userDetail" method="post">
					<div class="container" style="height: 50px">
						<select class="form-select w-100 h-100"
							name="<portlet:namespace/>document">
							<option selected>Choose...</option>
							<option>PAN Card</option>
							<option>GSTN</option>
							<option>Business</option>
							<option>Address</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="documentId" class="form-label">Document Number</label>
						<input type="String" class="form-control" id="documentId"
							name="<portlet:namespace/>documentId" />
					</div>
					<div class="mb-3">
						<label for="message" class="form-label">Message</label> <input
							type="String" class="form-control" id="message"
							name="<portlet:namespace/>message" />
					</div>
					<div class="mb-3">
						<label for="file" class="form-label">Upload File</label> <input
							type="file" class="form-control" id="file"
							name="<portlet:namespace/>file" />
					</div>
					<button class="btn btn-secondary" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary" onClick="reload()">Upload</button>
				</aui:form>
			</div>
		</div>
	</div>
</div>
