package in.gov.rajasthan.doitc.rajhack;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

class HofDetails {
    @SerializedName("AADHAR_ID")
    private String AADHAR_ID;
    @SerializedName("MOTHER_NAME_ENG")
    private String MOTHER_NAME_ENG;
    @SerializedName("DOB")
    private String DOB;
    @SerializedName("BHAMASHAH_ID")
    private String BHAMASHAH_ID;
    @SerializedName("SPOUCE_NAME_HND")
    private String SPOUCE_NAME_HND;
    @SerializedName("M_ID")
    private String M_ID;
    @SerializedName("FAMILYIDNO")
    private String FAMILYIDNO;
    @SerializedName("FATHER_NAME_HND")
    private String FATHER_NAME_HND;
    @SerializedName("NAME_ENG")
    private String NAME_ENG;
    @SerializedName("FATHER_NAME_ENG")
    private String FATHER_NAME_ENG;
    @SerializedName("GENDER")
    private String GENDER;
    @SerializedName("NAME_HND")
    private String NAME_HND;
    @SerializedName("SPOUCE_NAME_ENG")
    private String SPOUCE_NAME_ENG;
    @SerializedName("PHOTO")
    private Object PHOTO;
    @SerializedName("MOTHER_NAME_HND")
    private String MOTHER_NAME_HND;


    public String getAADHARID() {
        return this.AADHAR_ID;
    }

    public void setAADHARID(String AADHAR_ID) {
        this.AADHAR_ID = AADHAR_ID;
    }

    public String getMOTHERNAMEENG() {
        return this.MOTHER_NAME_ENG;
    }

    public void setMOTHERNAMEENG(String MOTHER_NAME_ENG) {
        this.MOTHER_NAME_ENG = MOTHER_NAME_ENG;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBHAMASHAHID() {
        return this.BHAMASHAH_ID;
    }

    public void setBHAMASHAHID(String BHAMASHAH_ID) {
        this.BHAMASHAH_ID = BHAMASHAH_ID;
    }

    public String getSPOUCENAMEHND() {
        return this.SPOUCE_NAME_HND;
    }

    public void setSPOUCENAMEHND(String SPOUCE_NAME_HND) {
        this.SPOUCE_NAME_HND = SPOUCE_NAME_HND;
    }

    public String getMID() {
        return this.M_ID;
    }

    public void setMID(String M_ID) {
        this.M_ID = M_ID;
    }

    public String getFAMILYIDNO() {
        return this.FAMILYIDNO;
    }

    public void setFAMILYIDNO(String FAMILYIDNO) {
        this.FAMILYIDNO = FAMILYIDNO;
    }

    public String getFATHERNAMEHND() {
        return this.FATHER_NAME_HND;
    }

    public void setFATHERNAMEHND(String FATHER_NAME_HND) {
        this.FATHER_NAME_HND = FATHER_NAME_HND;
    }

    public String getNAMEENG() {
        return this.NAME_ENG;
    }

    public void setNAMEENG(String NAME_ENG) {
        this.NAME_ENG = NAME_ENG;
    }

    public String getFATHERNAMEENG() {
        return this.FATHER_NAME_ENG;
    }

    public void setFATHERNAMEENG(String FATHER_NAME_ENG) {
        this.FATHER_NAME_ENG = FATHER_NAME_ENG;
    }

    public String getGENDER() {
        return this.GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getNAMEHND() {
        return this.NAME_HND;
    }

    public void setNAMEHND(String NAME_HND) {
        this.NAME_HND = NAME_HND;
    }

    public String getSPOUCENAMEENG() {
        return this.SPOUCE_NAME_ENG;
    }

    public void setSPOUCENAMEENG(String SPOUCE_NAME_ENG) {
        this.SPOUCE_NAME_ENG = SPOUCE_NAME_ENG;
    }

    public Object getPHOTO() {
        return this.PHOTO;
    }

    public void setPHOTO(Object PHOTO) {
        this.PHOTO = PHOTO;
    }

    public String getMOTHERNAMEHND() {
        return this.MOTHER_NAME_HND;
    }

    public void setMOTHERNAMEHND(String MOTHER_NAME_HND) {
        this.MOTHER_NAME_HND = MOTHER_NAME_HND;
    }
}

class FamilyDetail {
    @SerializedName("AADHAR_ID")
    private String AADHAR_ID;
    @SerializedName("MOTHER_NAME_ENG")
    private String MOTHER_NAME_ENG;
    @SerializedName("DOB")
    private String DOB;
    @SerializedName("SPOUCE_NAME_HND")
    private String SPOUCE_NAME_HND;
    @SerializedName("M_ID")
    private String M_ID;
    @SerializedName("FATHER_NAME_HND")
    private String FATHER_NAME_HND;
    @SerializedName("NAME_ENG")
    private String NAME_ENG;
    @SerializedName("FATHER_NAME_ENG")
    private String FATHER_NAME_ENG;
    @SerializedName("GENDER")
    private String GENDER;
    @SerializedName("NAME_HND")
    private String NAME_HND;
    @SerializedName("SPOUCE_NAME_ENG")
    private String SPOUCE_NAME_ENG;
    @SerializedName("PHOTO")
    private Object PHOTO;
    @SerializedName("MOTHER_NAME_HND")
    private String MOTHER_NAME_HND;


    public String getAADHARID() {
        return this.AADHAR_ID;
    }

    public void setAADHARID(String AADHAR_ID) {
        this.AADHAR_ID = AADHAR_ID;
    }

    public String getMOTHERNAMEENG() {
        return this.MOTHER_NAME_ENG;
    }

    public void setMOTHERNAMEENG(String MOTHER_NAME_ENG) {
        this.MOTHER_NAME_ENG = MOTHER_NAME_ENG;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSPOUCENAMEHND() {
        return this.SPOUCE_NAME_HND;
    }

    public void setSPOUCENAMEHND(String SPOUCE_NAME_HND) {
        this.SPOUCE_NAME_HND = SPOUCE_NAME_HND;
    }

    public String getMID() {
        return this.M_ID;
    }

    public void setMID(String M_ID) {
        this.M_ID = M_ID;
    }

    public String getFATHERNAMEHND() {
        return this.FATHER_NAME_HND;
    }

    public void setFATHERNAMEHND(String FATHER_NAME_HND) {
        this.FATHER_NAME_HND = FATHER_NAME_HND;
    }

    public String getNAMEENG() {
        return this.NAME_ENG;
    }

    public void setNAMEENG(String NAME_ENG) {
        this.NAME_ENG = NAME_ENG;
    }

    public String getFATHERNAMEENG() {
        return this.FATHER_NAME_ENG;
    }

    public void setFATHERNAMEENG(String FATHER_NAME_ENG) {
        this.FATHER_NAME_ENG = FATHER_NAME_ENG;
    }

    public String getGENDER() {
        return this.GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getNAMEHND() {
        return this.NAME_HND;
    }

    public void setNAMEHND(String NAME_HND) {
        this.NAME_HND = NAME_HND;
    }

    public String getSPOUCENAMEENG() {
        return this.SPOUCE_NAME_ENG;
    }

    public void setSPOUCENAMEENG(String SPOUCE_NAME_ENG) {
        this.SPOUCE_NAME_ENG = SPOUCE_NAME_ENG;
    }

    public Object getPHOTO() {
        return this.PHOTO;
    }

    public void setPHOTO(Object PHOTO) {
        this.PHOTO = PHOTO;
    }

    public String getMOTHERNAMEHND() {
        return this.MOTHER_NAME_HND;
    }

    public void setMOTHERNAMEHND(String MOTHER_NAME_HND) {
        this.MOTHER_NAME_HND = MOTHER_NAME_HND;
    }
}

public class HofAndMembers {
    @SerializedName("hof_Details")
    private HofDetailss hof_Details;
    @SerializedName("family_Details")
    private ArrayList<FamilyDetail> family_Details;

    public HofDetailss getHofDetails() {
        return this.hof_Details;
    }

    public void setHofDetails(HofDetailss hof_Details) {
        this.hof_Details = hof_Details;
    }

    public ArrayList<FamilyDetail> getFamilyDetails() {
        return this.family_Details;
    }

    public void setFamilyDetails(ArrayList<FamilyDetail> family_Details) {
        this.family_Details = family_Details;
    }
}

