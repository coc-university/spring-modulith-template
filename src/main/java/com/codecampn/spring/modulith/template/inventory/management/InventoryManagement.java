package com.codecampn.spring.modulith.template.inventory.management;

import com.codecampn.spring.modulith.template.order.OrderApi;
import com.codecampn.spring.modulith.template.order.management.OrderManagement;
import com.codecampn.spring.modulith.template.order.statistics.OrderStatistics;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InventoryManagement { // must be public for InventoryApi class that is in parent package

    private final OrderApi orderApi;
    // this is allowed by default in spring modulith, because it's an api package

    //--------------------------------------------------

    // private final OrderManagement orderManagement;
    // error: Module 'inventory' depends on non-exposed type OrderManagement within module 'order'

    //--------------------------------------------------

    private final OrderStatistics orderStatistics;

    // package.info of order statistics -> NamedInterface("order_statistics")
    // -> make the sub-modul accessible from the outside (it's by default internal)

    // package.info of inventory management -> allowedDependencies = {"order", "order::order_statistics"}
    // -> tell spring modulith that it is allowed to have these dependencies
}
