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
        <form method="post" name="saveschedule" action="/schedule">
            <td>${user.name}  ${user.surname}</td>
            <#list ["09:00","10:00","11:00","12:00","13:00","14:00"] as time>
                <th>

                    <button  class="btn btn-default" value="${time} ${user.id}" name="time_id" type="submit">${time}</button>
                    <!--<input class="btn btn-default" value="${time}"1 name="time" type="submit"/></th-->
            </#list>
            <input type="hidden" style="color: #000 ;" value="${model.today}" type="date" name="date" class="datePicker"/>
        </form>
        </tbody>
    </tr>
</#list>
</table>