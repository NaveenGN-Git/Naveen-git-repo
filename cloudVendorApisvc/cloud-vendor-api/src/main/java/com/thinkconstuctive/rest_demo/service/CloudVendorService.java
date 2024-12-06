package com.thinkconstuctive.rest_demo.service;

import com.thinkconstuctive.rest_demo.model.CloudVendor;

import java.util.List;

//Writing the methods whichever we wanted in our service/business layer
public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);//deleteCloudVendor expects id so we are giving id to delete based on that
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
