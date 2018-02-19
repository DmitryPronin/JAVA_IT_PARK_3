<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <meta charset="utf-8" >
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
                <li><a href="/registration">Registration</a> </li>
                <li><a href="#">About</a> </li>
                <li><a href="#">Examples</a> </li>
                <li><a href="#">F.A.Q.</a> </li>
            </ul>
        </div>
    </div>
</div>

<div id="logfield">
    <div class="container">
        <div class="row centered">
            <div class="col-lg-20 col-lg-offset-15">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-7"></div>
                        <div class="col-sm-3">
                            <form class="form-group" name="registrationForm" method="post" action="/login">
                                <br>
                                <div class="form-group" align="right">
                                    <label for="email"></label>
                                    <input type="email" name="email" class="form-control" id="email" placeholder="Enter email" >
                                </div>
                                <div class="form-group" align="right">
                                    <label for="pwd"></label>
                                    <input type="password" name="password" class="form-control" id="pwd"
                                           placeholder="Enter password">
                                </div>

                                <div class="checkbox" align="right">
                                    <label><input type="checkbox" name="remember-me"> Remember me</label>
                                </div>
                                <div class="form-group" align="right">
                                    <button type="submit"  class="btn btn-primary btn-sm btn-block">Enter</button>
                                </div>
                            </form>
                        </div>
                        <div class="col-sm-2"></div>
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
