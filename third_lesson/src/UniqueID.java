package third_lesson.src;

public class UniqueID {
    private static int counter = 0;
    private final int id;

    public UniqueID() {
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        UniqueID id1 = new UniqueID();
        UniqueID id2 = new UniqueID();
        System.out.println("ID1: " + id1.getId());
        System.out.println("ID2: " + id2.getId());
    }
}

