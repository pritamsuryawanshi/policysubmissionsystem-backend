package com.example.policysubmissionsystem.util;

import org.springframework.stereotype.Component;

@Component
public class PolicyNumberGenerator {
    private String policyNumber;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
