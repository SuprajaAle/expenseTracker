<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<style>
</style>
<!-- CSS only -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

</head>
<body>

	<div class="container mt-5">
		<form:form action="/getOther" modelAttribute="others" method="post">

			<div class="form-group">
				<label for="desc">Description</label>
				<form:errors path="description" cssClass="ml-5 text-danger" />
				<form:input type="text" cssClass="form-control" id="desc"
					path="description" />
			</div>
			<div class="form-group">
				<label for="date">Date</label>

			<form:label path="date">Date</form:label>
				<form:input path="date" type="text" class="form-control" />
				<form:errors path="date" cssClass="ml-5 text-danger" />

			</div>

			<fieldset class="form-group">
				
			</fieldset>

			<div class="form-group">
				<label for="value">Cost</label>
				<form:errors path="value" cssClass="ml-5 text-danger" />
				<form:input type="number" cssClass="form-control" path="value"
					id="value" />
			</div>
			<div class="form-group">
				<label for="name">name</label>
				<form:errors path="name" cssClass="ml-5 text-danger" />
				<form:input type="text" cssClass="form-control" path="name"
					id="name" />
			</div>
			<button type="submit" class="btn btn-primary w-25"
				aria-describedby="new">Now Add</button>
		</form:form>
	</div>

	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>

	<script
		src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
	<script>
		$('#targetDate').datepicker({

			format : 'dd/mm/yyyy'
		});
	</script>
</body>
</html>