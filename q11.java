class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++){
            for(int k = 1; k < height.length; k++){
                //Calculate the area
                //Calculate the base
                int base = k - i;
                //Calculate the height
                int shortest;
                if(height[i] < height[k]){
                    shortest = height[i];
                } else{
                    shortest = height[k];
                }
                int area = shortest * base;
                if(maxArea < area){
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
