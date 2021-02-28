import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    public static void distancia(String x1,String x2,String y1,String y2){
		
		
		try{
			
				Float f1 = Float.parseFloat(x1);
				Float f2 = Float.parseFloat(x2);
				Float f3 = Float.parseFloat(y1);
				Float f4 = Float.parseFloat(y2);
				System.out.printf("TUDO CERTO ATE AQUI");
		}catch(Exception e) {
        System.out.printf("ERRO NA CONVERSÃO STRING PRA FLOAT");
		}
		
	}
	
	/*try {	List<Integer> numeros = new ArrayList<Integer>();
	    String v2="";
	    int i;
	    int m = entrada.length();
	
	    for(i=0;i<entrada.length();i++){
	        if(entrada.charAt(i) == ' '|| i == m){
	            numeros.add(Integer.parseInt(v2));
	            v2 = "";
	        }else{
	            if((entrada.charAt(i) >= '0') && (entrada.charAt(i) <= '9')){
	                v2 = v2+String.valueOf(entrada.charAt(i));
	                }    
	            }
	    }
	
	numeros.add(Integer.parseInt(v2));// ultimo numero da sequencia da entrada é adicionado aqui
	m = numeros.size();// tamanho da lista é gerado aqui7 
	
	maiornumero(numeros,m);// chamada da função do maior numero
    
    
    }catch (Exception e) {
        System.out.printf("ERRO NA EXECUÇÃO, ENTRADA FORA DO LIMITE");
    }*/
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("DISTANCIA ENTRE PONTOS \n");
		System.out.println("Forneca a coordenada do ponto x1:  \n");
		String x1 = s.nextLine();
		System.out.println("Forneca a coordenada do ponto x2:  \n");
		String x2 = s.nextLine();
		System.out.println("Forneca a coordenada do ponto y1:  \n");
		String y1 = s.nextLine();
		System.out.println("Forneca a coordenada do ponto y2:  \n");
		String y2 = s.nextLine();
		distancia(x1,x2,y1,y2);
		System.out.println("\n\n PROGRAMA ENCERRADO \n");
		
	}
}