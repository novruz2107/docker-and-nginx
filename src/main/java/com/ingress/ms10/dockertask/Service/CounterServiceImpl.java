package com.ingress.ms10.dockertask.Service;

import com.ingress.ms10.dockertask.IRepository.CounterRepository;
import com.ingress.ms10.dockertask.domain.Counter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CounterServiceImpl implements CounterService {

    private final CounterRepository counterRepository;

    @Override
    public Counter saveAndGetCounter() {
        Counter counter = counterRepository.findFirstByOrderByIdDesc();
        if (counter == null) {
            return counterRepository.save(new Counter(0L));
        }
        Counter newCounter = new Counter();
        newCounter.setCounter(counter.getCounter() + 1);
        return counterRepository.save(newCounter);
    }
}
