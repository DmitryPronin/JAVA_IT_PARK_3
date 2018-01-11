package HumanComparatorb1;

public class HumanComparatorAge implements HumanComparator {
    @Override
    public int Compare(Human a, Human b) {
        int rez= 2;
        if (a.getAge()>b.getAge()){
            rez =1;
        }

        if (a.getAge()==b.getAge()){
            rez =0;
        }

        if (a.getAge()<b.getAge()){
            rez = -1;
        }
        return rez;
    }
}
