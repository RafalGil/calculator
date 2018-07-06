package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

/**
 * This service is responsible for average mathematical calculations
 */
@Service
public class CalculatorAverage {

    /**
     * Method calculate mathematical square of digit
     * @param a user input
     * @return square of a
     */
    public int squareOf(int a){
        //todo implement method
        return a*a;
    }

    /**
     * Method calculate mathematical element of digit
     * @param a user input
     * @return element of a
     */
    public int elementOf(int a){
        int sum=0;
        for (int i = 1;i<=a; i ++){
            sum+=i;
        }
        return sum;
    }

    /**
     * Method calculate mathematical factorial of digit
     * @param a user input
     * @return factorial of a
     */
    public int factorial(int a){

        return 0;
    }

    /**
     * Method check if digit is a prime number
     * @param a user input
     * @return result
     */
    public boolean isPrimeNumber(int a){
        //todo implement method
        return true;
    }

}
