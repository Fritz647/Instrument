public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum(1065);
        Trumpet trumpet = new Trumpet(11);

        Instrument[] instrument;
        instrument = new Instrument[]{guitar, drum, trumpet};

        for(Instrument instruments : instrument){
            instruments.play();
        }
    }
}