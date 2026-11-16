
public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado area = new Cuadrado();
		
		area.lado1 = 4;
		area.lado2 = 4;
		
		double resultadoArea = area.calcularArea();
		System.out.println("El resultado del area es: "+ resultadoArea);
		
		//==========================Perimetro=====================================
		
		Cuadrado perimetro = new Cuadrado();
		
		perimetro.lado = 3;
		
		double resultadoPerimetro = perimetro.calcularPerimetro();
		System.out.println("El perimetro es: "+ resultadoPerimetro);
		
		
	}

}
