package com.example.policysubmissionsystem.controller;

import com.example.policysubmissionsystem.model.Policy;
import com.example.policysubmissionsystem.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/policy")
@CrossOrigin
public class PolicyController {
    // controller --->  service  ----> repositiory
    //CSR

    @Autowired
    PolicyService policyService; //IOC --> invocation of target

    @GetMapping(value = "getpolicynumber", produces = "text/plain")
    public String getPolicyNumber() {
        String policyNumber = policyService.getPolicyNumber();
        System.out.println("number is " + policyNumber);
        return policyNumber;
    }

    @GetMapping("getpolicy")
    public List<Policy> getPolicy() {
        System.out.println("hit!!");
        return policyService.getPolicy();
    }

    @PostMapping("addpolicy")
    public Policy addPolicy(@RequestBody Policy policy) {
        System.out.println("hit!!!!!!!!");
        return policyService.addpolicy(policy);
    }

    @PutMapping("editpolicy")
    public Policy editPolicy(@RequestBody Policy policy) {
        return policyService.editPolicy(policy);
    }

    @DeleteMapping("deletepolicy")
    public List<Policy> deletePolicy(@PathParam("id") Integer id) {
        System.out.println("id is =============== " + id);
        return policyService.deletePolicy(id);
    }
}
