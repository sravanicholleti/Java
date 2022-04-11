public class Ifstmt{
public static void main(String[] args){

		double sight=0.25;
		int workhrs=12;
		int sleephrs=7;
//(using logical operators here, relative operators can also be used)
//if executes stmts only if ifcondition is true and it checks all the conditions to find the true		
		if(sight>=0.25&&workhrs>=9){
			System.out.println("Spects are Recomended");
}
		else{
			System.out.println("Have proper vitamins and sleep");
}

//if else if
		
		int avg=70;
		boolean amnesia=true;
		if(avg>90){
			System.out.println("Enhance your skills in others");
}	
		else if(avg<=90&&avg>70){
			System.out.println("Try more");
}
		else if(avg<60||amnesia==true){
			System.out.println("Practice steady and slow");
}
//nested if else

		boolean adhar=true;
		boolean pan=true;
		if(adhar==true){
			if(pan==true){
				System.out.println("Link both");
}
			else{
				System.out.println("apply for pan");
}
}
		else{
			System.out.println("get adhar first");			
}
}
}