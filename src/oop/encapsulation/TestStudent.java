package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("Zaytona");
		st1.setStID(101);
		st1.setStDOB("12-10-1990");
		System.out.println(st1.getStName()+ " "+st1.getStID()+" "+st1.getStDOB());

		Student st2 = new Student();
		st2.setStName("Osman");
		st2.setStID(102);
		st2.setStDOB("11-11-1980");
		System.out.println(st2.getStName()+ " "+st2.getStID()+" "+st2.getStDOB());
		
		Student st3 = new Student("mahmud", 103, "12-31-1985");
		System.out.println(st3.getStName()+ " "+st3.getStID()+" "+st3.getStDOB());
	}

}
