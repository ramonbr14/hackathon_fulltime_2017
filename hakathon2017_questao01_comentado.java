import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    
    public static void separaNumero(String entrada){
	
	    try {
  

	List<String> v1 = new ArrayList<>();
	List<Integer> numeros = new ArrayList<Integer>();
	String v2="";
	int y = 0;
	int i;
	int n = entrada.length();
	int m = 0;
	//System.out.printf("VALOR DE n é: %d \n", n);
	//System.out.printf("o tamanho da entrada.length é: %d \n", n);
	for(i=0;i<entrada.length();i++){
	    //System.out.printf("valor de y %d \n", y);
	    //System.out.println("VOLTA "+i+ "valor de v1: ");
	    //System.out.printf("VALOR DE i é: %d \n", i);
	        
	        
	    if(entrada.charAt(i) == ' '|| i == n){
	        //System.out.printf("o v2 QUE VAI ENTRAR EM v1: %s \n", v2);
	        //v1.add(v2);
	        numeros.add(Integer.parseInt(v2));
	        v2 = "";
	        //System.out.printf("valor de v1 posicao %d = %s\n", y, v1.get(y));
	        //System.out.println("VOLTA "+i+ " ACHOU O ESPAÇO e o valor de v1 na posicao "+y+" é "+v1.get(y));
	        y++;
	    }else
	       {
	        if((entrada.charAt(i) >= '0') && (entrada.charAt(i) <= '9')){
	           v2 = v2+String.valueOf(entrada.charAt(i));
	           //System.out.println("\n VOLTA do for " + i + " valor de v2: "+v2 +"\n"   );
	                }    
	            }
	}
	//v1.add(v2); // o ultimo numero só entra nessa instrucao
	numeros.add(Integer.parseInt(v2));
	n = v1.size();
	m = numeros.size();
	/*System.out.printf("LISTA EM STRING %d \n", n);
	for (i=0; i<n; i++) {
      System.out.printf("Posição %d = %s \n\n", i, v1.get(i));
    }
    System.out.printf("LISTA EM INTEIROS %d \n", m);
	for (i=0; i<m; i++) {
      System.out.printf("\n Posição %d = %d \n\n", i, numeros.get(i));
    }*/
    
    maiornumero(numeros,m);
    
    
    //System.out.println("FIM DA INSTRUCAO \n");
    
	    }
    catch (Exception e) {
        System.out.printf("ERRO NA EXECUÇÃO, ENTRADA FORA DO LIMITE");
        
    }
}   
    
    public static void maiornumero(List<Integer> numeros,int m){
        int i = 0;
        int maior = numeros.get(i);
        int atual = 0;
        
        do{
            if(maior<numeros.get(i)){
                maior = numeros.get(i);
            }
            i++;
        }while(i<m);
        System.out.printf(" %d eh o maior\n", maior);
    }

    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ESCREVA 3 NUMEROS NA MESMA LINHA: \n");
		String entrada = s.nextLine();
		separaNumero(entrada);
		
		System.out.println("PROGRAMA ENCERRADO \n");
		
	}
}