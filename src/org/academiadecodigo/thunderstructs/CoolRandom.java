package org.academiadecodigo.thunderstructs;

public class CoolRandom implements Coolness {

    private static final double MINDFUCK = 0.9;

    /**
     * Generates a random number (int) from 0 to the number you gave
     *
     * @param maxNumber max number (NOT INCLUDED) to be generated
     * @return the random generated number (int)
     */
    public static int CoolRandom(int maxNumber) {
        return (int) (Math.random() * maxNumber);
    }

    /**
     * Generates a random number (double) from 0 to the number you gave
     *
     * @param maxNumber max number (NOT INCLUDED) to be generated
     * @return the random generated number
     */
    public static double CoolRandom(double maxNumber) {
        return (Math.random() * maxNumber);
    }

    /**
     * Generates a random between minNumber and maxNumber
     *
     * @param minNumber min number (INCLUDED)
     * @param maxNumber max number (NOT INCLUDED)
     * @return the random generated number (int) in the interval
     */
    public static int CoolIntervalRandom(int minNumber, int maxNumber) {

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
    public static double CoolIntervalRandom(double minNumber, double maxNumber) {

        double number;

        while ((number = (Math.random() * maxNumber)) < minNumber) {
        }

        return number;
    }


    /**
     * Cool Random Mindfuck is a random generator that generates a number between 0 and the number you gave (NOT INCLUDED)
     *
     * Then, if another Math.Random is lower than the MINDFUCK value, it will return that random generated number.
     * Else, the method will generate another random generated number that can be up to maxNumber*maxNumber.
     *
     * @param maxNumber max number to be generated (OR NOT)
     * @return random generated number (int)
     */
    public static int CoolRandomMindfuck(int maxNumber) {

        int number = (int) (Math.random() * maxNumber);

        if (Math.random() < MINDFUCK) {
            return number;
        }

        return (int) (Math.random() * (maxNumber * (Math.random() * maxNumber)));
    }


    /**
     * Cool Random Mindfuck is a random generator that generates a number between 0 and the number you gave (NOT INCLUDED)
     *
     * Then, if another Math.Random is lower than the MINDFUCK value, it will return that random generated number.
     * Else, the method will generate another random generated number that can be up to maxNumber*maxNumber.
     *
     * @param maxNumber max number to be generated (OR NOT)
     * @return random generated number (double)
     */
    public static double CoolRandomMindfuck(double maxNumber) {

        double number = (Math.random() * maxNumber);

        if (Math.random() < MINDFUCK) {
            return number;
        }

        return ((Math.random() * (maxNumber * (Math.random() * maxNumber))));
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
        System.out.println("Coolnessssssssssss~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            coolRandom.coolness();
        }

        //CoolRandom
        System.out.println("\n\nCOOL RANDOM~~~~~~~~~~~~~~~~~~\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(CoolRandom(5));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(CoolRandom(5.0));
        }

        //CoolIntervalRandom
        System.out.println("\n\nCOOL INTERVAL RANDOM ~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(CoolIntervalRandom(5, 10));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(CoolIntervalRandom(5.0, 10.0));
        }

        //CoolMindfuckRandom
        System.out.println("\n\nCOOL MINDFUCK RANDOM ~~~~~~~~~~~~~~~~~~~~~~\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(CoolRandomMindfuck(20));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(CoolRandomMindfuck(20.0));
        }
    }

}
