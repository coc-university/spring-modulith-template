package com.codecampn.spring.modulith.template.inventory;

import com.codecampn.spring.modulith.template.inventory.management.InventoryManagement;
import com.codecampn.spring.modulith.template.order.OrderApi;
import com.codecampn.spring.modulith.template.order.management.OrderManagement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class InventoryApi {

    private final InventoryManagement inventoryManagement;
    // this is allowed by default in spring modulith, because it's in the same modul

    private final OrderApi orderApi;
    // this is allowed by default in spring modulith, because it's the api package of another modul

    // private final OrderManagement orderManagement;
    // error: Allowed targets: order, order::order_statistics
}
