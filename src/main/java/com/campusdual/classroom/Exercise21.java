package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hset = new HashSet<>();
        hset.add("ELEMENT KPRBC");
        hset.add("ELEMENT YPBTM");
        hset.add("ELEMENT AADXU");
        hset.add("ELEMENT RXCGJ");
        hset.add("ELEMENT WYMVD");
        hset.add("ELEMENT WFGEJ");
        hset.add("ELEMENT TYGBS");
        hset.add("ELEMENT MAPTK");
        hset.add("ELEMENT GJXVE");
        hset.add("ELEMENT BAFGL");
        return hset;
    }

    public static Set<String> createTreeSet() {
        Set<String> tset = new TreeSet<>();
        tset.add("ELEMENT KPRBC");
        tset.add("ELEMENT YPBTM");
        tset.add("ELEMENT AADXU");
        tset.add("ELEMENT RXCGJ");
        tset.add("ELEMENT WYMVD");
        tset.add("ELEMENT WFGEJ");
        tset.add("ELEMENT TYGBS");
        tset.add("ELEMENT MAPTK");
        tset.add("ELEMENT GJXVE");
        tset.add("ELEMENT BAFGL");
        return tset;
    }

    private static void printSet(Set<String> customSet) {
        for(String a:customSet){
            System.out.println(a);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);

    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();
        boolean hashSetAdded = addElementToSet(hashSet, "ELEMENT AAA");
        boolean treeSetAdded = addElementToSet(treeSet, "ELEMENT AAA");
        System.out.println("Elementos en HashSet:");
        printSet(hashSet);

        System.out.println("Elementos en TreeSet:");
        printSet(treeSet);

    }

}
