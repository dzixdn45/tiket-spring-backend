package com.smk.bi.ticketing.repository;

import com.smk.bi.ticketing.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
    List<User> findByUserId(String userId);
    List<User> findByCustomerId(String customerId);
    List<User> findByUserIdAndCustomerId(String userId, String customerId);

}
