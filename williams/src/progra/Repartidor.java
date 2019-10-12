package progra;

public class Repartidor extends Empleados{
	//atributos
	private String zona;

	//cosntructor
	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	//getters and setters
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + "Repartidor [zona=" + zona + "]";
	}
	
	
	public boolean plusRepartidor() {
		double salarioPlus;
		
		if(super.getEdad() < 25 && zona == "zona 3") {
			salarioPlus = super.getSalario() + super.PLUS;
			super.setSalario(salarioPlus);
			System.out.println("Felicitaciones te has ganado un bono");
			return true;
		}
		return false;
	}
	
	
}
