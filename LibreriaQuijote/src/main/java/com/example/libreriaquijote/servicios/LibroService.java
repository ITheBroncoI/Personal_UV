package com.example.libreriaquijote.servicios;

import com.example.libreriaquijote.dto.LibroDTO;

import java.util.List;

public interface LibroService {
    List<LibroDTO> findAllLibros();
}
