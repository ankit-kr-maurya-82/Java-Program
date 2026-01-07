public class Recursion1 {
    public static void printNum(int n) {
        if(n == 0){
            return; 
        }
        System.out.print(n);
        printNum(n-1);
    }
    public static void printNum2(int m) {
        if(m == 6){
            return; 
        }
        System.out.print(m);
        printNum2(m+1);
    }
    public static void main(String args[]) {
        int n = 5;
        printNum(n);
        System.err.println("");
        int m = 1;
        
        printNum2(m);
        
    }
}