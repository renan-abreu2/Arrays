
public class positivo_negativo {
	public static void main(String[] args) {
		
		   int[] numeros = {-11,62,-38,44,53,-17,88,79};
		   int[]positivos= new int[8];
		   int[]negativos = new int[8];
		   int n = 0;
		   int g = 0;

	        for(int i=0; i<numeros.length; i++){
	        	if(numeros[i] >=0) {
	        		
	        		
					positivos[n] = numeros[i];
					n++;
					
	        	}else {
	        		
	        		negativos[g] = numeros[i];
	        		g++;
	        	}
	        }
	        
	        //----------------------------------------------------------------
	        	System.out.println("NUMEROS POSITIVOS");
	        	for(int k=0; k<numeros.length; k++) {
	        		 
	        		 System.out.println(positivos[k]);
	     }
	        //--------------------------------------------------------------------
	        	System.out.println("---------------------");
	        	System.out.println("NUMEROS NEGATIVOS");
	        	
	        	for(int t=0; t<numeros.length; t++) {
	        		 
	        		 System.out.println(negativos[t]);
	        
	        	
	        	
	      
	            	
	               
	        	}
	}
}