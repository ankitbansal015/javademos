package single;

public class singleinheritancetest {

	public static void main(String[] args) {
		singleinheritancetest si = new singleinheritancetest();
//		si.m1();
		System.out.println(si.getClass());
		System.out.println(si.hashCode());
		System.out.println(si.toString());
		singleinheritancetest si2 = new singleinheritancetest();
		System.out.println(si2.toString());
	}
	
}