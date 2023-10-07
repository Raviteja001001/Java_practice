class Main{
public static int largest(int first,int second,int third){
int max=first;
if(second>max){max=second;}
if(third>max){max=third;}
return max;
}
public static int smallest(int first,int second,int third){
int min=first;
if(second<min){min=second;}
if(third<min){min=third;}
return min;
}
public static int keyfinding(int input1,int input2,int input3){
String res="";
if((input1>=1000 && input1<=9999)&&(input2>=1000 && input2<=9999)&&(input3>=1000 && input3<=9999)){
int a=0,b=0,c=0;
String inp1=String.valueOf(input1);
String inp2=String.valueOf(input2);
String inp3=String.valueOf(input3);
for(int i=0;i<4;i++){
a=Integer.parseInt(String.valueOf(inp1.charAt(i)));
b=Integer.parseInt(String.valueOf(inp2.charAt(i)));
c=Integer.parseInt(String.valueOf(inp3.charAt(i)));
res +=String.valueOf(largest(a,b,c)-smallest(a,b,c));
}
}
return Integer.parseInt(res);
}
public static void main(String arg[]){
System.out.print(keyfinding(1133,5467,5438));
}
}


