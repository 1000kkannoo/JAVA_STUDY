package my.study.testcode.spring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Transactional
    @Query("SELECT o FROM Order o WHERE o.registeredDateTime >= :startDateTime " +
            "AND o.registeredDateTime < :endDateTime " +
            "AND o.orderStatus = :orderStatus" )
    List<Order> findOrdersBy(@Param("startDateTime") LocalDateTime startDateTime,@Param("endDateTime") LocalDateTime endDateTime, @Param("orderStatus") OrderStatus orderStatus);
}
