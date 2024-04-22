package com.codecampn.spring.modulith.template.order.management;

import com.codecampn.spring.modulith.template.order.statistics.OrderStatistics;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderManagement { // must be public for OrderApi class that is in parent package

    private final OrderStatistics orderStatistics;
    // this is allowed by default in spring modulith, because it's in the same modul (order)

    private final OrderHandler orderHandler;
    // this class can be called, although it is package-private, because it's inside the same package
}
