package HumanComparatorb1;

public class HumanBubbleSorter implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human[] humans) {
        Human temphuman;
        temphuman = new Human();
        for (int j = 0; j < humans.length - 1; j++) {
            for (int i = 0; i < humans.length - j-1; i++) {
                if (comparator.Compare(humans[i], humans[i + 1]) > 0) {
                    temphuman = humans[i + 1];
                    humans[i + 1] = humans[i];
                    humans[i] = temphuman;
                }
            }
        }
    }
}
