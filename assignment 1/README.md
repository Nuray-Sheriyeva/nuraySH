# Sheriyeva Nuray IT-2501
## FIRST ASSIGNMENT

### Task 1.
public static void Digits(int numb){

        if (numb==0) return;

        int d = numb/10;
        int r = numb%10;

        Digits(d);
        System.out.println(r);
    }
  
<img src="/images/1/a1t1.png" width="500">

### Task 2.
public static double Average(int div, int[] list){

        
        if (div==0) return 0.0;

        int i = div - 1;
        double d = (double) list[i]/list.length;
        
        Average(i, list);
        return d + Average(i, list);
    }
  
<img src="/images/1/a1t2.png" width="500">

### Task 3.
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
  
<img src="/images/1/a1t3.png" width="500">

### Task 4.
public static int Factorial(int n){

        if(n==0) return 1;

        return n*Factorial(n-1);
    }
<img src="/images/1/a1t4.png" width="500">

### Task 5.
public static int Fibonacci(int n){

        if(n==0) return 0;
        else if (n==1) return 1;
        else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
  
<img src="/images/1/a1t5.png" width="500">

### Task 6.
public static int Power(int a, int n){

        if(n==1) return a;
        return a*Power(a, n-1);
    }
  
<img src="/images/1/a1t6.png" width="500">

### Task 7.
public static void Reverse(int n, int[] list){

        if (n==0) return;

        int i= n-1;
        int r = list[i];
        System.out.println(r);
        Reverse(i, list);
    }
  
<img src="/images/1/a1t7.png" width="500">

### Task 8.
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
<img src="/images/1/a1t8.png" width="500">

### Task 9.
public static int CinS(String s){

        if (s==null) return 0;
        
        return s.length();
    }
  
<img src="/images/1/a1t9.png" width="500">

### Task 10.
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
    
<img src="/images/1/a1t10.png" width="500">
