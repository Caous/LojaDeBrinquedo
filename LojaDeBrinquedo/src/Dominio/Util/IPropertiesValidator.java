package Dominio.Util;

import java.util.Date;


public interface IPropertiesValidator<T> {    
    void validObject() throws PropertiesValidator;
    boolean validString(String value)throws PropertiesValidator;
    boolean validDate(Date value)throws PropertiesValidator;
    boolean validInt(int value)throws PropertiesValidator;
    boolean validDouble(double value)throws PropertiesValidator;
}
