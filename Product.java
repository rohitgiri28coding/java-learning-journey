public class Product {
    float rate;
    int stock,id;
    String desc;
    
    Product(){
        rate = 50.75f;
        stock = 100;
        id = 4501;
        desc = "CHALK";
    }

    Product(int i,String d,int s,float r){
        id = i;
        desc = d;
        stock = s;
        rate = r;
    }
    void Show(){
        System.out.println("ID: "+id+"\t Name: "+desc+"\t Rate: "+rate+"\tStock: "+stock);
    }

    public static void main(String[] args) {
        Product P1 = new Product();
        Product P2 = new Product(1001,"DUSTER",152,12.5f);
        P1.Show();
        P2.Show();
    }
}
