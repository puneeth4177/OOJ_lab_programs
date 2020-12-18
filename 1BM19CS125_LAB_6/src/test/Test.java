package test;

import java.util.*;
class std
{
String usn,name;
static int credits[];
static double marks[];

void input(int n)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter usn and name ");
usn=sc.nextLine();
name=sc.nextLine();
System.out.println("enter marks along with credits");
for(int i=0;i<n;i++)
{
marks[i]=sc.nextDouble();
credits[i]=sc.nextInt();
System.out.println();
}
}



double calculate(int n)
{
int c,cred=0;
double tot,total=0.0;
for(int i=0;i<n;i++)
{
tot=marks[i];
if(tot>=90) 
            c=10;
            else if(tot>=80)
            c=9;
            else if(tot>=70)
            c=8;
            else if(tot>=60)
            c=7;
            else if(tot>=50)
            c=6;
            else if(tot>=40)
c=4;
   else
c=0;
   total=total+(c*credits[i]);
cred=cred+credits[i];
}
total=total/cred;
return(total);
}



void display(int n,double total)
{
System.out.println("name of student : "+name);
System.out.println("usn of student : "+usn);
System.out.println("marks of student along with credits of course");
for(int i=0;i<n;i++)
{
System.out.println(marks[i]+"   "+credits[i]);
}
System.out.println("sgpa of student : "+total);
}

class Test{
public  void main (String args[])
{
Scanner sc=new Scanner(System.in);
std obj=new std();
System.out.println("enter no of course ");
int n=sc.nextInt();
obj.credits=new int[n];
obj.marks=new double[n];
obj.input(n);
double total=obj.calculate(n);
obj.display(n,total);
}


}
}