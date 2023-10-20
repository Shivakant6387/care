package com.example.care.dto.care.request.ckyc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCkycEkycInputIO {
    private String panNum;
    private String document_type;
    private String id_number;
    private String consent_purpose;
    private String dob;
}
