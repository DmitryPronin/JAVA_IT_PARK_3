package com.company;

public class Student {
    private String name;
    private String surname;
    private int numberOfGroup;
    private int academicperfomance[];

    public Student(String name, String surname, int numberOfGroup, int[] academicperfomance) {
        this.name = name;
        this.surname = surname;
        this.numberOfGroup = numberOfGroup;
        this.academicperfomance = academicperfomance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public int[] getAcademicperfomance() {
        return academicperfomance;
    }

    public void add(String name, String surname, int numberOfGroup, int academicperfomance[]){
        this.name = name;
        this.surname = surname;
        this.numberOfGroup = numberOfGroup;
        this.academicperfomance = academicperfomance;


}
    public void show(){
        System.out.println("==================================");
        System.out.println("Имя : " + this.name);
        System.out.println("Фамилия : " + this.surname);
        System.out.println("Номер группы : "  + this.numberOfGroup);
        double middlerate,sum=0.00;

        for (int i=0; i<this.academicperfomance.length;i++){
            sum=sum+this.academicperfomance[i];
        }
        middlerate = sum / this.academicperfomance.length;

        System.out.println("Средний балл = " + middlerate + "||");

    }

    public double Middleperformance(){
        double middlerate,sum=0.00;

        for (int i=0; i<this.academicperfomance.length;i++){
            sum=sum+this.academicperfomance[i];
        }
        middlerate = sum / this.academicperfomance.length;
        return middlerate;


    }


}
