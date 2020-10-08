package PRESENTATION2and3;

import java.util.*;

public class kmers {
	public List<String> kmer_composition(String sequence, int kmerlen) // Method to obtain Kmer Composition
	{
		int windowstart = 0;
		int windowend = kmerlen;
		int looptime = sequence.length() - kmerlen + 1; // Total possible kmer to iterate the window over a loop
		List<String> kmerlist = new ArrayList<String>(); // List to store all possible kmers
		for (int i = 0; i < looptime; i++) {
			// System.out.println(sequence.substring(windowstart,windowend));
			kmerlist.add(sequence.substring(windowstart, windowend)); // appending all kmers to the list
			windowstart++;
			windowend++;
		}
		return kmerlist;
	}

	public List < String > lexographic_order(List<String> before_sort) { //method to lexicographically sort the kmerslist
	    Object[] arraylist = before_sort.toArray();
	    int length = arraylist.length;
	    String[] stringArray = new String[length];
	    for (int i = 0; i < length; i++) {
	      stringArray[i] = (String) arraylist[i];
	    }
	    for (int i = 0; i < length - 1; i++) {
	      for (int j = i + 1; j < stringArray.length; j++) {
	        if (stringArray[i].compareTo(stringArray[j]) > 0) { //using compare to function to check the order preference
	          String temp = stringArray[i];

	          stringArray[i] = stringArray[j];
	          stringArray[j] = temp;
	        }
	      }
	    }
	    LinkedList < String > sortedkmerlist = new LinkedList < String > (Arrays.asList(stringArray));
	    return sortedkmerlist;
	  }

	public void printlist(List<String> kmerlist) // A method to print all kmers obtained
	{
		for (String kmer : kmerlist)
			System.out.print(kmer + " ");
	}

	// Test Funciton
	public static void main(String[] args) {
		kmers kmercomp = new kmers();
		String sequence = new String();
		sequence = "GCGGTAATGCAGTTGAC"; // Input Sequence
		int kmerlen = 3; // Output Kmer Length (3mers)
		System.out.print("Input Sequence : " + sequence);
		int totalkmers = sequence.length() - kmerlen + 1;
		// printing total possible kmers
		System.out.print("\nTotal possible Kmers of length " + kmerlen + " in the sequence =  " + totalkmers);
		System.out.print("\nKmers List : ");

		List<String> kmerlist = kmercomp.kmer_composition(sequence, kmerlen); // storing the returned kmers list
		kmercomp.printlist(kmerlist); // printing all kmers
		// sorting the obtained kmers list in lexicographic order
		List<String> sortedkmerslist = kmercomp.lexographic_order(kmerlist); 
		System.out.print("\nAfter The lexographic order: ");
		kmercomp.printlist(sortedkmerslist);
	}
}
