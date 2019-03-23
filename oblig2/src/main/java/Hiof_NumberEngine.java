import java.util.ArrayList;

public class Hiof_NumberEngine {

    private ArrayList<String> numberArray;

    public Hiof_NumberEngine(ArrayList<String> numberArray) {
        this.numberArray = numberArray;
    }


    public ArrayList<String> numberEngine(ArrayList<String> numberArray) throws NegativeNumberException {
        //Her kan man endre første verdien til en minusverdi for å sjekke NegativeNumberException
        numberArray.add("1");

        String minimumValue = "1";
        String FirstValue = numberArray.get(0);

        if (Integer.parseInt(FirstValue) >= Integer.parseInt(minimumValue)) {
            for (int i = 2; i < 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    numberArray.add("HiOf");
                } else if (i % 3 == 0) {
                    numberArray.add("Hi");
                } else if (i % 5 == 0) {
                    numberArray.add("Of");
                } else {
                    numberArray.add(Integer.toString(i));
                }
            }
            return numberArray;
        } else {
            throw new NegativeNumberException("List with negative numbers are not allowed");
        }
    }
}
