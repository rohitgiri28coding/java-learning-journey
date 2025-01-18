class TestArray{
public static void main(String[] args) {
    
int n=2;
int[] row={1,2},column ={2,1};
int[][][] arr;
arr= new int[n][][];
for(int j=0;j<n;j++){
    for(int l=0;l<row.length;l++){
        for(int k=0;k<column.length;k++){
            arr[j] = new int[row[l]][column[k]];
        }
    }
}}}