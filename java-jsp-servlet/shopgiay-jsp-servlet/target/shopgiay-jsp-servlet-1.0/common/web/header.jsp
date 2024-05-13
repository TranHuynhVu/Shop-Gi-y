<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!-- Header -->
<header class="header-v4">
	<!-- Header desktop -->
	<div class="container-menu-desktop">
		<!-- Topbar -->
		<div class="top-bar">
			<div class="content-topbar flex-sb-m h-full container">
				<div class="left-top-bar">Welcome to our shoe shop</div>

				<div class="right-top-bar flex-w h-full">
					<a href="#" class="flex-c-m trans-04 p-lr-25"> Help & FAQs </a>
					<c:if test="${not empty ACC}">
						<a href='<c:url value="/thoat?action=logout"/>'
							class="flex-c-m trans-04 p-lr-25"> Wellcome, ${ACC.NAMEE} </a>
					</c:if>
					<c:if test="${empty ACC}">
						<a href='<c:url value="/dang-nhap?action=login"/>'
							class="flex-c-m trans-04 p-lr-25"> Login </a>
					</c:if>
					<a href="#" class="flex-c-m trans-04 p-lr-25"> EN </a> <a href="#"
						class="flex-c-m trans-04 p-lr-25"> USD </a>
				</div>
			</div>
		</div>

		<div class="wrap-menu-desktop">
			<nav class="limiter-menu-desktop container">

				<!-- Logo desktop -->
				<a href="#" class="logo"> <img
					src="<c:url value='/template/web/images/icons/logo-01.png'/>"
					alt="IMG-LOGO">
				</a>

				<!-- Menu desktop -->
				<div class="menu-desktop">
					<ul class="main-menu">
					
						<li class="<c:if test="${activeMenu == 'home'}"><c:out value = "active-menu"/></c:if>">
							<a href='<c:url value="/trang-chu"/>'>Home</a>
						</li>
						<li class="<c:if test="${activeMenu == 'product'}"><c:out value = "active-menu"/></c:if>">
							<a href='<c:url value="/product?filtersort=Default&filterprice=all"/>'>Shop</a>
						</li>
								
<%-- 						<li class="<c:if test="${activeMenu == 'shopingcart'}"><c:out value = "active-menu"/></c:if>">
							<a href='<c:url value="/shoping-cart"/>'>Features</a>
						</li>
 --%>
						<li class="<c:if test="${activeMenu == 'about'}"><c:out value = "active-menu"/></c:if>">
							<a href='<c:url value="/about"/>'>About</a>
						</li>
						
						<li class="<c:if test="${activeMenu == 'contact'}"><c:out value = "active-menu"/></c:if>">
							<a href='<c:url value="/contact"/>'>Contact</a>
						</li>
					</ul>
				</div>

				<!-- Icon header -->
				<div class="wrap-icon-header flex-w flex-r-m">
					<div
						class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
						<i class="zmdi zmdi-search"></i>
					</div>

					<div
						class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart"
						data-notify="${indexIconCart}">
						<i class="zmdi zmdi-shopping-cart"></i>
					</div>

					<a href="#"
						class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 icon-header-noti js-show-cart"
						data-notify="0"> <i class="zmdi zmdi-favorite-outline"></i>
					</a>
				</div>
			</nav>
		</div>
	</div>

	<!-- Header Mobile -->
	<div class="wrap-header-mobile">
		<!-- Logo moblie -->
		<div class="logo-mobile">
			<a href="index.html"><img
				src="<c:url value='/template/web/images/icons/logo-01.png'/>"
				alt="IMG-LOGO"></a>
		</div>

		<!-- Icon header -->
		<div class="wrap-icon-header flex-w flex-r-m m-r-15">
			<div
				class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
				<i class="zmdi zmdi-search"></i>
			</div>

			<div
				class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti js-show-cart"
				data-notify="2">
				<i class="zmdi zmdi-shopping-cart"></i>
			</div>

			<a href="#"
				class="dis-block icon-header-item cl2 hov-cl1 trans-04 p-r-11 p-l-10 icon-header-noti"
				data-notify="0"> <i class="zmdi zmdi-favorite-outline"></i>
			</a>
		</div>

		<!-- Button show menu -->
		<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
			<span class="hamburger-box"> <span class="hamburger-inner"></span>
			</span>
		</div>
	</div>


	<!-- Menu Mobile -->
	<div class="menu-mobile">
		<ul class="topbar-mobile">
			<li>
				<div class="left-top-bar">Free shipping for standard order
					over $100</div>
			</li>

			<li>
				<div class="right-top-bar flex-w h-full">
					<a href="#" class="flex-c-m p-lr-10 trans-04"> Help & FAQs </a> <a
						href="#" class="flex-c-m p-lr-10 trans-04"> My Account </a> <a
						href="#" class="flex-c-m p-lr-10 trans-04"> EN </a> <a href="#"
						class="flex-c-m p-lr-10 trans-04"> USD </a>
				</div>
			</li>
		</ul>

		<ul class="main-menu-m">
			<li><a href="index.html">Home</a>
				<ul class="sub-menu-m">
					<li><a href="index.html">Homepage 1</a></li>
					<li><a href="home-02.html">Homepage 2</a></li>
					<li><a href="home-03.html">Homepage 3</a></li>
				</ul> <span class="arrow-main-menu-m"> <i
					class="fa fa-angle-right" aria-hidden="true"></i>
			</span></li>

			<li><a href="product.html">Shop</a></li>

			<li><a href="shoping-cart.html" class="label1 rs1"
				data-label1="hot">Features</a></li>

			<li><a href="blog.html">Blog</a></li>

			<li><a href="about.html">About</a></li>

			<li><a href="contact.html">Contact</a></li>
		</ul>
	</div>

	<!-- Modal Search -->
	<div class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
		<div class="container-search-header">
			<button
				class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search">
				<img
					src="<c:url value='/template/web/images/icons/icon-close2.png'/>"
					alt="CLOSE">
			</button>
			
			<form class="wrap-search-header flex-w p-l-15" tyle="" id="myForm" action="/shopbangiay-jsp-servlet/product" method="post">
				<button class="flex-c-m trans-04">
					<i class="zmdi zmdi-search"></i>
				</button>
				<input class="plh3" type="text" name="search-product" id="search-product" placeholder="Search..." value="">
		
			</form>
		</div>
	</div>
</header>
<!-- Cart -->
<div class="wrap-header-cart js-panel-cart">
	<div class="s-full js-hide-cart"></div>

	<div class="header-cart flex-col-l p-l-65 p-r-25">
		<div class="header-cart-title flex-w flex-sb-m p-b-8">
			<span class="mtext-103 cl2"> Your Cart </span>

			<div
				class="fs-35 lh-10 cl2 p-lr-5 pointer hov-cl1 trans-04 js-hide-cart">
				<i class="zmdi zmdi-close"></i>
			</div>
		</div>

		<div class="header-cart-content flex-w js-pscroll">
			<ul class="header-cart-wrapitem w-full">
				
			</ul>

			
		</div>
		<div class="w-full">
				<div class="header-cart-total w-full p-tb-40">Total: $75.00</div>

				<div class="header-cart-buttons flex-w w-full">
					<a href="/shopbangiay-jsp-servlet/shoping-cart"
						class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-r-8 m-b-10">
						View Cart </a> <a href="/shopbangiay-jsp-servlet/shoping-cart"
						class="flex-c-m stext-101 cl0 size-107 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-10">
						Check Out </a>
				</div>
			</div>
	</div>
</div>

