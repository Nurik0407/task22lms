import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int ran = random.nextInt(100);
            array.add(ran);
            if (ran % 2 == 0) evenNumbers.add(ran);
            else oddNumbers.add(ran);
        }
        System.out.println("All numbers: \n" + array);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Even numbers: \n" + evenNumbers);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Odd numbers: \n" + oddNumbers);
    }
}