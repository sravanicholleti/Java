public class Switch{

public static void main(String[] args){

	int i='a';
//switch executes the case that is matched with the expression
	switch(i){
		case 95:{
System.out.println("try");
}
		case 96:{
System.out.println("hard");
}
		case 97:{
System.out.println("practice");//if break is used then all cases after the matched case will be executed.
break;
}
		case 98:{
System.out.println("be");
}
		case 99:{
System.out.println("consistent");
}
		default:{
System.out.println("expression and case label does'nt matched");
}
}

}
}