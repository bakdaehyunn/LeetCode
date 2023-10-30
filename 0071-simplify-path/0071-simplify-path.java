class Solution {
    public String simplifyPath(String path) {
        String[] p = path.split("/");
        Stack<String> stack = new Stack<>();
        StringBuilder sb=  new StringBuilder();
        for(int i=0;i<p.length;i++){
            if(!stack.isEmpty()&&p[i].equals(".."))stack.pop();
            else if(!p[i].equals("")&&!p[i].equals("..")&&!p[i].equals("."))stack.push(p[i]);
        }
        if(stack.isEmpty())return "/";

        while(!stack.isEmpty()){
            sb.insert(0,"/"+stack.pop());
        }
        return sb.toString();
    }
}