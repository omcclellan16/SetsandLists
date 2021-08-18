package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// from something known as "collection interface" in Java
    // Remember how you have to set the size of an array - you don't have to do this with a set or list
    // we don't know exactly how many things we will be adding...


        // a set is a collection of unordered elements that are unique
        // a set cannot contain the same element twice, and it doesn't know where each item exists, only that...
        //... they do.
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.add(-8);
        //System.out.println(t);
        // if we have two elements that are identical, Java will only print them once.

        boolean x = t.contains(5);
        //System.out.println(x);
        // this is how we can check to see if our set contains a certain element - true or false will be returned.

        t.remove(9);
        //System.out.println(t);
        // we now get a set that doesn't include "9".

        t.add(10);
        //System.out.println(t);
        // we now get a set that has "10" added

        t.clear();
        // this removes everything from a set

        t.isEmpty();
        // this will tell you whether or not a set is empty

        t.size();
        int y = t.size();
        System.out.println(y);
        // this will tell you the size of a set


        // TREE SETS
        // similar to hash sets
        // you can only have unique elements, but they are ordered.

        // LINKED HASH SETS
        // similar to  a basic set, but faster on certain operations... 

    }
}
