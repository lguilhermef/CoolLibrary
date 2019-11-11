package org.academiadecodigo.thunderstructs;

public class CoolCounter {

    private int start;
    private int end;
    private boolean test;

    public CoolCounter () {

        this.test = true;

    }

    public boolean booleanCountdown (int from, int to) {

        if (test) {

            this.start = from;
            this.end = to;
            this.test = false;
        }
        start--;

        if (start < end) {
            return true;
        }

        return start == end;
    }

    public static void main(String[] args) {

        CoolCounter coolCounter = new CoolCounter();
        int value = 22cd

        while (value > 0) {

            System.out.println(coolCounter.booleanCountdown(20, 5));
//            System.out.println("Round");
            value--;
        }
    }

}
