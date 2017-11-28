package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student students[] = new Student[10];
        Random random = new Random(6);
        int academicperfomance1[] = {5,3,4,1,4};
        Student student1 = new Student("Dmitry","Pronin",512,academicperfomance1);
        int academicperfomance2[] = {1,3,5,1,3};
        Student student2 = new Student("Albert","Abdullin",511,academicperfomance2);
        int academicperfomance3[] = {1,2,4,1,2};
        Student student3 = new Student("German","Blinov",412,academicperfomance3);
        int academicperfomance4[] = {4,3,4,1,2};
        Student student4 = new Student("Damir","Ahmedshin",512,academicperfomance4);
        int academicperfomance5[] = {3,3,3,3,3};
        Student student5 = new Student("Elena","Dolgushina",511,academicperfomance5);
        int academicperfomance6[] = {5,5,5,5,5};
        Student student6 = new Student("Dmitry","Ivanov",234,academicperfomance6);
        int academicperfomance7[] = {5,5,4,2,4};
        Student student7 = new Student("Sergey","Tihvinskiy",567,academicperfomance7);
        int academicperfomance8[] = {2,3,4,1,4};
        Student student8 = new Student("Ruslan","Kuznecov",611,academicperfomance8);
        int academicperfomance9[] = {5,3,4,3,5};
        Student student9 = new Student("Valentin","Skrebkov",513,academicperfomance9);
        int academicperfomance10[] = {5,2,2,2,2};
        Student student10 = new Student("Vitalya","Hotshit",511,academicperfomance10);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = student6;
        students[6] = student7;
        students[7] = student8;
        students[8] = student9;
        students[9] = student10;

        while (true){
            Menu.ShowMainMenu();
            int command = scanner.nextInt();
            switch (command){
                case 1:{
                    for (int i=0; i<students.length;i++){
                        students[i].show();
                    }
                }break;
                case 2:{
                    Student temp;
                    for (int i=0; i<students.length;i++){
                        for (int j=i+1; j<students.length;j++){
                            if (students[i].Middleperformance()>students[j].Middleperformance()){
                                temp = students[i];
                                students[i] = students[j];
                                students[j]=temp;
                            }
                        }
                    }
                }break;
                case 3: {
                    boolean go = true;

                    while (go == true) {
                        System.out.println("С каким проходным баллом показать студентов ");
                        double otmetka = scanner.nextDouble();
                        if (otmetka > 0 && otmetka <= 5) {
                            for (int i = 0; i < students.length; i++) {
                                if (otmetka <= students[i].Middleperformance()) {
                                    students[i].show();
                                }
                            }
                            go = false;

                        } else {
                            System.out.println("Введите значение в интервале 1-5");



                        }
                    }
                }break;
                case 4: {
                    boolean go = true;
                    while (go==true) {
                        System.out.println("Введите номер группы");
                        int numberofgroup = scanner.nextInt();
                        int count = 0;

                        for (int i = 0; i < students.length; i++) {
                            if (numberofgroup == students[i].getNumberOfGroup()) {
                                students[i].show();
                                count++;
                            }

                        }
                        if (count == 0) {
                            System.out.println("Такой группы не существует");

                        }else go = false;
                    }
                }break;
                case 5:{
                    boolean go = true;
                    while (go == true){
                        System.out.println("Введите номер группы");
                        int numberofgroup = scanner.nextInt();
                        int count = 0;
                        System.out.println("С каким проходным баллом показать студентов ");
                        double otmetka = scanner.nextDouble();
                        for (int i = 0; i < students.length; i++) {
                            if (numberofgroup == students[i].getNumberOfGroup()) {
                                if (otmetka > 0 && otmetka <= 5) {
                                    if (otmetka <= students[i].Middleperformance()) {
                                        students[i].show();
                                        count++;
                                        }


                                }else {
                                    System.out.println("Введите значение среднего бала в интервале 1-5");
                                    go = false;
                                    break;

                                }
                            }


                        }
                        if (count == 0) {
                            System.out.println("Данные согласно вашим запросам не найдены");
                            go = false;

                        }else go = false;
                    }
                }

            }
        }






























    }
}
