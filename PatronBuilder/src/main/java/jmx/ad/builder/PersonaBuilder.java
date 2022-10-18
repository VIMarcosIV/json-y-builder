package jmx.ad.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PersonaBuilder {

    String nombre;
    String apellido;
    String telefono;
    String email;
}
