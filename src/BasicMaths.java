import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BasicMaths {
    public static void CountAndPrintDigitsAlsoReverse(int n){
        int lastdigit=0;
        int count=0;
        int reverseNum=0;
        while(n>0){
            lastdigit = n % 10;
            reverseNum = (reverseNum*10) + lastdigit;
            count = count + 1;
            n = n / 10;
        }
        System.out.print("The numbers in reverse order is " + reverseNum);
        System.out.println();
        System.out.println("The total digits in this number is: "+count);
    }
    public static void CountUsingLog10(int n){
        int count = (int)(Math.log10(n)+1);
        System.out.println("The total digits in this number using log(10) is: "+count);
    }
    public static int CountUsingLog10return(int n){
        int count = (int)(Math.log10(n)+1);
        return count;
    }
    public static void PallindromeChk(int n){
        int lastdigit=0;
        int count=0;
        int originalInput = n;
        int reverseNum=0;
        while(n>0){
            lastdigit = n % 10;
            reverseNum = (reverseNum*10) + lastdigit;
            count = count + 1;
            n = n / 10;
        }
        if(originalInput==reverseNum){
            System.out.println("The number is pallindrome");
        }else{
            System.out.println("The number is not pallindrome");
        }
    }
    public static void ArmstrongChk(int n){
        int lastdigit=0;
        int OriginalInput=n;
        int CubesCounter=0;
        int totalDigits= CountUsingLog10return(n);
        while(n>0){
            lastdigit = n % 10;
            n = n / 10;
            CubesCounter = (int) (CubesCounter + Math.pow(lastdigit, totalDigits));
        }
        if(CubesCounter==OriginalInput) System.out.println("The number is an Armstrong number");
        else System.out.println("The number is not an Armstrong number");
    }
    public static void PrintAllDivisorsAlsoChkPrime(int n){
        System.out.println("The divisors of "+n+" are:");
//     Below one is not an optimal solution
//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.print(i+" ");
//            }
//        }
        List<Integer> divisorStorage = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                divisorStorage.add(i);
                if((n/i)!=i) divisorStorage.add(n/i);
            }
        }
        boolean isPrime = false;
        if(divisorStorage.size()==2){
            if(divisorStorage.contains(1)&&divisorStorage.contains(n)) isPrime = true;
        }
        Collections.sort(divisorStorage);
        System.out.println(divisorStorage);
        if(isPrime) System.out.println("The number "+n+" is a prime number");
        else System.out.println("The number "+n+" is not a prime number");
    }
//    public static List<Integer> findCommon(List<Integer> a, List<Integer> b){
//        List<Integer> common = new ArrayList<>();
//        for(int i : a){
//            if(b.contains(i)) common.add(i);
//        }
//        Collections.sort(common);
//        return common;
//    }
    public static int findingGCF(int n, int k){
        while(n > 0 && k > 0) {
            //If a is greater than b,
            //subtract b from a and update a
            if (n > k) {
                //update a to the remainder
                //of a divided by b
                n = n % k;
            }
            //If b is greater than or equal
            //to  a, subtract a from b and update b
            else {
                k = k % n;
            }
        }
            //Check if a becomes 0,
            //if so, return b as the GCD
            if(n==0){
                return k;
            }
            //If a is not 0,
            //return a as the GCD
            return n;

//        List<Integer>divisorStorageN = new ArrayList<>();
//        for(int i=1;i*i<=n;i++){
//            if(n%i==0){
//                divisorStorageN.add(i);
//                if((n/i)!=i) divisorStorageN.add(n/i);
//            }
//        }
//        List<Integer>divisorStorageK = new ArrayList<>();
//        for(int i=1;i*i<=k;i++){
//            if(k%i==0){
//                divisorStorageK.add(i);
//                if((k/i)!=i) divisorStorageK.add(k/i);
//            }
//        }
//        List<Integer>Common = new ArrayList<>();
//        Common = findCommon(divisorStorageN, divisorStorageK);
//        Integer max = Collections.max(Common);
//        System.out.println(max);
    }
    public static void main(String[] args) {
        int n=9;
        int k=12;
        CountAndPrintDigitsAlsoReverse(n);
        CountUsingLog10(n);
        PallindromeChk(n);
        ArmstrongChk(n);
        PrintAllDivisorsAlsoChkPrime(n);
        int g = findingGCF(n,k);
        System.out.println("The GCD of "+n+" and "+k+" is: "+g);
    }
}
