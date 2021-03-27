import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  // Import the Scanner class
public class Main
{
    public static void distancia(String x1,String x2,String y1,String y2){
		
		
		try{
			
				Double fxa = Double.parseDouble(x1);
				Double fxb = Double.parseDouble(x2);
				Double fya = Double.parseDouble(y1);
				Double fyb = Double.parseDouble(y2);
				
				Double dist = Math.pow(fxb-fxa,2);
				//Float dist = Float.parseFloat(Math.sqrt(Math.pow(fxb-fxa,2)+Math.pow(fyb-fya,2)));
				
				System.out.printf("RESULTADO DA DISTACIA: " + dist);
		}catch(Exception e) {
        System.out.printf("No calculo da distancia");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
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
		
	}
}