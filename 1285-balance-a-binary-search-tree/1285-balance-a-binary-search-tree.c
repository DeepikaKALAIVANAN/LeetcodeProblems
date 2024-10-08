void inorderTraversal(struct TreeNode* root, struct TreeNode** nodes, int* size) {
    if (!root) return;
    inorderTraversal(root->left, nodes, size);
    nodes[(*size)++] = root;
    inorderTraversal(root->right, nodes, size);
}

struct TreeNode* buildBalancedBST(struct TreeNode** nodes, int start, int end) {
    if (start > end) return NULL;
    int mid = start + (end - start) / 2;
    struct TreeNode* root = nodes[mid];
    root->left = buildBalancedBST(nodes, start, mid - 1);
    root->right = buildBalancedBST(nodes, mid + 1, end);
    return root;
}

struct TreeNode* balanceBST(struct TreeNode* root) {
    int size = 0;
    struct TreeNode* nodes[10000];
    inorderTraversal(root, nodes, &size);
    return buildBalancedBST(nodes, 0, size - 1);
}

void printInorder(struct TreeNode* root) {
    if (root != NULL) {
        printInorder(root->left);
        printf("%d ", root->val);
        printInorder(root->right);
    }
}
