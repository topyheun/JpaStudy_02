package JpaStudy_02.repository.order.simplequery;

import JpaStudy_02.domain.Address;
import JpaStudy_02.domain.OrderStatus;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class OrderSimpleQueryDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;
    
    public OrderSimpleQueryDto(Long orderId, String name, LocalDateTime orderDate,
                               OrderStatus orderStatus, Address address) {
        this.orderId = orderId;
        this.name = name;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;
    }
}
