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

	<script src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/ruang-admin.min.js'/>"></script>
	<script src="<c:url value='/template/admin/vendor/chart.js/Chart.min.js'/>"></script>
	<script src="<c:url value='/template/admin/js/demo/chart-area-demo.js'/>"></script>
</body>
</html>