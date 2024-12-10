/*
h-index is defined as the maximum value of h such that the given researcher has published at least h papers
that have each been cited at least h times.

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3,0, 6, 1, 5 citations respectively.
*/

class Solution {
    public int hIndex(int[] citations) {
      
        int papers = citations.length; // set the number as other value for convenience
        int[] citationBuckets = new int[papers + 1]; // make new list for the H-Index

        for(int citation : citations){ // iterate arrays
            citationBuckets[(Math.min(citation, papers))]++; //why min? > to ensure that if a citation count exceeds the total number of papers, 
                                                              // it counts towards the highest bucket 
        }

        int cumulativePapers = 0; //to check the papers which is bigger than h-index
        for(int hIndex = papers; hIndex >=0; hIndex--){ // becomes smaller from the paper number
            cumulativePapers += citationBuckets[hIndex]; //add citationBuckets's value to the cumulativePapers
            if(cumulativePapers >= hIndex){ // if the cumulativePapers overload the hIndex or same
                return hIndex; // that is the h-index value
            }
        }
        return 0; // if there are no paper bigger than 1 than will return 0
    }
}
