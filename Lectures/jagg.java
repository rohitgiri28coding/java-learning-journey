public class jagg {
    public static void main(String[] args) {
    int arr[][] = new int[3][ ];
    arr[0] = new int[2]; //1st row with 2 columns 
    arr[1] = new int[3]; //2nd row with 3 columns 
    arr[2] = new int[4]; //3rd row with 4 columns 
    int cnt = 0;
    for (int i=0; i<arr.length; i++){
    for(int j=0; j<arr[i].length; j++) 
    arr[i][j] = cnt++;}
    
    for (int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
}}
