package HumanComparatorb1;

public class HumanMain {
    public static void main(String[] args) {
        Human kolya = new Human("Nikolay",68,1.65, 75.4);
        Human nina = new Human("Nina", 59, 1.70, 70.0);
        Human dima = new Human("Dmitriy", 30, 1.8, 71.8);
        Human vasilina = new Human("Vasilina",36,1.75, 65.4);
        Human oficer = new Human("Oficer", 59, 1.55, 77.0);
        Human rinat = new Human("Rinat", 24, 1.9, 70.8);



        Human humans[] = new Human[6];
       // for (int i=0;i<humans.length;i++) humans[i] = new Human();

        humans[0] = kolya;
        humans[1] = nina;
        humans[2] = dima;
        humans[3] = vasilina;
        humans[4] = oficer;
        humans[5] = rinat;



        HumanComparatorAge humanComparatorAge = new HumanComparatorAge();
        HumanComparatorWeight humanComparatorWeight = new HumanComparatorWeight();
        System.out.println(humanComparatorAge.Compare(kolya,dima));

        HumanBubbleSorter humanBubbleSorter = new HumanBubbleSorter();
        humanBubbleSorter.sort(humanComparatorAge,humans);
        System.out.println();

        HumanChoiceSorter humanChoiceSorter = new HumanChoiceSorter();
        humanChoiceSorter.sort(humanComparatorWeight,humans);
        System.out.println();




    }
}
