package co.edu.sena.javabasico.tipodatos;

public class Caracter {

	public static void main(String[] args) {
		char letra = 'A';
		System.out.println("valor: " + letra);
		System.out.println("tama�o bit: " + Character.SIZE);
		System.out.println("tama�o minimo: " + Character.MIN_VALUE);
		System.out.println("tama�o maximo: " + Character.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Character.BYTES);
		System.out.println("type: " + Character.TYPE);
		
		String texto = "asdfasdfasdf"; // tipo referencia
		
		for (int i = 0; i < 300; i++) {
			Character letrica = (char)i;
			System.out.println(i+" es: "+letrica);
		}
		

	}

}
