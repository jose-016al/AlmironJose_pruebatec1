package org.example.logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String position;
    private double salary;
    private Date startDate;

    public Empleado(long id) {}

    public Empleado(String name, String position, double salary, Date startDate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }
}
