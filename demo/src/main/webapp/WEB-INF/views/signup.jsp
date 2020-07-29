<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

</head>
<body>

<div class="container mt-5">
    <form:form action="signedup" modelAttribute="user" method="post">
        <div class="form-group">
            <label for="name">User Name</label> <form:errors path="name" cssClass="ml-5 text-danger"/>
            <form:input type="text" cssClass="form-control" id="name"  path="name" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label> <form:errors path="username" cssClass="ml-5 text-danger"/>
            <form:input type="email" cssClass="form-control" id="exampleInputEmail1"  path="username" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label> <form:errors path="password" cssClass="ml-5 text-danger"/>
            <form:input type="password" cssClass="form-control" id="exampleInputPassword1" path="password" />
        </div>

        <div class="form-group">
            <label for="occupation">Occupation</label> <form:errors path="occupation" cssClass="ml-5 text-danger"/>
            <form:input type="" cssClass="form-control" path="occupation" id="occupation" />
        </div>
        <div class="form-group">
            <label for="income">Income</label> <form:errors path="income" cssClass="ml-5 text-danger"/>
            <form:input cssClass="form-control"   path="income" id="income" />
        </div>
        <button type="submit" class="btn btn-primary w-25" aria-describedby="new" >Now Login</button>
    </form:form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
</body>
</html>