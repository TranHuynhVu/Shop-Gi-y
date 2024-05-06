
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
		console.log(data)
		$.ajax({
			type: "POST", // hoặc "GET" tùy thuộc vào cách bạn cấu hình máy chủ
			url: "/shopbangiay-jsp-servlet/api-web-new", // Thay đổi "your-server-url" thành URL của máy chủ của bạn
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response)
				console.log(data)
				if (response.ACC != null) {
					
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
	$('.btn-num-product-down').on('click', function() {
		var numProduct = Number($(this).next().val());
		if (numProduct > 0) $(this).next().val(numProduct - 1);
	});

	$('.btn-num-product-up').on('click', function() {
		var numProduct = Number($(this).prev().val());
		$(this).prev().val(numProduct + 1);
	});

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
		var idshoes = $(this).data('idshoes');
		var nameShoe = $(this).data('nameshoes');
		var price = $(this).data('price');
		// Tạo một đối tượng JSON chứa các giá trị của các biến
		var data = {
			"ID": id,
			"ID_SHOE": idshoes,
			"NAME": nameShoe,
			"PRICE": price,
			"ACTION": "ClickQuickView"
		};
		// Sử dụng AJAX để gửi đối tượng JSON đến máy chủ
		$.ajax({
			type: "POST", // hoặc "GET" tùy thuộc vào cách bạn cấu hình máy chủ
			url: "/shopbangiay-jsp-servlet/api-web-new", 
			data: JSON.stringify(data),
			contentType: "application/json",
			dataType: "json",
			success: function(response) {
				console.log(response)
				if (response.ACC != null) {

					var colors = response.colors;
					var size = response.size;
					var nameShoe = response.nameShoe;
					var price = response.price;

					colors.forEach(function(color) {// cập nhật colors
						var option = $('<option>', { text: color.namee });
						$('#colorsShoe').append(option);

					});
					size.forEach(function(size) {// cập nhật size
						var option = $('<option>', { text: size.size });
						$('#sizes').append(option);
					});
					$('#nameShoe').text(nameShoe)// cập nhật tên
					$('#PRICE').text(price); // Cập nhật giá
					$('.js-modal1').addClass('show-modal1');

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

	
	$('.js-hide-modal1').on('click', function() {
		$('.js-modal1').removeClass('show-modal1');
	});



})(jQuery);