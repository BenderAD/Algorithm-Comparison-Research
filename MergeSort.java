// Alex Bender
// Analysis of Algorithms
// Merge Sort Algorithm (created from 2 sources: Wikipedia's entry on Merge Sort (https://en.wikipedia.org/wiki/Merge_sort),
// and the Merge Sort algorithm from https://www.cs.cmu.edu/~adamchik/15-121/lectures/Sorting%20Algorithms/code/MergeSort.java)
// Sorts arrays of strings, with an individual string having no more than 20 characters.

public class MergeSort {
	public static int count = 0;
	
	public String[] mergeSort(String[] arrA){
		int n = arrA.length;
		if (n == 1){
			System.out.println("MS Comparisons: 0");
			return arrA;}
		String[] arrB = new String[n];
		mergeSort(arrA, arrB, 0, arrA.length - 1);
		System.out.println("MS Comparisons: " + count);
		count = 0;
		return arrB;
	}
	
	private static void mergeSort(String[] arrA, String[] arrB, int left, int right){
		if (left < right){
			int center = (left + right)/2;
			mergeSort(arrA, arrB, left, center);
			mergeSort(arrA, arrB, center + 1, right);
			merge(arrA, arrB, left, center + 1, right);
		}
	}
	
	private static void merge (String[] arrA, String[] arrB, int left, int right, int rEnd){
		int localcount = 0;
		int lEnd = right - 1;
		int k = left;
		int num = rEnd - left + 1;
		
		while (left <= lEnd && right <= rEnd){
			if(arrA[left].compareTo(arrA[right]) <= 0){
				arrB[k++] = arrA[left++];}
			else{
				arrB[k++] = arrA[right++]; 
			}
			localcount += 1;
		}
		
		while(left <= lEnd){
			arrB[k++] = arrA[left++];
		}
		
		while (right <= rEnd){
			arrB[k++] = arrA[right++];
		}
		
		for (int i = 0; i < num; i++, rEnd--){
			arrA[rEnd] = arrB[rEnd];
		}
		count += localcount;
	}
	
	

}
