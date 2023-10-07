import java.util.*;
import java.io.*;
class Wipro2{
public static boolean isPrime(int number){
if(number<=1){ return false; }
for(int i=2;i<=Math.sqrt(number);i++){
if(number%i==0) return false;}
return true;
}
public static int calculateSum(int[] arr,int n){
ArrayList<Integer> prime=new ArrayList<Integer>();
for(int i=0;i<n;i++) if(isPrime(arr[i])) prime.add(arr[i]);
int sum=0;
if(prime.size()>0){
Collections.sort(prime);
for(int j=0;j<(prime.size()-1);j++)
sum +=prime.get(j);
return sum;
}
else{
Arrays.sort(arr);
for(int k=0;k<(n-1);k++) sum +=arr[k];
return sum;
}
}
public static void main(String args[]){
int[] input1={10,41,34,65,7,54};
int[] input2={10,41,34,65};
System.out.println(calculateSum(input1,6));
System.out.println(calculateSum(input2,4));
}
}