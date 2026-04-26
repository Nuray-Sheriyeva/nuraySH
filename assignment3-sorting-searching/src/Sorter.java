import java.util.Random;
//wanted to be sure it works, so don't mind main 
public class Sorter {
    //public static void main(String[] args) {
    //    
    //    int [] arr1 = generateRandomArray(10);
//
    //    System.out.println("Actual array");
    //    printArray(arr1);
//
    //    System.out.println(" ");
//
    //    System.out.println("BUBBLE SORT");
    //    arr1 = BubbleSort(arr1);
    //    printArray(arr1);
//
    //    System.out.println(" ");
//
    //    System.out.println("QUICK SORT");
    //    QuickSort(arr1);
    //    printArray(arr1);
    //    
    //}
    
    public static int[] BubbleSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){ // "-i" because last i elements are sorted
                if(arr[j]>arr[j+1]){ // if current is bigger than next, swap them
                    int temp = arr[j]; //temp holder for current value
                    arr[j]= arr[j+1]; // actual swapping part1, moves next to the left
                    arr[j+1] = temp; //part2, moves current to the right
                }
            }
        }
        return arr;
    }

    public static void QuickSort(int[] x){
        QuickSort(x, 0, x.length-1); // in case we need to sort the whole array
    }

    public static void QuickSort(int[] x, int start, int end){
        if (start <end){ //checking if array.length>1 basically
            int pi = partition(x, start, end); // find pivots correct position
            QuickSort(x, start, pi-1); //recursively sort the left side
            QuickSort(x, pi+1, end); // hold your horses, now it is the right side's turn
        }
    }

    public static int partition(int[] x, int start, int end){
        int pivot = x[end]; //choose pivot as last element

        int i= start -1; //make i the -1(pivot) since we don't have any smaller elements yet

        for (int j=start; j<end;j++){
            if(x[j] <= pivot){ // if current <= pivot
                i++; //since it is smaller now we can say that we have smaller element, therefore can increase i
                int temp = x[i]; //swapping part, just like in bubble sort 
                x[i] = x[j];
                x[j] = temp;
            }// now it just does it repeatedly until the end 
        }

        //used to place pivot in its actual place
        int temp = x[i+1];  // we know its place since we 
        x[i+1] = x[end]; // counted how many smaller items 
        x[end] = temp; // than pivot are there

        //return final pivot index
        int pi = i+1;
        return pi;
    }

    public static void printArray(int[] arr){
        // i hate how regular loop prints each element on new line so i thought of this
        String result = ""; //create string
        for (int i=0; i<arr.length; i++){ // loop through the loop to add the 
            result = result + " " + arr[i];// ints to the end of the string
        }
        System.out.println(result); //print or not print, thats not the question 🤔
    }

    public static int[] generateRandomArray(int size){
        Random rand = new Random(); //abuse the library 
        int[] arr = new int[size];

        for(int i =0; i<size;i++){
            arr[i] = rand.nextInt(size);
        }

        return arr;
    }

}
