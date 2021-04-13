<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<!-- Required meta tag  -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1,shrink-to-fit=no">

<!-- Bootstrap CSS  -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link href='<c:url value="/resources/css/my-test.css"/>'>

<title>Resgistration Form</title>
</head>

<center>
	<img width="375" height="275" src="/resources/images/demo.jpg" alt="my iage"/>
</center>
<body class="" style="background: #66C6E9;">

	<div class="container mt-4">
		<div class="row">
			<div class="col-md-8 offset-md-2">
				<div class="card">
					<div class="card-body">

						<h3 class="text-center">Complex Form</h3>

						<form action="handleform" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Your Name</label><input
									name="name" type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter Name"> <small id="emailHelp"
									class="form-text text-muted">We will never share your
									name</small>
							</div>
							
							<div class="form-group">
								<label for="exampleInputEmail1">Your Password</label><input name="password"
									type="password" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Id">
							</div>
							
							<div class="form-group">
								<label for="exampleInputEmail1">Your Id</label><input name="id"
									type="text" class="form-control" id="exampleInputEmail1"
									aria-describedby="emailHelp" placeholder="Enter Id">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Your DOB</label><input
									name="dob" type="text" class="form-control"
									id="exapmleInputEmail1" placeholder="dd/mm/YYYY"
									aria-describedby="emailHelp">
							</div>

							<div class="form-group">
								<label for="exampleFormControlSelect1">Select Courses</label><select
									name="courses" class="form-control"
									id="exampleFormControlSelect1" multiple>
									<option>Javas</option>
									<option>Android</option>
									<option>Python</option>
									<option>Goland</option>
									<option>Kotlin</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male"> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female"> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select type</label><select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="newstudent">New Student</option>
								</select>
							</div>

							<div class="container text-center">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>