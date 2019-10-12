package progra;

public class Comercial extends Empleados{
	
	//atributos
	private double comision;

	public Comercial(String nombre, int edad, double salario,double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	//getters and setters
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + "Comercial [comision=" + comision + "]";
	}
	
	
	public boolean plusComercial() {
		
		double salarioPlus;
		
		if(super.getEdad() > 30 && comision > 200) {
			salarioPlus = super.getSalario() + super.PLUS;
			super.setSalario(salarioPlus);
			System.out.println("Felicitaciones te has ganado un bono");
			return true;
		}
		return false;
	}
	

}
