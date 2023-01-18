package POO.EjercicioJA;
public class Tema {
  
  // cada tema tendrá un título y un array que contendrá, por secciones, el nº de ejercicios que le corresponde a cada sección del tema
  
  private String titulo;
  private int[] nEjercicios;
   
  // si al constructor se le pasa un entero, se entenderá que tiene una única seccion
  public Tema (String t, int nE) {
    this.titulo = t;
    nEjercicios = new int[1];
    nEjercicios[0] = nE;
  }
  
  // si al costructor se le pasa un array de enteros, se entenderá que tiene varias secciones, y cada valor será el nº de ejercicios correspondiente
  // a cada sección
  public Tema (String t, int [] nE ) {
    this.titulo = t;
    nEjercicios = new int[nE.length];
    for (int i=0; i<nE.length; i++) {
      nEjercicios[i] = nE[i];
    }
  }
  
  public String getTitulo() {
    return this.titulo;
  }
  
  // si tiene sólo una sección, devolverá el número del ejercicio elegido aleatoriamente correspondiente a su única sección
  // el nº de ejercicio devuelto oscilará entre 1 y el número de ejercicios del tema, ambos inclusive
  // si tiene varias secciones, devolverá -1, lo que indicará que tiene varias secciones (no se ha podido elegir el ejercicio)
  public int getEjercicio() {
    int resultado;
    int sección = 0;
    if (this.nEjercicios.length > 0) {
      resultado = -1;
    } else {
      resultado = (int)(Math.random()*this.nEjercicios[0])+1;
    }
    return resultado;
  }
  
  // devolverá el número del ejercicio elegido aleatoriamente correspondiente a la sección pasada como argumento
  // la sección pasada como argumento se entiende que oscila entre 1 y el nº de secciones que tenga el tema, ambos inclusive
  // el nº de ejercicio devuelto oscilará entre 1 y el número de ejercicios del tema, ambos inclusive
  // si el número de sección fuera incorrecto, devuelve -1, lo que indicará que no se ha podido elegir el ejercicio)
  public int getEjercicio(int s) {
    int resultado=-1;
    if ((s <= this.getNumSecciones()) && (s>=1)) {
      resultado = (int)(Math.random()*this.nEjercicios[s-1])+1;
    }
    return resultado;
  }
  
  // devuelve el número de secciones que tiene el tema (valor mínimo que devuelve: 1)
  public int getNumSecciones() {
    return this.nEjercicios.length;
  }
  
  // devuelve aleatoriamente un valor entre 1 y el número de secciones que tenga el tema, ambos incluidos
  public int getSeccion() {
    return (int)(Math.random()*this.nEjercicios.length)+1;
  }
}
