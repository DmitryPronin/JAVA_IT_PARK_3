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
        <div class='col-sm-6'>
            <div class="form-group">
                <form method="get" name="scheduleForm" action="/schedules">
                    <input style="color: #000 ;" value="${model.today}" type="date" name="date" class="datePicker"/>
                    <input class="btn btn-info" value="Edit Data" type="submit"/>
                </form>
            </div>
        </div>
    </div>

    <div class="row">
        <!--TABLE============================================================================-->


        <table class="table table-striped table-bordered">
            <thead>
            <tr>
                <th>Specialist</th>
                <th class="text-center" colspan="6">${model.today}</th>
            </tr>
            </thead>
        <#list model.users as user>
            <tr>
                <tbody>
                <form method="post" name="saveschedule" action="/schedules">
                    <td>${user.name}  ${user.surname}</td>
                    <#list  user.schedules as schedules>

                        <#if schedules.status=='BUSY'>
                            <th>
                                <button disabled class="btn btn-danger" value="${schedules.dateTime} ${schedules.master.id}" name="time_id"
                                        type="submit">${schedules.dateTime}</button>
                            </th>

                        <#else >
                            <th>
                                <button class="btn btn-success" value="${schedules.dateTime} ${schedules.master.id} ${schedules.id}"  name="time_id"
                                        type="submit">${schedules.dateTime}</button>
                            </th>

                        </#if>

                    </#list>
                    <input type="hidden" style="color: #000 ;" value="${model.today}" type="date" name="date" class="datePicker"/>



                </form>
                </tbody>
            </tr>

        </#list>
        </table>



        <!--TABLE============================================================================-->
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

