//wanted to be sure it works, so don't mind main

public class Experiment {

    //public static void main(String[] args) {
    //    runAllExperiments();
    //}

    public static long measureSortTime(int[] arr, String type) {

        long start = System.nanoTime();

        if (type.equalsIgnoreCase("quick")) {
            Sorter.QuickSort(arr);
        }
        else if (type.equalsIgnoreCase("bubble")) {
            Sorter.BubbleSort(arr);
        }

        long end = System.nanoTime();

        return end - start;
    }

    public static long measureSearchTime(int[] arr, int target) {

        long start = System.nanoTime();

        Searcher.binarySearch(arr, target);

        long end = System.nanoTime();

        return end - start;
    }

    public static void runAllExperiments() {

        int[] sizes = {1000, 5000, 10000, 20000};

        for (int size : sizes) {

            int[] arr = Sorter.generateRandomArray(size);
            int target = arr[size / 2];

            System.out.println("__________Size: " + size + "________");

            long quickTime = measureSortTime(arr, "quick");
            long bubbleTime = measureSortTime(arr, "bubble");

            long searchTime = measureSearchTime(arr, target);

            
            System.out.println("Bubble Sort: " + bubbleTime + " ns");
            System.out.println("Quick Sort:  " + quickTime + " ns");
            System.out.println("Binary Search: " + searchTime + " ns");
        }
    }
}