package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Taken from here https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html
//We learn a lot about sets here.
//In this program, we apply the Set Interface Bulk Operations
//s1.containsAll(s2) -- returns true if s2 is a subset of s1
//s1.addAll(s2) -- transforms s1 into the union of s1 and s2.
//s1.retainAll(s2) -- transforms s1 into the intersection of s1 and s2
//s1.removeAll(s2) -- transforms s1 into the (assymmetric) set difference of s1 and s2.
    //(For example, the set difference of s1 minus s2 is the set containing all of the elements
    //found in s1 but not in s2).
//One thing to know about Set Interface Bulk Operations is that they modify the set
//For this reason, we make the following idioms:
// Set<Type> union = new HashSet<Type>(s1); --now, it doesn't have to be union. It can be anything
// union.addAll(s2);
//Set<Type> intersection = new HashSet<Type>(s1);
// intersection.retainAll(s2);
//Set<Type> difference = new HashSet<Type>(s1);
// difference.removeAll(s2);






public class SetMain {

    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + " elements.");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        System.out.println("===================================================");

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" "); // -- splits at the spaces
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        System.out.println("===================================================");

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords)); //turns the array into a list

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));



        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);


        System.out.println("===================================================");
        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println("===================================================");
        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of nature");
        }

        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }










    }

    private static void printSet(Set<String> set) {
        System.out.println("\t");
        for(String s : set) {
            System.out.println(s + " ");
        }
        System.out.println();
    }
}
