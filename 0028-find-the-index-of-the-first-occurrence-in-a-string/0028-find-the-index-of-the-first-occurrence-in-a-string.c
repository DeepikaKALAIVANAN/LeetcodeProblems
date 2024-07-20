int strStr(char * haystack, char * needle){
int hay_len=strlen(haystack);
int ndl_len=strlen(needle);
if(ndl_len==0){
    return 0;
}
if(hay_len < ndl_len){
    return -1;
}
else{
    for(int i=0;i<=hay_len-ndl_len;i++){
        if(strncmp(haystack+i,needle,ndl_len)==0){
            return i;
        }
    }
}return -1;
}