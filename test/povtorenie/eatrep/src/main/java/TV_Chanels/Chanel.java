package TV_Chanels;

import java.time.LocalTime;

public class Chanel {
    private String nameChanel;
    private Show shows [];
    private int countShows;

    public Chanel() {
        this.shows= new Show[10];
    }



    public String getNameChanel() {
        return nameChanel;
    }

    public void setNameChanel(String nameChanel) {
        this.nameChanel = nameChanel;
    }

    public Show[] getShows() {
        return shows;
    }

    public void addShow(Show show){
        if (countShows< shows.length){
            shows[countShows] = show;
            countShows++;
        }else System.out.println("Программа передач сформирована");

    }

    public void showListShow(){
        for (Show show: this.shows ){
            show.watchShow();
        }
    }

    public void showCurrentTimeShow(){
        LocalTime currentTime = LocalTime.now();
        for (int i=0; i<this.countShows; i++){
            if (currentTime.getHour()>=this.shows[i].getStartTime().getHour() && currentTime.getHour()< this.shows[i].getEndTime().getHour()){
                System.out.println("На канале " + this.getNameChanel()+ " показывают");
                this.shows[i].watchShow();
            }
        }

    }
}
