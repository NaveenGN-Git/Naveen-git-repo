package com.thinkconstuctive.rest_demo.repository;

import com.thinkconstuctive.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {
    //String is a datatype of a id
}
