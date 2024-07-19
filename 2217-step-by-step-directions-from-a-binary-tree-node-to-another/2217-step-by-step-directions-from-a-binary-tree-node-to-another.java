class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();

        findPath(root, startValue, pathToStart);
        findPath(root, destValue, pathToDest);

        int i = 0, max_i = Math.min(pathToStart.length(), pathToDest.length());
        while (i < max_i && pathToStart.charAt(i) == pathToDest.charAt(i)) {
            i++;
        }

        StringBuilder result = new StringBuilder();
        for (int j = i; j < pathToStart.length(); j++) {
            result.append('U');
        }
        result.append(pathToDest.substring(i));

        return result.toString();
    }

    private boolean findPath(TreeNode root, int value, StringBuilder path) {
        if (root == null) {
            return false;
        }
        if (root.val == value) {
            return true;
        }
        path.append('L');
        if (findPath(root.left, value, path)) {
            return true;
        }
        path.setLength(path.length() - 1);

        path.append('R');
        if (findPath(root.right, value, path)) {
            return true;
        }
        path.setLength(path.length() - 1);

        return false;
    }
}