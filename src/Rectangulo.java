
public class Rectangulo {
	
	private int base, altura;

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
		
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = Math.abs(base);
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = Math.abs(altura);
		
	}
	//contructor para poner valores por defectos
	public Rectangulo() {
		
		base = 2;
		altura = 1;
		
	}
	//metodo para saber si es un cuadrado
	public boolean IsCuadrado() 
	{
	
	boolean isRectangulo = false;
	
		if(base == altura) 
		{
			isRectangulo = true;
		}
		
	return isRectangulo;
	}
	//metodo para sacar el area del rectangulo
	public int area() 
	{
		int area;
		
		area = base * altura;
		
		return area;
	}
	//metodo para sacar el perimetro del rectangulo
	public int perimetro() 
	{
		int perimetro;
		
		perimetro = (base*2) + (altura*2);
		
		return perimetro;
	}
	//metodo que gira 90 grados los valores del rectangulo
	public void gira90() 
	{
		int auxiliar;
		
		auxiliar = base;
		base = altura;
		altura = auxiliar;
		
		System.out.println("El nuevo rectangulo es: Base = "+base+", altura = "+altura);
	}
}
