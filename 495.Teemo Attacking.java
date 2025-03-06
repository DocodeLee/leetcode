// Teemo attacks and need to check how many time the poison attacks enemy
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
      // i could no think about loop with the index, if we check length we can run loop with index  
        int n = timeSeries.length; // check timeSeries length
        if(n == 0) return 0;
        
        int totalPoison = 0;
        for(int i =0; i < n-1; i++){ // run based on length
            if(timeSeries[i] + duration > timeSeries[i+1]){ //if next index is shorter than duration
                totalPoison += timeSeries[i + 1] - timeSeries[i]; // reset the duration == just add the time contract, i+1 and i
            }else{
                totalPoison += duration; // or we can just add duration
            }
        }
        return totalPoison + duration; // add duration because the last index is not related with time scale
    }
}
