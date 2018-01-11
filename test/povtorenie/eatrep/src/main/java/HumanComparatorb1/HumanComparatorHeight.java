package HumanComparatorb1;

public class HumanComparatorHeight implements HumanComparator {
    @Override
    public int Compare(Human a, Human b) {
        int rez = 2;
        if (a.getHeight()>b.getHeight()){
            rez = 1;
        }

        if (a.getHeight()==b.getHeight()){
            rez = 0 ;
        }

        if (a.getHeight()<b.getHeight()){
            rez = -1;
        }
        return rez;
    }
}
