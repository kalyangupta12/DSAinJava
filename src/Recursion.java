public class Recursion {
    public static void printNamesNTimes(int i, int n) {
        //Time Complexity O(n) , since it occurs almost n times
        //Space Complexity O(n), hypothetical , stack space it takes
        if(i > n){
         return;
        }
        System.out.println("Hello world " + i);
        printNamesNTimes(i+1, n);
    }
    public static void printNNumbers(int i, int n) {
        if(i > n){
            return;
        }
        System.out.print(i+" ");
        printNNumbers(i+1, n);
    }
    public static void printNNumbersReversely(int n, int i) {
       if(n < i){
           return;
       }
       System.out.print(n+" ");
       printNNumbersReversely(n-1, i);
    }
    public static void print1toNBackTracking(int i, int n) {
        if(i<1){
            return;
        }
//        System.out.print(i+" ");
        print1toNBackTracking(i-1, n);
//        System.out.println();
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        int n = 5;
//        printNamesNTimes(1, n);
//        printNNumbers(1, n);
//        printNNumbersReversely(n, 1);
        print1toNBackTracking(n,n);
    }
}
