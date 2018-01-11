package TV_Chanels;

import java.util.Scanner;

public class RemoteController {
    public static void main(String[] args) {
        TV tv = TV.getInstance();
        Show show1 = new Show("Орел и решка", "00:00","06:00","Передача о путешествиях");
        Show show2 = new Show("Давай поженимся", "06:00","12:00","Передача о поисках жены");
        Show show3 = new Show("Дом-2", "12:00","18:00","Передача о секса");
        Show show4 = new Show("100 к 1", "18:00","23:59","Передача с Гуревичем");
        Show show5 = new Show("Гарри поттер и философский камень", "00:00","06:00","Фильм о философском камне");
        Show show6 = new Show("Гарри поттер и тайная комната", "06:00","12:00","Фильм о тайной комнате");
        Show show7 = new Show("Гарри поттер и узник Азкабана", "12:00","18:00","Фильм об узнике");
        Show show8 = new Show("Гарри поттер и кубок огня", "18:00","23:59","Фильм о кубке огня");
        Show show9 = new Show("Властелин колец: братство кольца", "00:00","06:00","Фильм о братстве");
        Show show10 = new Show("Властелин колец: две башни", "00:00","06:00","Фильм о башнях");
        Show show11 = new Show("Властелин колец: возвращение короля", "12:00","18:00","Фильм о короле");
        Show show12= new Show("Хоббит", "18:00","23:59","Предыстория Властелина колец");
        Chanel chanel[] = new Chanel[3];
        chanel[0] = new Chanel();
        chanel[0].addShow(show1);
        chanel[0].addShow(show2);
        chanel[0].addShow(show3);
        chanel[0].addShow(show4);
        chanel[0].setNameChanel("Пятница");

        chanel[1] = new Chanel();
        chanel[1].addShow(show5);
        chanel[1].addShow(show6);
        chanel[1].addShow(show7);
        chanel[1].addShow(show8);
        chanel[1].setNameChanel("Гарри поттер фанс");

        chanel[2] = new Chanel();
        chanel[2].addShow(show9);
        chanel[2].addShow(show10);
        chanel[2].addShow(show11);
        chanel[2].addShow(show12);
        chanel[2].setNameChanel("Tolkien TV");

        tv.addChanel(chanel[0]);
        tv.addChanel(chanel[1]);
        tv.addChanel(chanel[2]);


        while (true){
            MainMenu.ShowMainMenu();
            System.out.println("Введите номер канала для просмотра");
            Scanner scanner = new Scanner(System.in);
            int numbChanel = scanner.nextInt();
            switch (numbChanel){
                case 1:{
                    tv.watchCurrentChanel(numbChanel-1);
                }break;

                case 2:{
                    tv.watchCurrentChanel(numbChanel-1);
                }break;

                case 3:{
                    tv.watchCurrentChanel(numbChanel-1);
                }break;

                case 0:{
                    return;
                }
                default:
                    System.out.println("Введите заново номер канала из списка");
            }
        }

    }

}
