import java.io.*;

class unicode {

	
	public static void main(String[] args)
	{

		
		try {

			
			String str = "Geeksforgeeks";

			
			int result_1 = str.codePointAt(0);

			
			int result_2 = str.codePointAt(-4);

		
			System.out.println("Original String : " + str);

		
			System.out.println("Character(unicode point) = "
							+ result_1);

		
			System.out.println("Character(unicode point) = "
							+ result_2);
		}

	
		catch (IndexOutOfBoundsException e) {

			
			System.out.println("Exception thrown :" + e);
		}
	}
}
