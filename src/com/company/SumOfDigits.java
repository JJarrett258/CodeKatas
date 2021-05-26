package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfDigits {
    public List<Integer> constituentNumbers(int numberToDestructure) {
        return Arrays.stream(String.valueOf(numberToDestructure)
                .split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public int sumOfIndividualDigits(List<Integer> digitsToSum) {
        return digitsToSum.stream().mapToInt(integer -> integer).sum();
    }

    public int singleDigitAfterReduction(int startingNumber) {
        while (true) {
            if (startingNumber < 10) {
                return startingNumber;
            } else {
                startingNumber = sumOfIndividualDigits(constituentNumbers(startingNumber));
            }
        }
    }
}
