package HumanComparatorb1;

public class HumanChoiceSorter implements  HumanSorter{
    @Override
    public void sort(HumanComparator comparator, Human[] human) {
        for (int j=0;j<human.length;j++){
            int min= j;
            Human temphuman = new Human();
            for(int i=j;i<human.length;i++){
                if (comparator.Compare(human[i],human[min])<0){
                    min = i;
                }
            }
            temphuman=human[j];
            human[j]=human[min];
            human[min]=temphuman;


        }
    }
}
