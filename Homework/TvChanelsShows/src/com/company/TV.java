package com.company;

import java.time.LocalTime;

public class TV {
    private Chanel tv[];
    private  int countChanel;

    public TV() {
        tv = new Chanel[3];
    }


    public Chanel[] getChanel() {
        return tv;
    }

    public void addChanels(Chanel chanel){
        tv[countChanel] = chanel;
        countChanel++;
    }

    public void watchCurrentChanel(int numbOfChanel){
        LocalTime currentTime = LocalTime.now();
        Chanel temp[] =  this.getChanel();
        Shows tempshows[] = temp[numbOfChanel].getShows();
        for (int i=0; i<tempshows.length; i++) {
            if (tempshows[i] != null) {

                if (currentTime.getHour() < tempshows[i].getEndShow().getHour() && currentTime.getHour()>tempshows[i].getStartShow().getHour()){
                    System.out.println("На канале " + temp[numbOfChanel].getChanelName()+ " сейчас показывают :" + tempshows[i].getNameShow());
                }
            }
        }







    }


    }



