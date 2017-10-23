package com.company;



import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shows shows1 = new Shows("Давай поженимся", "00:00","06:00", "Передаче о том как всех женят");
        Shows shows2 = new Shows("Давай разженимся","06:00","12:00", "Передаче о том как всех разводят");
        Shows shows3 = new Shows("На рыбалку","12:00","18:00", "Передаче о рыбалке на территории России");
        Shows shows4 = new Shows("На охоту","18:00","23:59", "Передаче об охоте на территории России");
        Shows shows5 = new Shows("Гарри Поттер и философский камень", "00:00","06:00", "Философский камень рулит");
        Shows shows6 = new Shows("Гарри Поттер и тайная комната","06:00","12:00", "Не ходи в тайную комнату");
        Shows shows7 = new Shows("Гарри Поттер и узник Азкабана","12:00","18:00", "Не пей с узником из Азкабана");
        Shows shows8 = new Shows("Гарри Поттер и кубок огня","18:00","23:59", "Пей из кубка огня");
        Shows shows9 = new Shows("Сербский фильм", "00:00","06:00", "Философский камень рулит");
        Shows shows10 = new Shows("Клип","06:00","12:00", "Не ходи в тайную комнату");
        Shows shows11= new Shows("Чрево","12:00","18:00", "Не пей с узником из Азкабана");
        Shows shows12= new Shows("Клуб шортбас","18:00","23:59", "Пей из кубка огня");

        Chanel chanel[] = new Chanel[3];
        chanel[0] = new Chanel();
        chanel[0].addShows(shows1);
        chanel[0].addShows(shows2);
        chanel[0].addShows(shows3);
        chanel[0].addShows(shows4);
        chanel[0].setChanelName("Первый канал");
        chanel[1] = new Chanel();
        chanel[1].addShows(shows5);
        chanel[1].addShows(shows6);
        chanel[1].addShows(shows7);
        chanel[1].addShows(shows8);
        chanel[1].setChanelName("Гарри Поттер и Ты");
        chanel[2] = new Chanel();
        chanel[2].addShows(shows9);
        chanel[2].addShows(shows10);
        chanel[2].addShows(shows11);
        chanel[2].addShows(shows12);
        chanel[2].setChanelName("Арт-хаус на каждый день");

        TV tv = new TV();
        tv.addChanels(chanel[0]);
        tv.addChanels(chanel[1]);
        tv.addChanels(chanel[2]);

        while (true){
            Menu.ShowMainMenu();
            Scanner scanner = new Scanner(System.in);
            int numChanel = scanner.nextInt();
            switch (numChanel){
                case 1:{
                    tv.watchCurrentChanel(numChanel-1);

                                   }break;
                case 2:{
                    tv.watchCurrentChanel(numChanel-1);
                }break;
                case 3:{
                    tv.watchCurrentChanel(numChanel-1);
                }break;
                case 0:
                    return;
            }

        }






















    }
}
