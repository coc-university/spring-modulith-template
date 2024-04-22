
@org.springframework.modulith.ApplicationModule(
        //displayName = "inventory_management",
        allowedDependencies = {"order", "order::order_statistics"}

)
package com.codecampn.spring.modulith.template.inventory.management;