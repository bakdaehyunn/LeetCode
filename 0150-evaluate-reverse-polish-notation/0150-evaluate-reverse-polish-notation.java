class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a= 0;
        int  b= 0 ; 
        for(String t: tokens){
            if(t.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(t.equals("-")){
                b= stack.pop();
                a= stack.pop();
                stack.push(a - b);
            }else if(t.equals("*")){
                stack.push(stack.pop()* stack.pop());
            }else if(t.equals("/")){
                b= stack.pop();
                a= stack.pop();
                stack.push( a/b);
            }else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}