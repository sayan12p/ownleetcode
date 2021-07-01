package first.String;


import java.util.Stack;

public class LongestParanthesis {
    public static int longestValidParentheses(String s) {
        int maxans=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if( c=='('){
                stack.push(c);
            }else if(c==')') {
                if (!stack.isEmpty() && stack.peek()=='(') {
                    stack.pop();
                    maxans++;
                }
            }
                    if(stack.isEmpty()){stack.push(c);}

            }
            return maxans*2;
}

    public static void main(String[] args) {
        String s="))";
        System.out.println(longestValidParentheses(s));
    }
}
