/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import modelo.Distribucion;
import modelo.Car;
import modelo.Carro;
import sessionBean.DBinomailService;
import modelo.Car;
import modelo.Carro;
import sessionBean.CarService;

/**
 *
 * @author Rodolhan
 */
@Named("form")
@SessionScoped
public class FormularioElemental implements Serializable {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Inject
    private CarService carservice;
    private Car car;
    private List<Car> cars;
    private List<Carro> mylistaCarros;
    private List<String> selectedOptions;
    private List<Car> selectedCars;
    private String console;
    private List<String> diasSeleccionados;
    private List<String> options;
    private String option;
    private String city;
    private Map<String, String> cities;

    @PostConstruct
    public void construct() {
        init();
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public List<String> getDiasSeleccionados() {
        return diasSeleccionados;
    }

    public void setDiasSeleccionados(List<String> diasSeleccionados) {
        this.diasSeleccionados = diasSeleccionados;
    }

    private void init() {
        options = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            options.add("Option " + i);
        }
        cities = new LinkedHashMap<>();
        cities.put("Cali", "Cali");
        cities.put("Palmira", "Palmira");
        cars = carservice.createCars(10);
        

    }

    public CarService getService() {
        return carservice;
    }

    public void setService(CarService service) {
        this.carservice = service;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Carro> getMylistaCarros() {
        return mylistaCarros;
    }

    public void setMylistaCarros(List<Carro> mylistaCarros) {
        this.mylistaCarros = mylistaCarros;
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public List<Car> getSelectedCars() {
        return selectedCars;
    }

    public void setSelectedCars(List<Car> selectedCars) {
        this.selectedCars = selectedCars;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Map<String, String> getCities() {
        return cities;
    }

    public void setCities(Map<String, String> cities) {
        this.cities = cities;
    }

    

}
