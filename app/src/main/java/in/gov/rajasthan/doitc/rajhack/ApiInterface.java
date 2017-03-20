package in.gov.rajasthan.doitc.rajhack;

import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface ApiInterface {

    @FormUrlEncoded
    @GET("gptestuser/verifyMobileUser/123456?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<MobileVerify> verifyMobile();

    @FormUrlEncoded
    @GET("bahmashah/hofAndMembers/1067-7PVQ-28383?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<HofAndMembers> getmembers();

    @FormUrlEncoded
    @GET("hofAndMember/ForApp/WDYYYGG?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<HofDetailss> getHofDetails();

    @FormUrlEncoded
    @GET("gptestuser/verifyMobileUser/123456?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<VerifiedData> verifyData();

    @FormUrlEncoded
    @GET("BhamashahgetNregaDetails/01012016/2711?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<Narega> naregaCheck();


    @FormUrlEncoded
    @GET("getAccountDetails/683601075581?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<BankAccount> bankAccount();

    @FormUrlEncoded
    @GET("verifyAccount/3390379679?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<AccountHolder> getHolder();

}
