package com.Ikrama.BackendTraini8.controller;

import com.Ikrama.BackendTraini8.model.TrainingCenter;
import com.Ikrama.BackendTraini8.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

    private final TrainingCenterService trainingCenterService;

    public TrainingCenterController(TrainingCenterService trainingCenterService) {
        this.trainingCenterService = trainingCenterService;
    }

    // ✅ POST API to create a new Training Center
    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = trainingCenterService.saveTrainingCenter(trainingCenter);
        return ResponseEntity.ok(savedCenter);
    }

    // ✅ GET API to fetch all Training Centers
    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = trainingCenterService.getAllTrainingCenters();
        return ResponseEntity.ok(centers);
    }
}
