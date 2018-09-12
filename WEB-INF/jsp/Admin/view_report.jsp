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
<%@ include file="inc/datatable_css.jsp"%>
<%@ include file="inc/common_css.jsp"%>
<style>
.dataTables_wrapper .dt-buttons .btn {
  display: inline-block;
  padding: 6px 12px;
  margin-bottom: 0;
  font-size: 14px;
  font-weight: 400;
  line-height: 1.1;
  color: #2196f3;
  text-align: center;
  text-transform: uppercase;
  letter-spacing: inherit;
  white-space: nowrap;
  vertical-align: middle;
  -ms-touch-action: manipulation;
      touch-action: manipulation;
  cursor: pointer;
  -webkit-user-select: none;
     -moz-user-select: none;
      -ms-user-select: none;
          user-select: none;
  background-image: none;
  border: 1px solid #cecece;
  border-radius: 4px;
}
</style>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
		response.setHeader("Pragma", "no-cache"); //HTTP 1.0
		response.setDateHeader("Expires", 0);
		//prevents caching at the proxy server
	%>
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
				<span>Treasurer</span>
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
						<!-- 						<div class="pmd-card pmd-z-depth pmd-card-custom-view"> -->
						<div class="table-responsive">
							<table id="example" class="table table-bordered"
								style="width: 100%">

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
												class="btn btn-sm pmd-btn-raised pmd-ripple-effect btn-info"
												href="salaryDetail.do">Detail</a>&nbsp; <a
												class="btn btn-sm pmd-btn-raised pmd-ripple-effect btn-info"
												href="personalDetail.do">Info</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<!-- 						</div> -->
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

	<script>
		$(document).ready(
				function() {
					var table = $('#example').DataTable({
						lengthChange : false,
						buttons : [ 'copy', 'excel', 'pdf', 'colvis' ]
					});

					table.buttons().container().appendTo(
							'#example_wrapper .col-sm-6:eq(0)');
				});
	</script>
	<!-- Scripts Ends -->

</body>
</html>