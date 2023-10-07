import java.util.*;
class DayNum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
switch(n){
case 0: System.out.println("SUNDAY"); break;
case 1: System.out.println("MONDAY"); break;
case 2: System.out.println("TUESDAY"); break;
case 3: System.out.println("WENDSDAY"); break;
case 4: System.out.println("THURSDAY"); break;
case 5: System.out.println("FRIDAY"); break;
case 6: System.out.println("SATURDAY"); break;
default: System.out.println("re-try");
}
}
}