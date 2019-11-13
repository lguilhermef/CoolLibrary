package org.academiadecodigo.thunderstructs;

public class CoolCounter {

    private int start;
    private int end;
    private boolean reseted;

    public CoolCounter () {

        this.reseted = true;

    }

    public boolean booleanCountUp (int from, int to) {

        if (reseted) {

            this.start = from;
            this.end = to;
            this.reseted = false;
        }
        start++;

        if (start > end) {
            return true;
        }

        return start == end;
    }

    public boolean booleanCountDown (int from, int to) {

        if (reseted) {

            this.start = from;
            this.end = to;
            this.reseted = false;
        }
        start--;

        if (start < end) {
            return true;
        }

        return start == end;
    }

    public int increasingCounter (int start) {

        if (reseted) {

            this.start = start;
            this.reseted = false;
        }

        return this.start++;
    }

    public int decreasingCounter (int start) {

        if (reseted) {

            this.start = start;
            this.reseted = false;
        }

        return --start;
    }

    public boolean isReseted () {
        return this.reseted;
    }

    public void reset () {
        this.reseted = true;
    }

    public static void main(String[] args) {

        CoolCounter coolCounter = new CoolCounter();
        int test = 0;

        while (coolCounter.increasingCounter(200) < 205)
        System.out.println(test++);

    }
}
