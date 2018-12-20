<%--
  Created by IntelliJ IDEA.
  User: KeqinFeng
  Date: 2018/12/20
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="req" value="${pageContext.request}" />
<c:set var="basePath" value="${req.scheme}://${req.serverName}:${req.serverPort}${req.contextPath}/" />
<html>
<head>
    <base href="${basePath}">
    <title>GetCustomerByIdPage</title>
    <link href="/css/common.css" rel="stylesheet" />
    <script src="/js/formData.js"></script>
    <script>
        function onSubmit()
        {
            document.getElementById('result').hidden = true;
            let formDataRaw = new FormData(document.getElementById('customerIdForm'));
            let formData = getFormData(formDataRaw);
            let url = new URL("/getCustomerById",window.location.href);
            let params = formData;
            Object.keys(params).forEach(key => url.searchParams.append(key,params[key]));
            fetch
            (
                url,
                {
                    method:'GET',
                    cache:'no-store',
                    redirect:'follow'
                }
            ).then
            (
                function (response)
                {
                    response.text().then
                    (
                        (text) =>
                        {
                            if (!text)
                            {
                                document.getElementById('result').hidden = false;
                            }
                        }
                    );
                }
            );
        }
    </script>
</head>
<body>
<div id="mainDiv">
    <form id="customerIdForm">
        <label for="customerId">客户身份证号码</label>
        <input type="text" id="customerId" name="customerId" />
        <span hidden id="result" class="error">无此客户</span>
        <input type="button" id="submit" value="继续" onclick="onSubmit()">
    </form>
</div>
</body>
</html>
