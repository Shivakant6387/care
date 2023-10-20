package com.example.care.dto.care.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyDOList {
    public String birthDt;
    public String firstName;
    public String genderCd;
    public String height;
    public String weight;
    public String guid;
    public String lastName;
    public ArrayList<PartyAddressDOList> partyAddressDOList;
    public ArrayList<PartyContactDOList> partyContactDOList;
    public ArrayList<PartyEmailDOList> partyEmailDOList;
    public ArrayList<PartyIdentityDOList> partyIdentityDOList;
    public String relationCd;
    public String roleCd;
    public String titleCd;
    public ArrayList<Object> partyQuestionDOList;
}
