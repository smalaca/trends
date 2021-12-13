package com.creativespace.trends.adapter.web.api.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@Tag("SystemTest")
class TrendsRestControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private TrendsClient client;

    @BeforeEach
    void setUpTrendsClient() {
        client = new TrendsClient(mockMvc);
    }

    @Test
    void shouldSayHelloToSpecificPerson() throws Exception {
        ResultActions actual = client.helloWorld("Pater Parker");

        actual
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Pater Parker! Are you looking for some suggestions?"));
    }

    @Test
    void shouldSayHelloToNoName() throws Exception {
        ResultActions actual = client.helloWorld();

        actual
                .andExpect(status().isOk())
                .andExpect(content().string("Hello No Name! Are you looking for some suggestions?"));
    }
}