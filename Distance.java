import java.util.Scanner;

class dist{
    Scanner sc;
    float d,dInInch;
    
    int dInFeet;
    String ch;
    public dist(){
        sc = new Scanner(System.in);
    }
    public void get(){
        System.out.print("Enter the length and unit (with a white space in between): ");
        d = sc.nextFloat();
        ch = sc.next();
        ch = ch.toLowerCase();
    }
    public void conversion(){
        switch(ch){
        case "feet","foot","ft":
            dInFeet = (int) d;
            dInInch = (d-dInFeet)*12;
            break;

        case "mile","miles":
            dInFeet =(int) (5280 *d);
            dInInch = (d*5280*12)-(dInFeet*12);
            break;
    
        case "cm","centimeters","centimeter":
            d /=100;

        case  "m","meter","meters":
            d *= 39.37 ;
    
        case "inch","inches":
            dInInch = d - (((int) (d / 12))*12);
            dInFeet =(int) (d / 12);
            break;
        } 
    }
    public void showResult(){
        System.out.println(dInFeet+"\' "+dInInch+"\"  ==>  ["+dInFeet+" feet and "+Math.round(dInInch)+" inches]");
    }  
}

public class Distance {
    public static void main(String[] args) {
        dist dobj = new dist();
        dobj.get();
        dobj.conversion();
        dobj.showResult();
    }
}
