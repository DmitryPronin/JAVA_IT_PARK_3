<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fresh Look</title>
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/main.css">

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Fresh Look</a>
        </div>
        <div class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="../registration_page.ftl">Registration</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Examples</a></li>
                <li><a href="#">F.A.Q.</a></li>
            </ul>
        </div>
    </div>
</div>
<br/><br/>
<div class="container">


    <div class="row">
        <h2 style="color: #0f0f0f">Congratulations, ${model.user.name}. You signed up for an appointment with a doctor ${model.master.name} ${model.master.surname} on ${model.dayofweek} ${model.month} ${model.day} ${model.year} at ${model.time}.
        <h3 style="color: #0f0f0f">Change or cancel your visit you can <a href="/profile">here</a> or visit order's history in your acount</h3>
    </div>

</div>


<footer class="container-fluid text-center" style=" position: relative; top: 100%;">
    <p>
        SUpertext
    </p>
</footer>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="../js/bootstrap.js"></script>
<!--<script src="../js/main.js"></script-->

</body>

</html>

