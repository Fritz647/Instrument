public class Trumpet implements Instrument{

    int Diameter;

    public Trumpet(int diameter){
        Diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет труба диметром " + Diameter + " мм");
    }
}
