package com.Ikrama.BackendTraini8.service;

import com.Ikrama.BackendTraini8.model.TrainingCenter;
import com.Ikrama.BackendTraini8.repository.TrainingCenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingCenterService {

    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
    }

    // ✅ Save a Training Center
    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        return trainingCenterRepository.save(trainingCenter);
    }

    // ✅ Retrieve All Training Centers
    public List<TrainingCenter> getAllTrainingCenters() {
        return trainingCenterRepository.findAll();
    }
}
