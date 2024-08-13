package work.dimitar.redis.proxy.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import work.dimitar.redis.proxy.services.ExternalApiProxyService;

@RestController
public class ApiController {

    private final ExternalApiProxyService externalApiProxyService;

    @Autowired
    public ApiController(ExternalApiProxyService externalApiProxyService) {
        this.externalApiProxyService = externalApiProxyService;
    }

    @GetMapping("/api/{endpoint}")
    public String getApiResponse(@PathVariable String endpoint) {
        return externalApiProxyService.getApiResponse(endpoint);
    }
}