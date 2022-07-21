

public class stringparser {

	public static void main(String[] args) {
		
		String s = "abcd";
	try {
		int a = Integer.parseInt(s);
		System.out.println("Result: " + a);
		
	} catch (Exception e) {
		System.out.println("string cannnot be int");
	}
		
	}
	
}