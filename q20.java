import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
                Character p = s.charAt(i);
                if (stack.size() == 0){
                    return false;
                }

                c = stack.pop();
                if ((c == '(' && p == ')') || (c == '[' && p == ']') || (c == '{' && p == '}')){
                    continue;
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0){
            return true;
        } 
        return false;
    }
}
