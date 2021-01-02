package com.example.uploadingfiles;

import com.example.uploadingfiles.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

public class UploadingFilesApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(UploadingFilesApplication.class, args);
    }

    @Bean
    CommandLineRunner init(StorageService storageService) {
        return (args) -> {
            storageService.deleteAll();
            storageService.init();
        };
    }

    /*
    * @sptingBootApplication id a convinivence annotations thats adds:
    * - @Configuration : tags the class as a source of bean definitions for the application context
    * - @EnableAutoConfiguration : Tells to SpringBoot  to start adding beans based on classpath settings
    * other beans, and various property settings. For example spring-webmvc is on the classpath, this annotation
    * flags the application as a web application and activates key behaviours, such as setting up a DispatcherServelt
    *
    * - @ComponentScan : Tells Spring to look for other components, configurations, and services in the
    * com/example package, letting it find the controllers
    *
    * - The main() method uses Spring Boot's SpringBootApplication.run() method launch and application.
    * */
}
