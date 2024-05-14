<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chu</title>
</head>
<body>
	<div class="container-fluid" id="container-wrapper">
		<div class="d-sm-flex align-items-center justify-content-between mb-4">
			<h1 class="h3 mb-0 text-gray-800">Thống kê</h1>
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a href="./">Home</a></li>
				<li class="breadcrumb-item active" aria-current="page">Thống kê</li>
			</ol>
		</div>

		<div class="row mb-3">
			<!-- Earnings (Monthly) Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card h-100">
					<div class="card-body">
						<div class="row align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-uppercase mb-1">Doanh
									thu (Theo năm)</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">$${doanhThuTheoNam}</div>
								<div class="mt-2 mb-0 text-muted text-xs">
									<span class="text-success mr-2"><i
										class="fa fa-arrow-up"></i> 0.48%</span> <span>So với năm
										trước</span>
								</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-calendar fa-2x text-primary"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Earnings (Annual) Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card h-100">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-uppercase mb-1">Tổng
									sản phẩm</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">${tongSoLuongGiay}</div>
								<div class="mt-2 mb-0 text-muted text-xs"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-shopping-cart fa-2x text-success"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- New User Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card h-100">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-uppercase mb-1">Người
									dùng</div>
								<div class="h5 mb-0 mr-3 font-weight-bold text-gray-800">${tongSoLuongNguoiDung}</div>
								<div class="mt-2 mb-0 text-muted text-xs">
									<span class="text-success mr-2"><i
										class="fas fa-arrow-up"></i> 1 </span> <span>Người dùng mới</span>
								</div>
							</div>
							<div class="col-auto">
								<i class="fas fa-users fa-2x text-info"></i>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- Pending Requests Card Example -->
			<div class="col-xl-3 col-md-6 mb-4">
				<div class="card h-100">
					<div class="card-body">
						<div class="row no-gutters align-items-center">
							<div class="col mr-2">
								<div class="text-xs font-weight-bold text-uppercase mb-1">Yêu
									cầu được giải quyết</div>
								<div class="h5 mb-0 font-weight-bold text-gray-800">0</div>
								<div class="mt-2 mb-0 text-muted text-xs"></div>
							</div>
							<div class="col-auto">
								<i class="fas fa-comments fa-2x text-warning"></i>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- Area Chart -->
			<div class="col-xl-8 col-lg-7">
				<div class="card mb-4">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 class="m-0 font-weight-bold text-primary">Danh thu theo
							tháng</h6>
						<!-- <div class="dropdown no-arrow">
							<a class="dropdown-toggle" href="#" role="button"
								id="dropdownMenuLink" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> <i
								class="fas fa-ellipsis-v fa-sm fa-fw text-gray-400"></i>
							</a>
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
								aria-labelledby="dropdownMenuLink">
								<div class="dropdown-header">Dropdown Header:</div>
								<a class="dropdown-item" href="#">Action</a> <a
									class="dropdown-item" href="#">Another action</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#">Something else here</a>
							</div>
						</div> -->
					</div>
					<div class="card-body">
						<div class="chart-area">
							<!-- 	<canvas id="myAreaChart"></canvas> -->
							<canvas id="myChart" width="1488" height="640"
								style="display: block; height: 320px; width: 744px;"></canvas>

						</div>
					</div>
				</div>
			</div>
			<!-- Pie Chart -->
			<div class="col-xl-4 col-lg-5">
				<div class="card mb-4">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 class="m-0 font-weight-bold text-primary">Bán chạy</h6>
						<div class="dropdown no-arrow">
							<a class="dropdown-toggle btn btn-primary btn-sm" href="#"
								role="button" id="dropdownMenuLink" data-toggle="dropdown"
								aria-haspopup="true" aria-expanded="false"> Tháng <i
								class="fas fa-chevron-down"></i>
							</a>
							<div
								class="dropdown-menu dropdown-menu-right shadow animated--fade-in"
								aria-labelledby="dropdownMenuLink">
								<div class="dropdown-header">Chọn</div>
								<a class="dropdown-item" href="#">Tuần</a> <a
									class="dropdown-item" href="#">Năm</a>
							</div>
						</div>
					</div>
					<div class="card-body">
						<div class="mb-3">
							<div class="small text-gray-500">
								Nike1
								<div class="small float-right">
									<b>20 đến 80 Giày</b>
								</div>
							</div>
							<div class="progress" style="height: 12px;">
								<div class="progress-bar bg-warning" role="progressbar"
									style="width: 80%" aria-valuenow="80" aria-valuemin="0"
									aria-valuemax="100"></div>
							</div>
						</div>
						<div class="mb-3">
							<div class="small text-gray-500">
								Nike2
								<div class="small float-right">
									<b>20 đến 50 Giày</b>
								</div>
							</div>
							<div class="progress" style="height: 12px;">
								<div class="progress-bar bg-success" role="progressbar"
									style="width: 70%" aria-valuenow="70" aria-valuemin="0"
									aria-valuemax="100"></div>
							</div>
						</div>
						<div class="mb-3">
							<div class="small text-gray-500">
								Nike3
								<div class="small float-right">
									<b>20 đến 30 Giày</b>
								</div>
							</div>
							<div class="progress" style="height: 12px;">
								<div class="progress-bar bg-danger" role="progressbar"
									style="width: 55%" aria-valuenow="55" aria-valuemin="0"
									aria-valuemax="100"></div>
							</div>
						</div>
						<div class="mb-3">
							<div class="small text-gray-500">
								Nike4
								<div class="small float-right">
									<b>10 đến 20 Giày</b>
								</div>
							</div>
							<div class="progress" style="height: 12px;">
								<div class="progress-bar bg-info" role="progressbar"
									style="width: 50%" aria-valuenow="50" aria-valuemin="0"
									aria-valuemax="100"></div>
							</div>
						</div>
						<div class="mb-3">
							<div class="small text-gray-500">
								Nike5
								<div class="small float-right">
									<b>10 đến 20 Giày</b>
								</div>
							</div>
							<div class="progress" style="height: 12px;">
								<div class="progress-bar bg-info" role="progressbar"
									style="width: 50%" aria-valuenow="50" aria-valuemin="0"
									aria-valuemax="100"></div>
							</div>
						</div>

					</div>
					<div class="card-footer text-center">
						<a class="m-0 small text-primary card-link" href="#">View More
							<i class="fas fa-chevron-right"></i>
						</a>
					</div>
				</div>
			</div>
			<!-- Invoice Example -->
			<div class="col-xl-8 col-lg-7 mb-4">
				<div class="card">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 class="m-0 font-weight-bold text-primary">Hóa đơn</h6>
						<a class="m-0 float-right btn btn-danger btn-sm"
							href='<c:url value="/admin-chitiet-hoadon"/>'>Xem thêm<i
							class="fas fa-chevron-right"></i>
						</a>
					</div>
					<div class="table-responsive">
						<table class="table align-items-center table-flush">
							<thead class="thead-light">
								<tr>
									<th>Mã hóa đơn</th>
									<th>Khách hàng</th>
									<th>Tổng tiền</th>
									<th>Trạng thái</th>
									<th>Hành động</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="hoadon" items="${arr_HoaDon}">
									<tr>
										<td><a href="#">${hoadon.getID()}</a></td>
										<td>${hoadon.getNameAcc()}</td>
										<td>${hoadon.getTongBill()}</td>
										<td><span class="badge badge-warning">Chưa giải
												quyết</span></td>
										<td><a href="#" class="btn btn-sm btn-primary">Xem
												chi tiết</a></td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="card-footer"></div>
				</div>
			</div>
			<!-- Message From Customer-->
			<div class="col-xl-4 col-lg-5 ">
				<div class="card">
					<div
						class="card-header py-4 bg-primary d-flex flex-row align-items-center justify-content-between">
						<h6 class="m-0 font-weight-bold text-light">Phản hồi</h6>
					</div>
					<div>
						<div class="customer-message align-items-center">
							<a class="font-weight-bold" href="#">
								<div class="text-truncate message-title">Chào bạn! Tôi là
									tự hỏi liệu bạn có thể giúp tôi với một vấn đề tôi đang gặp
									phải không..</div>
								<div class="small text-gray-500 message-time font-weight-bold">Udin
									Cilok · 58m</div>
							</a>
						</div>
						<div class="customer-message align-items-center">
							<a class="font-weight-bold" href="#">
								<div class="text-truncate message-title">Chào bạn! Tôi là
									tự hỏi liệu bạn có thể giúp tôi với một vấn đề tôi đang gặp
									phải không..</div>
								<div class="small text-gray-500 message-time font-weight-bold">Udin
									Cilok · 58m</div>
							</a>
						</div>
						<div class="customer-message align-items-center">
							<a class="font-weight-bold" href="#">
								<div class="text-truncate message-title">Chào bạn! Tôi là
									tự hỏi liệu bạn có thể giúp tôi với một vấn đề tôi đang gặp
									phải không..</div>
								<div class="small text-gray-500 message-time font-weight-bold">Udin
									Cilok · 58m</div>
							</a>
						</div>
						<div class="customer-message align-items-center">
							<a class="font-weight-bold" href="#">
								<div class="text-truncate message-title">Chào bạn! Tôi là
									tự hỏi liệu bạn có thể giúp tôi với một vấn đề tôi đang gặp
									phải không..</div>
								<div class="small text-gray-500 message-time font-weight-bold">Udin
									Cilok · 58m</div>
							</a>
						</div>
						<div class="card-footer text-center">
							<a class="m-0 small text-primary card-link" href="#">View
								More <i class="fas fa-chevron-right"></i>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>




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
						<a href="/shopbangiay-jsp-servlet/dang-nhap?action=login"
							class="btn btn-primary">Logout</a>
					</div>
				</div>
			</div>
		</div>

	</div>
	<!---Container Fluid-->
</body>
</html>