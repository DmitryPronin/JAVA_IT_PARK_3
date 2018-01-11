package HumanComparatorb1;

public class HumanComparatorWeight implements HumanComparator {
    @Override
    public int Compare(Human a, Human b) {
        int rez = 2;
        if (a.getWeight()>b.getWeight()) {
            rez= 1;
        }

        if (a.getWeight()==b.getWeight()){
            rez= 0;
        }

        if (a.getWeight()<b.getWeight()){
            rez= -1;
        }
        return rez;
    }
}
