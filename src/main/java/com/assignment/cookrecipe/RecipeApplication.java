package com.assignment.cookrecipe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * TODO Class description
 *
 * @author ShahKA
 * @since 7/14/2018
 */
@SpringBootApplication
@ImportResource(locations = { "classpath:config/context/ctx-application.xml" })
public class RecipeApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(RecipeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RecipeApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            /*LOGGER.info("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                LOGGER.info("beanName: {}", beanName);
            }*/
            /*LOGGER.info("Let's inspect the beans provided by Application:");
            RecipeApplication recipeApplicationBean = ctx.getBean(RecipeApplication.class);
            LOGGER.info("applicationBean: {}", recipeApplicationBean);*/
        };
    }

}
