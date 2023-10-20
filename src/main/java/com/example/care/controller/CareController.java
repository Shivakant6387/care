package com.example.care.controller;

import com.example.care.dto.care.request.Root;
import com.example.care.service.care.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/care")
public class CareController {
    @Autowired
    private CareService careService;

    @GetMapping("/getIntPolicyDataIO")
    public ResponseEntity<Root> getCareService(Root root) {
        return ResponseEntity.ok(careService.getIntPolicyDataIO(root));
    }
}
