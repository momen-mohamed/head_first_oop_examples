package Chapter3_DougsDogsDoor2;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remote remote = new Remote(door);
        door.setTimer(1000);
        System.out.println("Fido barks to go outside...");
        recognizer.recoginze("Woof");
        System.out.println("\nFido has gone outside...");
        System.out.println("\nFido’s all done...");
        try{
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("...but he's stuck outside!");
        System.out.println("\nFido Start barking");
        recognizer.recoginze("Woof");
        System.out.println("...so Gina grabs the remote control.");
        System.out.println("\nFido’s back inside...");

    }
}
