/// getting two String list, and need to find the most close and identical string between 2 lists.

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // To compare String Map is proper as it can compare string as "Key"
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
      // Make a two hasp map to store strings
        List<String> val = new ArrayList<>();
      // first we need to make a ArrayList because we don't know how many string will be return
        int minIndex = Integer.MAX_VALUE;
      //set minIndex as MAX_VALUE

        for(int i = 0; i < list1.length;i++){
            map1.put(list1[i],i);
        }
      // put the string into Map
        for(int j = 0; j < list2.length;j++){
            map2.put(list2[j],j); 
          //put Strings into Map2
          //Need to calculate the index, so proceed next step without closing for loop
            if(map1.containsKey(list2[j])){ // check map1 has list2[j] string
                int currentIndexSum = j + map1.get(list2[j]); // if has check the currentIndexSum
                // if currentIndexSum is smaller than minimum value
                if(currentIndexSum < minIndex){
                    minIndex = currentIndexSum; //update it with current value
                    val.clear(); // clear String arrayList
                    val.add(list2[j]); // add the list2[j] 
                }else if (currentIndexSum == minIndex){
                    val.add(list2[j]); // if it has same IndexSum just add 
                }
            }
        }

        return val.toArray(new String[0]); //Before return change arrayList to Array

    }
}
