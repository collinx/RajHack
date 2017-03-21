package in.gov.rajasthan.doitc.rajhack;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {


    @GET("gptestuser/verifyMobileUser/123456?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<MobileVerify> verifyMobile();


    @GET("hofAndMember/ForApp/{id}?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<HofDetailss> getmembers(@Path("id") String groupId);


    @GET("hofAndMember/ForApp/WDYYYGG?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<HofDetailss> getHofDetails();


    @GET("gptestuser/verifyMobileUser/123456?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<VerifiedData> verifyData();


    @GET("BhamashahgetNregaDetails/01012016/2711?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<Narega> naregaCheck();



    @GET("getAccountDetails/683601075581?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<BankAccount> bankAccount();


    @GET("verifyAccount/3390379679?client_id=ad7288a4-7764-436d-a727-783a977f1fe1")
    Call<AccountHolder> getHolder();

}
