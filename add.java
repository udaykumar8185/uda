import java.util.*;
class demo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=85;
System.out.println("enter a value");
int a=sc.nextInt();
System.out.println("enter b value");
int b=sc.nextInt();
int c=a+b;
int units=c*5;
if(units==x){
System.out.println("value of c is="+units);
}else{
System.out.println("wrong");
}
}
}

