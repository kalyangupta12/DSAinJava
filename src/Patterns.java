public class Patterns {
    //I will write over the solution for every pattern where n = 3
//    * * *
//    * * *
//    * * *
    public static void Pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//    *
//    * *
//    * * *
    public static void Pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//    1
//    1 2
//    1 2 3
    public static void Pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
//    1
//    2 2
//    3 3 3
    public static void Pattern4(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
//    * * *
//    * *
//    *
    public static void Pattern5(int n){
        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){ or the below
            for(int j=n;j>i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
//     1 2 3
//     1 2
//     1
    public static void Pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
//      *
//     * *
//    * * *
    public static void Pattern7(int n){
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//    * * *
//     * *
//      *
    public static void Pattern8(int n){
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//      *
//     * *
//    * * *
//     * *
//      *
    public static void Pattern9(int n){
        //for erect pyramid
        Pattern7(n);
        //for inverted pyramid
        Pattern8(n);
    }
//    *
//    * *
//    * * *
//    * *
//    *
    public static void Pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    1
//    0 1
//    1 0 1
    public static void Pattern11MyApproach(int n) {
        System.out.println("My Approach");
        for(int i=0;i<n;i++){
            //My Approach
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }

    public static void Pattern11StriverApproach(int n) {
        System.out.println("Striver's Approach");
        int start = 1;
        for(int i=0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void Pattern11(int n) {
        Pattern11MyApproach(n);
        Pattern11StriverApproach(n);
    }
//    1         1
//    1 2     2 1
//    1 2 3 3 2 1
    public static void Pattern12MyApproach(int n) {
        System.out.println("My Approach");
        for(int i=0;i<n;i++){
            //for printing numbers
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            //for printing spaces
            for(int j=0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            //for mirrored printing numbers
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Pattern12StriverApproach(int n) {
        System.out.println("Striver's Approach");
        int spaces = 2*(n-1);
        for(int i=1;i<=n;i++){
            //for printing numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //for printing spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //for printing mirrored numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
    public static void Pattern12(int n) {
        Pattern12MyApproach(n);
        Pattern12StriverApproach(n);
    }
//    1
//    2 3
//    4 5 6
    public static void Pattern13(int n) {
        System.out.println("My Approach");
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
//    A
//    A B
//    A B C
    public static void Pattern14(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
//    A B C
//    A B
//    A
    public static void Pattern15(int n) {
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+(n-i-1); ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
//    A
//    B B
//    C C C
    public static void Pattern16(int n) {
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
//       A
//      ABA
//     ABCBA
    public static void Pattern17(int n) {
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //letters
            char ch = 'A';
            for(int j=0;j<2*i+1;j++){
                System.out.print(ch);
                if(j<(2*i+1)/2){
                    ch++;
                }else {
                    ch--;
                }
            }
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
//    E
//    D E
//    C D E
    public static void Pattern18(int n) {
        for(int i=0;i<n;i++){
            for(char ch = (char) (('A'+n-1)-i); ch<=(n + 'A' -1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
//    * * * * * *
//    * *     * *
//    *         *
//    * *     * *
//    * * * * * *
    public static void Pattern19(int n) {
        int spaces = 0;
        //upper
        for(int i=0;i<n;i++){
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            spaces+=2;
            System.out.println();
        }
        spaces = 2*n-2;
        for(int i=1;i<=n;i++){
            //for printing numbers
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for printing spaces
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            //for mirrored printing numbers
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }

    }
//    *    *
//    **  **
//    ******
//    **  **
//    *    *
    public static void Pattern20MyApproach(int n) {
        System.out.println("My Approach");
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            int spaces = 2*n-i;
            if(i>n){
                stars = 2*n-i;
                spaces = i;
            }
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<spaces-stars;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern20StriverApproach(int n) {
        System.out.println("Striver's Approach");
        int spaces = 2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;
        }
    }
    public static void Pattern20(int n) {
        Pattern20MyApproach(n);
        Pattern20StriverApproach(n);
    }
//    * * *
//    *   *
//    * * *
    public static void Pattern21(int n) {
        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }
//    3 3 3 3 3
//    3 2 2 2 3
//    3 2 1 2 3
//    3 2 2 2 3
//    3 3 3 3 3
    public static void Pattern22(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int bottom = i;
                int left = (2*n-2) - i;
                int right = (2*n-2) - i;

                System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right))+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Pattern 1");
        Pattern1(n);
        System.out.println("Pattern 2");
        Pattern2(n);
        System.out.println("Pattern 3");
        Pattern3(n);
        System.out.println("Pattern 4");
        Pattern4(n);
        System.out.println("Pattern 5");
        Pattern5(n);
        System.out.println("Pattern 6");
        Pattern6(n);
        System.out.println("Pattern 7");
        Pattern7(n);
        System.out.println("Pattern 8");
        Pattern8(n);
        System.out.println("Pattern 9");
        Pattern9(n);
        System.out.println("Pattern 10");
        Pattern10(n);
        System.out.println("Pattern 11");
        Pattern11(n);
        System.out.println("Pattern 12");
        Pattern12(n);
        System.out.println("Pattern 13");
        Pattern13(n);
        System.out.println("Pattern 14");
        Pattern14(n);
        System.out.println("Pattern 15");
        Pattern15(n);
        System.out.println("Pattern 16");
        Pattern16(n);
        System.out.println("Pattern 17");
        Pattern17(n);
        System.out.println("Pattern 18");
        Pattern18(n);
        System.out.println("Pattern 19");
        Pattern19(n);
        System.out.println("Pattern 20");
        Pattern20(n);
        System.out.println("Pattern 21");
        Pattern21(n);
        System.out.println("Pattern 22");
        Pattern22(n);
    }
}