import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    
    public static void separaNumero(String entrada){
	//Codigo para Extrair os numeros da entrada
	try {	List<Integer> numeros = new ArrayList<Integer>();
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
    }
}   
    
    public static void maiornumero(List<Integer> numeros,int m){
        //Função para descobrir quem é o maior numero
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