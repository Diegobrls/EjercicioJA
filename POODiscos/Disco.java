package POODiscos;

public class Disco {
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos

    public Disco(String string, String string2, String string3, String string4, int i) {
        this.codigo = string;
        this.autor = string2;
        this.titulo = string3;
        this.genero = string4;
        this.duracion = i;
    }

    public String getCodigo() {
    return codigo;
    }

    public void setCodigo(String codigo) {
    this.codigo = codigo;
    }

    public String getAutor() {
    return autor;
    }

    public void setAutor(String autor) {
    this.autor = autor;
    }

    public String getGenero() {
    return genero;
    }

    public void setGenero(String genero) {
    this.genero = genero;
    }

    public String getTitulo() {
    return titulo;
    }

    public void setTitulo(String titulo) {
    this.titulo = titulo;
    }

    public int getDuracion() {
    return duracion;
    }

    public void setDuracion(int duracion) {
    this.duracion = duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
    
    return cadena;
    }  
    public static void main(String[] args) {
        Disco Chenoa = new Disco("LIBRE","Chenoa","Chenoa","Pop español",49);
            System.out.println(Chenoa);
        Disco Melendi = new Disco("LIBRE","Melendi","Sin noticias de Holanda","Pop español",58);
            System.out.println(Melendi);
        Disco Fito = new Disco("LIBRE","Fito y los Fitipaldis","Antes de que cuente diez","Pop español",60);
            System.out.println(Fito);
        Disco Tupac = new Disco("LIBRE","Tupac Shakur","All Eyez on Me","Hip-Hop",139);
            System.out.println(Tupac);
        Disco Skrillex = new Disco("LIBRE","Skrillex","Jack Ü","Dubstep",35);
            System.out.println(Skrillex);
        Disco Bejo = new Disco("LIBRE","Bejo","Chachichacho","Rap español",50);
            System.out.println(Bejo);
        Disco Billie = new Disco("LIBRE","Billie Eilish","Happier Than Ever","Electropop",56);
            System.out.println(Billie);
        Disco Marife = new Disco("LIBRE","Marifé de Triana","La copla, Siempre","Copla",75);
            System.out.println(Marife);
    }
}
