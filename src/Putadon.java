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
 *  - La "i" del bucle for tenia que ser inicializada a 1.
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
		for(int i=1;i<frase.length();i++){
			if(letra==frase.charAt(i-1)){
				numRepeticiones=numRepeticiones++;
				System.out.println("Letra "+letra+" encontrada en la posicion "+i);
			}
		}
	}
}
