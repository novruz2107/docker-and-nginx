package com.ingress.ms10.dockertask.Service;

import com.ingress.ms10.dockertask.domain.Counter;

public interface CounterService {
    Counter saveAndGetCounter();
}
