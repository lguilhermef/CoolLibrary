package org.academiadecodigo.thunderstructs;

import java.lang.reflect.Array;
import java.util.*;

public class CoolRandom implements Coolness {

    private static final double MINDFUCK = 0.9;

    /**
     * Generates a random number (int) from 0 to the number you gave
     *
     * @param maxNumber max number (NOT INCLUDED) to be generated
     * @return the random generated number (int)
     */
    public static int coolRandom(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    /**
     * Generates a random number (double) from 0 to the number you gave
     *
     * @param maxNumber max number (NOT INCLUDED) to be generated
     * @return the random generated number
     */
    public static double coolRandom(double maxNumber) {
        return (Math.random() * maxNumber);
    }

    /**
     * Generates a random between minNumber and maxNumber
     *
     * @param minNumber min number (INCLUDED)
     * @param maxNumber max number (NOT INCLUDED)
     * @return the random generated number (int) in the interval
     */
    public static int coolIntervalRandom(int minNumber, int maxNumber) {

        int number;

        while ((number = (int) (Math.random() * maxNumber)) < minNumber) {
        }

        return number;
    }

    /**
     * Generates a random between minNumber and maxNumber
     *
     * @param minNumber min number (INCLUDED)
     * @param maxNumber max number (NOT INCLUDED)
     * @return the random generated number (double) in the interval
     */
    public static double coolIntervalRandom(double minNumber, double maxNumber) {

        double number;

        while ((number = (Math.random() * maxNumber)) < minNumber) {
        }

        return number;
    }


    /**
     * Cool Random Mindfuck is a random generator that generates a number between 0 and the number you gave (NOT INCLUDED)
     * <p>
     * Then, if another Math.Random is lower than the MINDFUCK value, it will return that random generated number.
     * Else, the method will generate another random generated number that can be up to maxNumber*maxNumber.
     *
     * @param maxNumber max number to be generated (OR NOT)
     * @return random generated number (int)
     */
    public static int coolRandomMindfuck(int maxNumber) {

        int number = (int) (Math.random() * maxNumber);

        if (Math.random() < MINDFUCK) {
            return number;
        }

        return (int) (Math.random() * (maxNumber * (Math.random() * maxNumber)));
    }


    /**
     * Cool Random Mindfuck is a random generator that generates a number between 0 and the number you gave (NOT INCLUDED)
     * <p>
     * Then, if another Math.Random is lower than the MINDFUCK value, it will return that random generated number.
     * Else, the method will generate another random generated number that can be up to maxNumber*maxNumber.
     *
     * @param maxNumber max number to be generated (OR NOT)
     * @return random generated number (double)
     */
    public static double coolRandomMindfuck(double maxNumber) {

        double number = (Math.random() * maxNumber);

        if (Math.random() < MINDFUCK) {
            return number;
        }

        return ((Math.random() * (maxNumber * (Math.random() * maxNumber))));
    }

    /**
     * Cool Random Boolean is a method that provides you a boolean if the generated number is higher than your percentage
     *
     * @param percentage percentaged to be compare to
     * @return a boolean according to result of the generated number and the percentage
     */
    public static boolean coolRandomBoolean(int percentage) {
        return (Math.random() * 100) <= percentage;
    }

    /**
     * Cool Array Randomizer is a method to randomize an array of Strings
     *
     * @param words array you wish to randomize
     * @return a new array of Strings
     */
    public static Object[] coolArrayRandomizer(String[] words) {

        String[] newArray = new String[words.length];
        List<String> newArrayList = new ArrayList<>();

        newArrayList.addAll(Arrays.asList(words));
        Collections.shuffle(newArrayList);

        for (int i = 0; i < words.length; i++) {
            newArray[i] = newArrayList.get(i);
        }

        return newArray;
    }

    /**
     * Cool Array Randomizer is a method to randomize an array of int
     *
     * @param numbers array of numbers you want to randomize
     * @return a new array of ints randmized
     */
    public static int[] coolArrayRandomizer(int[] numbers) {

        int[] newArray = new int[numbers.length];
        List<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            newArrayList.add(numbers[i]);
        }

        Collections.shuffle(newArrayList);

        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = newArrayList.get(i);
        }

        return newArray;
    }

    /*W.I.P*/

    @Override
    public void coolness() {

        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0:
                System.out.println("Super cool randomix");
                break;

            case 1:
                System.out.println("Cool freaking library! Coolest randoms in the house!");
                break;

            case 2:
                int number = (int) (Math.random() * 100000000);
                int number1 = (int) (Math.random() * 100000000);
                int number2 = (int) (Math.random() * 100000000);
                int number3 = (int) (Math.random() * 1000);

                System.out.println(number * number1 * number2 / number3);
                break;

            case 3:
                System.out.println("Cool randomizer by: #32_thunderSTRUCTs <Academia de Código_>");
                break;

            case 4:
                System.out.println("No more ideas, COOL!");
        }
    }


    public static void main(String[] args) {

        CoolRandom coolRandom = new CoolRandom();

        //Coolness
        System.out.println("Coolnessssssssssss ~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            coolRandom.coolness();
        }

        //CoolRandom
        System.out.println("\n\nCOOL RANDOM ~~~~~~~~~~~~~~~~~~\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(coolRandom(5));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(coolRandom(5.0));
        }

        //CoolIntervalRandom
        System.out.println("\n\nCOOL RANDOM INTERVAL ~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(coolIntervalRandom(5, 10));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(coolIntervalRandom(5.0, 10.0));
        }

        //CoolMindfuckRandom
        System.out.println("\n\nCOOL RANDOM MINDFUCK ~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(coolRandomMindfuck(20));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(coolRandomMindfuck(20.0));
        }

        //CoolRandomBoolean
        System.out.println("\n\nCOOL RANDOM BOOLEAN ~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 0; i < 10; i++) {
            System.out.println(coolRandomBoolean(100));
        }

        //Cool Array Randomizer
        System.out.println("\n\nCOOL STRING RANDOMIZER ~~~~~~~~~~~~~~~~~~~~~~");
        String[] cool = {"cooliness", "waza", "coolllllllllllllllnesssssss", "A TUA PRIMA", "VAI-TE LIXAR", "O RAFA É O MAIOR", "LOLEEEEE"};
        int[] cool1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] newCool = (String[]) coolArrayRandomizer(cool);
        int[] newCool1 = coolArrayRandomizer(cool1);

        for (int i = 0; i < cool.length; i++) {
            System.out.println(cool[i]);
        }

        System.out.println("\n\n NEW ARRAY\n");

        for (int i = 0; i < cool.length; i++) {
            System.out.println(newCool[i]);
        }

        System.out.println("\n\n NUMBERS AFTER\n");

        for (int i = 0; i < cool1.length; i++) {
            System.out.println(newCool1[i]);
        }

    }

}