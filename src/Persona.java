public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;

public void setNombre(String nom){
    if (nom == null || nom.equals("")){
        System.out.println("Nombre vacio");
    }
    else {
        this.nombre=nom;
    }
}

public String getNombre(){
    return this.nombre;
}


}
