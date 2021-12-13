package com.creativespace.trends.adapter.web.api.rest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class TrendsClient {
    private static final String HELLO_WORLD_URL = "/hello-world";

    private final MockMvc mockMvc;

    TrendsClient(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    ResultActions helloWorld() {
        return helloWorld(get(HELLO_WORLD_URL));
    }

    ResultActions helloWorld(String name) {
        return helloWorld(get(HELLO_WORLD_URL).param("name", name));
    }

    private ResultActions helloWorld(MockHttpServletRequestBuilder request) {
        try {
            return mockMvc.perform(request);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
