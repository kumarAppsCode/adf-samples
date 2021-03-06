<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/ui/jsp/adftags" prefix="adf"%>
<adf:uimodelreference model="mainUIModel" lifecycle="test.LoginPageHandler"/>
<html>
<head>
  <title>Browse Departments</title>
</head>
<body>
  <a href="main.jsp?event=Logout">Logout</a>
  <html:errors/>
  <table border="1" width="100%">
    <tr>
      <th>&nbsp;</th>
      <th>
        <c:out value="${bindings.DeptView.labels['Deptno']}"/>
      </th>
      <th>
        <c:out value="${bindings.DeptView.labels['Dname']}"/>
      </th>
      <th>
        <c:out value="${bindings.DeptView.labels['Loc']}"/>
      </th>
    </tr>
    <c:forEach var="Row" items="${bindings.DeptView.rangeSet}">
      <tr>
        <td>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Deptno']}"/>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Dname']}"/>&nbsp;
        </td>
        <td>
          <c:out value="${Row['Loc']}"/>&nbsp;
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
