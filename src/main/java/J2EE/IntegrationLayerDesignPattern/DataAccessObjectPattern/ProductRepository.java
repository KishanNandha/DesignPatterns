package J2EE.IntegrationLayerDesignPattern.DataAccessObjectPattern;

import org.springframework.data.jpa.repository.JpaRepository;
// This is DAO or data access layer
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom queries can be defined here if needed
}