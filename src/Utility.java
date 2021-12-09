
public class Utility {

	/*Metodo che ritorna il maggiore tra tre numeri senza usare if o switch*/
	public static int findMax(int a,int b,int c ) {
		
		int max=a;
		
		boolean bool=(max<b) && ((max=b)>0);
		
		bool=(max<c)&&((max=c)>0);
		
		return max;
	}
	
	
}
