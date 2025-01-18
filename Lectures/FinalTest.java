/*final */class Aclass{
    int x;
}
class Bclass extends Aclass{
    int y;
}

public class FinalTest {
    public static void main(String[] args) {
        Aclass Aobj = new Aclass();
        Bclass Bobj = new Bclass();
    }
}
