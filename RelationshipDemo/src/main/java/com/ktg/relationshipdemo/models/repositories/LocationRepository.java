package com.ktg.relationshipdemo.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ktg.relationshipdemo.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>  {

}
