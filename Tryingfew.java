public class Tryingfew {

 public static void main(String[] args){

// converting integers into character
   byte b1= 12; // as the values can be changed it is throwing an error when using identifiers
   short s1= 150;
   char c1= (char) 12+150 ; // we are using the syntax dt identifier=(dt) identifierorvalues 

   System.out.println("c1=" +c1);

// adding two diff datatypes i.e int and float
   int i1= 99;
   float f1= 2.4f;
   float f= i1+f1; // not using the syntax as we are converting lower dt to higher dt

   System.out.println("f=" +f);

// converting character into integer
  char c2= 's';
  int i2= c2; // not using the syntax as we are converting lower dt to higher dt

  System.out.println(i2);

// converting substraction of two characters into integers
   char c3= 'a';
   char c4= 'n';
   int i3= c3-c4; // not using the syntax as we are converting lower dt to higher dt

  System.out.println("i3=" +i3);

/* trying few errors
  byte b= 133;
  System.out.println(b);
*/

// dynamic value assigning 

  int i=33;
         i=i+9;
  System.out.println(i);

//using final access modifier for fixed variable value

  final int j=10;
  final int k=15;
  int l=j+k;
System.out.println(l);

//dynamic value assigning using char and int
  
   char m= 'a';
      m=('a'+2);
  System.out.println(m);
}

}