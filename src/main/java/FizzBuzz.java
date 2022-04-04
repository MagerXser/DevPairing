import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzz {
    /*
    Print integers 1 to N, but print “Fizz” if an integer is divisible by 3, “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.
    - Range of numbers
    - eventually print those numbers
    - Store the range
    - iterate / loop
    - divisibleBy method - done
    - return the filtered fizzbuzz sequence
     */

    public static void main(String[] args) {


        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<Integer> generatedList = fizzBuzz.fizzBuzzGenerator(15);
        System.out.println(generatedList);

        for (int i = 1; i<= generatedList.size(); i++)
        {
            if (fizzBuzz.divisibleBy(i,3) && fizzBuzz.divisibleBy(i,5))
                System.out.println("FizzBuzz");
            else if (fizzBuzz.divisibleBy(i,3))
                System.out.println("Fizz");
            else if (fizzBuzz.divisibleBy(i,5))
                System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    public ArrayList fizzBuzzGenerator (int fizzBuzzSize) {

        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 1; i <= fizzBuzzSize; i++)
            generatedList.add(i);

        for (int i = 0; i < generatedList.size(); i++) {

        }
        return generatedList;
    }

    public boolean divisibleBy (int numberInList, int dividingNumber) {

        return numberInList % dividingNumber == 0;

    }
}

