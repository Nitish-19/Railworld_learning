package basicQuestions;

public class stringbuilder {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer("deepak java");
		StringBuffer sb2 = new StringBuffer("deepak java");
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1.capacity());//16
		System.out.println(sb1.append(" hello"));
		//setcharAt
		
		
		System.out.println(sb1.insert(0,'n'));
		System.out.println(sb1.delete(2,3));
		
		System.out.println(sb1.length());
		
		

	}

}
