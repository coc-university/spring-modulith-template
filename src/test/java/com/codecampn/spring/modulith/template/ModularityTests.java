package com.codecampn.spring.modulith.template;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class ModularityTests {

    ApplicationModules modules = ApplicationModules.of(SpringModulithApp.class);

    @Test
    void verifyModules() {
        modules.verify();
    }

    @Test
    void printModules() {
        modules.forEach(System.out::println);
    }

    @Test
    void documentModules() { // check target/spring-modulith-docs
        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }
}
