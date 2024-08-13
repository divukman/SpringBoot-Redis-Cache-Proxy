package work.dimitar.redis.proxy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiProxyService {

    private final RestTemplate restTemplate;

    @Autowired
    public ExternalApiProxyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Cacheable(value = "apiCache", key = "#endpoint")
    public String getApiResponse(String endpoint) {
        String apiUrl = "https://api.restful-api.dev/objects/" + endpoint;
        return restTemplate.getForObject(apiUrl, String.class);
    }

}
