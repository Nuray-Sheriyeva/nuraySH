import java.util.Scanner;

public class ass1 {
    public static void main(String[] args){

        System.out.println("Task 1. Print Digits of a Number");
        int number = 5481;
        Digits(number);

        System.out.println(" ");
        System.out.println("Task 2. Average of Elements");
        int div = 4;
        int[] list = {3, 2, 4, 1};
        System.out.println(Average(div, list));

        System.out.println(" ");
        System.out.println("Task 3. Prime Number Check");
        isPrime(7, 2);

        System.out.println(" ");
        System.out.println("Task 4. Factorial");
        System.out.println(Factorial(5));

        System.out.println(" ");
        System.out.println("Task 5. Fibonacci");
        System.out.println(Fibonacci(17));

        System.out.println(" ");
        System.out.println("Task 6. Power Function");
        System.out.println(Power(3, 4));

        System.out.println(" ");
        System.out.println("Task 7. Reverse Output");
        int[] list1 = {1, 4, 6, 2};
        Reverse(4, list1);

        System.out.println(" ");
        System.out.println("Task 8. Check Digits in String");
        System.out.println(DinS("12312", 0));

        System.out.println(" ");
        System.out.println("Task 9. Check Characters in String");
        System.out.println(CinS("recursion"));

        System.out.println(" ");
        System.out.println("Task 10. Greatest Common Divisor");
        System.out.println(GCD(86, 14));

    }

    public static void Digits(int numb){

        if (numb==0) return;

        int d = numb/10;
        int r = numb%10;

        Digits(d);
        System.out.println(r);
    }

    public static double Average(int div, int[] list){

        if (div==0) return 0.0;

        int i = div - 1;
        double d = (double) list[i]/list.length;
        
        Average(i, list);
        return d + Average(i, list);
    }

    public static void isPrime(int n, int i){

        if (n%2==0) System.out.println("Composite");

        else {
            if (i<n){
                if (n%i==0) System.out.println("Composite");
                else {
                    isPrime(n, i+1);
                }
            }
            else {
                System.out.println("Prime");
            }
        }
    }

    public static int Factorial(int n){

        if(n==0) return 1;

        return n*Factorial(n-1);
    }

    public static int Fibonacci(int n){

        if(n==0) return 0;
        else if (n==1) return 1;
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

    public static int Power(int a, int n){

        if(n==1) return a;
        return a*Power(a, n-1);
    }

    public static void Reverse(int n, int[] list){

        if (n==0) return;

        int i= n-1;
        int r = list[i];
        System.out.println(r);
        Reverse(i, list);
    }

    public static String DinS(String s, int i){
        if(s==null) return "Null";
        if (i==s.length()) return "Yes";
        

        if (Character.isDigit(s.charAt(i))){
             return DinS(s, i+1);
        }
        else {
            return "No";
        }
    }

    public static int CinS(String s){
        if (s==null) return 0;
        
        return s.length();
    }

    public static int GCD(int a, int b){
        if (a==0 || b==0) return 1;
        int r;
        if (a>b){
            r= a%b;
            if (b%r==0){
                return r;
            }
            else {
                return GCD(b, r);
            }
        }
        else {
            r = b%a;
            if (a%r==0){
                return r;
            }
            else {
                return GCD(a, r);
            }
        }

        
    }
}
