import java.util.*;

public class GestorContactos {
	
	private static Scanner scan = new Scanner(System.in);
	private static List<Contacto> contactos = new ArrayList<>();

	public static void main(String[] args) {
		//Contactos dummy
		contactos.add(new Contacto("Sarina", "Bolaños", "51130327"));
		contactos.add(new Contacto("Esvin", "González", "51233905"));
		contactos.add(new Contacto("Lenix", "González", "47331010"));
		contactos.add(new Contacto("Josué", "Lima", "43890987"));
		contactos.add(new Contacto("Lester", "Segura", "51190327"));

		int opcion;
		do {
			System.out.println("+-------- Gestor de contactos --------+");
			System.out.println("|                                     |");
			System.out.println("| Seleccione una opción:              |");
			System.out.println("| 1) Crear contacto                   |");
			System.out.println("| 2) Eliminar contacto                |");
			System.out.println("| 3) Mostrar todos los contactos      |");
			System.out.println("| 4) Filtrar por nombre               |");
			System.out.println("| 0) Salir                            |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			opcion = scan.nextInt();
			switch (opcion) {
				case 1:
					//crearContacto();
					break;
				case 2:
					//eliminarContacto();
					break;
				case 3:
					mostrarTodos();
					break;
				case 4:
					//mostrarFiltrados();
					break;
				case 0:
					System.out.println("\n\nBye ;)");
					return;
				default:
					System.err.println("Opción inválida\n\n\n");
			}
		} while(opcion != 0);
	}

	private static void crearContacto() {}

	private static void eliminarContacto() {}

	private static void mostrarTodos() {
		contactos.forEach(System.out::println);
	}

	private static void mostrarFiltrados() {}

}