<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chi Tiết hóa đơn</title>
</head>
<body>
	<div class="col-xl-12 col-lg-7 mb-4" >
				<div class="card" style="padding: 20px;">
					<div
						class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
						<h6 class="m-0 font-weight-bold text-primary">Hóa đơn</h6>
					</div>
					<div class="table-responsive">
						<table id="example" class="table align-items-center table-flush" style="margin-top: 20px;">
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
										<td><a href="#" class="btn btn-sm btn-primary">Xem chi tiết</a></td>
									</tr>

								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="card-footer"></div>
				</div>
			</div>
</body>
</html>