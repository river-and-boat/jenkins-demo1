package com.thoughtworks.demo1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(FirstController.class)
@AutoConfigureJsonTesters
class FirstControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void should_return_hello_world() throws Exception {
        mockMvc.perform(get("/hello error"))
                .andExpect(status().isOk());
    }
}