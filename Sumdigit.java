import java.util.*;
class Sumdigit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=0;
while(a>0){
b +=a%10;
a=a/10;
}
System.out.println(b);
}
}
