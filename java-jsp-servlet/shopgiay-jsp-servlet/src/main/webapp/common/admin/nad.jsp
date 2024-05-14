<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Sidebar -->
    <ul class="navbar-nav sidebar sidebar-light accordion" id="accordionSidebar">
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
         <div class="sidebar-brand-icon">
          <img src="<c:url value="/template/admin/img/logo/logo002.png"/>" style="max-height: 6.3rem;">
        </div> 
        <div class="sidebar-brand-text mx-3">Admin</div>
      </a>
      <hr class="sidebar-divider my-0">
      <li class="nav-item active">
        <a class="nav-link" href="/shopbangiay-jsp-servlet/admin-home">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>Thống kê</span></a>
      </li>
      <hr class="sidebar-divider">
      <div class="sidebar-heading">
        <!-- Features -->
      </div>
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTable" aria-expanded="true"
          aria-controls="collapseTable">
          <i class="fas fa-fw fa-table"></i>
          <span>Quản lý</span>
        </a>
        <div id="collapseTable" class="collapse" aria-labelledby="headingTable" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <h6 class="collapse-header"></h6>
            <a class="collapse-item" href='<c:url value="/admin-quanly-giay"/>'>Quản lý giày</a>
            <a class="collapse-item" href='<c:url value="/admin-chitiet-hoadon"/>'">Quản lý hóa đơn</a>
          </div>
        </div>
      </li>
      <hr class="sidebar-divider">
      <div class="sidebar-heading">
        <!-- Examples -->
      </div>
      

    </ul>
    <!-- Sidebar -->