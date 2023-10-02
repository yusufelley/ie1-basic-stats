import java.util.ArrayList;
import java.util.Collections;

// Calculates the min and max of a given set of numbers in an ArrayList<Double>
public class MinMaxCalculation {

    public double minCalculator(ArrayList<Double> numbers) {
        return Collections.min(numbers);
    }

    public double maxCalculator(ArrayList<Double> numbers) {
        return Collections.max(numbers);
    }

}