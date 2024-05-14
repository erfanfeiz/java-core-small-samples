public class ObjectInstanceCounter {
    private static int liveInstances = 0;
    {
        liveInstances++;
    }

    public static int getLiveInstances() {
        return liveInstances;
    }

    @Override
    protected void finalize() throws Throwable {
        liveInstances--;
    }
}
