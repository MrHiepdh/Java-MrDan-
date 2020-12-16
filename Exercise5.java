public class Exercise5 {
    public static void solve(int a[][]){
        double temp = a[0][0]/a[0][1];
        double temp1 = a[1][0]/a[1][1];
        double temp2 = a[2][0]/a[2][1];
        if(temp==temp1&&temp1==temp2){
            System.out.println("True!");
        }
        else{
            System.out.println("False!");
        }
    }
    public static void main(String [] args){
        int a[][] = {{1,1},{2,2},{3,3}};
        solve(a);
    }
}
