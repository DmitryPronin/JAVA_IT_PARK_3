<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8">
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
                <li><a href="registration.html">Registration</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Examples</a></li>
                <li><a href="/logout">Logout</a></li>
            </ul>
        </div>
    </div>
</div>
<div id="userbackground">
    <div class="containertransparent container">
        <div class="row">
        <div class="col-lg-2 col-md-4 col-sm-5" class="img-responsive">

            <img width="180" height="180" src="${model.user.avatarUrl}" class="img-thumbnail" alt="Cinque Terre">
            <br><br>

            <a href="/profile_edit" class="btn btn-info">Edit profile</a>

        </div>
        <div class="col-lg-8 col-md-8 col-sm-7 ">
            <div class="row center-menu">
                <div class="col-md-12">
                    <div class="btn-group btn-group-justified">
                        <a href="#" class="btn btn-primary">Order's history</a>
                        <a href="/schedule" class="btn btn-primary">Find master</a>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    Name:
                </div>
                <div class="col-md-6">
                ${model.user.name}
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    Surname:
                </div>
                <div class="col-md-6">
                ${model.user.surname}
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    Birth date:
                </div>
                <div class="col-md-6">
                ${model.user.birthDate}
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    Email:
                </div>
                <div class="col-md-6">
                ${model.user.email}
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    Mobile phone:
                </div>
                <div class="col-md-6">
                ${model.user.mobilephone}
                </div>
            </div>
        </div>


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
