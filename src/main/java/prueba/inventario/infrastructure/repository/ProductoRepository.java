package prueba.inventario.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prueba.inventario.domain.Producto;

/**
 * Repositorio que maneja la persistencia de Producto
 * a través de JPA/Hibernate.
 */
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos de consulta personalizados si los necesitas
}
