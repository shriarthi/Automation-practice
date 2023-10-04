package week3.day1;

public class StringMethods {

	public static void main(String[] args) {
		
		String Name ="Test leaf";
		char[] charArray = Name.toCharArray();
		int count=0;
		
		for (int i = 0; i <=charArray.length-1; i++) 
		{
			if(charArray[i]=='e')
			{
				count++;
			}
			System.out.print(count);
		}
		
		

	}

}
