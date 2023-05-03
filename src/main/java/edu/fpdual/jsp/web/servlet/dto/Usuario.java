package edu.fpdual.jsp.web.servlet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.ResultSet;
import java.sql.SQLException;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Usuario {
    private String nick;
    private String password;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Usuario(ResultSet result) throws SQLException {
        setNick(result.getString("nick"));
        setNombre(result.getString("nombre"));
        setPassword(result.getString("passwd"));
        setApellido(result.getString("apellido"));
        setTelefono(result.getString("telefono"));
        setEmail(result.getString("email"));
    }
}
