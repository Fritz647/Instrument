public class Guitar implements Instrument{

    int  numberOfStrings;

    public Guitar(int NumberOfStrings){
        numberOfStrings = NumberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}
