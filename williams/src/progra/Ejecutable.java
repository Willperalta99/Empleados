package progra;

public class Ejecutable {

	public static void main(String[] args) {
		
		//Objetos creados a partir de las clases Comercial y Repartidor
        Comercial c1 = new Comercial("Williams", 31, 4000, 500);
        Repartidor r1 = new Repartidor("Cen", 24, 3000, "zona 3");
 
        //Convocamos el metodo plus
        c1.plusComercial();
        r1.plusRepartidor();
 
        //Imprimos los objetos
        System.out.println(c1);
        System.out.println(r1);

	}

}
