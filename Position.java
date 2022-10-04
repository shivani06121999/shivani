import java.util.*;
class Position{
public static void main(String args[]){
int count=0;
String num,rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
num=sc.nextLine();
int l=num.length();
for(int i=l-1;i>=0;i--)
rev=rev+num.charAt(i);
for(int i=0;i<l;i++){
if((num.charAt(i))==rev.charAt(i)){
System.out.println("The Numbers that does change the position are "+num.charAt(i));
count++;
}
}
if(count==0)
System.out.println("No such number whose positions are same");
}
}
