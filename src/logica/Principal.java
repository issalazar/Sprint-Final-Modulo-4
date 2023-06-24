package logica;

import java.util.Scanner;
import java.util.ArrayList;
import dominio.*;

public class Principal {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Contenedor contenedor = new Contenedor();
	menu(sc, contenedor);
	}


public static void menu(Scanner sc, Contenedor contenedor) {
	boolean condicion2 =true;
	boolean condicion = true;
	

	while(condicion2) {
		System.out.println("Bienvenido al sistema de capacitaciones Bug Busters "+"\n" + "");
		System.out.println("1)Agregar nuevo Cliente");
		System.out.println("2)Agregar nuevo Profesional");
		System.out.println("3)Agregar nuevo Administrativo");
		System.out.println("4)Agregar nueva Capacitación");
		System.out.println("5)Eliminar Usuario");
		System.out.println("6)Mostrar lista de Usuarios");
		System.out.println("7)Mostrar Usuarior por tipo");
		System.out.println("8)Mostrar Capacitaciones");
		System.out.println("9)Salir");
		String respuesta = "";
		respuesta = sc.nextLine();
		switch(respuesta) {
		case "1":
			condicion = true;
			while(condicion){
				System.out.println("Ingrese el rut del usuario (Use el formato xx.xxx.xxx-x).");
				String rut = sc.nextLine();
				if(verificarRut(rut)) {
					condicion = false;
				} else{
					condicion = true;
					break;
				}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese una fecha de nacimiento (Use el formato DD/MM/AAAA).");
					String fecha = sc.nextLine();
					if(verificarFecha(fecha)) {
						condicion = false;
					} else{
						condicion = true;
						break;
						
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese un nombre de usuario.");
					String nombre = sc.nextLine();
					if(verificar10a50(nombre)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese los nombres del cliente.");
					String nombres = sc.nextLine();
					if(verificar5a30(nombres)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese los apellidos del cliente.");
					String apellidos = sc.nextLine();
					if(verificar5a30(apellidos)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese el teléfono del cliente.");
					String telefono = sc.nextLine();
					if(verificarObligatorio(telefono)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese AFP del cliente.");
					String afp = sc.nextLine();
					if(verificar4a30(afp)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese sistema de salud del cliente.(Seleccione 1 para Fonasa, y 2 para Isapre)");
					String salud = sc.nextLine();
					if(verificarSalud(salud)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese la dirección del cliente.");
					String direccion = sc.nextLine();
					if(verificarMax70(direccion)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				
				condicion = true;
				while(condicion){
					System.out.println("Ingrese la comuna del cliente.");
					String comuna = sc.nextLine();
					if(verificarMax50(comuna)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				
				condicion = true;
				while(condicion){
					System.out.println("Ingrese la edad del cliente.");
					String edad = sc.nextLine();
					if(verificarEdad(edad)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
					int sistemaSalud = Integer.parseInt(salud);
					int edad2 = Integer.parseInt(edad);
					agregarCliente(contenedor, rut, fecha, nombre, nombres, apellidos, telefono ,afp, sistemaSalud, direccion, comuna, edad2);
					System.out.println("El cliente fue creado exitosamente." + "\n");


				}
				}
				}
				}
				}
				}
				}
				}
				}
				}
			}				
			break;
		case "2":
			condicion = true;
			while(condicion){
				System.out.println("Ingrese el rut del usuario (Use el formato xx.xxx.xxx-x).");
				String rut = sc.nextLine();
				if(verificarRut(rut)) {
					condicion = false;
				} else{
					condicion = true;
					break;
				}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese una fecha de nacimiento (Use el formato DD/MM/AAAA).");
					String fecha = sc.nextLine();
					if(verificarFecha(fecha)) {
						condicion = false;
					} else{
						condicion = true;
						break;
						
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese un nombre de usuario.");
					String nombre = sc.nextLine();
					if(verificar10a50(nombre)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese el título del profesional.");
					String titulo = sc.nextLine();
					if(verificar10a50(titulo)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese la fecha de ingreso del profesional (Use el formato DD/MM/AAAA).");
					String fechaIngreso = sc.nextLine();
					if(verificarFecha(fechaIngreso)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
					agregarProfesional(contenedor, rut, fecha, nombre,titulo, fechaIngreso);
					System.out.println("El profesional fue creado exitosamente." + "\n");
					condicion = false;
					break;

				}
				}
				}
				}
			}
				
				
				break;
		case "3":
			condicion = true;
			while(condicion){
				System.out.println("Ingrese el rut del usuario (Use el formato xx.xxx.xxx-x).");
				String rut = sc.nextLine();
				if(verificarRut(rut)) {
					condicion = false;
				} else{
					condicion = true;
					break;
				}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese una fecha de nacimiento (Use el formato DD/MM/AAAA).");
					String fecha = sc.nextLine();
					if(verificarFecha(fecha)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese un nombre de usuario.");
					String nombre = sc.nextLine();
					if(verificar10a50(nombre)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese el área del administrativo.");
					String area = sc.nextLine();
					if(verificar5a20(area)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
				
				condicion = true;
				while(condicion){
					System.out.println("Ingrese la experiencia previa del administrativo.");
					String experiencia = sc.nextLine();
					if(verificarMax100(experiencia)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
					agregarAdministrativo(contenedor, rut, fecha, nombre, area, experiencia);
					System.out.println("El administrativo fue creado exitosamente." + "\n");

				}
				}
				}
				}
			}
			
			break;
		case "4":
			condicion = true;
			while(condicion){
				System.out.println("Ingrese el identificador de la capacitación.");
				String identificador = sc.nextLine();
				if(verificarObligatorio(identificador)) {
					condicion = false;
				} else{
					condicion = true;
					break;
				}
				condicion = true;
				while(condicion){
					System.out.println("Ingrese el rut del cliente.");
					String rut = sc.nextLine();
					if(verificarRut(rut)) {
						condicion = false;
					} else{
						condicion = true;
						break;
					}
					condicion = true;
					while(condicion){
						System.out.println("Ingrese el día de la capacitación.");
						String dia = sc.nextLine();
						if(verificarDia(dia)) {
							condicion = false;
						} else{
							condicion = true;
							break;
						}
						condicion = true;
						while(condicion){
							System.out.println("Ingrese la hora de la capacitación.");
							String hora = sc.nextLine();
							if(verificarHora(hora)) {
								condicion = false;
							} else{
								condicion = true;
								break;
							}
							condicion = true;
							while(condicion){
								System.out.println("Ingrese el lugar de la capacitación.");
								String lugar = sc.nextLine();
								if(verificar10a50(lugar)) {
									condicion = false;
								} else{
									condicion = true;
									break;
								}
								condicion = true;
								while(condicion){
									System.out.println("Ingrese la duración de la capacitación en minutos.");
									String duracion = sc.nextLine();
									if(verificarMax70(duracion)) {
										condicion = false;
									} else {
										condicion = true;
										break;
									}
									condicion = true;
									while(condicion){
										System.out.println("Ingrese la cantidad de asistentes de la capacitación.");
										int asistentes = sc.nextInt();
										if(verificarMenorDe1000(asistentes)) {
											condicion = false;
										} else{
											condicion = true;
											break;
										}
										agregarCapacitacion(contenedor, identificador, rut, dia, hora, lugar, duracion, asistentes);
										condicion = false;
										System.out.println("La capacitación fue creada exitosamente." + "\n");
										break;

					}
				}
			}
						}
					}
				}
			}
		
			break;
		case "5":
			System.out.println("Ingrese el rut del usuario (Use el formato xx.xxx.xxx-x).");
			String eliminarRut= sc.nextLine();
			
			boolean rutEncontrado = eliminarUsuario(contenedor, eliminarRut);
			if (rutEncontrado== true) {
				System.out.println("Usuario eliminado correctamente");
			}
			else {
				System.out.println("Usuario no encontrado");
			}

			break;
		case "6":
			System.out.println("Lista de usuarios:");
			System.out.println(mostrarListaUsuario(contenedor));
			break;

		case "7":
			System.out.println("¿Qué lista quiere desplegar?");
			System.out.println("1. Lista clientes");
			System.out.println("2. Lista profesionales");
			System.out.println("3. Lista administrativos");
			String tipoLista=sc.nextLine();
			System.out.println(mostrarListaPorTipo(contenedor,tipoLista));
			
			break;
		case "8":
            // Listar capacitaciones
            System.out.println("Lista de capacitaciones:"+"\n");
            
            System.out.println(listarCapacitaciones(contenedor));
			break;
		case "9":
			System.out.println("Que tenga buen día.");
			condicion2=false;
			break;
		default:
			System.out.println("Ingrese una opción válida");
			break;
			
			}
		}
	
	}




public static void agregarCliente(Contenedor contenedor, String rut, String fecha, String nombre,
		String nombres, String apellido, String telefono ,String afp, int sistemaDeSalud, String direccion, String comuna, int edad) {
		Cliente cliente = new Cliente(nombre, fecha, rut, nombres, apellido,
				telefono, afp, sistemaDeSalud, direccion, comuna, edad);
		contenedor.getLusuarios().add(cliente);
	}

public static void agregarProfesional(Contenedor contenedor, String rut, String fecha, String nombre,
		String titulo, String fechaDeIngreso) {
		Profesional profesional = new Profesional(nombre, fecha, rut, titulo, fechaDeIngreso);
		contenedor.getLusuarios().add(profesional);
	}

public static void agregarAdministrativo(Contenedor contenedor, String rut, String fecha, String nombre,
		String area, String experienciaPrevia) {
		Administrativo administrativo = new Administrativo(nombre, fecha, rut, area, experienciaPrevia);
		contenedor.getLusuarios().add(administrativo);
	}

public static void agregarCapacitacion(Contenedor contenedor, String identificador, String cliente, String dia,
		String hora, String lugar, String duracion, int asistentes) {
		Capacitacion capacitacion = new Capacitacion(identificador, cliente, dia, hora, lugar, duracion, asistentes);
		contenedor.getLcapacitaciones().add(capacitacion);
}

public static boolean verificarRut(String rut) {
	String patronrut = "^\\d{1,2}\\.\\d{3}\\.\\d{3}-\\d{1}$";
	if(rut.matches(patronrut) == false) {
		System.out.println("El rut no tiene un formato válido." + "\n");
		return false;
	}
	String comprobar = rut.replaceAll("[^0-9]","");
	comprobar = comprobar.substring(0, comprobar.length() - 1);
	int comprobar2 = Integer.parseInt(comprobar);
	if(comprobar2 < 99999999) {
		return true;
	}
	else {
		System.out.println("Ingrese un rut menor a 99.999.999." + "\n");
		return false;
		}
	}

public static boolean verificarFecha(String fecha) {
	String patronfecha = "^\\d{2}/\\d{2}/\\d{4}$";
	if(fecha.matches(patronfecha)) {
		return true;
	} else {
		System.out.println("La fecha no tiene un formato válido." + "\n");
		return false;
		}
	}

public static boolean verificarHora(String hora) {
	String patronhora = "^(?:[01]\\d|2[0-3]):[0-5]\\d$";
	if(hora.matches(patronhora)) {
		return true;
	} else {
		System.out.println("La hora no tiene un formato válido." + "\n");
		return false;
		}
	}

public static boolean verificarObligatorio(String texto) {
	if(texto.isEmpty()) {
		System.out.println("Este campo es obligatorio." + "\n");
		return false;
	} else {
		return true;
		}
}

public static boolean verificarEdad(String edad) {
    try {
        int edad2 = Integer.parseInt(edad);
    	if(edad2 > 0 && edad2 < 150) {
    		return true;
    	} else {
    		System.out.println("La edad debe ser menor a 150 años." + "\n");
    		return false;
    	}
    } catch (NumberFormatException e) {
		System.out.println("La edad debe ser un número válido" + "\n");

        return false;
    }
}

public static boolean verificarDia(String dia) {
	ArrayList<String> semana = new ArrayList<>();
    semana.add("lunes");
    semana.add("martes");
    semana.add("miercoles");
    semana.add("jueves");
    semana.add("viernes");
    semana.add("sabado");
    semana.add("domingo");
    dia = dia.replaceAll("[áÁ]", "a");
    dia = dia.replaceAll("[éÉ]", "e");
    dia = dia.toLowerCase();
    

	if(semana.contains(dia)) {
		return true;
	} else {
		System.out.println("El ingreso debe corresponder a un día de la semana." + "\n");
		return false;
		}
}


public static boolean verificarSalud(String opcion) {
	if(opcion.equals("1") || opcion.equals("2")) {
		return true;
	} else {
		System.out.println("El sistema de salud debe ser una de las dos opciones." + "\n");
		return false;
		}
	}

public static boolean verificar10a50(String texto) {
	if(texto.length() >= 10 && texto.length() <= 50) {
		return true;
	} else {
		System.out.println("El texto debe tener entre 10 y 50 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificar5a20(String texto) {
	if(texto.length() >= 5 && texto.length() <= 20) {
		return true;
	} else {
		System.out.println("El texto debe tener entre 5 y 20 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificar5a30(String texto) {
	if(texto.length() >= 5 && texto.length() <= 30) {
		return true;
	} else {
		System.out.println("El texto debe tener entre 5 y 30 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificar4a30(String texto) {
	if(texto.length() >= 4 && texto.length() <= 30) {
		return true;
	} else {
		System.out.println("El texto debe tener entre 4 y 30 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificarMax70(String texto) {
	if(texto.length() <= 70) {
		return true;
	} else {
		System.out.println("El texto debe tener menos de 70 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificarMax50(String texto) {
	if(texto.length() <= 50) {
		return true;
	} else {
		System.out.println("El texto debe tener menos de 50 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificarMax100(String texto) {
	if(texto.length() <= 100) {
		return true;
	} else {
		System.out.println("El texto debe tener menos de 50 caracteres." + "\n");
		return false;
		}
	}

public static boolean verificarMenorDe1000(int asistentes) {
	if(asistentes <= 1000) {
		return true;
	} else {
		System.out.println("El número debe ser menor o igual a 1000." + "\n");
		return false;
		}
	}

public static boolean eliminarUsuario(Contenedor contenedor, String rut) {
	boolean condicion = false;
	for(int i=0; i<contenedor.getLusuarios().size();i++) {
		if(rut.equals(contenedor.getLusuarios().get(i).getRut())) {
			contenedor.getLusuarios().remove(i);
			condicion = true;
		}
		else {
			condicion = false;
		}	
	}
	return condicion;
}

public static String mostrarListaUsuario(Contenedor contenedor) {
	String data= "";
	for(int i=0; i<contenedor.getLusuarios().size();i++) {
		
		data+=contenedor.getLusuarios().get(i).analizarUsuario()+"\n";
		
	}
	return data;
}

public static String mostrarListaPorTipo(Contenedor contenedor,String tipoLista) {
	String data= "";
	for(int i=0; i<contenedor.getLusuarios().size();i++) {
		
		if(tipoLista.equals("1")) {
			if(contenedor.getLusuarios().get(i) instanceof Cliente) {
				data+=( contenedor.getLusuarios().get(i)).analizarUsuario()+"\n";
			}
		}
		else if(tipoLista.equals("2")) {
			if(contenedor.getLusuarios().get(i) instanceof Profesional) {
				data+=contenedor.getLusuarios().get(i).analizarUsuario()+"\n";
			}
		}
		else if(tipoLista.equals("3")) {
			if(contenedor.getLusuarios().get(i) instanceof Administrativo) {
				data+=contenedor.getLusuarios().get(i).analizarUsuario()+"\n";
			}
		}
		else {
			data="Ingrese un valor";
		}
	}
	return data;
}

public static Cliente buscarCliente(Contenedor contenedor, String rutCliente) {
	Cliente cliente = null;
	for(int i = 0; i < contenedor.getLusuarios().size();i++) {
		if(contenedor.getLusuarios().get(i).getRut().equals(rutCliente)) {
			cliente = (Cliente) contenedor.getLusuarios().get(i);
			return cliente;
		}
		
	}
	return cliente;
	
}


public static String listarCapacitaciones(Contenedor contenedor) {
    StringBuilder sb = new StringBuilder();
    for (Capacitacion capacitacion : contenedor.getLcapacitaciones()) {
        sb.append("Capacitación ID: ").append(capacitacion.getIdentificador()).append("\n");
        Cliente cliente = buscarCliente(contenedor, capacitacion.getCliente());
        try {
            sb.append("Cliente: ").append(cliente.analizarUsuario()).append("\n");
        } catch (NullPointerException e) {
            sb.append("RUT ").append(capacitacion.getCliente()).append("\n");
        }
        sb.append("Descripción: ").append(capacitacion.mostrarDetalle()).append("\n");
        sb.append("Cupo: ").append(capacitacion.getAsistentes()).append("\n");
        sb.append("------------------------------------------\n");
    }
    return sb.toString();
}


}