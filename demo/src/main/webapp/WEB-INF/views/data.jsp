<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<title>Document</title>
	<!-- <link rel"stylesheet" href="/css/main.css" /> -->
	<script src="https://cdn.jsdelivr.net/npm/chart.js@2.8.0"></script>
</head>
<body>
<canvas id="myChart" width="300" height="100"></canvas>
</body>
<script>
	const gdata = [];
	const values=[];
	async function getData() {
		const response = await fetch("http://localhost:8080/users");
		const data = await response.json();

		console.log(data);
		data.forEach((d) => {
			console.log(d.name, d.occupation);
			gdata.push(d.name);
			values.push(d.income);
		});
	}
	chartIt();
	async function chartIt(){
		await getData();
		var ctx = document.getElementById("myChart").getContext("2d");
		var myChart = new Chart(ctx, {
			type: "line",
			data: {
				labels: gdata,
				datasets: [
					{
						label: "Income",
						data: values,
						backgroundColor: [
							"rgba(255, 99, 132, 0.2)",
							"rgba(54, 162, 235, 0.2)",
							"rgba(255, 206, 86, 0.2)",
							"rgba(75, 192, 192, 0.2)",
							"rgba(153, 102, 255, 0.2)",
							"rgba(255, 159, 64, 0.2)",
						],
						borderColor: [
							"rgba(255, 99, 132, 1)",
							"rgba(54, 162, 235, 1)",
							"rgba(255, 206, 86, 1)",
							"rgba(75, 192, 192, 1)",
							"rgba(153, 102, 255, 1)",
							"rgba(255, 159, 64, 1)",
						],
						borderWidth: 1,
					},
				],
			},
			options: {
				scales: {
					yAxes: [
						{
							ticks: {
								beginAtZero: true,
							},
						},
					],
				},
			},
		});
	}
</script>
</html>
