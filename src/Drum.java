public class Drum implements Instrument{

    int Size;

    public Drum(int size){
        Size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан размером " + Size + " мм");
    }
}
