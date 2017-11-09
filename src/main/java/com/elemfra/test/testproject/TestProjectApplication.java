package com.elemfra.test.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
}

@RestController
class HelloWorldRestController {

/*
    private void sonarQubeFail() {
        //TODO: Testing SonarQube
        List<String> l = new ArrayList<String>();

        String nullString = null;
        nullString.equals("My_Sweet_String");

        Object o = null;
        o.equals(nullString);
    }
*/

    private void testCode() {
        if (true) {
            if (!false) {
                if (true) {
                    if (!false) {
                        if (true) {
                            System.out.println(".......");
                        }
                    }
                }
            }
        }
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(value="name") String name) {
        return String.format("Hello %s!!", name);
    }
}
