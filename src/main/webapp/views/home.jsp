<%@page import="java.util.List"%>
<%@page import="com.boot.dashboard.entity.DashboardData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table, th, td {
  		border: 1px solid black;
	}
</style>
</head>
<body>
<c:if test="${allData != null }">
	<c:forEach var="data" items="${allData}">
		<table style="width:100%; border:solid;	">
	<tr>
		<th>end_year</th>
		<td>${data.end_year}</td>
	</tr>
	<tr>
		<th>citylng</th>
		<td>${data.citylng}</td>
	</tr>
	<tr>
		<th>citylat</th>
		<td>${data.citylat }</td>
	</tr>	
	<tr>
		<th>intensity</th>
		<td>${data.intensity }</td>
	</tr>
	<tr>
		<th>sector</th>
		<td>${data.sector }</td>
	</tr>
	<tr>
		<th>topic</th>
		<td>${data.topic }</td>
	</tr>
	<tr>
		<th>insight</th>
		<td>${data.insight }</td>
	</tr>
	<tr>
		<th>swot</th>
		<td>${data.swot }</td>
	</tr>
	<tr>
		<th>url</th>
		<td>${data.url }</td>
	</tr>
	<tr>
		<th>region</th>
		<td>${data.region }</td>
	</tr>
	<tr>
		<th>start_year</th>
		<td>${data.start_year }</td>
	</tr>
	<tr>
		<th>impact</th>
		<td>${data.impact }</td>
	</tr>
	<tr>
		<th>added</th>
		<td>${data.added }</td>
	</tr>
	<tr>
		<th>published</th>
		<td>${data.published }</td>
	</tr>
	<tr>
		<th>city</th>
		<td>${data.city }</td>
	</tr>
	<tr>
		<th>country</th>
		<td>${data.country }</td>
	</tr>
	<tr>
		<th>relevance</th>
		<td>${data.relevance }</td>
	</tr>
	<tr>
		<th>pestle</th>
		<td>${data.pestle }</td>
	</tr>
	<tr>
		<th>source</th>
		<td>${data.source }</td>
	</tr>
	<tr>	
		<th>title</th>
		<td>${data.title}</td>
	</tr>
	<tr>
		<th>likelihood</th>
		<td>${data.likelihood }</td>
	</tr>
</table>
</c:forEach>
</c:if>

<table style="width:100%; border:solid;	">
	<tr>
		<th>end_year</th>
		<td>${data.end_year}</td>
	</tr>
	<tr>
		<th>citylng</th>
		<td>${data.citylng}</td>
	</tr>
	<tr>
		<th>citylat</th>
		<td>${data.citylat }</td>
	</tr>	
	<tr>
		<th>intensity</th>
		<td>${data.intensity }</td>
	</tr>
	<tr>
		<th>sector</th>
		<td>${data.sector }</td>
	</tr>
	<tr>
		<th>topic</th>
		<td>${data.topic }</td>
	</tr>
	<tr>
		<th>insight</th>
		<td>${data.insight }</td>
	</tr>
	<tr>
		<th>swot</th>
		<td>${data.swot }</td>
	</tr>
	<tr>
		<th>url</th>
		<td>${data.url }</td>
	</tr>
	<tr>
		<th>region</th>
		<td>${data.region }</td>
	</tr>
	<tr>
		<th>start_year</th>
		<td>${data.start_year }</td>
	</tr>
	<tr>
		<th>impact</th>
		<td>${data.impact }</td>
	</tr>
	<tr>
		<th>added</th>
		<td>${data.added }</td>
	</tr>
	<tr>
		<th>published</th>
		<td>${data.published }</td>
	</tr>
	<tr>
		<th>city</th>
		<td>${data.city }</td>
	</tr>
	<tr>
		<th>country</th>
		<td>${data.country }</td>
	</tr>
	<tr>
		<th>relevance</th>
		<td>${data.relevance }</td>
	</tr>
	<tr>
		<th>pestle</th>
		<td>${data.pestle }</td>
	</tr>
	<tr>
		<th>source</th>
		<td>${data.source }</td>
	</tr>
	<tr>	
		<th>title</th>
		<td>${data.title}</td>
	</tr>
	<tr>
		<th>likelihood</th>
		<td>${data.likelihood }</td>
	</tr>
</table>
</body>
</html>