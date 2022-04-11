public class Loops{
public static void main(String[] args){

	int value=25;
	int reach='!';//!unicode is 33
// while loop
	
	while(value<=reach){
		
		System.out.println("true");
		value++;
}

//do while loop executes the stmts for once for sure after that depends on condition
	int savings=49990;
	int savetarget=50000;
	int leaves=7;

	do{
		System.out.println("Go for trip");
		savings++;
				
}
	while(savings<=savetarget&&leaves>5);

//for loop
	int number=5;
	int first=1;
	int last=10;
	int result=0;

	for(first=1;first<=last;first++){
		result=number*first;
		System.out.println(number+"*"+first+"="+result);
		
}

//jump stmts
//break the loop
 int j=1;
for(j=1;j<=9;j++){
if(j==5){
break;
}
System.out.println(j);
}

//just to give space
System.out.println("space");

//continue after skipping the condition
for(j=1;j<=9;j++){
if(j==5){
continue;
}
System.out.println(j);
}
}
}