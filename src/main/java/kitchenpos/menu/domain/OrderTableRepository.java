package kitchenpos.menu.domain;

import kitchenpos.order.delivery.domain.OrderTable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderTableRepository {
    OrderTable save(OrderTable orderTable);

    Optional<OrderTable> findById(UUID id);

    List<OrderTable> findAll();
}

