package com.elemfra.test.testproject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

@RunWith(SpringRunner.class)
@WebMvcTest(value = HelloWorldRestController.class, secure = false)
public class TestProjectApplicationTests {

    @Autowired
    private MockMvc mockMvc;

	@Test
	public void testHello() throws Exception {
	    String name = UUID.randomUUID().toString();

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/hello/" + name);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        Assert.assertTrue(result.getResponse().getContentAsString().contains("Hello " + name));
    }

}
