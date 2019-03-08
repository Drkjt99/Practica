import java.util.*;

public class GestorContactos {
	
	private static Scanner scan = new Scanner(System.in);
	private static List<Contacto> contactos = new ArrayList<>();

	public static void main(String[] args) {
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
					crearContacto();
					break;
				case 2:
					//eliminarContacto();
					break;
				case 3:
					//mostrarTodos();
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

	private static void crearContacto() {
		Contacto contacto = new Contacto();

		System.out.println("Ingrese el nombre");
		String nombre = scan.nextLine();
		contacto.setNombre(nombre);

		System.out.println("Ingrese el apellido");
		String apellido = scan.nextLine();
		contacto.setApellido(apellido);

		System.out.println("Ingrese la fecha de nacimiento");
		String fechaNacimiento = scan.nextLine();
		contacto.setFechaNacimiento(fechaNacimiento);

		System.out.println("Ingrese el telefono");
		String telefono = scan.nextLine();
		contacto.setTelefono(telefono);

		contactos.add(contacto);
		System.out.println("Contacto ingresado exitosamente");
	}

	private static void eliminarContacto() {}

	private static void mostrarTodos() {}

	private static void mostrarFiltrados() {}

}