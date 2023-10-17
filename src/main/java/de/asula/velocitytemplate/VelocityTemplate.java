package de.asula.velocitytemplate;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import lombok.Getter;
import org.slf4j.Logger;

import java.nio.file.Path;

@Getter
@Plugin(id = "velocity_template", name = "VelocityTemplate",
        description = "Template Plugin for Velocity Servers",
        authors = "malte", version = "1.0",
        url = "")
public class VelocityTemplate {
    private final ProxyServer server;
    private final Path dataDirectory;
    private final Logger logger;

    @Inject
    public VelocityTemplate(ProxyServer server, @DataDirectory Path dataDirectory, Logger logger) {
        this.server = server;
        this.dataDirectory = dataDirectory;
        this.logger = logger;
        logger.info("VelocityTemplate Constructor call");
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("VelocityTemplate onProxyInitialization");
    }
}
