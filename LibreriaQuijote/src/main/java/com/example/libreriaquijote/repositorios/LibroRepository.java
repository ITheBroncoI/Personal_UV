package com.example.libreriaquijote.repositorios;

import com.example.libreriaquijote.modelos.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
