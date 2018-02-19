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
    <link rel="stylesheet" href="../css/jasny-bootstrap.css">
    <link rel="stylesheet" href="../css/main.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
    <script type="text/javascript" src="/js/upload_file.js"></script>
    <script type="text/javascript" src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/jasny-bootstrap.js"></script>


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
    <div class="containertransparent">

        <div class="col-lg-2" align="center" class="img-responsive">
            <img width="180" height="180" src="${model.user.avatarUrl}" class="img-thumbnail" alt="Cinque Terre">
            <div class="form-inline">
                <br>
                <div class="fileinput fileinput-new" data-provides="fileinput">
                    <span class="btn btn-default btn-file">
                        <span>Choose file</span>
                            <input type="file" id="fileInput" name="avatarurl" />
                    </span>
                    <button class="btn btn-info"name="uploadButton" onclick="uploadFile(
                    document.getElementById('fileInput')['files'][0])">Load
                    </button>
                    <br>
                    <span class="fileinput-filename"></span>
                    <span class="fileinput-new">No file chosen</span>
                </div>
            </div>


        </div>
        <div class="col-lg-8" align="left">
            <h4 align="left">Edit profile</h4>
            <br>

            <form class="form-horizontal" name="updateForm" method="POST" action="" role="form">
                <div class="form-group">
                    <label for="username" class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-4">
                        <input type="text" id="username" name="name" value="${model.user.name}" placeholder="Name"
                               class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="userlastname" class="col-sm-3 control-label">Surname</label>
                    <div class="col-sm-4">
                        <input type="text" id="userlastname" name="surname" value="${model.user.surname}"
                               placeholder="Surname" class="form-control" autofocus>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-3 control-label">Email</label>
                    <div class="col-sm-4">
                        <input type="email" id="email" name="email" placeholder="Email" value="${model.user.email}"
                               class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label for="mobilephone" class="col-sm-3 control-label">Mobile phone</label>
                    <div class="col-sm-4">
                        <input type="text" id="mobilephone" name="mobilephone" value="${model.user.mobilephone}"
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
                        <input type="date" id="birthDate" name="birthDate" value="${model.user.birthDate}"
                               class="form-control">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="Radio1" name="gender" value="Female"
                                           <#if model.user.gender =='Female'> checked</#if >
                                    >Female
                                </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio-inline">
                                    <input type="radio" id="Radio1" name="gender" value="Male"
                                            <#if model.user.gender !='Female'> checked</#if >
                                    >Male
                                </label>
                            </div>
                        </div>
                    </div>
                </div> <!-- /.form-group -->
                <div class="form-group">
                    <div class="col-lg-6 col-sm-offset-3">
                        <button type="submit" class="btn btn-success ">Save</button>
                        <a href="profile.ftl" class="btn btn-danger ">Cancel</a>
                        <a type="submit" class="btn btn-warning ">Delete User Profile</a>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


<footer class="container-fluid text-center" >
    <p>
        SUpertext
    </p>
</footer>



<script src="../js/bootstrap.min.js"></script>
</body>

</html>
