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
<title>Manage Salary | Payroll</title>
<%@ include file="inc/common_css.jsp"%>
<%@ include file="inc/datatable_css.jsp"%>
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
				<li><a href="#" class="active">Manage Salary</a></li>
				<li>Calculate All Staff</li>
			</ol>
			<!--breadcrum end-->

			<section class="row component-section">
				<div class="col-md-12">
					<div class="component-box">
						<!-- table card example -->
						<div class="pmd-card pmd-z-depth pmd-card-custom-view">
							<div class="table-responsive">
								<table id="example"
									class="table pmd-table table-hover table-striped display responsive nowrap"
									cellspacing="0" width="100%">

									<thead>
										<tr>
											<th>No</th>
											<th>Name</th>
											<th>Rank</th>
											<th>Department</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="i" begin="${SalaryFormBean.begin}"
											end="${SalaryFormBean.end}" step="1">
											<tr>
												<td class="center">${i}</td>
												<td>${SalaryFormBean.frmStaffList[i-1].staffName}</td>
												<td>${SalaryFormBean.frmStaffList[i-1].rank.rankName}</td>
												<td>${SalaryFormBean.frmStaffList[i-1].dept.deptName}</td>
												<td><a
													class="btn pmd-btn-raised pmd-ripple-effect btn-info"
													href="salaryDetail.do">Salary Detail</a></td>
												<td><a
													class="btn pmd-btn-raised pmd-ripple-effect btn-info"
													href="personalDetail.do?staffDetailId=${SalaryFormBean.frmStaffList[i-1].id }">Detail Info</a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</section>
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
	<%@ include file="inc/datatable_js.jsp"%>

	<script type="text/javascript">
		$(document).ready(
				function() {
					var sPath = window.location.pathname;
					var sPage = sPath.substring(sPath.lastIndexOf('/') + 1);
					$(".pmd-sidebar-nav").each(
							function() {
								$(this).find("a[href='" + sPage + "']")
										.parents(".dropdown").addClass("open");
								$(this).find("a[href='" + sPage + "']")
										.parents(".dropdown").find(
												'.dropdown-menu').css(
												"display", "block");
								$(this).find("a[href='" + sPage + "']")
										.parents(".dropdown").find(
												'a.dropdown-toggle').addClass(
												"active");
								$(this).find("a[href='" + sPage + "']")
										.addClass("active");
							});
					$(".auto-update-year").html(new Date().getFullYear());
				});
	</script>

	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							var exampleDatatable = $('#example')
									.DataTable(
											{
												responsive : {
													details : {
														type : 'column',
														target : 'tr'
													}
												},
												order : [ 0, 'asc' ],
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
											'<h2 class="pmd-card-title-text">Calculate All Staff</h2>');
							$(".custom-select-action")
									.html(
											'<button class="btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect btn-primary" type="button"><i class="material-icons pmd-sm">delete</i></button><button class="btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect btn-primary" type="button"><i class="material-icons pmd-sm">more_vert</i></button>');

						});
	</script>
	<!-- Scripts Ends -->

</body>
</html>