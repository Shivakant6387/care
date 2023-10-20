package com.example.care.controller;

import com.example.care.dto.care.request.Root;
import com.example.care.dto.care.request.ckyc.CkycEkycInputIO;
import com.example.care.service.care.CareService;
import com.example.care.service.care.ckyc.GetCkycEkycInputIOService;
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
    @Autowired
    private GetCkycEkycInputIOService getCkycEkycInputIOService;

    @GetMapping("/getIntPolicyDataIO")
    public ResponseEntity<Root> getCareService(Root root) {
        return ResponseEntity.ok(careService.getIntPolicyDataIO(root));
    }
    @GetMapping("/getCkycEkycInputIO")
    public ResponseEntity<CkycEkycInputIO> getCkycEkycInputIO(CkycEkycInputIO ckycEkycInputIO){
        return ResponseEntity.ok(getCkycEkycInputIOService.getCkycEkycInputIO(ckycEkycInputIO));
    }
}
