package ee.itcollage.level6;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        System.out.println("How old are you?");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); //or sc.nextLine() for String
        System.out.println("You are: " + age + " years old");

        // todo calculate and print which year person was born in
        int birthYear = 2018 - age;
        System.out.println("You were born in "  + birthYear + ".");

        // todo if person is 18+ ask them whether they have coded java
        if (age >= 18) {
            sc = new Scanner(System.in);
            System.out.println("Have you coded java? (y/n)");
            String answer = sc.nextLine();
            boolean java;
            if (answer.equals("y")) {
                java = true;
            } else {
                java = false;
            }

            // todo if yes, do sth, if no, do sth else
            if(java) {
                System.out.println("Nice!");
            } else {
                System.out.println("Boo!");
            }
        }
    }
}
