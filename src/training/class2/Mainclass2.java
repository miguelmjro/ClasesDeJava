package training.class2;

public class Mainclass2 {

	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		
		System.out.println(i++);
		
		System.out.println(++i);
		
		i = i + 1;

		System.out.println(i);
		
		i += 120;

		System.out.println(i);
		boolean b150 = i > 150;
		boolean b100 = i > 100;
		if(b150) {
			System.out.println("es mayor");
		}else if(b100){
			System.out.println("No es mayor a 150 pero si que 100");
		}

	}

}
