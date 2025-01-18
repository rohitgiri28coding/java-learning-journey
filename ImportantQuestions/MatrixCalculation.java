import java.util.Scanner;

class Matrix{
    static int [][][] arr;
    static int[] row,column;  // if static is removed this.row=null while accessing row in operation
    int n=0,c;
    String str_choice;
    Scanner sc;
    public Matrix(){
        sc = new Scanner(System.in);
    }
    void choice(){
        System.out.print("Enter operation to be performed on matrices :-\n(1) Addition\n(2) Subtraction\n(3) Multiplication\n=> ");
        str_choice = sc.next();
        str_choice = str_choice.toLowerCase();
    }
    int number(){
        System.out.print("Enter number of matrices on which "+str_choice+" operation has to be performed: ");
        n= sc.nextInt();
        return n;
    }
    void size(){
        row = new int[n];
        column = new int[n];
        
        if (c == 1||c==2){
            System.out.print("Enter row size for array : ");
            row[0] = sc.nextInt();
            System.out.print("Enter column size for array : ");
            column[0] = sc.nextInt();
            arr = new int [n][row[0]][column[0]];
        }
        else{
            arr = new int [n][][];
            for(int j=0;j<n;j++){
            System.out.print("Enter row size for array "+(j+1)+" : ");
            row[j] = sc.nextInt();
            System.out.print("Enter column size for array "+(j+1)+" : ");
            column[j] = sc.nextInt();
            }
            for(int j=0;j<n;j++){
                for(int l=0;l<row.length;l++){
                    for(int k=0;k<column.length;k++){
                        arr[j] = new int[row[l]][column[k]];
                    }
                }
            }
        }
    }
    int checkSize(){
        switch (str_choice){
            case "addition","add","1":
                    c=1;
                    str_choice = "addition";
                    return c;
                    
            case "sub","subtract","2":
                    c=2;
                    str_choice = "subtraction";
                    return c;

            case "multiplication","multiply","3":
                    str_choice = "multiplication";
                    int flag =0;
                    for(int i=0;i+1<n;i++){
                    if(column[i] !=row[i+1] ){
                        flag++;
                        break;
                        }   
                    }
                    if(flag == 0){
                        c=3;
                        return c; 
                    }
                    else{
                        System.out.println("Entered size for matrix multiplication is not possible. ");
                        return 0;
                    }

            case "division":
                    System.out.println("The operation division is not defined for matrix.");
                    return 0;

            default:
                    System.out.println("Entered operation is not possible for matrix.");
                    return 0;
        }
    }
    int[][][] getMatrix(){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                for(int k= 0;k<arr[i][j].length;k++){
                    System.out.print("Enter element "+(j+1)+" * "+(k+1)+" for array "+(i+1)+" : ");
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }
        return arr;
    }
    void showMatrix(int[][] res){
        System.out.println("Resultant Matrix after performing "+str_choice+" operation :-");
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Operation extends Matrix{
    int[][] add(){
        int [][] sum = new int [row[0]][column[0]];
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                for(int k= 0;k<arr[i][j].length;k++){
                    sum[j][k]+=arr[i][j][k];
                }
            }
        }
        return sum;
    }
    int [][] sub(){
        int [][] sub =  new int[row[0]][column[0]];
        for(int i =1;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                for(int k= 0;k<arr[i][j].length;k++){
                    sub[j][k] -=  arr[i][j][k];
                }
            }
        }
        for(int j =0;j<arr[0].length;j++){
            for(int k= 0;k<arr[0][j].length;k++){
                sub[j][k] +=  arr[0][j][k];
            }
        }
        
        return sub;
    }

    int [][] multiply(){
        int [][] prod,temp;
        prod = arr[0];
        int sum=0,l;
        for(int i=1;i<arr.length;i++){
            temp = new int[prod.length][arr[i][arr[i].length-1].length];
            for(int j=0;j<prod.length;j++){
                for(int k =0;k<arr[i][arr[i].length-1].length;k++){
                    for( l =0,sum=0;l<prod[j].length;l++){
                        sum += (prod[j][l] * arr[i][l][k]);
                    }
                    temp[j][k] = sum;
                }
            }
            prod = temp;
        }
        return prod;
    }
}
public class MatrixCalculation {
    public static void main(String[] args){
        Matrix m_obj = new Matrix();
        Operation o_obj = new Operation();
        int [][] res;
        m_obj.choice();
        int c = m_obj.checkSize();
        int n = m_obj.number();
        if(n>1){
            if(c==1){  
                m_obj.size();
                m_obj.getMatrix();
                res = o_obj.add();
                m_obj.showMatrix(res);
            }    
            else if(c==2){
                m_obj.size();
                m_obj.getMatrix();
                res = o_obj.sub();
                m_obj.showMatrix(res);   
            }
            else if(c==3){
                m_obj.size();
                int check = m_obj.checkSize();
                if(check==3){
                m_obj.getMatrix();
                res = o_obj.multiply();
                m_obj.showMatrix(res);
                }
            }
        }
        else if (n==1){
            System.out.println("You're way too single to use this calculator.Thank you!");
        } 
    }
}