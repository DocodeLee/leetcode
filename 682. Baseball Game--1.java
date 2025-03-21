
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>(); // make a new List for list

        for(int i = 0; i <operations.length;i++){

            int k = list.size(); // check the size for every time

            if(operations[i].equals("+")){
                list.add(list.get(k-1)+ list.get(k-2)); // if "+" > add the two values from the last
            }
            else if(operations[i].equals("D")){
                list.add(list.get(k-1) + list.get(k-1)); // if "D" > double the last value
            }
            else if(operations[i].equals("C")){
                list.remove(k-1); // if "C" remove the last value
            }
            else{
                list.add(Integer.parseInt(operations[i])); // parseInt() help to input String to int
            }
        }

        int sum = 0;
        for(int i = 0; i<list.size();i++){
            sum += list.get(i); // add to sum
        }
        
        return sum;
    }
}
