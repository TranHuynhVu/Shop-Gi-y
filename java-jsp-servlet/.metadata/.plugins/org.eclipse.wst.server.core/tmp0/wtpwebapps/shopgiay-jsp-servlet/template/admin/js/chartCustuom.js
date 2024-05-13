
$(window).on('load', function() {
	var data = {
		"ACTION": "LOADTRANG_DATACHART"
	};
	$.ajax({
		type: "POST",
		url: "/shopbangiay-jsp-servlet/api-admin-new",
		data: JSON.stringify(data),
		contentType: "application/json",
		dataType: "json",
		success: function(response) {
			console.log(response);

			const xValues = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
			const yValues = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

			for (let month = 1; month <= 12; month++) {
				// Kiểm tra xem tháng này có trong Data_Chart không
				if (response.Data_Chart.hasOwnProperty(month.toString())) {
					// Nếu có, cập nhật giá trị tương ứng trong yValues
					yValues[month - 1] = response.Data_Chart[month.toString()];
				}
			}
			console.log(xValues);
			console.log(yValues);

			new Chart("myChart", {
				type: "line",
				data: {
					labels: xValues,
					datasets: [{
						fill: false,
						lineTension: 0,
						backgroundColor: "rgba(0,0,255,1.0)",
						borderColor: "rgba(0,0,255,0.1)",
						data: yValues
					}]
				},
				options: {
					legend: { display: false },
					scales: {
						yAxes: [{ ticks: { min: 0, max: 70000 } }],
					}
				}
			});



		},
		error: function(xhr, status, error) {
			console.error("Error sending data:", error);
		}
	});

});