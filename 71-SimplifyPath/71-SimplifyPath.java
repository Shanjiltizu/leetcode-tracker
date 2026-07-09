// Last updated: 09/07/2026, 09:52:16
class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } 
            else {
                stack.push(part);
            }
        }
        
        String result = "";
        for (String dir : stack) {
            result += "/" + dir;
        }
        
        return result.isEmpty() ? "/" : result;
    }
}