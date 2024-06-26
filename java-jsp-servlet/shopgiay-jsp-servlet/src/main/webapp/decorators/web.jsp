<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="<c:url value='/template/web/images/icons/favicon.png'/>"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/bootstrap/css/bootstrap.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/fonts/font-awesome-4.7.0/css/font-awesome.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/fonts/iconic/css/material-design-iconic-font.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/fonts/linearicons-v1.0.0/icon-font.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/animate/animate.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/css-hamburgers/hamburgers.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/animsition/css/animsition.min.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/select2/select2.min.css'/>">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/daterangepicker/daterangepicker.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/slick/slick.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/MagnificPopup/magnific-popup.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/vendor/perfect-scrollbar/perfect-scrollbar.css'/>">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/css/util.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/template/web/css/main.css'/>">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<!--===============================================================================================-->
	<title><dec:title default="Trang chu" /></title>

</head>
<body class="animsition">
	<%@include file="/common/web/header.jsp"%>

	<dec:body />

	<%@include file="/common/web/footer.jsp"%>

	

<!-- 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> -->

<!--===============================================================================================-->	
	<script src="<c:url value='/template/web/vendor/jquery/jquery-3.2.1.min.js'/>"></script> 
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/animsition/js/animsition.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/bootstrap/js/popper.js'/>"></script>
	<script src="<c:url value='/template/web/vendor/bootstrap/js/bootstrap.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/select2/select2.min.js'/>"></script>
	<script>
		$(".js-select2").each(function(){
			$(this).select2({
				minimumResultsForSearch: 20,
				dropdownParent: $(this).next('.dropDownSelect2')
			});
		})
	</script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/daterangepicker/moment.min.js'/>"></script>
	<script src="<c:url value='/template/web/vendor/daterangepicker/daterangepicker.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/slick/slick.min.js'/>"></script>
	<script src="<c:url value='/template/web/js/slick-custom.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/parallax100/parallax100.js'/>"></script>
	<script>
        $('.parallax100').parallax100();
	</script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/MagnificPopup/jquery.magnific-popup.min.js'/>"></script>
	<script>
		$('.gallery-lb').each(function() { // the containers for all your galleries
			$(this).magnificPopup({
		        delegate: 'a', // the selector for gallery item
		        type: 'image',
		        gallery: {
		        	enabled:true
		        },
		        mainClass: 'mfp-fade'
		    });
		});
	</script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/isotope/isotope.pkgd.min.js'/>"></script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/sweetalert/sweetalert.min.js'/>"></script>
	<script>
		$('.js-addwish-b2').on('click', function(e) {
			e.preventDefault();
			var id = $(this).data('id');
			var idshoes = $(this).data('idshoes');
			var nameShoe = $(this).data('nameshoes');
			var price = $(this).data('price');
			// Tạo một đối tượng JSON chứa các giá trị của các biến
			var data = {
				"ID": id,
				"ID_SHOE": idshoes,
				"NAME": nameShoe,
				"PRICE": price,
				"ACTION": "ClickTym"
			};
			console.log(data)
			$.ajax({
				type: "POST", // hoặc "GET" tùy thuộc vào cách bạn cấu hình máy chủ
				url: "/shopbangiay-jsp-servlet/api-web-new", // Thay đổi "your-server-url" thành URL của máy chủ của bạn
				data: JSON.stringify(data),
				contentType: "application/json",
				dataType: "json",
				success: function(response) {
					console.log(response)
					if (response.ACC != null) {
						var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
						$(this).on('click', function() {
							swal(nameProduct, "is added to wishlist !", "success");
	
							$(this).addClass('js-addedwish-b2');
							$(this).off('click');
						});
					} else {
						alert("Vui lòng đăng nhập để xem chi tiết sản phẩm.");
						console.log("Vui lòng đăng nhập để xem chi tiết sản phẩm.")
					}
				},
				error: function(xhr, status, error) {
					console.error("Error sending data:", error);
				}
			});
		});
		
/* 		$('.js-addwish-b2').on('click', function(e){
			e.preventDefault();
		});
 */
/* 		$('.js-addwish-b2').each(function(){
			var nameProduct = $(this).parent().parent().find('.js-name-b2').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");

				$(this).addClass('js-addedwish-b2');
				$(this).off('click');
			});
		}); */

		$('.js-addwish-detail').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.js-name-detail').html();

			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");

				$(this).addClass('js-addedwish-detail');
				$(this).off('click');
			});
		});
		function initSlickSlider() {
		    $('.wrap-slick3').each(function() {
		        $(this).find('.slick3').slick({
		            slidesToShow: 1,
		            slidesToScroll: 1,
		            fade: true,
		            infinite: true,
		            autoplay: false,
		            autoplaySpeed: 6000,

		            arrows: true,
		            appendArrows: $(this).find('.wrap-slick3-arrows'),
		            prevArrow: '<button class="arrow-slick3 prev-slick3"><i class="fa fa-angle-left" aria-hidden="true"></i></button>',
		            nextArrow: '<button class="arrow-slick3 next-slick3"><i class="fa fa-angle-right" aria-hidden="true"></i></button>',

		            dots: true,
		            appendDots: $(this).find('.wrap-slick3-dots'),
		            dotsClass: 'slick3-dots',
		            customPaging: function(slick, index) {
		                var portrait = $(slick.$slides[index]).data('thumb');
		                return '<img src=" ' + portrait + ' "/><div class="slick3-dot-overlay"></div>';
		            },
		        });
		    });
		}

		$('.js-addcart-detail').each(function() {
			var nameProduct = $(this).closest('.click-js-addcart-detail').find('.js-name-detail').text().trim();
			$(this).on('click', function() {
				var data = {
					"ID": $('#iddf').val(),
					"QUANTITY": $('#num-product').val(),
					"COLOR": $('#color').val(),
					"SIZES": $('#sizes').val(),
					"ACTION": "AddCart"
				};
				$.ajax({
					type: "POST",
					url: "/shopbangiay-jsp-servlet/api-web-new",
					data: JSON.stringify(data),
					contentType: "application/json",
					dataType: "json",
					success: function(response) {
						console.log(response + "AddCart");
						if (response.ACC != null) {
							swal(nameProduct, "is added to cart !", "success");
						}else{
							alert("Vui lòng đăng nhập để xem chi tiết sản phẩm.");
							console.log("Vui lòng đăng nhập để xem chi tiết sản phẩm.")
						}
						
						
					},
					error: function(xhr, status, error) {
						console.error("Error sending data:", error);
					}
				});


			});
		});
		/*---------------------------------------------*/

/* 		$('.js-addcart-detail').each(function(){
			var nameProduct = $(this).parent().parent().parent().parent().parent().find('.js-name-detail').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to cart !", "success");
			});
		}); */
	
	</script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/vendor/perfect-scrollbar/perfect-scrollbar.min.js'/>"></script>
	<script>
		$('.js-pscroll').each(function(){
			$(this).css('position','relative');
			$(this).css('overflow','hidden');
			var ps = new PerfectScrollbar(this, {
				wheelSpeed: 1,
				scrollingThreshold: 1000,
				wheelPropagation: false,
			});

			$(window).on('resize', function(){
				ps.update();
			})
		});
	</script>
<!--===============================================================================================-->
	<script src="<c:url value='/template/web/js/main.js'/>"></script>
</body>
</html>