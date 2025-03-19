class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){
            //Check if the start and end add together
            if((numbers[start] + numbers[end] == target)){
                return new int[] {start + 1, end + 1};
            }
            //Otherwise move rightpointer right
            else if(start != end){
                end--;
            }
            //Both pointers at same index
            else{
                start++;
                end = numbers.length;
            }

        }
        return new int[] {};
    }
} 
