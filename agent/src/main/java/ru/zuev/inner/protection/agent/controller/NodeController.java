package ru.zuev.inner.protection.agent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.zuev.inner.protection.agent.entity.Node;
import ru.zuev.inner.protection.agent.repository.NodeRepository;

import java.util.List;


@RestController
@RequestMapping
public class NodeController {
    private final NodeRepository nodeRepository;

    public NodeController(NodeRepository nodeRepository) {
        this.nodeRepository = nodeRepository;
    }

    @GetMapping(value = "/nodes")
    public List<Node> getTestData() {
        return nodeRepository.findAll();
    }
}
