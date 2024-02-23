package br.com.edd.gestao_vagas.modules.candidate.candidate;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;



@Data
public class CandidateEntity {

    private UUID id;
    private String name;
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    private String username;
    @Email(message = "O campo [Email] deve conter um e-mail válido")
    private String email;
    @Length(min = 8, max = 35, message = "A senha deve conter entre 8 caracters e 35 caracteres")
    private String password;
    private String description;
    private String curriculum;

}
