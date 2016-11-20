<%@ include file="header.jsp"%>
<html>
<head>
<title>User Detail</title>
</head>
<body>
	<h2>registration Form 1: User Detail</h2>
<div class="container">
<div class="col-lg-6">
   <form class="form-horizontal">
    <fieldset>
	<form:form modelAttribute="userDetail">

		<br>
		<label for="firstName">First Name: </label>
		<form:input path="firstName" />
		<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('firstName')}" var="err">
		<div><span>${err.text}</span></div>
		</c:forEach>
		<br>
		<label for="lastName">Last Name: </label>
		<form:input path="lastName" />
		<br>
		<label for="phoneNumber">Phone Number: </label>
		<form:input path="phoneNumber" />
		<br>
		<label for="mobileNumber">Mobile Number: </label>
		<form:input path="mobileNumber" />
		<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('mobileNumber')}" var="err">
		<div><span>${err.text}</span></div>
		</c:forEach>
		<br>
		<label for="emailId">Email-Id: </label>
		<form:input path="emailId" />
		<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('emailId')}" var="err">
		<div><span>${err.text}</span></div>
		</c:forEach>
		<br>
		<label for="username">Username: </label>
		<form:input path="username" />
		<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('username')}" var="err">
		<div><span>${err.text}</span></div>
		</c:forEach>
		<br>
		<label for="password">Password: </label>
		<form:password path="password" />
		<c:forEach items="${flowRequestContext.messageContext.getMessagesBySource('password')}" var="err">
		<div><span>${err.text}</span></div>
		</c:forEach>
		<br>
		<button  name="_eventId_submit" type="submit" class="btn btn-warning">Submit</button>
		<button  name="_eventId_cancel" type="submit" class="btn btn-warning">Cancel</button>
	</form:form>
	</fieldset>
	</form>
	</div>
	</div>
</body>
</html>