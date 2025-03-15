class Solution {
    public int distributeCandies(int[] candyType) {
        // check length and count how many candy eat
        // this is not necessary
        
        // put it into map and if there is something
        // count up

        Set<Integer> type = new HashSet<>();

        for(int candy : candyType){
            type.add(candy);
        }
        int count = 0;
        for(int t : type){
            count ++;
        }
        return Math.min(count, candyType.length/2);
    }
}

// very unefficient

// use type.size() not to count up the arrays 
class Solution {
    public int distributeCandies(int[] candyType) {
        // check length and count how many candy eat
        // this is not necessary
        
        // put it into map and if there is something
        // count up

        Set<Integer> type = new HashSet<>();

        for(int candy : candyType){
            type.add(candy);
        }
        return Math.min(type.size(), candyType.length/2);
    }
}
