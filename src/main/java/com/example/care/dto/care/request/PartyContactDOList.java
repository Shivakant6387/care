package com.example.care.dto.care.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyContactDOList {
    public String contactNum;
    public String contactTypeCd;
    public String stdCode;
}
