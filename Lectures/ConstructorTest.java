class ConstructorTest {
    int qty; double prc, amt; String des;
    ConstructorTest(){//default constructor
    qty = 0;
    prc= 0;
    amt = 0;
    des = null;
    System.out.println("Default Constructor Invoked");
    }
    //overloaded (parameterized) constructor
    ConstructorTest(int q, double p, String d){
    qty = q;
    prc= p;
    amt = p * q;
    des = new String(d);
    System.out.println("Overloaded Constructor Invoked");
    }
    void show(){
    System.out.printf("Description :%s\t",des);
    System.out.printf("Quantity : %d\t",qty);
    System.out.printf("Rate : %7.2f\t",prc);
    System.out.printf("Amount : %8.2f\n",amt);
    }
    public static void main(String args[]){
        ConstructorTest ord1 = new ConstructorTest();
        ord1.show();
        ConstructorTest ord2 = new ConstructorTest(10, 123.45,
        "Board");
        ord2.show();
        }
        }