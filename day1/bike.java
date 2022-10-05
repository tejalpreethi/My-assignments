package week1.day1;

public class bike {
	public void applybreak() {
		System.out.println("applied break for bike");
	}
	public void soundhorn() {
		System.out.println("sound horn for bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike k=new bike();
		k.applybreak();
		k.soundhorn();
	    car r=new car();
	    r.applybreak();
	    r.soundhorn();

	}

}
