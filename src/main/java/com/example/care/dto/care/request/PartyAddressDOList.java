package com.example.care.dto.care.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyAddressDOList {
    public String addressLine1Lang1;
    public String addressLine2Lang1;
    public String addressTypeCd;
    public String areaCd;
    public String cityCd;
    public String stateCd;
    public String pinCode;
}
