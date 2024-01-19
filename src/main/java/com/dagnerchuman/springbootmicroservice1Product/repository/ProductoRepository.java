package com.dagnerchuman.springbootmicroservice1Product.repository;

import com.dagnerchuman.springbootmicroservice1Product.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNegocioId(Long negocioId);

    List<Producto> findByCategoriaId(Long categoriaId);
}
