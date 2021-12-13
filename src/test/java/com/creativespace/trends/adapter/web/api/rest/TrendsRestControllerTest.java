package com.creativespace.trends.adapter.web.api.rest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Tag("SystemTest")
class TrendsRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldSayHelloToSpecificPerson() throws Exception {
        mockMvc.perform(get("/hello-world").param("name", "Pater Parker"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Pater Parker! Are you looking for some suggestions?"));
    }

    @Test
    void shouldSayHelloToNoName() throws Exception {
        mockMvc.perform(get("/hello-world"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello No Name! Are you looking for some suggestions?"));
    }
}