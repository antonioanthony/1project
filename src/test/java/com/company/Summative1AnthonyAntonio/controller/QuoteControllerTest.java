package com.company.Summative1AnthonyAntonio.controller;


import com.company.Summative1AnthonyAntonio.controller.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)
public class   QuoteControllerTest {

    //wiring in the MockMVC object
    @Autowired
    MockMvc mockMvc;

    //objectMapper used to covert Java objects to Json and vice versa
   private ObjectMapper mapper= new ObjectMapper();

    // A list of records for testing purposes
    private List<String> quoteList;

    @Test
    public void ShouldReturnAllQuotes() throws Exception{




       // String outputJson= mapper.writeValueAsString();

        mockMvc.perform(get("/quotes"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk());              // ASSERT (status code is 200)
    }
}
