package interfaces;

public class APPmain {

	public static void main(String[] args) {
		
		Policy r = new Worker();//interface kaa object nhi bnta ref ban shkta he
		{
			r.checkpolicy();
		//	r.checkAdharcard();//error ayaga
			
			Adharcard r2 = new Worker();//interface kaa object nhi bnta ref ban shkta he
			{
			
				r2.checkAdharcard();
				
				//r2.checkpolicy();//error ayaga
				
		}
		

	}}}
