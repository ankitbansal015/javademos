package multi;

public class multithreading extends Thread {

	public static void main(String[] args) {
		multithreading mt = new multithreading();
		mt.start();
		
		for (int j=1; j<=200;j++) {
			System.out.println("j: " + j + "\t");
		}
	}
	
	@Override
	public void run() {
		for (int i=1; i<=200; i++) {
			System.out.println("i: " + i + "\t");
		}
	}

}
//public class multithreading extends Thread {
//	
//	public static void main(String[] args) {
//		multithreading mt = new multithreading();
//		mt.start();
//		
//		for (int j=1; j<=200; j++) {
//			System.out.print("j: " + j + "\t");
//		}
//	}
//
//	@Override
//	public void run() {
//		for (int i=1; i<=200; i++) {
//			System.out.print("i: " + i + "\t");
//		}
//	}
//	
//}