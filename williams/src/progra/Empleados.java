package progra;

public class Empleados {
	//constante
	public final int PLUS = 300;
	
	//atributos
	private String nombre;
	private int edad;
	private double salario;
	
	//constructor
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	

}
