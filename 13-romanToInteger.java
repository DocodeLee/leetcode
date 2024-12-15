//need to change from roman string to number

// get the string so i struggled to change it to get one by one and exception
// for example IV is 4 , IX is 9
class Solution {
    public int romanToInt(String s) {
        int total = 0; // first set the int value to return 
        Map<Character,Integer> roman = new HashMap<>(); // use HashMap for store effectively
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
      // from this we could know smaller one cannot be come infront of bigger one
      //ex) 999 > CM XC IX  
       
      //iterate the string
        for(int i =0; i< s.length()-1; i++){ //need to check i+1 so the s.length()-1 is adapted
            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){ //need to remember charAt()
                total -= roman.get(s.charAt(i)); //if smaller is infront of bigger one it means that number is minus
            }else{
                total += roman.get(s.charAt(i)); // else we need to count up as total
            }
        }
        return total + roman.get(s.charAt(s.length()- 1)); //didn't check the last index so add manually
    }
}
