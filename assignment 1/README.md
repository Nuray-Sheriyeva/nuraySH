# Sheriyeva Nuray IT-2501
## FIRST ASSIGNMENT

### Task 1. Print Difits of Number 
  public static void Digits(int numb){

        if (numb==0) return;

        int d = numb/10;
        int r = numb%10;

        Digits(d);
        System.out.println(r);
  }

