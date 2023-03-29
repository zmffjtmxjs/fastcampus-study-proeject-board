package com.fastcampus.studyproejectboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusStudyProjectBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastCampusStudyProjectBoardApplication.class, args);
    }

}
