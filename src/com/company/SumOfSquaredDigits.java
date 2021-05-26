package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 9119 through the function, 811181
public class SumOfSquaredDigits {
        public int squareDigits(int n) {
                int[] individualDigitsArray =

                    Arrays.stream(String.valueOf(n)
                    .split(""))
                    .mapToInt(Integer::valueOf)
                    .toArray();

                String result = "";
                for (int x:individualDigitsArray) {
                        result.concat(String.valueOf(x*x));
                }
                return Integer.parseInt(result);
        }

        public static void main(String[] args) {
                SumOfSquaredDigits j = new SumOfSquaredDigits();
                System.out.println(j.squareDigits( 9119));
        }
}
