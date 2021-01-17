import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    
    public static void ehomaior(String entrada){
	
	
	List<String> v1 = new ArrayList<>();
	String v2="";
	int y = 0;
	int i;
	for(i=0;i<entrada.length();i++){
	    if(entrada.charAt(i) == ' '){
	        
	        v1.add(v2);
	        v2 = "";
	        System.out.println("VOLTA "+i+ " ACHOU O ESPAÇO e o valor de v1 na posicao "+y+" é "+v1.get(y));
	        y++;
	        }else
	            {
	            if((entrada.charAt(i) >= '0') && (entrada.charAt(i) <= '9')){
	                v2 = v2+String.valueOf(entrada.charAt(i));
	                System.out.println("VOLTA "+i+ "valor de v2: "+v2   );
	                }    
	            }
	 

	}
	int n = v1.size();
	for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, v1.get(i));
    }   
	 
	//O ULTIMO NUMERO NÃO TA ENTRANDO DESCOBRIR O PORQUER
	

}


    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ESCREVA 3 NUMEROS NA MESMA LINHA: \n");
		String entrada = s.nextLine();
		ehomaior(entrada);
		
		
	}
}