package POO.EjercicioJA;
/*
 * EleccionAleatoriaEjercicioTema
 * 
 * El programa elije aleatoriamente un ejercicio del libro
 * 
 * @author Juan Antonio
 */
public class EleccionAleatoriaEjercicioTema {
  public static void main (String[] args) {
    final int TOPE=16;
    
    Tema [] LibroDeLuis = new Tema[TOPE];
    
    // cargamos todos los temas
    LibroDeLuis[0] = new Tema("1.Salida de datos por pantalla",10);
    LibroDeLuis[1] = new Tema("2.Variables",8);
    LibroDeLuis[2] = new Tema("3.Lectura de datos desde teclado",12);
    LibroDeLuis[3] = new Tema("4.Sentencia condicional",29);
    LibroDeLuis[4] = new Tema("5.Bucles",69);
    LibroDeLuis[5] = new Tema("6.Números aleatorios",32);
    int [] aux = {21,13};
    LibroDeLuis[6] = new Tema("7.Arrays",aux);
    LibroDeLuis[7] = new Tema("8.Funciones",56);
    int [] aux2 = {7,18,5};
    LibroDeLuis[8] = new Tema("9.Programación orientada a objetos",aux2);
    LibroDeLuis[9] = new Tema("10.Colecciones y diccionarios",23);
    LibroDeLuis[10] = new Tema("11.Ficheros texto y parámetros",6);
    LibroDeLuis[11] = new Tema("12.Aplicaciones en JSP",25);
    LibroDeLuis[12] = new Tema("13.Acceso a BBDD",6);
    LibroDeLuis[13] = new Tema("14.Control de excepciones",3);
    int [] aux3 = {4,2};
    LibroDeLuis[14] = new Tema("15.Sesiones y cookies",aux3);
    LibroDeLuis[15] = new Tema("Apéndice A.Ejercicios de ampliación",2);
    
    
    
    
    
    int tema;                 // almacenará el número de tema elegido, entre 1 y TOPE, ambos inclusive
    int ejercicio;            // almacenaraá el número de ejercicio elegido
    int seccion;              // almacenará el número de seccion elegido (si ha lugar), entre 1 y total de secciones
    
    String tipoEleccion="";
    
    System.out.println("Elección aleatoria de tema y ejercicio:");
    System.out.println("Indique si quiere elegir un ejercicio de un tema concreto o un ejercicio de un rango de temas");
    System.out.print("(concreto/rango> ---> ");
    tipoEleccion=System.console().readLine();
    
    if (tipoEleccion.equals("concreto")) {
      System.out.print("Indique tema: ");
      tema = Integer.parseInt(System.console().readLine());
    } else {
      System.out.print("Indique tema superior del rango de temas: ");
      int extSup = Integer.parseInt(System.console().readLine());
      if (extSup> TOPE) {
        System.out.println("El máximo de temas es "+TOPE+". Extremo superior fijado a "+TOPE+".");
        extSup=TOPE;
      }
      if (extSup<1) {
        System.out.println("El mínimo de temas es 1. Extremo superior fijado a 1.");
        extSup=1;
      }
      tema = (int)(Math.random()*extSup)+1;
    }
    
    ejercicio = LibroDeLuis[tema-1].getEjercicio();
    if (ejercicio==-1) {
      System.out.println("Hay varias secciones de ejercicios para este tema");
      System.out.println("Indique si quiere elegir un ejercicio cualquiera de cualquier sección\no de una sección concreta (cualquiera/seccion): ");
      String subseleccion = System.console().readLine();
      if (subseleccion.equals("seccion")) {
        System.out.print("Indique sección [1-"+LibroDeLuis[tema].getNumSecciones()+"]: ");
        seccion = Integer.parseInt(System.console().readLine());
      } else {
        seccion = LibroDeLuis[tema].getSeccion();
      }
            
      ejercicio = LibroDeLuis[tema].getEjercicio(seccion);
      System.out.println("Tema: " + LibroDeLuis[tema-1].getTitulo());
      System.out.println("Subsección: "+ seccion);
      System.out.println("Ejercicio: "+ ejercicio);
    } else {
      System.out.println("Tema: "+ LibroDeLuis[tema-1].getTitulo());
      System.out.println("Ejercicio: "+ejercicio);
    }
  } 
}
