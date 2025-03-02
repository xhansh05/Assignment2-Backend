package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.example")

public class ProjectConfig {
    @Component
    public class EagerSingleton {
        public EagerSingleton() {
            System.out.println("EagerSingleton is here");
        }
    }
    @Component
    @Lazy
    public class LazySingleton {
        public LazySingleton() {
            System.out.println("LazySingleton is here");
        }
    }
}
