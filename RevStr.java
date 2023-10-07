import java.util.*;
class RevStr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1=sc.next();
int n=s1.length();
String s2="";
for(int i=n-1;i>=0;i--){
s2=s2+s1.charAt(i);
}
System.out.println(s2);
}
}
