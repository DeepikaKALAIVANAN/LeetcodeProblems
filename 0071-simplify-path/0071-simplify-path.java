import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.equals("") || dir.equals(".")) {
                continue;
            } else if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        StringBuilder simplifiedPath = new StringBuilder();
        if (stack.isEmpty()) {
            simplifiedPath.append("/");
        } else {
            for (String dir : stack) {
                simplifiedPath.append("/").append(dir);
            }
        }
        return simplifiedPath.toString();
    }
}