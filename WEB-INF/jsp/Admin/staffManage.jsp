<%@ include file="inc/common.jsp"%>
<!doctype html>
<html lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description"
	content="Blank Page | Propeller - Admin Dashboard">
<meta content="width=device-width, initial-scale=1, user-scalable=no"
	name="viewport">
<title>Manage Staff | Payroll</title>
<%@ include file="inc/common_css.jsp"%>
</head>

<body>
	<!-- Header Starts -->
	<!--Start Nav bar -->
	<%@ include file="inc/nav_bar.jsp"%>
	<!--End Nav bar -->
	<!-- Header Ends -->

	<!-- Left sidebar -->
	<%@ include file="inc/left_sidebar.jsp"%>
	<!-- Sidebar Ends -->

	<!--content area start-->
	<div id="content" class="pmd-content inner-page">
		<!--tab start-->
		<div class="container-fluid full-width-container blank">
			<!-- Title -->
			<h1 class="section-title" id="services">
				<span>Staff</span>
			</h1>
			<!-- End Title -->

			<!--breadcrum start-->
			<ol class="breadcrumb text-left">
				<li><a href="#" class="active">Dashboard</a></li>
				<li>Staff</li>
			</ol>
			<!--breadcrum end-->

			<!--Filte Area  -->
			<!--End  -->

			<section class="row component-section">
				<div class="col-md-12">
					<div class="component-box">
						<!-- table card example -->
						<div class="pmd-card pmd-z-depth pmd-card-custom-view">
							<div class="table-responsive">
								<table
									class="table pmd-table table-hover table-striped display responsive nowrap"
									cellspacing="0" width="100%">
									<thead>
										<tr>
											<th>No</th>
											<th>Name</th>
											<th>Email</th>
											<th>Status</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="i" begin="${StaffFormBean.begin}"
											end="${StaffFormBean.end}" step="1">
											<tr>
												<td class="center">${i}</td>
												<td>${StaffFormBean.staffList[i-1].staffName}</td>
												<td>${StaffFormBean.staffList[i-1].email}</td>
												<td>${(StaffFormBean.staffList[i-1].staffStatus) == 1 ? '<span class="badge badge-success">Active</span>' : '<span class="badge">Disable</span>'}</td>
												<td><a
													class="btn pmd-btn-raised pmd-ripple-effect btn-primary"
													href="staffEdit.html"> Edit </a> <a
													class="btn pmd-btn-raised pmd-ripple-effect btn-info"
													href="personalDetail.do?staffDetailId=${StaffFormBean.staffList[i-1].id }">
														Detail </a> <a
													href="deleteStaff.do?staffDeleteId=${StaffFormBean.staffList[i-1].id }&formControl=1"
													class="btn pmd-btn-raised pmd-ripple-effect btn-danger" type="button">Delete</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</section>

			<!--Alert Delete-->
			<div tabindex="-1" class="modal fade" id="alert-dialog"
				style="display: none;" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-body">Would you like to delete?</div>
						<div class="pmd-modal-action text-right">
							<button data-dismiss="modal"
								class="btn pmd-ripple-effect btn-primary pmd-btn-flat"
								type="button">Cancel</button>
							<button data-dismiss="modal"
								class="btn pmd-ripple-effect btn-default pmd-btn-flat"
								type="button">Ok</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- tab end -->

	</div>
	<!-- content area end -->

	<!-- Footer Starts -->
	<%@ include file="inc/footer.jsp"%>
	<!-- Footer Ends -->

	<!-- Scripts Starts -->
	<%@ include file="inc/common_js.jsp"%>

	<!-- Custom Data Table -->
	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var exampleDatatable = $('#tableStaff')
									.DataTable(
											{
												responsive : {
													details : {
														type : 'column',
														target : 'tr'
													}
												},
												order : [ 1, 'asc' ],
												bFilter : true,
												bLengthChange : true,
												pagingType : "simple",
												"paging" : true,
												"searching" : true,
												"language" : {
													"info" : " _START_ - _END_ of _TOTAL_ ",
													"sLengthMenu" : "<span class='custom-select-title'>Rows per page:</span> <span class='custom-select'> _MENU_ </span>",
													"sSearch" : "",
													"sSearchPlaceholder" : "Search",
													"paginate" : {
														"sNext" : " ",
														"sPrevious" : " "
													},
												},
												dom : "<'pmd-card-title'<'data-table-responsive pull-left'><'search-paper pmd-textfield'f>>"
														+ "<'row'<'col-sm-12'tr>>"
														+ "<'pmd-card-footer' <'pmd-datatable-pagination' l i p>>",
											});

							/// Select value
							$('.custom-select-info').hide();

							$(".data-table-responsive")
									.html(
											'<h2 class="pmd-card-title-text">Manage All Staff</h2>');
							$(".custom-select-action")
									.html(
											'<button class="btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect btn-primary" type="button"><i class="material-icons pmd-sm">delete</i></button><button class="btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect btn-primary" type="button"><i class="material-icons pmd-sm">more_vert</i></button>');

						});
	</script>
	<!-- Scripts Ends -->

</body>
</html>