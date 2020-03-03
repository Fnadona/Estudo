package fnadona.estudo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import fnadona.estudo.model.StudentRequest;

@RestController
public class AlunoResource {

    @GetMapping(path = "/alunos")
    public String getnome() {
        return "blablabla";
    }

    @PostMapping(path = "/alunos")
    public String createStudent(
            @RequestBody @Valid StudentRequest request
    ) {
        System.out.println(request.address);
        return "OK";
    }
}
