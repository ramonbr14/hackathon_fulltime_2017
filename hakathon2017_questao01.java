import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    
    public static void ehomaior(String entrada){
	
	int tam = entrada.length();
	List<String> v1;
	String v2 = "";
	//List<String> numeros = ["0","1","2","3","4","5","6","7","8","9"]
    for(int i = 0; i< tam; i++){
		System.out.println(" DENTRO DO FOR "+ i);
		
		v2 = v2+entrada[i];	
		if(entrada[i] ==" "){
				v1.add(v2);
		}
	System.out.println("ENTROUUUUUUU!!!!!!!! "+ tam);
    }
}


    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ESCREVA 3 NUMEROS NA MESMA LINHA: \n");
		String entrada = s.nextLine();
		ehomaior(entrada);
		
		
	}
}