package com.example.libreriaquijote.servicios.impl;

import com.example.libreriaquijote.dto.LibroDTO;
import com.example.libreriaquijote.modelos.Libro;
import com.example.libreriaquijote.repositorios.LibroRepository;
import com.example.libreriaquijote.servicios.LibroService;

import java.util.List;
import java.util.stream.Collectors;

public class LibroServiceImpl implements LibroService {
    private final LibroRepository libroRepository;

    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public List<LibroDTO> findAllLibros() {
        List<Libro> libros = libroRepository.findAll();
        return libros.stream().map((libro) -> mapToLibroDto(libro)).collect(Collectors.toList());
    }

    private LibroDTO mapToLibroDto(Libro libro) {
        LibroDTO libroDTO = LibroDTO.builder()
                .id(libro.getId())
                .id_sucursal(libro.getId_sucursal())
                .id_genero(libro.getId_genero())
                .id_editorial(libro.getId_editorial())
                .nombre(libro.getNombre())
                .fecha_publicacion(libro.getFecha_publicacion())
                .precio(libro.getPrecio())
                .createOn(libro.getCreateOn())
                .updateOn(libro.getUpdateOn())
                .build();
        return libroDTO;
    }
}
