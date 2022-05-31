package com.ingress.ms10.dockertask.IRepository;

import com.ingress.ms10.dockertask.domain.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Long> {
    Counter findFirstByOrderByIdDesc();
}
