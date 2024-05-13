
(function($) {
	"use strict";

	/*[ Load page ]
	===========================================================*/
	$(".animsition").animsition({
		inClass: 'fade-in',
		outClass: 'fade-out',
		inDuration: 1500,
		outDuration: 800,
		linkElement: '.animsition-link',
		loading: true,
		loadingParentElement: 'html',
		loadingClass: 'animsition-loading-1',
		loadingInner: '<div class="loader05"></div>',
		timeout: false,
		timeoutCountdown: 5000,
		onLoadEvent: true,
		browser: ['animation-duration', '-webkit-animation-duration'],
		overlay: false,
		overlayClass: 'animsition-overlay-slide',
		overlayParentElement: 'html',
		transition: function(url) { window.location.href = url; }
	});

	/*[ Back to top ]
	===========================================================*/
	var windowH = $(window).height() / 2;

	$(window).on('scroll', function() {
		if ($(this).scrollTop() > windowH) {
			$("#myBtn").css('display', 'flex');
		} else {
			$("#myBtn").css('display', 'none');
		}
	});

	$('#myBtn').on("click", function() {
		$('html, body').animate({ scrollTop: 0 }, 300);
	});


	/*==================================================================
	[ Fixed Header ]*/
	var headerDesktop = $('.container-menu-desktop');
	var wrapMenu = $('.wrap-menu-desktop');

	if ($('.top-bar').length > 0) {
		var posWrapHeader = $('.top-bar').height();
	}
	else {
		var posWrapHeader = 0;
	}


	if ($(window).scrollTop() > posWrapHeader) {
		$(headerDesktop).addClass('fix-menu-desktop');
		$(wrapMenu).css('top', 0);
	}
	else {
		$(headerDesktop).removeClass('fix-menu-desktop');
		$(wrapMenu).css('top', posWrapHeader - $(this).scrollTop());
	}

	$(window).on('scroll', function() {
		if ($(this).scrollTop() > posWrapHeader) {
			$(headerDesktop).addClass('fix-menu-desktop');
			$(wrapMenu).css('top', 0);
		}
		else {
			$(headerDesktop).removeClass('fix-menu-desktop');
			$(wrapMenu).css('top', posWrapHeader - $(this).scrollTop());
		}
	});


	/*==================================================================
	[ Menu mobile ]*/
	$('.btn-show-menu-mobile').on('click', function() {
		$(this).toggleClass('is-active');
		$('.menu-mobile').slideToggle();
	});

	var arrowMainMenu = $('.arrow-main-menu-m');

	for (var i = 0; i < arrowMainMenu.length; i++) {
		$(arrowMainMenu[i]).on('click', function() {
			$(this).parent().find('.sub-menu-m').slideToggle();
			$(this).toggleClass('turn-arrow-main-menu-m');
		})
	}

	$(window).resize(function() {
		if ($(window).width() >= 992) {
			if ($('.menu-mobile').css('display') == 'block') {
				$('.menu-mobile').css('display', 'none');
				$('.btn-show-menu-mobile').toggleClass('is-active');
			}

			$('.sub-menu-m').each(function() {
				if ($(this).css('display') == 'block') {
					console.log('hello');
					$(this).css('display', 'none');
					$(arrowMainMenu).removeClass('turn-arrow-main-menu-m');
				}
			});

		}
	});


	/*==================================================================
	[ Show / hide modal search ]*/
	$('.js-show-modal-search').on('click', function() {
		$('.modal-search-header').addClass('show-modal-search');
		$(this).css('opacity', '0');
	});

	$('.js-hide-modal-search').on('click', function() {
		$('.modal-search-header').removeClass('show-modal-search');
		$('.js-show-modal-search').css('opacity', '1');
	});

	$('.container-search-header').on('click', function(e) {
		e.stopPropagation();
	});


	/*==================================================================
	[ Isotope ]*/
	var $topeContainer = $('.isotope-grid');
	var $filter = $('.filter-tope-group');

	// filter items on button click
	$filter.each(function() {
		$filter.on('click', 'button', function() {
			var filterValue = $(this).attr('data-filter');
			$topeContainer.isotope({ filter: filterValue });
		});

	});

	// init Isotope
	$(window).on('load', function() {
		var $grid = $topeContainer.each(function() {
			$(this).isotope({
				itemSelector: '.isotope-item',
				layoutMode: 'fitRows',
				percentPosition: true,
				animationEngine: 'best-available',
				masonry: {
					columnWidth: '.isotope-item'
				}
			});
		});
	});

	var isotopeButton = $('.filter-tope-group button');

	$(isotopeButton).each(function() {
		$(this).on('click', function() {
			for (var i = 0; i < isotopeButton.length; i++) {
				$(isotopeButton[i]).removeClass('how-active1');
			}

			$(this).addClass('how-active1');
		});
	});

	/*==================================================================
	[ Filter / Search product ]*/
	$('.js-show-filter').on('click', function() {
		$(this).toggleClass('show-filter');
		$('.panel-filter').slideToggle(400);

		if ($('.js-show-search').hasClass('show-search')) {
			$('.js-show-search').removeClass('show-search');
			$('.panel-search').slideUp(400);
		}
	});

	$('.js-show-search').on('click', function() {
		$(this).toggleClass('show-search');
		$('.panel-search').slideToggle(400);

		if ($('.js-show-filter').hasClass('show-filter')) {
			$('.js-show-filter').removeClass('show-filter');
			$('.panel-filter').slideUp(400);
		}
	});




	/*==================================================================
	[ Cart ]*/// Click vào giỏi hàng
	$('.js-show-cart').on('click', function(e) {
		e.preventDefault();
		var data = {
			"ACTION": "ClickGioHang"
		};
		$.ajax({
			type: "POST",
			url: "/shopbangiay-jsp-servlet/api-web-new",
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response)
				if (response.ACC != null) {
					$('.header-cart-wrapitem').find('.header-cart-item').remove();
					$('.header-cart-wrapitem').append(response.html);
					$('.header-cart-total').text("Total: $" + response.price);
					$('.js-panel-cart').addClass('show-header-cart');
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

	$('.js-hide-cart').on('click', function() {
		$('.js-panel-cart').removeClass('show-header-cart');
	});

	/*==================================================================
	[ Cart ]*/
	$('.js-show-sidebar').on('click', function() {
		$('.js-sidebar').addClass('show-sidebar');
	});

	$('.js-hide-sidebar').on('click', function() {
		$('.js-sidebar').removeClass('show-sidebar');
	});

	/*==================================================================
	[ +/- num product ]*/



	/*==================================================================
	[ Rating ]*/
	$('.wrap-rating').each(function() {
		var item = $(this).find('.item-rating');
		var rated = -1;
		var input = $(this).find('input');
		$(input).val(0);

		$(item).on('mouseenter', function() {
			var index = item.index(this);
			var i = 0;
			for (i = 0; i <= index; i++) {
				$(item[i]).removeClass('zmdi-star-outline');
				$(item[i]).addClass('zmdi-star');
			}

			for (var j = i; j < item.length; j++) {
				$(item[j]).addClass('zmdi-star-outline');
				$(item[j]).removeClass('zmdi-star');
			}
		});

		$(item).on('click', function() {
			var index = item.index(this);
			rated = index;
			$(input).val(index + 1);
		});

		$(this).on('mouseleave', function() {
			var i = 0;
			for (i = 0; i <= rated; i++) {
				$(item[i]).removeClass('zmdi-star-outline');
				$(item[i]).addClass('zmdi-star');
			}

			for (var j = i; j < item.length; j++) {
				$(item[j]).addClass('zmdi-star-outline');
				$(item[j]).removeClass('zmdi-star');
			}
		});
	});

	/*==================================================================
	[ Show modal1 ]*/// Click Quick view
	$('.js-show-modal1').on('click', function(e) {
		e.preventDefault();
		var id = $(this).data('id');
		var nameShoe = $(this).data('nameshoes');
		var price = $(this).data('price');
		var idshoes = $(this).data('idshoes')
		// Tạo một đối tượng JSON chứa các giá trị của các biến
		var data = {
			"ID": id,
			"NAME": nameShoe,
			"PRICE": price,
			"ID_SHOES": idshoes,
			"ACTION": "ClickQuickView"
		};
		$.ajax({
			type: "POST", // hoặc "GET" tùy thuộc vào cách bạn cấu hình máy chủ
			url: "/shopbangiay-jsp-servlet/api-web-new",
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response + "ClickQuickView");

				var colors = response.colors;
				var size = response.size;
				var images = response.images;
				var df = response.detall_shoes;

				var i = 1;
				images.forEach(function(image) {
					$('#imageDataThumb' + i).attr('data-thumb', "/shopbangiay-jsp-servlet/" + image.id);
					$('#imageIMG' + i).attr('src', "/shopbangiay-jsp-servlet/" + image.id);
					$('#imageA' + i).attr('href', "/shopbangiay-jsp-servlet/" + image.id);
					i++;
				});

				colors.forEach(function(color) {// cập nhật colors
					var option = $('<option>', { text: color.namee });
					$('#color').append(option);

				});
				size.forEach(function(size) {// cập nhật size
					var option = $('<option>', { text: size.size });
					$('#sizes').append(option);
				});
				$('#nameShoe').text(df.name);// cập nhật tên
				$('#PRICE').text('$' + df.price); // Cập nhật giá
				$('#id_Shoe').val(df.id_SHOE);
				$('#iddf').val(df.id);

				initSlickSlider();

				$('.js-modal1').addClass('show-modal1');

			},
			error: function(xhr, status, error) {
				console.error("Error sending data:", error);
			}
		});
	});

	////////////////////////////////////////


	// Xử lý sự kiện click cho các liên kết có class 'FilterSort'
	$('a.FilterSort').click(function(event) {
		event.preventDefault();

		$("a.FilterSort").removeClass("filter-link-active");

		$(this).addClass("filter-link-active");

		var url = "/shopbangiay-jsp-servlet/product";
		$("a.filter-link-active").each(function() {
			if ($(this).data('filtersort')) { url += $(this).data('filtersort'); }
			if ($(this).data('filterprice')) { url += $(this).data('filterprice'); }

		});
		console.log(url);
		window.location.href = url;
	});


	// Xử lý sự kiện click cho các liên kết có class 'FilterPrice'
	$('a.FilterPrice').click(function(event) {
		event.preventDefault();
		// Xóa lớp 'filter-link-active' từ tất cả các phần tử có class 'FilterPrice'
		$("a.FilterPrice").removeClass("filter-link-active");
		// Thêm lớp 'filter-link-active' vào phần tử được nhấp chuột
		$(this).addClass("filter-link-active");

		var url = "/shopbangiay-jsp-servlet/product";
		$("a.filter-link-active").each(function() {
			if ($(this).data('filtersort')) { url += $(this).data('filtersort'); }
			if ($(this).data('filterprice')) { url += $(this).data('filterprice'); }

		});
		console.log(url);
		window.location.href = url;
	});

	//////////////////////////////////

	/*
		$('a#clickproductdetail').on('click', function(event) {
			event.preventDefault();
			var id = $(this).data('id');
			var nameShoe = $(this).data('nameshoes');
			var price = $(this).data('price');
			var idshoes = $(this).data('idshoes')
	
			// Tạo một đối tượng JSON chứa các giá trị của các biến
			var data = {
				"ID": id,
				"NAME": nameShoe,
				"PRICE": price,
				"ID_SHOES": idshoes,
				"ACTION": "productdetail"
			};
	
			$.ajax({
				type: "POST",
				url: "/shopbangiay-jsp-servlet/api-web-productdetail",
				data: JSON.stringify(data),
				contentType: "application/json",
				dataType: "json",
				success: function(response) {
					console.log(response + "productdetail");
	
					// Di chuyển chuyển hướng trang vào trong phần xử lý thành công của AJAX
					var url = "/shopbangiay-jsp-servlet" + $('a#clickproductdetail').attr('href');
					window.location.href = url;
	
					// Xử lý dữ liệu phản hồi sau khi chuyển hướng
					var colors = response.colors;
					var size = response.size;
					var images = response.images;
					var df = response.detall_shoes;
	
					var i = 1;
					images.forEach(function(image) {
						$('#imageDataThumb' + i).attr('data-thumb', "/shopbangiay-jsp-servlet/" + image.id);
						$('#imageIMG' + i).attr('src', "/shopbangiay-jsp-servlet/" + image.id);
						$('#imageA' + i).attr('href', "/shopbangiay-jsp-servlet/" + image.id);
						i++;
					});
	
					colors.forEach(function(color) { // cập nhật colors
						var option = $('<option>', { text: color.namee });
						$('#color').append(option);
					});
					size.forEach(function(size) { // cập nhật size
						var option = $('<option>', { text: size.size });
						$('#sizes').append(option);
					});
					$('#nameShoe').text(df.name); // cập nhật tên
					$('#PRICE').text('$' + df.price); // Cập nhật giá
					$('#id_Shoe').val(df.id_SHOE);
					$('#iddf').val(df.id);
	
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
					
				},
				error: function(xhr, status, error) {
					console.error("Error sending data:", error);
				}
			});
		});
	
	
	*/
	// summit comment
	$('#idsubmitform').on('click', function() {
		var starCount = $('.starComment').find('.zmdi-star').length;
		console.log(starCount);
		var reviewContent = $('#review').val();
		var iddetailshoe = $('#iddetailshoe').val();
		var idaccount = $('#idaccount').val();
		var data = {
			"IDACC": idaccount,
			"IDDF": iddetailshoe,
			"COMMENT": reviewContent,
			"RATE": starCount,
			"ACTION": "COMMENT"
		};
		$.ajax({
			type: "POST",
			url: "/shopbangiay-jsp-servlet/api-web-new",
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response)
				if (response.ACC != null) {
					if (response.commentrate == "commentrate") {
						alert("Vui lòng nhập comment or chọn sao.");
					} else {
						swal("", "Comment !", "success");
						$('#review').val("");
					}

				} else {
					alert("Vui lòng đăng nhập để comment.");
				}
			},
			error: function(xhr, status, error) {
				console.error("Error sending data:", error);
			}
		});

	});


	// update cart
	$('.UpdateCart').on('click', function() {
		var rowData = [];

		// Lặp qua mỗi hàng trong bảng
		$('.table_row').each(function() {
			// Tạo một đối tượng JSON mới để lưu trữ dữ liệu của mỗi hàng
			var row = {};

			// Lấy giá trị của thuộc tính "data-id"
			var id = $(this).find('.num-product-cart').data('id');

			// Lấy giá trị của phần tử có class "num-product-cart"
			var value = $(this).find('.num-product-cart').val();

			// Thêm cặp key-value vào đối tượng JSON
			row[id] = value;

			// Thêm đối tượng JSON này vào mảng rowData
			rowData.push(row);
		});

		// Hiển thị dữ liệu đã thu thập được
		console.log(rowData);
		var data = {
			"CART": rowData,
			"ACTION": "UPDATECART"
		};


		$.ajax({
			type: "POST",
			url: "/shopbangiay-jsp-servlet/api-web-new",
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response)
				if (response.ACC != null) {
					swal("", "Update !", "success");
					// Xóa các dòng hiện tại trước khi cập nhật HTML mới
					$('.table-shopping-cart .table_row').remove();

					// Thêm HTML mới cho từng dòng
					$('.table-shopping-cart').append(response.html);
					$('.tongtien').text(response.tongtien);
					location.reload();

				} else {
					alert("Vui lòng đăng nhập để comment.");
				}
			},
			error: function(xhr, status, error) {
				console.error("Error sending data:", error);
			}
		});

	});



	$('.js-hide-modal1').on('click', function() {
		$('.js-modal1').removeClass('show-modal1');

		location.reload();

	});

	/*	//  gắn sự kiện click cả các phần tử mới thêm vào html
		$(document).on('click', '.UpdateCart', function() {
			
	
		});*/


})(jQuery);
function btnnumproductdown(e) {
	var numProduct = Number($(e).next().val());
	if (numProduct > 0) $(e).next().val(numProduct - 1);
}

function btnnumproductup(e) {
	var numProduct = Number($(e).prev().val());
	$(e).prev().val(numProduct + 1);
}

function DeleteCart(e) {
	var id = e.querySelector("div").getAttribute("data-id");
	console.log(id)
	var data = {
		"IDCART": id,
		"ACTION": "DELETECART"
	};
	$.ajax({
		type: "POST",
		url: "/shopbangiay-jsp-servlet/api-web-new",
		data: JSON.stringify(data),
		contentType: "application/json",
		dataType: "json",
		success: function(response) {
			console.log(response);
			if (response.ACC != null) {
				swal("", "Delete !", "success");
				// Xóa các dòng hiện tại trước khi cập nhật HTML mới
				$('.table-shopping-cart .table_row').remove();

				// Thêm HTML mới cho từng dòng
				$('.table-shopping-cart').append(response.html);
			} else {
				swal("", "Delete !", "error"); // Show error message
			}
		},
		error: function(xhr, status, error) {
			console.error("Error sending data:", error);
			swal("", "Error !", "error"); // Show error message
		}
	})
}