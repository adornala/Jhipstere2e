package com.e2e.hipster.cucumber.stepdefs;

import com.e2e.hipster.JhipsterE2EApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterE2EApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
