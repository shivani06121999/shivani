import java.util.*;
class ReverseNum{
public static void main(String args[]){
String num,rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the num");
num=sc.nextLine();
int l=num.length();
for(int i=l-1;i>=0;i--)
rev=rev+num.charAt(i);
if(num.equals(rev))
System.out.println("the num is palindrome "+rev);
else
System.out.println("the num is not palindrome "+rev);
}
}
