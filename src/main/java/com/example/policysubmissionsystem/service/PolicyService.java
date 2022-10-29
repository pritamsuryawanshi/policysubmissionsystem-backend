package com.example.policysubmissionsystem.service;


import com.example.policysubmissionsystem.model.Policy;
import com.example.policysubmissionsystem.repository.PolicyRepository;
import com.example.policysubmissionsystem.util.PolicyNumberGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PolicyService {

    @Autowired
    PolicyRepository repository;

    @Autowired
    PolicyNumberGenerator policyNumberGenerator;

    public List<Policy> getPolicy() {
        List<Policy> all = repository.findAll();
        return all;
    }

    public Policy addpolicy(Policy policy) {
        Policy save = repository.save(policy);
        return save;
    }

    public Policy editPolicy(Policy policy) {
        //repository.findByNameContaining(policy.getFirstName());
        //Policy policyToEdit = repository.findById(policy.getId()).orElse(null);
        List<Policy> list = repository.findByPolicyNumber(policy.getPolicyNumber());
        Policy policyToEdit = list.get(0);
        policyToEdit.setPolicyNumber(policy.getPolicyNumber());
        policyToEdit.setFirstName(policy.getFirstName());
        policyToEdit.setLastName(policy.getLastName());
        Policy save = repository.save(policyToEdit);
        return save;
    }

    public List<Policy> deletePolicy(Integer id) {
        repository.deleteById(id);
        List<Policy> all = repository.findAll();
        return all;
    }

    public String getPolicyNumber() {
        return UUID.randomUUID().toString().substring(1, 8);
    }
}
