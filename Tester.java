import java.io.*;
import java.util.*;
// Alex Bender
// Analysis of Algorithms
// Tester: Implements BubbleSort and MergeSort
// NOTE: String arrays with naming convention "number of elements" + "Array" + "sortIdentifier"
// (e.g. oneArrayB denotes a String array of length 1 to be used in BubbleSort)
// were generated from words.txt, which was generated from http://listofrandomwords.com/.
// There are 100 strings in words.txt, and all are less than 20 characters.
// The arrays with naming convention "sortIdentifier" + "letter" (e.g. bA is array A for bubblesort) are hard-coded arrays
// to look at specific "attributes" of arrays, like number, similarity, and order of elements.
// The "bd" test stands for "Big Data"; that is, the input is a 10,000 string array, with 20-character strings,
// to show how the algorithms run under a huge input size.

public class Tester {
	
	public static void main(String[] args){
		
		// The paths for the data to be sorted.
		// words.txt is used for all tests except "letter-named" tests (which are hard-coded, e.g. bA, mC) and
		// the "bd" tests (where bigdata.txt is used). 
		String url = "C:\\Users\\ABender\\workspaceMARS1\\AlgSorts\\src\\words.txt";
		String bigData = "C:\\Users\\ABender\\workspaceMARS1\\AlgSorts\\src\\bigdata.txt";
		
		try {
			ArrayList<String> wordsAL = dataRetreival(url);
			ArrayList<String> bigDataAL = dataRetreival(bigData);
			String[] bdB = inputSelector(bigDataAL, 10000);
			String[] bdM = Arrays.copyOf(bdB,  bdB.length);
			
			// Bubble Sort input
			String[] oneArrayB = inputSelector(wordsAL, 1);		
			String[] fiveArrayB = inputSelector(wordsAL, 5);
			String[] tenArrayB = inputSelector(wordsAL, 10);
			String[] twentyArrayB = inputSelector(wordsAL, 20);
			String[] fiftyArrayB = inputSelector(wordsAL, 50);
			String[] hundredArrayB = inputSelector(wordsAL, 100);
			String[] fivehunArrayB = inputSelector(wordsAL, 500);
			String[] thousandArrayB = inputSelector(wordsAL, 1000);
			String[] tenthousandArrayB = inputSelector(wordsAL, 10000);
			
			String[] bA = {"he", "she", "grossly", "ineffectual", "establishmentarian"};
			String[] bB = {"h"};
			String[] bC = {"?ISDF", "heh", "gargantuan", "grump"};
			String[] bD = {"inopportune", "indirect", "indirectly", "opportune", "opportunity", "zoo", "zoological", "zoonotic"};
			String[] bE = {"zelda", "yard", "terrible", "quetzal", "lean", "everyday", "carry", "because", "almighty", "all", "abbey"};
			//String[] bF = {"abbey", "all", "almighty", "because", "carry", "everyday", "lean", "quetzal", "terrible", "yard", "zelda"};
			
			// MergeSort input
			// Copies necessary so MergeSort doesn't receive pre-sorted arrays
			String[] oneArrayM = Arrays.copyOf(oneArrayB, oneArrayB.length);
			String[] fiveArrayM = Arrays.copyOf(fiveArrayB, fiveArrayB.length);
			String[] tenArrayM = Arrays.copyOf(tenArrayB, tenArrayB.length);
			String[] twentyArrayM = Arrays.copyOf(twentyArrayB, twentyArrayB.length);
			String[] fiftyArrayM = Arrays.copyOf(fiftyArrayB, fiftyArrayB.length);
			String[] hundredArrayM = Arrays.copyOf(hundredArrayB, hundredArrayB.length);
			String[] fivehunArrayM = Arrays.copyOf(fivehunArrayB, fivehunArrayB.length);
			String[] thousandArrayM = Arrays.copyOf(thousandArrayB, thousandArrayB.length);
			String[] tenthousandArrayM = Arrays.copyOf(tenthousandArrayB, tenthousandArrayB.length);
			
			String[] mA = {"he", "she", "grossly", "ineffectual", "establishmentarian"};
			String[] mB = {"h"};
			String[] mC = {"?ISDF", "heh", "gargantuan", "grump"};
			String[] mD = {"inopportune", "indirect", "indirectly", "opportune", "opportunity", "zoo", "zoological", "zoonotic"};
			String[] mE = {"zelda", "yard", "terrible", "quetzal", "lean", "everyday", "carry", "because", "almighty", "all", "abbey"};
			//String[] mF = {"abbey", "all", "almighty", "because", "carry", "everyday", "lean", "quetzal", "terrible", "yard", "zelda"};
			
			// -- The Sorting --
			// Performs sorts and prints results.
			// Results include pre-sorted array, number of comparisons for the given sort, the sorted array,
			// and the runtime of the sort in milliseconds.
			// NOTE: Even with maximized character limit, console cannot output "max input size" tests for either sort.
			
			BubbleSort testing = new BubbleSort();
			
			System.out.println(Arrays.toString(oneArrayB));
			long startTime1 = System.currentTimeMillis();
			String[] test1 = testing.bubbleSort(oneArrayB);
			long endTime1 = System.currentTimeMillis();
			long total1 = endTime1 - startTime1;
			System.out.println(Arrays.toString(test1));
			System.out.println("Runtime: " + total1 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fiveArrayB));
			long startTime2 = System.currentTimeMillis();
			String[] test5 = testing.bubbleSort(fiveArrayB);
			long endTime2 = System.currentTimeMillis();
			long total2 = endTime2 - startTime2;
			System.out.println(Arrays.toString(test5));
			System.out.println("Runtime: " + total2 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(tenArrayB));
			long startTime3 = System.currentTimeMillis();
			String[] test10 = testing.bubbleSort(tenArrayB);
			long endTime3 = System.currentTimeMillis();
			long total3 = endTime3 - startTime3;
			System.out.println(Arrays.toString(test10));
			System.out.println("Runtime: " + total3 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(twentyArrayB));
			long startTime4 = System.currentTimeMillis();
			String[] test20 = testing.bubbleSort(twentyArrayB);
			long endTime4 = System.currentTimeMillis();
			long total4 = endTime4 - startTime4;
			System.out.println(Arrays.toString(test20));
			System.out.println("Runtime: " + total4 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fiftyArrayB));
			long startTime5 = System.currentTimeMillis();
			String[] test50 = testing.bubbleSort(fiftyArrayB);
			long endTime5 = System.currentTimeMillis();
			long total5 = endTime5 - startTime5;
			System.out.println(Arrays.toString(test50));
			System.out.println("Runtime: " + total5 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(hundredArrayB));
			long startTime6 = System.currentTimeMillis();
			String[] test100 = testing.bubbleSort(hundredArrayB);
			long endTime6 = System.currentTimeMillis();
			long total6 = endTime6 - startTime6;
			System.out.println(Arrays.toString(test100));
			System.out.println("Runtime: " + total6 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fivehunArrayB));
			long startTime7 = System.currentTimeMillis();
			String[] test500 = testing.bubbleSort(fivehunArrayB);
			long endTime7 = System.currentTimeMillis();
			long total7 = endTime7 - startTime7;
			System.out.println(Arrays.toString(test500));
			System.out.println("Runtime: " + total7 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(thousandArrayB));
			long startTime8 = System.currentTimeMillis();
			String[] test1000 = testing.bubbleSort(thousandArrayB);
			long endTime8 = System.currentTimeMillis();
			long total8 = endTime8 - startTime8;
			System.out.println(Arrays.toString(test1000));
			System.out.println("Runtime: " + total8 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(tenthousandArrayB));
			long startTime9 = System.currentTimeMillis();
			String[] test10000 = testing.bubbleSort(tenthousandArrayB);
			long endTime9 = System.currentTimeMillis();
			long total9 = endTime9 - startTime9;
			System.out.println(Arrays.toString(test10000));
			System.out.println("Runtime: " + total9 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(bA));
			long startTime10 = System.currentTimeMillis();
			String[] testA = testing.bubbleSort(bA);
			long endTime10 = System.currentTimeMillis();
			long total10 = endTime10 - startTime10;
			System.out.println(Arrays.toString(testA));
			System.out.println("Runtime: " + total10 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(bB));
			long startTime11 = System.currentTimeMillis();
			String[] testB = testing.bubbleSort(bB);
			long endTime11 = System.currentTimeMillis();
			long total11 = endTime11 - startTime11;
			System.out.println(Arrays.toString(testB));
			System.out.println("Runtime: " + total11 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(bC));
			long startTime12 = System.currentTimeMillis();
			String[] testC = testing.bubbleSort(bC);
			long endTime12 = System.currentTimeMillis();
			long total12 = endTime12 - startTime12;
			System.out.println(Arrays.toString(testC));
			System.out.println("Runtime: " + total12 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(bD));
			long startTime13 = System.currentTimeMillis();
			String[] testD = testing.bubbleSort(bD);
			long endTime13 = System.currentTimeMillis();
			long total13 = endTime13 - startTime13;
			System.out.println(Arrays.toString(testD));
			System.out.println("Runtime: " + total13 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(bE));
			long startTime14 = System.currentTimeMillis();
			String[] testE = testing.bubbleSort(bE);
			long endTime14 = System.currentTimeMillis();
			long total14 = endTime14 - startTime14;
			System.out.println(Arrays.toString(testE));
			System.out.println("Runtime: " + total14 + " milliseconds");
			System.out.println();
			
	
			MergeSort test = new MergeSort();
			
			System.out.println(Arrays.toString(oneArrayM));
			long st1 = System.currentTimeMillis();
			String[] testing1 = test.mergeSort(oneArrayM);
			long et1 = System.currentTimeMillis();
			long tot1 = et1 - st1;
			System.out.println(Arrays.toString(testing1));
			System.out.println("Runtime: " + tot1 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fiveArrayM));
			long st2 = System.currentTimeMillis();
			String[] testing5 = test.mergeSort(fiveArrayM);
			long et2 = System.currentTimeMillis();
			long tot2 = et2 - st2;
			System.out.println(Arrays.toString(testing5));
			System.out.println("Runtime: " + tot2 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(tenArrayM));
			long st3 = System.currentTimeMillis();
			String[] testing10 = test.mergeSort(tenArrayM);
			long et3 = System.currentTimeMillis();
			long tot3 = et3 - st3;
			System.out.println(Arrays.toString(testing10));
			System.out.println("Runtime: " + tot3 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(twentyArrayM));
			long st4 = System.currentTimeMillis();
			String[] testing20 = test.mergeSort(twentyArrayM);
			long et4 = System.currentTimeMillis();
			long tot4 = et4 - st4;
			System.out.println(Arrays.toString(testing20));
			System.out.println("Runtime: " + tot4 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fiftyArrayM));
			long st5 = System.currentTimeMillis();
			String[] testing50 = test.mergeSort(fiftyArrayM);
			long et5 = System.currentTimeMillis();
			long tot5 = et5 - st5;
			System.out.println(Arrays.toString(testing50));
			System.out.println("Runtime: " + tot5 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(hundredArrayM));
			long st6 = System.currentTimeMillis();
			String[] testing100 = test.mergeSort(hundredArrayM);
			long et6 = System.currentTimeMillis();
			long tot6 = et6 - st6;
			System.out.println(Arrays.toString(testing100));
			System.out.println("Runtime: " + tot6 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(fivehunArrayM));
			long st7 = System.currentTimeMillis();
			String[] testing500 = test.mergeSort(fivehunArrayM);
			long et7 = System.currentTimeMillis();
			long tot7 = et7 - st7;
			System.out.println(Arrays.toString(testing500));
			System.out.println("Runtime: " + tot7 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(thousandArrayM));
			long st8 = System.currentTimeMillis();
			String[] testing1000 = test.mergeSort(thousandArrayM);
			long et8 = System.currentTimeMillis();
			long tot8 = et8 - st8;
			System.out.println(Arrays.toString(testing1000));
			System.out.println("Runtime: " + tot8 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(tenthousandArrayM));
			long st9 = System.currentTimeMillis();
			String[] testing10000 = test.mergeSort(tenthousandArrayM);
			long et9 = System.currentTimeMillis();
			long tot9 = et9 - st9;
			System.out.println(Arrays.toString(testing10000));
			System.out.println("Runtime: " + tot9 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(mA));
			long st10 = System.currentTimeMillis();
			String[] testingA = test.mergeSort(mA);
			long et10 = System.currentTimeMillis();
			long tot10 = et10 - st10;
			System.out.println(Arrays.toString(testingA));
			System.out.println("Runtime: " + tot10 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(mB));
			long st11 = System.currentTimeMillis();
			String[] testingB = test.mergeSort(mB);
			long et11 = System.currentTimeMillis();
			long tot11 = et11 - st11;
			System.out.println(Arrays.toString(testingB));
			System.out.println("Runtime: " + tot11 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(mC));
			long st12 = System.currentTimeMillis();
			String[] testingC = test.mergeSort(mC);
			long et12 = System.currentTimeMillis();
			long tot12 = et12 - st12;
			System.out.println(Arrays.toString(testingC));
			System.out.println("Runtime: " + tot12 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(mD));
			long st13 = System.currentTimeMillis();
			String[] testingD = test.mergeSort(mD);
			long et13 = System.currentTimeMillis();
			long tot13 = et13 - st13;
			System.out.println(Arrays.toString(testingD));
			System.out.println("Runtime: " + tot13 + " milliseconds");
			System.out.println();
			
			System.out.println(Arrays.toString(mE));
			long st14 = System.currentTimeMillis();
			String[] testingE = test.mergeSort(mE);
			long et14 = System.currentTimeMillis();
			long tot14 = et14 - st14;
			System.out.println(Arrays.toString(testingE));
			System.out.println("Runtime: " + tot14 + " milliseconds");
			System.out.println();
			
			// These tests are for a "maximized" input size.
			
			BubbleSort tests1 = new BubbleSort();
			long startTime15 = System.currentTimeMillis();
			String[] bdtestB = tests1.bubbleSort(bdB);
			long endTime15 = System.currentTimeMillis();
			long total15 = endTime15 - startTime15;
			System.out.println(Arrays.toString(bdtestB));
			System.out.println("Runtime: " + total15 + " milliseconds");
			System.out.println();
									
			MergeSort tests2 = new MergeSort();
			long st15 = System.currentTimeMillis();
			String[] bdtestM = tests2.mergeSort(bdM);
			long et15 = System.currentTimeMillis();
			long tot15 = et15 - st15;
			System.out.println(Arrays.toString(bdtestM));
			System.out.println("Runtime: " + tot15 + " milliseconds");
			System.out.println();
		
		}
		// Generic exception for try block
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public static ArrayList<String> dataRetreival(String filename) throws IOException{
		// Reads strings from file into ArrayList. Returns ArrayList of complete string list, to be passed to inputSelector().
		
		ArrayList<String> words = new ArrayList<String>();
		File file = new File(filename);
		
		// This was created because the site 
		if(filename == "C:\\Users\\ABender\\workspaceMARS1\\AlgSorts\\src\\bigdata.txt"){
			try {
				
				Scanner in = new Scanner(file);
				while(in.hasNext()){
					words.add(in.next());
					}
				
				in.close();
			}
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			try {
				Scanner in = new Scanner(file);
				while(in.hasNextLine()){
					words.add(in.nextLine());
				}
				in.close();
			}
			
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return words;
	}
	
	public static String[] inputSelector(ArrayList<String> wordArray, int n){
		// Selects sub-arrays of variable size randomly from the entire word list for sorting.
		Random random = new Random();
		ArrayList<String> temp = new ArrayList<String>();
		for (int i = 0; i <= n-1; i++){
			temp.add(wordArray.get(random.nextInt(wordArray.size())));
		}
		
		String[] array = temp.toArray(new String[0]);
		return array;
		
	}
}
