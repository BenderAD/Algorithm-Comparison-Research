// Alex Bender
// Analysis of Algorithms
// Bubble Sort Algorithm (created from 2 sources: Wikipedia's entry on Bubble Sort (https://en.wikipedia.org/wiki/Bubble_sort),
// and the Bubble Sort algorithm from the Levitin text [p. 100])
// Sorts arrays of strings, with an individual string having no more than 20 characters.

public class BubbleSort {
	
	public String[] bubbleSort(String[] arrA){
		int count = 0;
		boolean swapped = true;
		String[] C = arrA;
		int nInteractions = C.length;
		for (int i = 0; i < nInteractions - 1 && swapped; i++){
			swapped = false;
			for (int j = 0; j < nInteractions - 1 - i; j++){
				if (C[j+1].compareTo(C[j]) < 0) {
					String temp = C[j];
					C[j] = C[j+1];
					C[j+1] = temp;
					swapped = true;
				}
				count += 1;
			}
		}
	
		System.out.println("BS Comparisons: " + count);
		return C;
	}

}
