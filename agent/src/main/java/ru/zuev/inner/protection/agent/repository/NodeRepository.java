package ru.zuev.inner.protection.agent.repository;

import ru.zuev.inner.protection.agent.entity.Node;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NodeRepository extends CrudRepository<Node, Long> {
    List<Node> findAll();
}
