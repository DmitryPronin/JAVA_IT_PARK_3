package ru.itpark.probro.forms;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ScheduleForm {
    private String date;
    private String time_id;
    private String commit;



}
