import java.util.ArrayList;

public class Hiof_NumberEngine {

    private ArrayList<String> numberArray;

    public Hiof_NumberEngine(ArrayList<String> numberArray) {
        this.numberArray = numberArray;
    }

    public ArrayList<String>  numberEngine(ArrayList<String> numberArray) {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numberArray.add("HiOf");
            } else if (i % 3 == 0) {
                numberArray.add("Hi");
            } else if (i % 5 == 0) {
                numberArray.add("Of");
            } else {
                numberArray.add(Integer.toString(i));
            }
        }   return numberArray;
    }
}
