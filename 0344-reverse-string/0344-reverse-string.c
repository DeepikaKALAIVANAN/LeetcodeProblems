void reverseString(char* s, int sSize){
char *b,*e,ch;
b=s;
e=s;
for(int i=0;i<sSize-1;i++)e++;
for(int i=0;i<sSize/2;i++){
    ch=*e;
    *e=*b;
    *b=ch;
    b++;
    e--;
}
}