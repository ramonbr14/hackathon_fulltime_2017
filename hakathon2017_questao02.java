//https://www.online-java.com/

import java.util.ArrayList;
import java.util.Arrays;  
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    public static List<String> separaNumero(String entrada){
    List<String> listnumeros = new ArrayList<String>();
	//Codigo para Extrair os numeros da entrada
	try {	
	    
	    
	    String a = "";
	    
	    for(int i=0;i<entrada.length();i++){
	       
	        if(entrada.charAt(i)!= ' '){
	            a = a+String.valueOf(entrada.charAt(i));
	            // System.out.println("separaNumero volta:  "+ i);
	        }else{
	           // System.out.println("separaNumero valor de a:  "+ a);
	            listnumeros.add(a);
	            a = "";
	    }
	    listnumeros.add(a);
	   }
	   
    }catch (Exception e) {
        System.out.printf("ERRO NA EXECUÇÃO, ENTRADA FORA DO LIMITE");
    }
    System.out.println("Fim do separaNumero");
    //listnumeros.forEach(System.out::println);
    return listnumeros;
    }



    //public static void distancia(String x1,String x2,String y1,String y2){
	public static void distancia(List<String> entradaNumeros){	
		
		try{
			
				Double fxa = Double.parseDouble(entradaNumeros.get(0));
				Double fxb = Double.parseDouble(entradaNumeros.get(1));
				Double fya = Double.parseDouble(entradaNumeros.get(2));
				Double fyb = Double.parseDouble(entradaNumeros.get(3));
				
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
		List<String> entradaNumeros = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("ESCREVA as coordenadas: \n");
		String entrada = s.nextLine();
		entradaNumeros = separaNumero(entrada);
		entrada = s.nextLine();
		entradaNumeros.addAll(separaNumero(entrada));
		//entradaNumeros.forEach(System.out::println);
		distancia(entradaNumeros);
		System.out.println("PROGRAMA ENCERRADO \n");
	}
}