package training.class1;

import training.class1.animales.Perro;
import training.class1.animales.RazasPequeñas;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");
		System.out.println("Hola Mundo");

		RazasPequeñas razapequeña = new RazasPequeñas();
		razapequeña.setNombre("Luna");
		System.out.println(razapequeña.getNombre());
		
		RazasPequeñas razapequeña2 = razapequeña;
		razapequeña2.setNombre("Kluass");
		System.out.println(razapequeña2.getNombre());
		System.out.println(razapequeña.getNombre());
		RazasPequeñas razapequeña3 = new RazasPequeñas();
		razapequeña3.setNombre("Koler");
		System.out.println(razapequeña3.getNombre());
		System.out.println(razapequeña2.getNombre());
		System.out.println(razapequeña.getNombre());
		
		System.out.println(razapequeña3.isHembra());
		razapequeña3.getMaxSize();
		
		Perro perrito = razapequeña3;
		perrito.setHembra(true);
		System.out.println(razapequeña3.isHembra());
	}

}
