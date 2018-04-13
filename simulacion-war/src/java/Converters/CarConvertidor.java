/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converters;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import modelo.Car;

/**
 *
 * @author Rodolhan
 */
@FacesConverter(value = "CarConverter")
public class CarConvertidor implements Converter {

    private static Map<String, Car> cache = new HashMap<String, Car>();

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {

        if (value == null || value.length() == 0) {
            return null;
        }
        Car numero = cache.get(value);
//            return cache.get(value);
        if (numero == null) {
            FacesMessage message = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Unknown value", "The Car is unknown!");
            throw new ConverterException(message);

        }
        return numero;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {

        if (object == null) {
            return null;
        }
        if (object instanceof Car) {
            Car o = (Car) object;
            String id = Integer.toString(o.getId());
            cache.put(id, o);
            return id;
        } else {
            throw new IllegalArgumentException("objeto " + object + " es de tipo "
                    + object.getClass().getName() + "; tipo esperado: "
                    + Color.class.getName());
        }
    }

}
