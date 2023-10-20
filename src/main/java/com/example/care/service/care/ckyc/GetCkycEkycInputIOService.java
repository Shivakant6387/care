package com.example.care.service.care.ckyc;

import com.example.care.dto.care.request.ckyc.GetCkycEkycInputIO;
import com.example.care.dto.care.request.ckyc.CkycEkycInputIO;
import org.springframework.stereotype.Service;

@Service
public class GetCkycEkycInputIOService {
    public CkycEkycInputIO getCkycEkycInputIO(CkycEkycInputIO root){
        GetCkycEkycInputIO getCkycEkycInputIO=new GetCkycEkycInputIO();
        getCkycEkycInputIO.setPanNum("DNJPS0097E");
        getCkycEkycInputIO.setDocument_type("PAN");
        getCkycEkycInputIO.setId_number("");
        getCkycEkycInputIO.setConsent_purpose("this is a consent purpose string pass anything");
        getCkycEkycInputIO.setDob("1991-01-08");
        root.setGetCkycEkycInputIO(getCkycEkycInputIO);
       return root;
    }
}
