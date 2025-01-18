class Phone{
    void time(){
        System.out.println("Time is 11:04pm");
    }
    void keypad(){
        System.out.println("Keypad is manual.");
    }
}
class SmartPhone extends Phone{
    void camera(){
        System.out.println("Photo is being clicked....");
    }
    void keypad(){
        System.out.println("Keypad is touchscreen.");
    }
}

public class DMD {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        obj.keypad();
    }
}
