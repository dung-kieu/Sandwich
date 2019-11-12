<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: anh dung
  Date: 12/11/2019
  Time: 9:06 SA
  To change this template use File | Settings | File Templates.
--%>
<form method="post" action="showSandwich">
  <fieldset style="height: fit-content; width: fit-content">
    <legend>Sandwich Condiments Selection</legend>
    <form:checkboxes path="Spice"  items="${Spice}" name="Spice"/>
    <p><button type="submit">Order</button></p>
  </fieldset>
</form>
<p>Orders: ${result}</p>
