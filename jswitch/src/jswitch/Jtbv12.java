package jswitch;

public class Jtbv12 {
	public static void main (String []args) {
		
		//Conditional statements in java
		
		//if else
		int a =41;
		int b=5;
		
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
		
//		if else if
		int aa = 18;
		int bb = 17;
		int cc = 19;
		
		if(aa >bb && aa>cc)
			System.out.println(aa);
		else if (bb > cc)
			System.out.println(bb);
		else
			System.out.println(cc);
		
//		Ternary operator
		int n =5;
		int result = 0;
		
		result = n%2==0?10:20;
		System.out.println(result);
		
//		switch statement traditional 
		int d = 9;
		switch(d) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter valid number.");
		}
		
//		switch statement without break;
		int dd = 5;
		switch(dd) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thrusday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		default ->System.out.println("Enter valid number.");
		}
		
//		switch assigning value to variable
		String ddd = "Monday";
		int resultt;
		
		switch(ddd) {
		case "Monday":
			resultt = 1;
			break;
		case "Tuesday":
			resultt = 2;
			break;
		case "Wednesday":
			resultt = 3;
			break;
		case "Thrusday":
			resultt = 4;
			break;
		case "Friday":
			resultt = 5;
			break;
		case "Saturday":
			resultt = 6;
			break;
		case "Sunday":
			resultt = 7;
			break;
		default:
			resultt = 0;
		}
		System.out.println(resultt);
		
//		Switch as expression 1.0
		String dddd = "Monday";
		int resulttt = switch(dddd) {
		case "Monday" -> 1;
		case "Tuesday" -> 2;
		case "Wednesday" -> 3;
		case "Thrusday" -> 4;
		case "Friday" -> 5;
		case "Saturday" -> 6;
		case "Sunday" -> 7;
		default -> 0;
		};
		System.out.println(resulttt);
		
//		Switch as expression 2.0
		String ddddd = "Tue";
		int resultttt = switch(ddddd) {
		case "Monday" : yield 1;
		case "Tuesday" :  yield 2;
		case "Wednesday" : yield 3;
		case "Thrusday" :  yield 4;
		case "Friday" :  yield 5;
		case "Saturday" : yield  6;
		case "Sunday" :  yield 7;
		default :  yield 0;
		};
		System.out.println(resultttt);
		
	}
}
