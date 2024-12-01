/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sueldoTrabajador.Model;

/**
 *
 * @author LAB_P03
 */
public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasExtra;
    private double sueldoTotal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void setSueldoTotal(double sueldoTotal) {
        this.sueldoTotal = sueldoTotal;
    }
    
    public void calcularSueldo(){
        double tarifaHoraExtra = salarioBase / 160;
        this.sueldoTotal=salarioBase + (tarifaHoraExtra * 8);
    }
    
}
