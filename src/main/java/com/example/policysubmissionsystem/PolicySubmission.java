package com.example.policysubmissionsystem;

import com.example.policysubmissionsystem.model.Policy;
import com.example.policysubmissionsystem.repository.PolicyRepository;
import com.example.policysubmissionsystem.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class PolicySubmission {

    @Autowired
    PolicyService policyService;

    public static void main(String[] args) {
        SpringApplication.run(PolicySubmission.class, args);
    }

    @PostConstruct
    public void addData() {
        Policy policy = new Policy(1, "54564", "pritam", "surya");
        policyService.addpolicy(policy);
        Policy policy1 = new Policy(2, "1234", "saili", "bhatt");
        policyService.addpolicy(policy1);
        Policy policy2 = new Policy(3, "45466", "rakesh", "maha");
        policyService.addpolicy(policy2);
        Policy policy3 = new Policy(5, "6455", "mahesh", "babu");
        policyService.addpolicy(policy3);
        Policy policy5 = new Policy(6, "6456", "surya", "babu");
        policyService.addpolicy(policy5);
        Policy policy6 = new Policy(7, "6457", "nayab", "babu");
        policyService.addpolicy(policy6);
        Policy policy7 = new Policy(8, "6458", "yash", "babu");
        policyService.addpolicy(policy7);
    }
}
