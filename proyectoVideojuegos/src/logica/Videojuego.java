package logica;

import java.time.Year;

/*que se hace: se utiliza esta clase para crear instancias "videojuego"
con los atributos declarados, todos con sus getters y setters corres-
pondientes. */

public class Videojuego {//atributos
    private String nombre;
    private int pegi;
    private String genero; 
    private Year anioLanzamiento; 
    
    public Videojuego (){ //constructor vacio
    }
    
    //constructctor completo
    public Videojuego (String nombre, int pegi, String genero, Year anioLanzamiento){
        this.nombre = nombre;
        this.pegi = pegi;
        this.genero = genero;
        if (anioLanzamiento.getValue() < 2000){
            this.anioLanzamiento = Year.of(2000);
        }
        else{
            this.anioLanzamiento = anioLanzamiento;
        }
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Year getAñoLanzamiento() {
        return anioLanzamiento;
    }
    /*el setter de añolanzamiento tiene la condicion de que si el año
    ingresado es menor a 2000, entonces el año se quedara en 2000.
    si por el otro lado el año es mayor a 2027, el año no se actualiza,
    o en otras palabras no permite la actualizacion
    */
    public void setAñoLanzamiento(Year anioLanzamiento) {
        if (anioLanzamiento.getValue() < 2000){
            this.anioLanzamiento = Year.of(2000);
        }
        else{
            if (!(anioLanzamiento.getValue() > Year.now().plusYears(2).getValue())){
                this.anioLanzamiento = anioLanzamiento;
            }
        }
          
    }
    
    public void setGeneroPorCodigo(int codigo){
        if(codigo == 1 || codigo == 2 || codigo == 3){ //verificacion para que si se ingresa un numero invalido no se recorran 
                                                       //todos los if
            if (codigo == 1) {
                this.genero = "Rol";
            }
            else{
                if(codigo == 2){
                    this.genero = "Carreras";
                }
                else{
                    this.genero = "FPS";
                }
            }
        }
    }

    @Override
    public String toString() {
        return nombre + ", pegi: " + pegi + ", genero: " + genero + ", Año de lanzamiento: " + anioLanzamiento;
    }
    
}
    
    

