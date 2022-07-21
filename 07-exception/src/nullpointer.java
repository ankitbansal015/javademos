import java.util.Scanner;
public class nullpointer {
	
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println("String Length: " + s.length());
		} catch (Exception e) {
			System.out.println("string is null");
			
		}
	}

}