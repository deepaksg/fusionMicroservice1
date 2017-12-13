package com.dnb.fusion.cucumber.stepdefs;

import com.dnb.fusion.FusionMicroservice1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FusionMicroservice1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
