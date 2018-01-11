package TV_Chanels;

import java.time.LocalTime;

public class Show {
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
    private String aboutCommit;

    public Show(String name, String startTime, String endTime, String aboutCommit) {
        if (name ==null) {
            this.name = "_______";
        }else this.name = name;

        if (startTime==null){
            this.startTime = LocalTime.parse("00:00");
        }else this.startTime = LocalTime.parse(startTime);
        if (endTime==null){
            this.endTime = LocalTime.parse("00:00");
        }else this.endTime = LocalTime.parse(endTime);

        if (aboutCommit==null){
            this.aboutCommit = "*****************";
        }else this.aboutCommit = aboutCommit;


    }

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getAboutCommit() {
        return aboutCommit;
    }

    public void watchShow(){
        System.out.println("Название : " + this.name);
        System.out.println("Начало в : " + this.startTime.toString());
        System.out.println("Начало в : " + this.endTime.toString());
        System.out.println("Информация о передаче : " + this.aboutCommit);
    }
}
