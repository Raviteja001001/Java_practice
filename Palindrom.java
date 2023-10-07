import java.util.*;
class Palindrom{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
s=s.toLowerCase();
int n=s.length();
String rev="";
for(int i=n-1;i>=0;i--){
rev=rev+s.charAt(i);
}
//System.out.println(rev);
if(s.equals(rev))
System.out.println("given number Palindrom:"+s);
else
System.out.println("given number NOT Palindrom:"+s);
}
}