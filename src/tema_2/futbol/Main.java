package tema_2.futbol;

public class Main {

	public static void main(String[] args) {

		Jugadores Roberto = new Jugadores();
		Equipos programador = new Equipos();

		Roberto.setNombre("Roberto");
		programador.setLocalidad("Talavera");
		programador.setNombre("CFPROGR");

		Roberto.setEquipos(programador);

		System.out.println(Roberto.getNombre());
		System.out.println(programador.getNombre());
		System.out.println(Roberto.getEquipos().getLocalidad());
	}
}
