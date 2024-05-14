<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link href="img/logo/logo.png" rel="icon">
<link href="<c:url value='/template/admin/vendor/fontawesome-free/css/all.min.css'/>" rel="stylesheet"
	type="text/css">
<link href="<c:url value='/template/admin/vendor/bootstrap/css/bootstrap.min.css'/>" rel="stylesheet"
	type="text/css">
<link href="<c:url value='/template/admin/css/ruang-admin.min.css'/>" rel="stylesheet">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>
<title><dec:title default="Home" /></title>
</head>
<body id="page-top">
	<div id="wrapper">
		<%@include file="/common/admin/nad.jsp"%>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<%@include file="/common/admin/header.jsp"%>
				<dec:body />
			</div>
			<%@include file="/common/admin/footer.jsp"%>
		</div>
	</div>
	
	<!-- Scroll to top -->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>
	<!-- Modal Logout -->
		<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
			aria-labelledby="exampleModalLabelLogout" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabelLogout">Ohh No!</h5>
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<p>Are you sure you want to logout?</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-outline-primary"
							data-dismiss="modal">Cancel</button>
						<a href="/shopbangiay-jsp-servlet/dang-nhap?action=login" class="btn btn-primary">Logout</a>
					</div>
				</div>
			</div>
		</div>
	
	<script src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/ruang-admin.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/chart.js/Chart.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/demo/chart-area-demo.js'/>"></script>	
	<script src="<c:url value='/template/admin/js/chartCustuom.js'/>"></script>

	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css"></script>
	<script src="https://cdn.datatables.net/2.0.7/css/dataTables.bootstrap4.css"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="https://cdn.datatables.net/2.0.7/js/dataTables.js"></script>
	<script src="https://cdn.datatables.net/2.0.7/js/dataTables.bootstrap4.js"></script>
	



		<script src="<c:url value='/template/admin/js/main.js'/>"></script>


	
</body>
</html>