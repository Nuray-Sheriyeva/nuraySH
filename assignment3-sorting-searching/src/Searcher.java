//wanted to be sure it works, so don't mind main 
public class Searcher {
    //public static void main(String[] args) {
//
    //    int[] arr = {1, 2, 3, 4 ,5 ,6, 7, 8 ,9 ,10};
//
    //    System.out.println(binarySearch(arr, 10));
    //    
    //}
    public static int binarySearch(int[] arr, int target) {
        int left = 0; //left pointer
        int right = arr.length -1; //write pointer
        while (left <= right) {
            int mid = left + (right - left) / 2; //please find the middle index 

            if (arr[mid] == target) // FOUND IT!! : because our target is mid
                return mid;
            
            if (arr[mid] < target) // target is bigger, searching right half
                left = mid + 1;
            else
                right = mid - 1;  // target is smaller, searching left half
        } 
        return -1; //i don't think it exists
    }
}
