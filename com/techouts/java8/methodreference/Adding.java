package com.techouts.java8.methodreference;

import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.logging.Logger;

class Add {
//    static int sum(int a, int b) {
//        return a + b;
//    }

    int mul(int a, int b) {
        return a * b;
    }

    String add(String a, String b) {
        return a + b;
    }

//    String repeat(String a, int b) {
//        String result = "";
//        for (int i = 0; i < b; i++) {
//            result += a;
//        }
//        return result;
//    }
}

public class Adding {
    private static final Logger logger = Logger.getLogger(Adding.class.getName());

    public static void main(String[] args) {
        //BiFunction<Integer, Integer, Integer> add = Add::sum;
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        logger.log(Level.INFO, "Addition of {0} and {1} is {2}", new Object[]{5, 6, add.apply(5, 6)});

        BiFunction<Integer, Integer, Integer> mul = new Add()::mul;
        logger.log(Level.INFO, "Multiplication of {0} and {1} is {2}", new Object[]{5, 6, mul.apply(5, 6)});

        BiFunction<String, String, String> concat = new Add()::add;
        logger.log(Level.INFO, "Concatenation of {0} and {1} is {2}", new Object[]{"Ganesh", "Yadav", concat.apply("Ganesh ", "Yadav")});

//        BiFunction<String, Integer, String> repeat = new Add()::repeat;
//        logger.log(Level.INFO, "Repeating {0} of {1} is {2}", new Object[]{"Ganesh", 3, repeat.apply("Ganesh ", 3)});
        BiFunction<String, Integer, String> concat2 = (a, b) -> {
            String result = "";
            for (int i = 0; i < b; i++) {
                result += a;
            }
            return result;
        };
        logger.log(Level.INFO, "Repeating {0} of {1} is {2}", new Object[]{"Ganesh", 3, concat2.apply("Ganesh ", 3)});

        BiFunction<Integer, Integer, Integer> max = Math::max;
        logger.log(Level.INFO, "Max of {0} and {1} is {2}", new Object[]{5, 6, max.apply(5, 6)});

    }
}
