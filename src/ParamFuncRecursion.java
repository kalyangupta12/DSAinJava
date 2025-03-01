public class ParamFuncRecursion {
    public static void ParamNAdd(int n, int sum){
        if(n<1) {
            System.out.println(sum);
            return;
        }
        ParamNAdd(n-1, sum+n);
    }
    public static int FuncNAdd(int n){
        if(n==0) return 0;
        return (n + FuncNAdd(n-1));
    }
    //Time and space complexity will be O(n)
    //n times stack space occupied
    public static int FuncNFact(int n){
        if(n==1) return 1;
        return (n * FuncNFact(n-1));
    }

    public static void main(String[] args) {
        //Parameterised Recursion
        ParamNAdd(3, 0);
        //Functional Recursion
        System.out.println("The Addition for this will be " + FuncNAdd(3));
        System.out.println("The Factorial for this will be " + FuncNFact(5));
    }
}
