<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>X-Workz</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" height="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search">


				</form>
			</div>
		</nav>
	</div>
	<div class=container>


		<h1>Welcome to CM Info</h1>

		<form action="cm" method="post">
		

			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label">Hotel
					Name </label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter Hotel Name"
					name="name" />
			</div>

			<div>
				<select class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example" name="parties">
					<option selected>Parties</option>
					<option>Select</option>
					<option>BJP</option>
					<option>Congress</option>
					<option>JOS</option>
					<option>AAP</option>
					<option>KJP</option>
					
				</select>
			</div>
			
			<div>
				<select class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example" name="state">
					<option selected>State</option>
					<option>India</option>
					<option>KR</option>
					<option>UP</option>
					<option>TS</option>
					<option>AP</option>
					<option>TN</option>
					<option>MP</option>
					<option>TS</option>
					
				</select>
			</div>
			
			
			<div>
				<select class="form-select form-select-lg mb-3"
					aria-label=".form-select-lg example" name="tenure">
					<option selected>Select</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					
					
				</select>
				</div>
				PortFolio <textarea rows="3" cols="50" name="portfolio"></textarea>
				<input type="submit" value="Save" class="btn btn-primary"/>
			
		

			
		</form>
	</div>
</body>
</html>
