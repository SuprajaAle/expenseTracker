<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
</head>
<body>
	The logged in UserName is ${user.name} ${user.name} Email is
	${user.username} ${user.name} Occupation is ${user.occupation}
	${user.name} Income is ${user.income} ${food} ${foodlist}


	<table class="table table-striped table-hover table-bordered ">
		<caption>User Expenses</caption>
		<thead class="thead-dark">
			<tr>
				<th>Desc</th>
				<th>Target Date</th>
				<th>Done</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${foodlist}" var="food">
				<tr>
					<td>${food.id}</td>
					<td>${food.userid}</td>
					<td>${food.value}</td>
					<td>${food.name}</td>
					<%-- <td><fmt:formatDate value="${todo.targetDate}"
							pattern="dd/MM/yyyy" /></td> --%>
					<td>${food.description}</td>
					<%-- <td><a type="button" class="btn btn-success"
						href="/updatetodo?id=${todo.id}">Update</a></td>
					<td><a type="button" class="btn btn-danger"
						href="/removetodo?id=${todo.id}">Delete</a></td> --%>
				</tr>
			</c:forEach>

		</tbody>
	</table>

	<a href="/addFood">Add user</a>

</body>
</html>