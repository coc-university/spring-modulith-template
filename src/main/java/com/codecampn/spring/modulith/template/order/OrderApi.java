package com.codecampn.spring.modulith.template.order;

import com.codecampn.spring.modulith.template.order.management.OrderManagement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderApi {

    private final OrderManagement orderManagement;
}
