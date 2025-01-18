public class ArrayIntializationTest {
    public static void main(String[] args) {
        int [][][] a= {
                    {
                        {2,1,3,4,3},
                        {5,6,4,5,2},
                        {2,3,5,1,3}
                },
                    {
                    {10,60,40,50},
                    {20,30,50,20}
                }
                };
       // int [][][] z = new int [5][2][3];
        //arr = new int [z[0].length][z[0][1].length];
       /*  int [][] m=new int[a[0].length][a[0][a[0].length-1].length];
        for(int i=0 ;i<1;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k =0;k<a[i][a[i].length-1].length;k++)
                 m[j][k] =a[0][j][k];
            }
            
        }*/
        for(int i=0 ;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k =0;k<a[i][a[i].length-1].length;k++)
                System.out.print(a[i][j][k]+" ");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("nnnn");
        int [][] m =a[0];
        for(int i=0 ;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        // m = arr;
        // System.out.println(m[1][3]);
        /*int [][][] x =new  int [2][][];
        x[0]= new int[3][8];
        x[1]= new int[4][5];
        //System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[0][x[0].length-1].length);
        System.out.println(x[1].length);
        System.out.println(x[1][x[1].length-1].length);*/
        
    }
}
