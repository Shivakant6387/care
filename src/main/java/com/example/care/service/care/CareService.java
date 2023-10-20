package com.example.care.service.care;


import com.example.care.dto.care.request.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class CareService {
    public Root getIntPolicyDataIO(Root root) {

        Policy policy = new Policy();
        policy.setBusinessTypeCd("NEWBUSINESS");
        policy.setBaseProductId("10001117");
        policy.setBaseAgentId("20008325");
        policy.setCoverType("INDIVIDUAL");
        policy.setSumInsured("001");
        policy.setTerm("1");
        policy.setIsPremiumCalculation("YES");
        policy.setAddOns("WBS1146,NCBS1145,AHCS1144");
        ArrayList<PartyContactDOList> partyContactDOList = new ArrayList<>();
        partyContactDOList.add(new PartyContactDOList("9892398089", "MOBILE", "+91"));
        ArrayList<PartyContactDOList> partyContactDOList1 = new ArrayList<>();
        partyContactDOList1.add(new PartyContactDOList("9757184521", "MOBILE", "+91"));

        PartyAddressDOList partyAddressDOList = new PartyAddressDOList();
        partyAddressDOList.setAddressLine1Lang1("1206");
        partyAddressDOList.setAddressLine2Lang1("Maruthi nagar");
        partyAddressDOList.setAddressTypeCd("COMMUNICATION");
        partyAddressDOList.setAreaCd("Nalgonda");
        partyAddressDOList.setCityCd("Nalgonda");
        partyAddressDOList.setStateCd("ANDHRA PRADESH");
        partyAddressDOList.setPinCode("560072");
        PartyAddressDOList partyAddressDOList1 = new PartyAddressDOList();
        partyAddressDOList1.setAddressLine1Lang1("1206");
        partyAddressDOList1.setAddressLine2Lang1("Maruthi nagar");
        partyAddressDOList1.setAddressTypeCd("PERMANENT");
        partyAddressDOList1.setAreaCd("Nalgonda");
        partyAddressDOList1.setCityCd("Nalgonda");
        partyAddressDOList1.setStateCd("ANDHRA PRADESH");
        partyAddressDOList1.setPinCode("560072");
        ArrayList<PartyAddressDOList> partyAddressDOLists = new ArrayList<>();

        partyAddressDOLists.add(partyAddressDOList1);
        partyAddressDOLists.add(partyAddressDOList);
        ArrayList<PartyEmailDOList> partyEmailDOList = new ArrayList<>();
        partyEmailDOList.add(new PartyEmailDOList("karan.churi@workindia.in", "PERSONAL"));
        ArrayList<PartyEmailDOList> partyEmailDOList1 = new ArrayList<>();
        partyEmailDOList1.add(new PartyEmailDOList("kjchuri95@gmail.com", "PERSONAL"));

        ArrayList<PartyIdentityDOList> partyIdentityDOList = new ArrayList<>();
        partyIdentityDOList.add(new PartyIdentityDOList("PAN"));
        ArrayList<PartyIdentityDOList> partyIdentityDOList1 = new ArrayList<>();

        partyIdentityDOList1.add(new PartyIdentityDOList());

        ArrayList<Object> partyQuestionDOList=new ArrayList<>();

        ArrayList<PartyDOList> partyDOListLis = new ArrayList<>();
        policy.setPartyDOList(partyDOListLis);

        partyDOListLis.add(new PartyDOList("08/12/1991", "kpqui", "MALE", "99", "70", "QN6237993", "kka", partyAddressDOLists, partyContactDOList, partyEmailDOList, partyIdentityDOList, "SELF", "PROPOSER", "MR", partyQuestionDOList));

        partyDOListLis.add(new PartyDOList("08/12/1991", "oqdwkpp", "MALE", "99", "70", "QN6237993", "kmsxsk", partyAddressDOLists, partyContactDOList1, partyEmailDOList1, partyIdentityDOList1, "SELF", "PRIMARY", "MR", partyQuestionDOList));

        ArrayList<PolicyAdditionalFieldsDOList> policyAdditionalFieldsDOList = new ArrayList<>();
        policyAdditionalFieldsDOList.add(new PolicyAdditionalFieldsDOList("Partner_NB_PartnerName", "xc", "SISTER", "YES", "YES", "YES"));

        policy.setPolicyAdditionalFieldsDOList(policyAdditionalFieldsDOList);
        IntPolicyDataIO intPolicyDataIO = new IntPolicyDataIO();
        intPolicyDataIO.setPolicy(policy);
        root.setIntPolicyDataIO(intPolicyDataIO);
        return root;
    }
}
