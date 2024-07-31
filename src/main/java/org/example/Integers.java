package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Integers {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        System.out.println(integers + " Original list.");
        Set<Integer> set = new HashSet<>(integers);
        System.out.println(set + " Set used to remove dupes.");
        List<Integer> listNoDupes = new ArrayList<>(set);
        System.out.println(listNoDupes + " List with no dupes.");

        Integers obj = new Integers();

        try {
            int sum = obj.add(listNoDupes);
            System.out.println("The sum of the list with no duplicates is: " + sum);

            int average = obj.average(sum, listNoDupes.size());
            System.out.println("The average of the list with no duplicates is: " + average);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution of try-catch-finally block completed.");
        }
    }

    public int add(List<Integer> integers) {
        int sum = 0;
        for (Integer integer : integers) {
            if (integer == null) {
                throw new IllegalArgumentException("List contains a null element.");
            }
            sum += integer;
        }
        return sum;
    }

    public int average(int sum, int size) {
        if (size == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return sum / size;
    }
}






