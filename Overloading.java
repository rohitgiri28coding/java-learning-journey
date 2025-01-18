class Product{
    int rate;
    Product(){ //DEFAULT Constructor
        rate = 10;
        System.out.println("From DEFAULT Constructor: "+rate);
    }
    Product(int i){ // OVERLOADED Constructor
        rate = i;
        System.out.println("From OVERLOADED Constructor: "+rate);
    }
}


public class Overloading {
    public static void main(String[] args) {
        Product P1 = new Product();
        Product P2 = new Product(30);
    }
}
