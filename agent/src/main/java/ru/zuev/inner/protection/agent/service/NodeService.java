package ru.zuev.inner.protection.agent.service;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.*;

public class NodeService {
    public double getUsageCPU() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/actuator/metrics/system.cpu.usage";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl, String.class);

        String body = response.getBody();

        JsonParser springParser = JsonParserFactory.getJsonParser();

        Map<String, Object> map = springParser.parseMap(body);

        List<Map<String, Object>> list = (ArrayList<Map<String, Object>>) map.get("measurements");

        LinkedHashMap<String, Object> measurements = (LinkedHashMap<String, Object>) list.get(0);

        return (Double) measurements.get("value") * 100;
    }
}
