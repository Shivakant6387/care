package com.example.care.dto.care.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Policy {
    public String businessTypeCd;
    public String baseProductId;
    public String baseAgentId;
    public String coverType;
    public ArrayList<PartyDOList> partyDOList;
    public ArrayList<PolicyAdditionalFieldsDOList> policyAdditionalFieldsDOList;
    public String sumInsured;
    public String term;
    public String isPremiumCalculation;
    public String addOns;
}
