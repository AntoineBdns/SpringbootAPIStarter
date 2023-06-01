package fr.antoinebdns.springbootapistarter.services;

import fr.antoinebdns.springbootapistarter.models.SampleModel;
import fr.antoinebdns.springbootapistarter.repositories.SampleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    public List<SampleModel> findAllSamples() {
        return sampleRepository.findAll();
    }
}
