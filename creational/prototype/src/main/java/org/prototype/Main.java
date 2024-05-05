package org.prototype;

import org.prototype.entities.Knight;
import org.prototype.entities.Mage;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Knight originalKnight = new Knight();
        originalKnight.attack();

        Knight clonedKnight = (Knight) originalKnight.clone();

        System.out.println("Original Knight:-");
        System.out.println(originalKnight);

        System.out.println("-----------------------------");
        System.out.println("Cloned Knight");
        System.out.println(clonedKnight);

        Mage mage = new Mage();
        mage.clone(); // will throw exception
    }
}