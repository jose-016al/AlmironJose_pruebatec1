package org.example.persistencia;

import org.example.logica.Empleado;
import org.example.persistencia.exceptions.NonexistentEntityException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    EmpleadoJpaController projJPA = new EmpleadoJpaController();

    public void crearEmpleado(Empleado proj) {
        projJPA.create(proj);
    }

    public void borrarEmpleado(Long id) {
        try {
            projJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Empleado> traerEmpleados () {
        return projJPA.findEmpleadoEntities();
    }

/*    public List<Empleado> traerEmpleadosPorTipo(String tipo) {
        List<Empleado> all = projJPA.findEmpleadoEntities();
        List<Empleado> search = new ArrayList<>();
        for (Empleado proyecto : all)
            if (proyecto.getTipo().equalsIgnoreCase(tipo)) {
                search.add(proyecto);
            }
        return search;
    }*/

    public void modificarEmpleado (Empleado proj) {
        try {
            projJPA.edit(proj);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}