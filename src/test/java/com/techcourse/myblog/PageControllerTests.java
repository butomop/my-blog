package com.techcourse.myblog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PageControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void index() throws Exception {
        this.mockMvc.perform(get("/"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void articles() throws Exception {
        this.mockMvc.perform(get("/articles"))
                .andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void writing() throws Exception {
        this.mockMvc.perform(get("/writing"))
                .andDo(print()).andExpect(status().isOk());
    }
}
