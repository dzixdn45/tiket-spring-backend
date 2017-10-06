package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.Rails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RailsRepository extends CrudRepository<Rails,Long> {
    List<Rails> findByRailsName(String railsName);
    List<Rails> findByCapacityRails(Integer capacityRails);
    List<Rails> findByRailsNameAndCapacityRails(String railsName, Integer capacityRails);

}
