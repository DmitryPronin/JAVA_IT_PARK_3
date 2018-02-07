<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8" >
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User's page</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/main.css">

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
                <li><a href="registration.html">Registration</a> </li>
                <li><a href="#">About</a> </li>
                <li><a href="#">Examples</a> </li>
                <li><a href="/logout">Logout</a> </li>
            </ul>
        </div>
    </div>
</div>
<div id="userbackground">
    <div class="containertransparent">

        <div class="col-lg-2" align="center" class="img-responsive" >
            <img width="180" height="180" src="${model.user.avatarUrl}" class="img-thumbnail" alt="Cinque Terre">
            <br><br>
            <button type="submit" class="btn btn-info">Edit profile</button>
        </div>
        <div class="col-lg-8" align="left">
            <div class="btn-group btn-group-justified">
                <a href="#" class="btn btn-primary">Order's history</a>
                <a href="#" class="btn btn-primary">Find master</a>
            </div>
        </div>

        <div class="col-lg-2" align="Center">
            <br>
            Name: ${model.user.name}<br>
            Surname: ${model.user.surname}<br>
            Birth date: ${model.user.birthDate}<br>
            Email: ${model.user.email}<br>
            Mobile phone: ${model.user.mobilephone}<br>
        </div>




    </div>
</div>


<footer class="container-fluid text-center">
    <p>
        SUpertext
    </p>
</footer>



<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</body>

</html>
