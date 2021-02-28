package com.company.Summative1AnthonyAntonio.controller;

import com.company.Summative1AnthonyAntonio.controller.model.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(magicBallController.class)
public class magicBallControllerTest {

    @Autowired
    MockMvc mockMvc;

    ObjectMapper mapper= new ObjectMapper();
    @Test
    public void shouldReturnNewAnswerOnPostRequest() throws Exception {
        // ARRANGE
        Answer inputAnswer = new Answer();
       // inputAnswer.setId(1);
       // inputAnswer.setAnswer("no");
       inputAnswer.setQuestion("Will I have a good day?");

        //Convert Java Object to JS
        String inputJson = mapper.writeValueAsString(inputAnswer);
       //Answer outputAnswer = new Answer();
       // outputAnswer.setId(1);
       // outputAnswer.setAnswer("no");
       // outputAnswer.setQuestion("will I have a good day");

        //String outputJson = mapper.writeValueAsString(outputAnswer);

        mockMvc.perform(
                post("/magic")                            // Perform the POST request
                        .content(inputJson)                       // Set the request body
                        .contentType(MediaType.APPLICATION_JSON)  // Tell the server it's in JSON format
        )
                .andDo(print())                                // Print results to console
                .andExpect(status().isOk());              // ASSERT (status code is 201)
    }

}