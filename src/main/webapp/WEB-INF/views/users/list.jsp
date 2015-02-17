<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

Users:

<ul>
    <c:forEach items="${users.content}" var="user">
        <li>${user.name}, ${user.age}</li>
    </c:forEach>
</ul>