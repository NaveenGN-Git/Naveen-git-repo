package com.thinkconstuctive.rest_demo.service.impl;

import com.thinkconstuctive.rest_demo.model.CloudVendor;
import com.thinkconstuctive.rest_demo.repository.CloudVendorRepository;
import com.thinkconstuctive.rest_demo.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    //Instatiated cloudVendorReposity because it is only talking to the databaseRepo
    CloudVendorRepository cloudVendorRepository;

    //Created constructor for the arguement
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override//Whatever coming(Entity value) inside cloudVendor should be saved into repository
    public String createCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        //More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        //More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        //More Business Logic
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        //More Business Logic
        return cloudVendorRepository.findAll();
    }
}
