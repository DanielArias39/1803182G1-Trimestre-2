package co.edu.sena.javabasico.tipodatos;

public class Reales {

	public static void main(String[] args) {
		// Reales, coma flontate
		
		
		// float
		float realCorto = 4.78F;
		System.out.println("valor: " + realCorto);
		System.out.println("tama�o bit: " + Float.SIZE);
		System.out.println("tama�o minimo: " + Float.MIN_VALUE);
		System.out.println("tama�o maximo: " + Float.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Float.BYTES);
		System.out.println("type: " + Float.TYPE);
		
		System.out.println("---------------------------------------------");
		
		
		
		double realLargo= 3434534534534.7;
		System.out.println("valor: " + realLargo);
		System.out.println("tama�o bit: " + Double.SIZE);
		System.out.println("tama�o minimo: " + Double.MIN_VALUE);
		System.out.println("tama�o maximo: " + Double.MAX_VALUE);
		System.out.println("tama�o en bytes: " + Double.BYTES);
		System.out.println("type: " + Double.TYPE);

	}

}
