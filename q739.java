 class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Iterate through each temperature
        //Loop through a stack (top being the left most temp)
        //Calc difference in index
        //Input in answer array
        //pop stack

        int noDays = temperatures.length;
        int[] answer = new int[noDays];

        for(int i = 0; i < noDays; i++){
            answer[i] = 0; 
            for(int k = i; k < noDays; k++){
                if(temperatures[i] < temperatures[k]){
                    answer[i] = k - i;
                    break;
                }
            }
        }

    return answer;
    }
}
