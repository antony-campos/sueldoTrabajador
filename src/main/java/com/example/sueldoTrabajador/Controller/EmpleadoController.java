/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.sueldoTrabajador.Controller;

import com.example.sueldoTrabajador.Model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB_P03
 */
@Controller
public class EmpleadoController {

    @GetMapping("/calcularSueldo")
    public String mostrarFormulario(Empleado empleado) {
        return "formulario_empleado";
    }

    @PostMapping("/calcularSueldo")
    public String guardarFormulario(@ModelAttribute Empleado empleado, Model model) {
        if (empleado.getSalarioBase() < 0 || empleado.getHorasExtra() < 0) {
            model.addAttribute("empleado", "El salario base y las horas extra no pueden ser negativos");
        }
        return "resultado_empleado";
    }
}
