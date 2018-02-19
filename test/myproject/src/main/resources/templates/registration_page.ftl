<#ftl encoding='UTF-8'>
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
                <li><a href="registration_page.ftl">Registration</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Examples</a></li>
                <li><a href="#">F.A.Q.</a></li>
            </ul>
        </div>
    </div>
</div>

<div id="regfield">
    <div class="container">
        <div class="row centered">
            <div class="col-lg-20 col-lg-offset-15">
                <form class="form-horizontal" action='' method="POST">
                    <div class="fieldset">
                        <h2 align="left">User Registration</h2>
                        <div class="form-group" align="left">
                            <div class="container">
                                <form class="form-horizontal" name="registrationForm" method="post"
                                      action="/registration" role="form">
                                    <div class="form-group">
                                        <label for="username" class="col-sm-3 control-label">Name</label>
                                        <div class="col-sm-4">
                                            <input type="text" id="username" name="name" placeholder="Name"
                                                   class="form-control" autofocus>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="userlastname" class="col-sm-3 control-label">Surname</label>
                                        <div class="col-sm-4">
                                            <input type="text" id="userlastname" name="surname" placeholder="Surname"
                                                   class="form-control" autofocus>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="col-sm-3 control-label">Email</label>
                                        <div class="col-sm-4">
                                            <input type="email" id="email" name="email" placeholder="Email"
                                                   class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="mobilephone" class="col-sm-3 control-label">Mobile phone</label>
                                        <div class="col-sm-4">
                                            <input type="text" id="mobilephone" name="mobilephone"
                                                   placeholder="+7 (XXX)-XXX-XX-XX" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="password" class="col-sm-3 control-label">Password</label>
                                        <div class="col-sm-4">
                                            <input type="password" id="password" name="password" placeholder="Password"
                                                   class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                                        <div class="col-sm-4">
                                            <input type="date" id="birthDate" name="birthDate" class="form-control">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label col-sm-3">Gender</label>
                                        <div class="col-sm-6">
                                            <div class="row">
                                                <div class="col-sm-4">
                                                    <label class="radio-inline">
                                                        <input type="radio" id="Radio" name="gender" value="Female">Female
                                                    </label>
                                                </div>
                                                <div class="col-sm-4">
                                                    <label class="radio-inline">
                                                        <input type="radio" id="Radio" name="gender" value="Male" checked>Male
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </div> <!-- /.form-group -->
                                    <hr width="850" align="center">
                                    <div class="form-group">
                                        <label class="control-label col-sm-3">Registrate as</label>
                                        <div class="col-sm-6">
                                            <div class="row">
                                                <div class="col-sm-4">
                                                    <label class="radio-inline">
                                                        <input type="radio" id="Radio" name="role" value="USER" checked>User
                                                    </label>
                                                </div>
                                                <div class="col-sm-4">
                                                    <label class="radio-inline">
                                                        <input type="radio" id="Radio" name="role" value="MASTER">Master
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </div> <!-- /.form-group -->
                                    <div class="form-group">

                                    </div> <!-- /.form-group -->
                                    <div class="form-group">
                                        <div class="col-sm-4 col-sm-offset-3">
                                            <button type="submit" class="btn btn-primary btn-block">Register</button>
                                        </div>
                                    </div>
                                </form> <!-- /form -->
                            </div> <!-- ./container -->

                        </div>

                    </div>
                </form>

            </div>
        </div>
    </div>
</div>

<footer class="container-fluid text-center">
    <p>

    </p>
</footer>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
</body>

</html>
