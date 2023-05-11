package my.study.testcode.spring.domain.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    /*
    select *
    from product
    where selling_type in ('SELLING','HOLD');
     */
    List<Product> findAllBySellingStatusIn(List<ProductSellingStatus> sellingTypes);

    List<Product> findAllByProductNumberIn(List<String> productNumbers);

    @Query(value = "SELECT product_number FROM product p ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String findLatestProduct();
}
