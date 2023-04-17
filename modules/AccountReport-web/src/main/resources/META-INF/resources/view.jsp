<%@ include file="/init.jsp"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/all.min.css">

<portlet:resourceURL id="/user/detail" var="userDetailUrl"></portlet:resourceURL>


<div class="card">
	<div class="card-header">
		<h3>User Detail</h3>
	</div>
	<div class="card-body">
		<div class="container" style="height: 50px">
			<select class="form-select w-100 h-100"
				name="<portlet:namespace/>document">
				<option selected>Choose...</option>
				<option>Option1</option>
				<option>Option2</option>
			</select>
		</div>
	</div>
	<button class="btn btn-success" onclick="printData('${userDetailUrl}')">getData</button>
</div>

<div id="generate_pdf">
	<div id="table_data" class="table_pdf container"
		style="border: 2px solid black;">
		<table class="table" id="pdf_table"
			style="font-size: 15px; color: black; font-family: 'Times New Roman', serif;"></table>
	</div>
</div>


<!-- js part of the above code -->
<script src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>

<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/js/dataTables.buttons.js"></script>


<script>
	function printData(downloadUrl) {
		console.log(downloadUrl)
		$.ajax({
			url : downloadUrl,
			processData : false,
			contentType : false,
			type : 'POST',
			success : function(data) {
				console.log("hello frome success");
				var jsonObject = JSON.parse(data);
				console.log(jsonObject);
				userSaveAsExcel(jsonObject);
			},
			error : function(jqxhr, status, exception) {
				console.log("hello frome failure");
				alert('Exception:', exception);
			}
		});
		console.log("end of ajax")
	}

	function userSaveAsExcel(jsonArray) {

		var len = jsonArray.length;
		var userDetailExcel = $('#pdf_table').DataTable({
			"data" : jsonArray,
			"paging" : false,
			"bFilter" : false, // hide Search bar
			"bInfo" : false, // hide showing entries
			"dom" : 'Bfrtip',
			"bDestroy" : true,
			"ordering" : false,
			dom: 'Bfrtip',
				buttons: [
        		
                {
                	extend: 'excel',
                    className: 'btn btn-xs',
                    extension: '.xlsx',
                    filename: 'UserDetail',
                    title:"",

                }
			],
			"columns" : [ {
				"data" : "FirstName",
				"title" : "First Name"
			}, {
				"data" : "LastName",
				"title" : "Last Name"
			}, {
				"data" : "EmailAddress",
				"title" : "Email Address"
			}, {
				"data" : "ScreenName",
				"title" : "Screen Name"
			} ]
		});
		userDetailExcel.buttons('.buttons-excel').trigger();
	}
</script>








