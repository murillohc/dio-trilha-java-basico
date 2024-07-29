package com.primeiro_projeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {
    @Test
    void validarIdade(){
        Pessoa jessica = new Pessoa(20, "Jessica");
        Assertions.assertEquals(20, jessica.getIdade());
    }





}

