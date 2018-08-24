import java.util.Scanner;


public class CheckNumbersInTwoStrings {

	public static void checkNumbersInTwoStrings(String strInput1, String strInput2){
		String strNumber1=strInput1.replaceAll("[^1-9]", "");
		String strNumber2=strInput2.replaceAll("[^1-9]", "");
		int iCheck=strNumber1.trim().compareTo(strNumber2.trim());		
		
		if(iCheck==0){
			System.out.println(strNumber1+" , "+strNumber2+" , true");
		}else{
			System.out.println(strNumber1+" , "+strNumber2+" , false");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your first string: ");
		String inputString1="",inputString2="";
		Scanner console=new Scanner(System.in);
		inputString1=console.nextLine();
		
		System.out.println("Please enter your second number: ");
		inputString2=console.nextLine();
		
		System.out.println("Output is ");
		checkNumbersInTwoStrings(inputString1,inputString2);
	}

}
