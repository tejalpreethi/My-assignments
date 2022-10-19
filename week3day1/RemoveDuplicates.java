package week3day1;

public class RemoveDuplicates {
	

	public static void main(String[] args) {
	 String s="We learn java basics as part of java sessions in java week1";
		int count =0;
		String[] txt = s.split("");
		for(int i=0;i<txt.length;i++) {
			for(int j=0;j<txt.length;j++) {
				if(txt[i]==txt[j]) {
					count++;
		}
			
			}
		}if (count>1) {
			int i = 0;
			s=s.replace(txt[i], "");
			
		}count=0;
		System.out.println(s);
	    	
	    	 
	     
	}}	


