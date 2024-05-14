<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý giày</title>
</head>
<body>
	<!-- Container Fluid-->
	<div class="container-fluid" id="container-wrapper">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Quản lý Giày</h1>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="./">Home</a></li>
				<li class="breadcrumb-item">Quản lý</li>
				<li class="breadcrumb-item active" aria-current="page">Quản lý giày</li>
			</ol>
		</div>

		<!-- Row -->
		<div class="row">
			<!-- Datatables -->
			<div class="col-lg-12">
				<div class="card mb-4">

					<div class="table-responsive p-3">
						<table id="example" class="table table-striped table-bordered" style="width:100%; margin-top: 20px;" >
							<thead class="thead-light">
								<tr>
									<th>Mã giày</th>
									<th>Tên giày</th>
									<th>Giá</th>
									<th>Số lượng</th>
									<th>Hành động</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<th>Mã giày</th>
									<th>Tên giày</th>
									<th>Giá</th>
									<th>Số lượng</th>
									<th>Hành động</th>
								</tr>
							</tfoot>
							<tbody>
								<c:forEach var="giay" items="${arr_Giay_Table}">
									<tr>
										<td>${giay.ID}</td>
										<td>${giay.NAMEE}</td>
										<td>$${giay.gia}</td>
										<td>${giay.soluong}</td>
										<td><a href="/shopbangiay-jsp-servlet/admin-chitiet-giay?ID=${giay.ID}" class="btn btn-sm btn-primary">Chi
												tiết</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>
		<!--Row-->

		<!-- Documentation Link -->
		<div class="row">
			<div class="col-lg-12">
				<p>
					DataTables is a third party plugin that is used to generate the
					demo table below. For more information about DataTables, please
					visit the official <a href="https://datatables.net/"
						target="_blank">DataTables documentation.</a>
				</p>
			</div>
		</div>

		

	</div>
	<!---Container Fluid-->
</body>
</html>