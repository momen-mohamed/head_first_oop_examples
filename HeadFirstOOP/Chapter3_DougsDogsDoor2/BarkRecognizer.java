package Chapter3_DougsDogsDoor2;

public class BarkRecognizer {
    private DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recoginze(String bark){
        System.out.println("    BarkRecognizer: Heard a '"+bark+"'");
        door.open();
    }
}
