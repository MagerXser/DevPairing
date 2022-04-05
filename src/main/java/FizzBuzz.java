import java.util.ArrayList;

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
        fizzBuzz.fizzBuzzList(15);
    }

    public ArrayList numberGenerator(int fizzBuzzSize) {

        ArrayList<Integer> generatedList = new ArrayList<>();

        for (int i = 1; i <= fizzBuzzSize; i++)
            generatedList.add(i);

        return generatedList;
    }

    public boolean divisibleBy (int numberInList, int dividingNumber) {

        return numberInList % dividingNumber == 0;

    }

    public String fizzBuzzNumberChecker(int fizzBuzzNumber) {

        if (divisibleBy(fizzBuzzNumber,3) && divisibleBy(fizzBuzzNumber,5))
            return "FizzBuzz";
        else if (divisibleBy(fizzBuzzNumber,3))
            return "Fizz";
        else if (divisibleBy(fizzBuzzNumber,5))
            return "Buzz";
        else
            return String.valueOf(fizzBuzzNumber);
    }

    public ArrayList fizzBuzzList(int sizeOfList) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        ArrayList<String> generatedList = fizzBuzz.numberGenerator(sizeOfList);

        for (int i = 1 ; i <= sizeOfList ; i++) {
            fizzBuzz.fizzBuzzNumberChecker(i);
            generatedList.set(i-1,fizzBuzz.fizzBuzzNumberChecker(i));

        }
        System.out.println(generatedList);
        return generatedList;
    }
}

