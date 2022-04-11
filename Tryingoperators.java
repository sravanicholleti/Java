public class Tryingoperators {

public static void main(String[] args) {

//logical operators

 int i=193;
 int a=6;
 int s=i+a;//here + is used as addition operator, result will be digit
 System.out.println("s=" +s);//+ is used for concatination, result will be string

 i++;
 System.out.println("i=" +i);
 int j=193;
 ++j;
 System.out.println("j=" +j);

//using dynamic assigning 

 int k=9;
 int l=++k; // first incrementation then assigning i.e,k=9+1, l=k
 k=9;
 int m=k++; // first assigning then incrementation i.e, m=k, k=9+1
 System.out.println("l=" +l);
 System.out.println("m=" +m);

//division operator
int c=5/5;
 System.out.println("c=" +c);

//relative operators-comparision
int e=5;
double f=5.05;
System.out.println(e==f);
System.out.println(e!=f);

int x='b';//unicode of b=98
int y=('a'+1);//unicode of a=97
System.out.println(x==y);
System.out.println(e>x);

//logical operators
}

}