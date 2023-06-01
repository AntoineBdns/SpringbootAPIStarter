package fr.antoinebdns.springbootapistarter.controllers;

import fr.antoinebdns.springbootapistarter.models.SampleModel;
import fr.antoinebdns.springbootapistarter.services.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class SampleController {
    @Autowired
    SampleService sampleService;

    @GetMapping("/getSampleModel")
    public List<SampleModel> getSampleModelList(){
        return sampleService.findAllSamples();
    }

}
