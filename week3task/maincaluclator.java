package week3task;
import java.util.*;
public class maincaluclator {
	public static void main(String args[]) {

	int a,b;
	Scanner m =new Scanner(System.in);
	System.out.println("Enter the first operand:");
	a=m.nextInt();
	System.out.println("Enter the second operand:");
	b=m.nextInt();
	
	System.out.println("choose one operation(+,-,*,/):");
	char ch=m.next().charAt(0);
	simplecalculator s=new simplecalculator();
	switch(ch)
	{
	case '+':System.out.println(a +"+"+ b+"="+s.add(a,b));break;
	case '-':System.out.println(a +"-"+ b+"="+s.sub(a,b));break;
	case '*':System.out.println(a +"*"+ b+"="+s.mul(a,b));break;
	case '/':System.out.println(a +"/"+ b+"="+s.div(a,b));
	default:System.out.println("Enter a valid operator!!");
	}
	
	
	}	
}
