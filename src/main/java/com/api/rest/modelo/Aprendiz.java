package com.api.rest.modelo;

public class Aprendiz {

   private String ficha;
   private String cedula;
   private String nombre;


   public Aprendiz() {
   }


   public Aprendiz(String ficha, String cedula, String nombre) {
    this.ficha = ficha;
    this.cedula = cedula;
    this.nombre = nombre;
   }


   public String getFicha() {
    return ficha;
   }


   public void setFicha(String ficha) {
    this.ficha = ficha;
   }


   public String getCedula() {
    return cedula;
   }


   public void setCedula(String cedula) {
    this.cedula = cedula;
   }


   public String getNombre() {
    return nombre;
   }


   public void setNombre(String nombre) {
    this.nombre = nombre;
   }

   

    
   


    
}
