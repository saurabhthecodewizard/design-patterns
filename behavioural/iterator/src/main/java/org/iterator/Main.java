package org.iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator Design Pattern");
        System.out.println("--------------------------");

        Iterator<CountryCode> iterator = CountryCode.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}