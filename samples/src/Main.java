public class Main {
    public static void main(String[] args) {
        ObjectInstanceCounter a1 = new ObjectInstanceCounter();
        ObjectInstanceCounter a2 = new ObjectInstanceCounter();
        ObjectInstanceCounter a3 = new ObjectInstanceCounter();

        System.out.println(ObjectInstanceCounter.getLiveInstances());
    }
}