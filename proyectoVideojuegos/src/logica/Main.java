package logica;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//creo scanner para pedir datos
        ArrayList <Videojuego> listaVideojuegos = new ArrayList<>();//array para guardar videojuegos
        //variables para almacenar los datos que se vayan usando para crear los videojuegos
        String nombre;
        Year anioLanz;
        int pegi;
        String genero;
        
        
        
        for (int i = 0; i < 4; i++){//for para crear los 4 juegos que se solicitan ingresar por teclado
            System.out.println("Ingrese el nombre del juego: ");
            nombre = scan.nextLine();
            
            System.out.println("Ingrese el año de lanzamiento del juego: ");
            anioLanz = Year.of(scan.nextInt());
            scan.nextLine();
            System.out.println(anioLanz.getValue() + " " + Year.now().plusYears(2).getValue());
            if (anioLanz.getValue() < Year.now().plusYears(2).getValue()){
                System.out.println("Ingrese el PEGI del juego: ");
                pegi = scan.nextInt();
                scan.nextLine();
            
                System.out.println("Ingrese el genero del juego: ");
                genero = scan.nextLine();
                
                Videojuego videojuego = new Videojuego(nombre, pegi, genero, anioLanz); //se crea una instancia
                System.out.println(videojuego);//se muestra el videojuego que se creo
                listaVideojuegos.add(videojuego); //se añade el nuevo videojuego al array
            }
            else{
                System.out.println("Debe escribir un año menor a "+Year.now().plusYears(2).getValue());
                i--;
            }
           
            
        }
        
        System.out.println("\n");
        
        for (Videojuego v : listaVideojuegos){//un for each para mostrar todas las instancias creadas 
            System.out.println(v);
            if(v.esRecienteMayor()){
                System.out.println("es reciente mayor");
            }
            else{
                System.out.println("no es reciente mayor");
       
            }
            
        }
        /*
        listaVideojuegos.get(0).setGeneroPorCodigo(3);//se cambia el gener de call of duty a FPS
        System.out.println("\n");
        System.out.println(listaVideojuegos.get(0));
        
        */
        
    
}}
