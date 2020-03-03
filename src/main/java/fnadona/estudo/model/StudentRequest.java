package fnadona.estudo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

/**
 * @author fnadona
 * @version : $<br/> : $
 * @since 02/03/2020 14:48
 */
public class StudentRequest {
    @NotBlank
    @Pattern(regexp = "[a-zA-Z ]+[0-9]+")
    public String name;
    @Positive
    public Integer age;
    @Pattern(regexp = "^[a-zA-Z0-9.]+@[a-zA-Z0-9.]+\\.[a-zA-Z]+")
    public String email;
    public String address;

}
