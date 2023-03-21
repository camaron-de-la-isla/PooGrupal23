public class GestorId {
    private static int id = 0;

    public static int assignId() {
        id++;
        return id;
    }

    public static int getId() {
        return assignId();
    }


}
