package Assignment;
class FindSum{
    private double sum, num;
    private void sumNum(){
    sum += num;
    }
    public void getNum(double n){
    num = n;
    sumNum();
    }
    public void showSum(){
    System.out.println("Sum of above given numbers : " + sum);
    }
    FindSum(){
    sum=0.0;
    }
    }
    class Assignment1{
    public static void main(String args[]){
    int argCnt = args.length;
    if(argCnt == 0){
    System.out.println("Numbers required as argument to the command(java file name)");
    System.exit(0);
    }
    FindSum fs= new FindSum();
    for(int i=0 ; i<argCnt; i++ ){
    fs.getNum( Double.parseDouble(args[i]) );
    }
    fs.showSum();
    }
    }
