public class Main {
    public static void main(String[] args) {
        
        int[] arr10 = Sorter.generateRandomArray(10);
        int[] arr100 = Sorter.generateRandomArray(100);
        int[] arr1001 = Sorter.generateRandomArray(1001);

        Sorter sortUsing = new Sorter();
        Searcher searchUsing = new Searcher();
        Experiment measureTime = new Experiment();

        int[] s_arr10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // s stands for sorted
        int[] s_arr100 = new int[100]; // s stands for sorted
        int[] s_arr1001 = new int[1001]; // s stands for sorted

        for (int i=0; i<100; i++){
            s_arr100[i] = i;
        }
        for (int i=0; i<1001; i++){
            s_arr1001[i] = i;
        }
        String[] sizes = {"10" ,"100", "1001"};
        int[][] arrays = {arr10, arr100, arr1001};
        int[][] s_arrays = {s_arr10, s_arr100, s_arr1001};
        int binary_target = 7;

        print("");
        print("Manual results");
        for (int i=0; i<3; i++){
            String s = "_________SIZE "+ sizes[i]+ "__________";
            print(s);

            long start = System.nanoTime();
            sortUsing.BubbleSort(arrays[i]);
            long end = System.nanoTime();
        
            print("Bubble UNsorted Time: " + (end-start));

            start = System.nanoTime();
            sortUsing.BubbleSort(s_arrays[i]);
            end = System.nanoTime();
            
            print("Bubble Sorted Time: " + (end-start));

            start = System.nanoTime();
            sortUsing.QuickSort(arrays[i]);
            end = System.nanoTime();
            
            print("Quick UNsorted Time: " + (end-start));

            start = System.nanoTime();
            sortUsing.QuickSort(s_arrays[i]);
            end = System.nanoTime();
            
            print("Quick Sorted Time: " + (end-start));

            start = System.nanoTime();
            searchUsing.binarySearch(s_arrays[i], binary_target);
            end = System.nanoTime();
            
            print("Binary Search Time: " + (end-start));
        }
        print("_________________________________________");
        print("Quick Sort performs better than Bubble Sort in large arrays, but not in small ones(e.g. size 10)");
        print("_________________________________________");

        print("");
        print("Results using Experiment.java");
        measureTime.runAllExperiments();
        print("_________________________________________");
        print("Quick Sort performs SIGNIFICANTLY better than Bubble Sort!");
        print("_________________________________________");
    }

    public static void print(String s){
        System.out.println(s);
    }
}
