/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Rodolhan
 */
public class Carro implements Serializable{
    private Integer id;
    private String model;
    private Integer year;

    public Carro(Integer id, String model, Integer year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", model=" + model + ", year=" + year + '}';
    }

    
    
    
    
    
}
