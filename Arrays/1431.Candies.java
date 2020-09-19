/*
 * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
 * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number 
 * of candies among them. Notice that multiple kids can have the greatest number of candies.
 */
 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int length = candies.length;
        int largest = 0;
        for(int i = 0; i < length; i++) {
            if(candies[i] > largest) {
                largest = candies[i];
            }
        }
        List<Boolean> out = new ArrayList();
        for(int i = 0; i < length; i++) {
            if(candies[i] + extraCandies >= largest) {
                out.add(true);
            } else {
                out.add(false);
            }
        }
        return out;
    }
}
