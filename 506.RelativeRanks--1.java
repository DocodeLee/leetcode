// we will get unique scores array.
        // need to give rank to scores (all scores are unique)
        
        // 1 <= score.length <= 10000
        // score could be 0 ~ 10^6

        // how i will access

        // 1.check the Array Size
        // 2. give the rank to each element
        // 3. renew the rank if the gold medal comes 
        // it looks time consuming

        // Need to remember index if we change the array

class Solution {
    public String[] findRelativeRanks(int[] score) {
        // check the length of the score
        int n = score.length;
        // make a String Array to return
        String[] result = new String[n];

        // make a new ArrayList to store {score, index} array
        List<int[]> scoreWithIndex = new ArrayList<>();

        // add to List With score and index
        for(int i =0; i < n; i++){
            scoreWithIndex.add(new int[]{score[i], i});
        }
        // sort the List . b[0] & a[0] means score . > b[0] - a[0] makes bigger one comes first
        Collections.sort(scoreWithIndex, (a,b) -> b[0] - a[0]);

        // iterate List
        for(int i =0; i < n; i++){
            int scoreValue = scoreWithIndex.get(i)[0]; // actually we don't use this
            int index = scoreWithIndex.get(i)[1]; // we need only original index
        
        if(i==0){ // give the gold medal to first one 
            result[index] = "Gold Medal"; // save at [index] , 
        }else if(i==1){
            result[index] = "Silver Medal";
        }else if(i==2){
            result[index] = "Bronze Medal";
        }else{
            result[index] = String.valueOf(i+1); // change int to String . (i+1) + ""; 
        }
    }
        return result; // return result;
    }
}
