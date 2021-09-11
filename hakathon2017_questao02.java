//https://www.online-java.com/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    public static void separaNumero(String entrada){
	//Codigo para Extrair os numeros da entrada
	try {	List<Double> numeros = new ArrayList<Double>();
	    String v2="";
	    int i;
	    int m = entrada.length();
	
	    for(i=0;i<entrada.length();i++){
	        if(entrada.charAt(i) == ' '|| i == m){
	            numeros.add(Double.parseDouble(v2));
	            System.out.println("Valor de v2: " + v2);
	            v2 = "";
	        }else{
	            if((entrada.charAt(i) >= '0') && (entrada.charAt(i) <= '9'||(entrada.charAt(i) == "."))){
	                v2 = v2+String.valueOf(entrada.charAt(i));
	                System.out.println("Valor de v2: " + v2);
	                }    
	            }
	    }
	
	numeros.forEach(System.out::println);
    
    }catch (Exception e) {
        System.out.printf("ERRO NA EXECUÇÃO, ENTRADA FORA DO LIMITE");
    }
}    
    
    
    
    
    public static void distancia(String x1,String x2,String y1,String y2){
		
		
		try{
			
				Double fxa = Double.parseDouble(x1);
				Double fxb = Double.parseDouble(x2);
				Double fya = Double.parseDouble(y1);
				Double fyb = Double.parseDouble(y2);
				
				Double dist = Math.pow(fxb-fxa,2);
				//Float dist = Float.parseFloat(Math.sqrt(Math.pow(fxb-fxa,2)+Math.pow(fyb-fya,2)));
				
				System.out.printf("RESULTADO DA DISTANCIA: " + dist);
		}catch(Exception e) {
                System.out.printf("Erro no calculo da distancia");
		}
		
	}
	
	public static void main(String[] args) {
		
		//Entrada separada
		/*Scanner s = new Scanner(System.in);
		System.out.println("DISTANCIA ENTRE PONTOS \n");
		System.out.println("Forneca a coordenada do ponto xa:  \n");
		String xa = s.nextLine();
		System.out.println("Forneca a coordenada do ponto xb:  \n");
		String xb = s.nextLine();
		System.out.println("Forneca a coordenada do ponto ya:  \n");
		String ya = s.nextLine();
		System.out.println("Forneca a coordenada do ponto yb:  \n");
		String yb = s.nextLine();
		distancia(xa,xb,ya,yb);
		System.out.println("\n\n PROGRAMA ENCERRADO \n");
		*/
		
		//Entrada em Duas linhas
		
		Scanner s = new Scanner(System.in);
		System.out.println("ESCREVA as coordenadas: \n");
		String entrada = s.nextLine();
		System.out.println(entrada);
		separaNumero(entrada);
		
		System.out.println("PROGRAMA ENCERRADO \n");
	}
}