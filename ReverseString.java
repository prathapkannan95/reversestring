import java.util.Scanner;
public  class ReverseString{
	public static void main(String[] args){
		String str;
		String reverse ="";
		Scanner in= new Scanner (System.in);
		System.out.println("enter the string");
		str=in.nextLine();
		int length=str.length();
		
		for(int i=length-1;i>=0;i--){
			reverse= reverse+str.charAt(i);
			
			
		}
		System.out.println("the reverse order= "+reverse);
	}
}
