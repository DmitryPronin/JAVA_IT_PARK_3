<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Подтверждение</title>
</head>
<body>
<#if model.result == true>
<h1>Вы успешно подтвердили почту</h1>
<h1>перейдите по ссылке для входа на сайт</h1> <a href="../templates/login.ftl">Enter</a>
<#else>
<h1>Ссылка не верна, либо истекло время жизни</h1>

</#if>
</body>
</html>