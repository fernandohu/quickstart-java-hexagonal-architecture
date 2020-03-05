package com.example.demo.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;

import java.util.Arrays;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@Configuration
public class WiremockInitializer implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private Environment environment;

    private static final Logger logger = LogManager.getLogger(WiremockInitializer.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (Arrays.asList(environment.getActiveProfiles()).contains("dev")) {
            String port = environment.getProperty("wiremock.server.port");

            logger.info("Starting Wiremock on port " + port + "...");

            WireMockConfiguration config = wireMockConfig()
                    .usingFilesUnderDirectory("/__files")
                    .port(Integer.parseInt(port));

            WireMockServer wm = new WireMockServer(config);
            wm.start();
        }
    }
}
