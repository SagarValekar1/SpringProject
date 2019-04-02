<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.er{
color:red;
background:#D3D3D3
}
</style>
<meta charset="ISO-8859-1">
<title>Place Order</title>
<h1>Purchase</h1>
</head>
<body>
	<form:form action="AddPurchase" method="POST" modelAttribute="purchase">
		<table>
			<tr>
				<td>Order Code:</td>
				<td><form:input path="oCode" cssClass="er" /></td>
				<td><form:errors path="oCode" cssClass="er"></form:errors></td>
			</tr>
			<tr>
				<td>Shipment Mode:</td>
				<td><form:input path="shMode"  cssClass="er" /></td>
				<td><form:errors path="shMode" cssClass="er" ></form:errors></td>
			
			</tr>
			<tr>
				<td>Vendor:</td>
				<td><form:input path="vendor" /></td>
			</tr>
			<tr>
				<td>Reference Number:</td>
				<td><form:input path="refNum" /></td>
			</tr>
			<tr>
				<td>Quality Check:</td>
				<td><form:radiobutton path="qcheck" value="Required" />Required
				</td>

				<td><form:radiobutton path="qcheck" value=" Not Required" />Not
					Required</td>
			</tr>
			<tr>
				<td>Default Status:</td>
				<td><form:input path="dstatus" /></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><form:textarea path="pdes" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Place Order" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>