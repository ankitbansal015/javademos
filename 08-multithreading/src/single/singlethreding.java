package single;

public class singlethreding {
	
	public static void main(String[] args) {
		singlethreding st = new singlethreding();
		st.printNumbers();
		
		for (int j=1; j<=200; j++) {
			System.out.print("j: " + j + "\t");
		}
	}

	void printNumbers() {
		for (int i=1; i<=200; i++) {
			System.out.print("i: " + i + "\t");
		}
	}
	
}