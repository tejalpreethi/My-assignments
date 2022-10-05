package learnjava;

public class Mobile{
	public void makecall(String mobilemodel, float mobileweight) {
		
		System.out.println("the mobile model is "+mobilemodel);
		System.out.println("the mobile weight is"+mobileweight);
	}
	public void sendmsg(boolean fullcharged, int cost) {
		
		
		System.out.println("fullcharged is "+fullcharged);
		System.out.println("mobile cost is"+cost);
	}

	public static void main(String[] args) {
	
	Mobile h=new Mobile();
	h.makecall("pro6",15);
	h.sendmsg(true, 20000);
			
	System.out.println("this is my mobile");
      
        		 
	}

}
