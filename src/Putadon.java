import java.util.Scanner;

/*
 * CSI Florida
 * Reto Putadon
 * 
 * El siguiente código busca una letra dentro de una frase
 * y devuelve dónde se ha encontrado y ctas veces
 * 
 * Hay dos errores:
 * 
 *  - Corregido charAt(-1) que indica la existencia de la letra en la frase.
 * 
 */
public class Putadon {
	
	public static void main(String[] args) {
		//Variables inicialización
		String frase="";
		int numPos=0;
		int numRepeticiones=0;
		char letra=0;
		
		//Pedimos datos
		frase = pideFrase("Introduce tu frase");
		letra = pideLetra("Introduce la letra a buscar");
		buscaLetras(frase,letra);
		 
		
		//-------
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Introduce tu frase");
		//frase = sc.nextLine();
		
		//System.out.println("Introduce la letra a buscar");
		//letra = sc.nextLine().charAt(0); //charAt(0) devuelve la primera letra
		
		//Buscamos las letras
		//for(int i=0;i<frase.length();i++){
			//if(letra==frase.charAt(i-1)){
				//numRepeticiones=numRepeticiones;
				//System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			//}
		//}
		//System.out.println("Total repeticiones "+numRepeticiones);
	
	}
	public static String pideFrase(String msj){
		Scanner sc=new Scanner(System.in);
		System.out.println(msj);
		String frase = sc.nextLine();
		return frase;
	}
	public static char pideLetra(String msj){
		Scanner sc=new Scanner(System.in);
		System.out.println(msj);
		char letra = sc.nextLine().charAt(0);
		return letra;
	}
	public static void buscaLetras(String frase, char letra){
		int numRepeticiones=0;
		//System.out.println(frase.length());
		for(int i=0;i<frase.length();i++){
			System.out.println(letra);
			if(letra==frase.charAt(i-1)){
				numRepeticiones=numRepeticiones++;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
	}
}
