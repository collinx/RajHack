package in.gov.rajasthan.doitc.rajhack;


import java.util.ArrayList;

  class AccountDetail
{
    private String SCHEME_NAME;

    public String getSCHEMENAME() { return this.SCHEME_NAME; }

    public void setSCHEMENAME(String SCHEME_NAME) { this.SCHEME_NAME = SCHEME_NAME; }

    private String SCHEM_ID;

    public String getSCHEMID() { return this.SCHEM_ID; }

    public void setSCHEMID(String SCHEM_ID) { this.SCHEM_ID = SCHEM_ID; }
}

public class VerifiedData
{
    private String accountHolder_name;

    public String getAccountHolderName() { return this.accountHolder_name; }

    public void setAccountHolderName(String accountHolder_name) { this.accountHolder_name = accountHolder_name; }

    private String isExist;

    public String getIsExist() { return this.isExist; }

    public void setIsExist(String isExist) { this.isExist = isExist; }

    private ArrayList<AccountDetail> account_details;

    public ArrayList<AccountDetail> getAccountDetails() { return this.account_details; }

    public void setAccountDetails(ArrayList<AccountDetail> account_details) { this.account_details = account_details; }
}

