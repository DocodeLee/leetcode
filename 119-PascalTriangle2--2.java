class Solution {
    public List<Integer> getRow(int rowIndex) { // return the List<Integer> 
        List<Integer> res = new ArrayList<>(); // make a new ArrayList which has Integer as variable
        res.add(1); // first add 1
        long prev = 1; // this will be the standard because all the line has 1 in the first
        
        for(int k = 1; k <= rowIndex; k++){ // iterate the line
            long next_val = prev * (rowIndex - k + 1) / k; // the next value is changed as following k >
          // k changes as per iteration but prev will be updated so need check the balance
            res.add((int) next_val); //add new value to the res
            prev = next_val; // prev update
        }
        
        return res; // return res
    }
}
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> result  = new ArrayList<>(); // make a new list for return 
        result.add(1); // add the 1 at first // for the rowIndex 0

        for(int k = 1; k <= rowIndex; k++){ // from the rowIndex 1
            List<Integer> newRow = new ArrayList<>(); // make a new list
            newRow.add(1); // add 1
            for(int j = 1; j < result.size();j++){
                newRow.add(res.get(j-1) + result.get(j)); // 
            }
            newRow.add(1); // this is for the last one
            result = newRow; //update the result
        }
        return result;

    }
}
