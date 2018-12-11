package com.medievalgrosbill.controllers

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc

import static org.assertj.core.api.Assertions.assertThat

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class AdminControllerTest extends GroovyTestCase {

    @Autowired
    private AdminController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }


}