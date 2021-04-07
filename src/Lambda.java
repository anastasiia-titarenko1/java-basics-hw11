import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;


import static java.util.stream.Stream.*;

public class Lambda {

    /**
     * Function to get max value.
     *
     * @return lambda expression.
     */
    public static BiFunction<Double, Double, Double> getMax() {
        return (aDouble, aDouble2) -> Math.max(aDouble, aDouble2);
    }

    /**
     * Function to get square root.
     *
     * @return lambda expression.
     */
    public static Function<Double, Double> getSqrt() {
        return Math::sqrt;
    }
}

