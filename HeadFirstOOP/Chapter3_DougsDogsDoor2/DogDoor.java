package Chapter3_DougsDogsDoor2;


import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;

    private int time = 2000; // default value

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        System.out.println("The dog door opens.");
        open = true;
        final Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, time);
    }

    public void close() {
        System.out.println("The dog door closes.");
        open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void setTimer(int time_ms) {
        time = time_ms;
    }
}
