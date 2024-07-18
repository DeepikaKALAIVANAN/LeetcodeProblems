int reverse(int x){
long int last,rev=0;
while(x!=0){
    last=x%10;
    rev=rev*10+last;
    x=x/10;
}
if(rev>=INT_MIN&&rev<=INT_MAX){
    return rev;
}
else{
    return 0;
}
}