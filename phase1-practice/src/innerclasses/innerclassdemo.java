package innerclasses;

public class innerclassdemo {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		innerclassdemo obj=new innerclassdemo();
		innerclassdemo.Inner in=obj.new Inner();  
		in.hello();  
	}
}




