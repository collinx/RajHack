package in.gov.rajasthan.doitc.rajhack;

import java.util.ArrayList;

  class AccountHoldersDetail
{
    private String AADHAR_ID;

    public String getAADHARID() { return this.AADHAR_ID; }

    public void setAADHARID(String AADHAR_ID) { this.AADHAR_ID = AADHAR_ID; }

    private String M_ID;

    public String getMID() { return this.M_ID; }

    public void setMID(String M_ID) { this.M_ID = M_ID; }

    private String BHAMASHAH_ACK_ID;

    public String getBHAMASHAHACKID() { return this.BHAMASHAH_ACK_ID; }

    public void setBHAMASHAHACKID(String BHAMASHAH_ACK_ID) { this.BHAMASHAH_ACK_ID = BHAMASHAH_ACK_ID; }

    private String NAME;

    public String getNAME() { return this.NAME; }

    public void setNAME(String NAME) { this.NAME = NAME; }

    private String MOBILE_NO;

    public String getMOBILENO() { return this.MOBILE_NO; }

    public void setMOBILENO(String MOBILE_NO) { this.MOBILE_NO = MOBILE_NO; }

    private String FATHER_NAME_ENG;

    public String getFATHERNAMEENG() { return this.FATHER_NAME_ENG; }

    public void setFATHERNAMEENG(String FATHER_NAME_ENG) { this.FATHER_NAME_ENG = FATHER_NAME_ENG; }
}

public class AccountHolder
{
    private String isExist;

    public String getIsExist() { return this.isExist; }

    public void setIsExist(String isExist) { this.isExist = isExist; }

    private ArrayList<AccountHoldersDetail> account_holders_details;

    public ArrayList<AccountHoldersDetail> getAccountHoldersDetails() { return this.account_holders_details; }

    public void setAccountHoldersDetails(ArrayList<AccountHoldersDetail> account_holders_details) { this.account_holders_details = account_holders_details; }
}
