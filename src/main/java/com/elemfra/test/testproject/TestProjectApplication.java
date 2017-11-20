package com.elemfra.test.testproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Set;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
}



@RestController
class HelloWorldRestController {
    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable(value="name") String name) {

        InetAddress addr;
        String hostname;
        try {
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException e) {
            hostname = "Unknown";
        }

        return String.format("Hello %s!! My thread ID is %s. Hostname is %s", name, Thread.currentThread().getId(), hostname);
    }
}
