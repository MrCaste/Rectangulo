import java.util.Scanner;

public class Main {
	
	Scanner sc;
	Rectangulo rectangulo;

	public static void main(String[] args) {
		
		Main app = new Main();
		app.sc = new Scanner(System.in);
		
		app.inicializarDatos();
		app.Cuadrado();
		app.Area();
		app.Perimetro();
		app.Girar90();
	}
	//metodo que inicializa los datos del rectangulo pidiendo unos nuevos valores por teclado si asi se desea o dejando los de por defectos
	public void inicializarDatos() 
	{
		int base;
		int altura;
		rectangulo = new Rectangulo();
		System.out.println("El rectangulo posee los valores por defecto de: Base = 2 y Altura = 1/nDesea cambiarlos?");
		
		System.out.println("Opcion 1: Si.");
		System.out.println("Opcion 2: No.");
		
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduce los nuevos valores de Base y Altura respectivamente: ");
			base = sc.nextInt();
			altura = sc.nextInt();
			rectangulo.setBase(base);
			rectangulo.setAltura(altura);
			break;
			
		case 2: System.out.println("No.");
			System.out.println("Se usaran los valores por defecto");
			break;

		default:
			System.err.println("Opcion erronea");
			break;
		}
	}
	//metodo que llama a la funcion cuadrado de la clase rectangulo y imprime si es o no
	public void Cuadrado() 
	{
		if(rectangulo.IsCuadrado()) 
		
			System.out.println("Es un cuadrado");
		else
			
			System.out.println("No es un cuadrado");
	}
	//metodo que llama a la funcion del area de la clase rectangulo y lo enseña por pantalla
	public void Area()
	{
		if(rectangulo.IsCuadrado())
			System.out.println("El area del cuadrado es = "+rectangulo.area());
		else
			System.out.println("El area del rectangulo es = "+rectangulo.area());
	}
	//metodo que llama a la funcion perimetro de la clase rectangulo y lo enseña por pantalla
	public void Perimetro()
	{
		if(rectangulo.IsCuadrado())
			System.out.println("El perimetro del cuadrado es = "+rectangulo.perimetro());
		else
			System.out.println("El perimetro del rectangulo es = "+rectangulo.perimetro());
	}
	//metodo que llama a la funcion girar90 de la clase rectangulo y mientra los valores intercambiados por pantalla
	public void Girar90()
	{
		rectangulo.gira90();
	}
}
