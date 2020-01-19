package com.exercie15string.app;

import java.util.Arrays;
import com.exercie15string.model.Tuneador;

public class StringApp {
	public static void main(String... args) {
		String cadena = "Agradecemos tu interés en nuestros contenidos, sin embargo; este material cuenta con derechos de propiedad intelectual, queda expresamente prohibido la publicación, retransmisión, distribución, venta, edición y cualquier otro uso de los contenidos (incluyendo, pero no limi- tado a, contenido, texto, fotografías, audios, videos y logotipos) sin previa autorización por escrito de EL UNIVERSAL, Compañía Periodística Nacional S. A. de C. V. Si deseas hacer uso de ellos te invitamos a visitar nuestra tienda en línea: https://tienda.agenciaeluniversal.mx , o bien, puedes comunicarte con nosotros para cualquier duda, comentario o sugerencia al teléfono: 57091313 Ext. 2406 y 2425 de lunes a viernes en horarios de oficina. Si deseas suscribete en nuestra versión impresa o digital, puedes comunicarte al teléfono 5709 1313 Ext. 1564 de lunes a viernes en horarios de oficina.";
		String cadena2 = "   Aajsdslkjhkjhkhkhj20394809()   ";
		
		String cadena3 = "asdñsndfksndfknslf hsfhsfhsoidhfois ioshdf";
		
		/*System.out.println(cadena.charAt(5));
		System.out.println(cadena.codePointAt(5));
		System.out.println(cadena.codePointBefore(5));
		System.out.println(cadena.codePointCount(3,4));
		System.out.println(cadena.compareTo(cadena2));
		System.out.println(cadena.equals(cadena2));
		//System.out.println(cadena.concat(cadena2));
		System.out.println(cadena.contains("Agradecemos"));
		System.out.println(cadena2.endsWith("09()"));
		System.out.println(cadena2.trim() + cadena2.trim());
		System.out.println(cadena.indexOf("t"));
		System.out.println(cadena.lastIndexOf("t"));
		System.out.println(Arrays.toString(cadena.split("s")));
		System.out.println(cadena.replace("a", ""));
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());*/
		
		String[] myArr = {cadena, cadena2, cadena3};
		
		double[] myDob = {5.5, 6.6, 7.8};
		
		System.out.println(Arrays.toString(Tuneador.tunea(myArr)));
		
		System.out.println(Tuneador.obtenerMedia(myDob));
	}
}
