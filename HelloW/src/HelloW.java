import javax.swing.plaf.synth.SynthEditorPaneUI;

public class HelloW {
    public static void main(String[] args) {
       Person maks = new Person();
       maks.height = 180;
       maks.weight = 74.4f;

        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.weight = 96.4f;
        oleg.height = 195;

        System.out.println(maks.height);
        }
}

