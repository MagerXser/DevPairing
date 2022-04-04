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
        System.out.println(fizzBuzz.fizzBuzzGenerator(11));
    }

    public boolean divisibleBy (int numberInList , int dividingNumber) {

        return numberInList % dividingNumber == 0;

    }

    public ArrayList fizzBuzzGenerator (int fizzBuzzSize) {

        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 1; i <= fizzBuzzSize; i++)
            generatedList.add(i);

        for (int i = 0; i < generatedList.size(); i++) {

        }
        return generatedList;
    }
}

