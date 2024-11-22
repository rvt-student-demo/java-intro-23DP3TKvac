package lv.rvt;

public class Timer {
    private int seconds;
    private int miliseconds;

    public Timer() {
        this.seconds = 0;
        this.miliseconds = 0;
    }

    public void advance() {
        this.miliseconds = this.miliseconds + 1;
        if (this.miliseconds == 100) {
            this.miliseconds = 0;
            this.seconds = this.seconds + 1;
            if (this.seconds == 60) {
                seconds = 0;
            }
        }
    }


    public String toString() {
        return String.format("%02d:%02d", seconds, miliseconds);
    }
}