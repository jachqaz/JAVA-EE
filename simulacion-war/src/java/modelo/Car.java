/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

import java.io.Serializable;

/**
 *
 * @author Rodolhan
 */
public class Car implements Serializable {

    public Integer id;
    public String model;
    public Integer year;
    private String Brand;
    public String manufacturer;
    public String color;
    public Integer price;
    public Date fecha;

    private boolean soldState;

    public Car() {
    }

//    public Car(String model, Integer year, String manufacturer, String color) {
//        this.model = model;
//        this.year = year;
//        this.manufacturer = manufacturer;
//        this.color = color;
//    }
//
//    public Car(Integer id, String model, Integer year, String manufacturer, String color, Integer price, Date fecha) {
//        this.id = id;
//        this.model = model;
//        this.year = year;
//        this.manufacturer = manufacturer;
//        this.color = color;
//        this.price = price;
//        this.fecha = fecha;
//    }

//    Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice, boolean randomSoldState) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public Car(Integer id,String Brand, Integer year,  String color, Integer price, boolean soldState) {
        this.id = id;
        this.year = year;
        this.Brand = Brand;
        this.color = color;
        this.price = price;
        this.soldState = soldState;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (!(obj instanceof Car)) {
//            return false;
//        }
//
//        Car compare = (Car) obj;
//        return compare.id.equals(this.id);
//    }
//    @Override
//    public int hashCode() {
//        int hash = 1;
//
//        return hash * 31 + id.hashCode();
//    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public boolean isSoldState() {
        return soldState;
    }

    public void setSoldState(boolean soldState) {
        this.soldState = soldState;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", model=" + model + ", year=" + year + ", Brand=" + Brand + ", color=" + color + ", price=" + price + ", fecha=" + fecha + ", soldState=" + soldState + '}';
    }
    
    
}
