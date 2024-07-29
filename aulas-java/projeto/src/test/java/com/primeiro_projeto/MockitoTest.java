package com.primeiro_projeto;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {

    @Mock
    private List<String> palavras;

    @Test
    void adicionarItemNaLista(){
        Mockito.when(palavras.get(0)).thenReturn("Loja");

        Assertions.assertEquals("Loja", palavras.get(0));

    }

}
