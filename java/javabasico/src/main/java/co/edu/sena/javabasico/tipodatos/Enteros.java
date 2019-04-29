package co.edu.sena.javabasico.tipodatos;

public class Enteros {

	public static void main(String[] args) {
		// estos son los enteros en java
		
		final String valor = "valor: ";

		// primer tipo byte
		byte numeroEnteroMasPequenio = 4;
		System.out.println(valor + numeroEnteroMasPequenio);
		System.out.println("tama�o bit: " + Byte.SIZE);
		System.out.println("tama�o minimo: " + Byte.MIN_VALUE);
		System.out.println("tama�o maximo: " + Byte.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Byte.BYTES);
		System.out.println("type: " + Byte.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato short
		short numeroEnteroCorto = 45;
		System.out.println(valor + numeroEnteroCorto);
		System.out.println("tama�o bit: " + Short.SIZE);
		System.out.println("tama�o minimo: " + Short.MIN_VALUE);
		System.out.println("tama�o maximo: " + Short.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Short.BYTES);
		System.out.println("type: " + Short.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato short
		int enteroNormal = 100;
		System.out.println(valor + enteroNormal);
		System.out.println("tama�o bit: " + Integer.SIZE);
		System.out.println("tama�o minimo: " + Integer.MIN_VALUE);
		System.out.println("tama�o maximo: " + Integer.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Integer.BYTES);
		System.out.println("type: " + Integer.TYPE);
		System.out.println("---------------------------------------------");
		// tipo de dato long
		long enteroLargo = 10057867687L;// literal
		System.out.println(valor + enteroLargo);
		System.out.println("tama�o bit: " + Long.SIZE);
		System.out.println("tama�o minimo: " + Long.MIN_VALUE);
		System.out.println("tama�o maximo: " + Long.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Long.BYTES);
		System.out.println("type: " + Long.TYPE);
		System.out.println("---------------------------------------------");

	}

}
