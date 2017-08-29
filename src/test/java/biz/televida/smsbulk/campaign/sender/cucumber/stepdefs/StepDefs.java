package biz.televida.smsbulk.campaign.sender.cucumber.stepdefs;

import biz.televida.smsbulk.campaign.sender.SmsBulkCampaignSenderApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SmsBulkCampaignSenderApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
