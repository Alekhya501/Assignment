package classwork;

public class oops {
	
	int r;
	String n;
	void add(int rollno,String name) {
		 r=rollno;
		 n=name;
		 System.out.println("rollNo is:"+r);
			System.out.println("name is:"+n);
			
	}
	
	public static void main(String args[]) {
		 oops obj=new oops();
		 obj.add(23,"Alekhya" );
		 //obj.display();
	}
}
