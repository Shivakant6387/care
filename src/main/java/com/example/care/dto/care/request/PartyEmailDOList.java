package com.example.care.dto.care.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartyEmailDOList {
    public String emailAddress;
    public String emailTypeCd;
}
