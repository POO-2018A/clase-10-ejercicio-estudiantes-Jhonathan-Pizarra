
package estudiante;

public class Estudiante {

    //1)Atributos
    private String nombre;
    private int cedula;
    private String [] materias;

    //2) Construcotr
    public Estudiante(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    
    //3) Setter y Getter(s)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    
    //......

    public String[] getMaterias() { //2) Pero al momento de obtener, no me da, porque un arreglo no puede ser convertido a un String
                                    //No puede imprimir "Quimica", "Fisica"... como Arreglo... porque le llegan como strings? ¿O como es?
        return materias;
    }

    public void setMaterias(String[] materias) { // 1) Este si me recibe un arreglo de materias (De strings)
        this.materias = materias;
    }
      
    
}
