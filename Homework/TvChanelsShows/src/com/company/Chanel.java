package com.company;

import java.time.LocalTime;

public class Chanel {
    private Shows chanel[];
    private String chanelName;
    private int countShows = 0;


    public Chanel() {
        chanel = new Shows[10];
    }

    public Shows[] getShows() {
        return chanel;
    }

    public String getChanelName() {
        return chanelName;
    }

    public void setChanelName(String chanelName) {
        this.chanelName = chanelName;
    }

    public void addShows(Shows show) {
        if (countShows <= chanel.length) {
            chanel[countShows] = show;
            countShows++;
        }
    }

    public void showShows() {

        System.out.println("Название канала : " + this.getChanelName());
        System.out.println("===============");

        for (int i = 0; i < this.chanel.length; i++)
            if (this.chanel[i] != null) {
                System.out.println("Начало :" + this.chanel[i].getStartShow()+", Конец :" + this.chanel[i].getEndShow() +" - " + this.chanel[i].getNameShow());
            }

    }
  }


