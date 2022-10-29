package com.example.policysubmissionsystem.repository;

import com.example.policysubmissionsystem.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Integer> {

    @Query(value = "SELECT * FROM Policy c WHERE c.policy_number = :name", nativeQuery = true)
    List<Policy> findByPolicyNumber(@Param("name") String name);

    //List<Policy> findByNameContaining(String name);
}
