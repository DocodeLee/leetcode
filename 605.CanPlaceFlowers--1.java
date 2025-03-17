class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if( n == 0){
        return true;
       }
      // if n is 0 return true;

      // where we can place flower : left and right is 0
       for(int i = 0; i < flowerbed.length; i++){
         // set left it is 0 or not
        boolean left = i == 0 || flowerbed[i -1] ==0;
         // set rigth and check it is 0 or not
        boolean right = i == flowerbed.length -1 || flowerbed[i+1] == 0;
         // if left right and [i] is 0
        if(left && right && flowerbed[i] ==0){
          // change it to 1
        flowerbed[i] =1;
        n--; // decrement n
        }
       }
       return n <= 0; // boolean n is less than 0 or not
    }

}
