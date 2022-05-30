package br.com.lucasDev.catalogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucasDev.catalogo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
