/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize){
* returnSize=2;
int* result=(int*)malloc(*returnSize*sizeof(int));
int j;
for(j=0;j<numsSize;j++){
    if(nums[j]==target){
        result[0]=j;
        break;
    }
}
if(j>=numsSize){
    result[0]=result[1]=-1;
    return result;
}
for(int i=numsSize-1;i>=0;i--){
    if(nums[i]==target){
        result[1]=i;
        break;
    }
}
return result;
}