# • Algorithm explanations
### Basic sorting algorithm of choice --- Bubble Sort
Bubble Sort sorts an array by continuously swapping adjacent elements if they are in wrong positions( that is, i being bigger than i+1 ). 

Time complexity:

Best case: O(n)

Average case: O(n^2)

Worst case: O(n^2)

### Advanced sorting algorithm of choice --- Quick Sort
Quick Sort sorts an array using Divide and Conquer mentality: picks pivot (first, middle or last element) and partitions the array around pivot ultimately placing all pivots in correct positions. Quick Sort recursively does that and therefore has a base case of only 1 element remaining.

Time complexity:

Best case: O(n logn)

Average case: O(n logn)

Worst case: O(n^2)

### Searching algorithm of choice -- Binary Search
Binary Search operates on sorted arrays. It repeatedly divides what we have into halves to find the target we set. To find the target exactly, binary search actaully compares the middle value with the target value and if target is less/bigger than middle value, it then searches the left/right half.

Time complexity:

Best case: O(1)

Average case: O(logn)

Worst case: O(logn)

# • Results and analysis
### Results 
My results have shown that so called Quick sort performs worse than Bubble sort in small sized arrays. However, since these sorting methods are more used in large arrays it is fairer to consider the results of larger arrays as the norm: in that case Quick Sort does perform significantly better than Bubble Sort!
### Analysis Questions
1. Which sorting algorithm performed faster? Why?

Quick Sort performed faster than Bubble sort, because Quick Sort uses Divide and Conquer method. When Bubble sort compares everything with everything (hence O(n^2)), Quick Sort divides this sorting into halves (O(logn)) and processes elements at once (O(n)).
2. How does performance change with input size?

Generally, as input size increases the performance also increases because there are more things to process.
3. How does sorted vs unsorted data affect performance?

When it comes to sorting algorithms, array being already sorted basically deletes all the swapping parts process and mostly leave time that is spend to confirm that elements are in right order. Therefore, sorted arrays will perform significantly better than the unsorted ones because there is almost no job of sorting done in sorted arrays.
4. Do the results match the expected Big-O complexity?

Maybe i am calculating this wrong, but I dont think it matches. I don't know why.
5. Which searching algorithm is more efficient? Why?

From theoretical knowledge, i know that Binary search is more efficient since binary search implements the Divide and Conquer method in comparison to Linear Search
6. Why does Binary Search require a sorted array?

Because we need to compare the target with the halves that we have. If array is unsorted we cannot be sure that our target is actually lying in which half.
# • Reflection and clarity
From this assignment i have practiced that algorithm efficiency is an important requirement indeed. From previous lectures I have learned what time complexities are there and which are better than others. I have thought that the difference between theoretical time and practical time would not be that large but i was proven false. I did not face any significant challenges during this assignment except only to try to understand what i am required to do in the Main.java files maybe. Overall, I hated sorting methods topic before this and since i tried them, in practical sense, in this assignment I can proudly say that i actaully understood some of them, which i think is a great progress in and of itself.
1 paragraph
