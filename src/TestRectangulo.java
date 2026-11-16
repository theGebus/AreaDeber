
public class TestRectangulo {

	public static void main(String[] args) {
		
		
		Rectangulo perimetro = new Rectangulo();
		
		perimetro.altura1 = 2;
		perimetro.altura2 = 2;
		perimetro.base1 = 4;
		perimetro.base2 = 4;
		
		Double resultadoParametro;
		resultadoParametro = perimetro.perimetro();
		System.out.println("El resultado del perimetro es: "+ resultadoParametro);
	}

}
