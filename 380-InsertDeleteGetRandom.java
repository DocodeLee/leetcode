
/*


Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.

bool insert(int val) Inserts an item val into the set if not present. 
Returns true if the item was not present, false otherwise.

bool remove(int val) Removes an item val from the set if present.
Returns true if the item was present, false otherwise.

int getRandom() Returns a random element from the current set of elements
(it's guaranteed that at least one element exists when this method is called). 
Each element must have the same probability of being returned.

You must implement the functions of the class such that each function works in average O(1) time complexity.

*/

class RandomizedSet {

    List<Integer> list; // List is also needs for return random Value
    Map<Integer, Integer> map; // HashMap can search the value with O(n)

    public RandomizedSet() {
        list = new ArrayList<>(); //set the new list
        map = new HashMap<>(); // set the map
    }
    
    public boolean insert(int val) { // if there was no val put it
        if(map.containsKey(val)) return false; // if there is already value in map return false
        list.add(val); // else : add the value into list
        map.put(val,list.size()-1); // add the value with the key val and the position
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false; // if there is no value return false
        int pos = map.get(val); // if there were value get key and set it as position
        Collections.swap(list,pos,list.size()-1); // swap from the key to last value
        map.put(list.get(pos),pos); // because we swap the index need to update with the map
        list.remove(list.size()-1); // remove from the list
        map.remove(val); // then remove the val from the map
        return true;
    }
    
    public int getRandom() {
        Random random = new Random(); //set random
        int newNum = random.nextInt(list.size()); //get the random int
        return list.get(newNum); //get Number
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
