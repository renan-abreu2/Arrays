public class primos {

    public static void main(String[] args) {

        int[] numeros = {11,62,38,44,53,17,88,79};

        for(int i=0; i<numeros.length; i++){
        	
            if(isNumeroPrimo(numeros[i])){
            
            	
                System.out.print("\nO "
                		+ "N�mero " + numeros[i] + " - � PRIMO    "+"E PERTENCE A POSI��O - "+i);
                
            } else {
            	
               continue;
            }
        }
    }

    public static boolean isNumeroPrimo(int numero){

        boolean isNumeroPrimo = false;
        int contador=0;

        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                contador++;
            }
        }

        if(contador == 2){
            isNumeroPrimo = true;
        }

        return isNumeroPrimo;
    }
}
	


