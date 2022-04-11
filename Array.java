public class Array{

public static void main(String[] args){

int[] i=new int[5];
i[0]=54;
//not assigning any value to index 1, it prints default value 0
i[2]=79;
i[3]=69;
i[4]=25;
System.out.println(i);
for(int index=0;index<=4;index++){
System.out.println(i[index]);
}

//max number
int[] j={2,3,4,9,5,29,25};
int max;
max=j[0];
for(int indexv=0;indexv<j.length;indexv++){
 if(j[indexv]>max)
max=j[indexv];
}
System.out.println("Max Number="+max);


//min number
int min;
min=j[0];
for(int indexv=0;indexv<j.length;indexv++){
if(j[indexv]<min)
min=j[indexv];
}
System.out.println("Min Number="+min);


//sum 
int sum;
sum=j[0];
for(int indexv=1;indexv<j.length;indexv++){
sum=j[indexv]+sum;
}
System.out.println("Sum="+sum);

//average
int avrg= sum/7;
System.out.println("Avrg="+avrg);

//index of given number
int value=j[0];
for(int indexv=0;indexv<j.length;indexv++){
if(j[indexv]==9)
value=j[indexv];
}
System.out.println("index of this number is"+ value);





}
}