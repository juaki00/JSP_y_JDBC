package manager;

import java.sql.Connection;
import java.util.Set;

/*Buscar (todos y por id)
o Crear
o Actualizar
o Borrar*/
public interface ActoresManager<T> {
    public Set<T> findCitiesByCountryCode(Connection connection, String countryCode);

}
