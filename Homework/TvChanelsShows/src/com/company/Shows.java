package com.company;

import java.time.LocalTime;

public class Shows {
    private String nameShow;
    private LocalTime startShow;
    private LocalTime endShow;
    private String info;

    public Shows(String shows, String startShow, String endShow, String info) {
        if (shows == null){
            this.nameShow = "_____________";
        }else {
            this.nameShow = shows;
        }
        if (startShow == null){
            this.startShow = LocalTime.parse("00:00");
        }else{
            this.startShow = LocalTime.parse(startShow);
        }
        if (endShow == null){
            this.endShow = LocalTime.parse("00:00");
        }else {
            this.endShow = LocalTime.parse(endShow);
        }
        if (info == null) {

                this.info = "_____________";
            }else{
                this.info = shows;
            }

    }






    public String getNameShow() {
        return nameShow;
    }

    public LocalTime getStartShow() {
        return startShow;
    }

    public LocalTime getEndShow() {
        return endShow;
    }

    public String getInfo() {
        return info;
    }
}
