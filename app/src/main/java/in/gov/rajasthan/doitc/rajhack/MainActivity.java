package in.gov.rajasthan.doitc.rajhack;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="0";
    String edittext;
    EditText text;
    ImageView image;
    Button button;
    Bitmap bitmap;
    Thread thread ;
    String result;
    String[] extra;
    public final static int QRcodeWidth = 500 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         text = (EditText) findViewById(R.id.text1);
          image = (ImageView)findViewById(R.id.image1);
          button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edittext = text.getText().toString();
                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);


                Call<HofDetailss> call = apiService.getmembers(edittext);
                call.enqueue(new Callback<HofDetailss>() {
                    @Override
                    public void onResponse(Call<HofDetailss>call, Response<HofDetailss> response) {
                        if (response.body().getFamilyDetailss() != null ) {
                            result = "Head Of Family: " + response.body().getHofDetail().getNAMEENG()
                                    + "\nFAMILY ID NO:" + response.body().getHofDetail().getFAMILYIDNO()
                                    + "\nAddress: " + response.body().getHofDetail().getADDRESS()
                                    + "\nRation Card Number: " + response.body().getHofDetail().getRATIONCARDNO()
                                    + "\nCategory: " + response.body().getHofDetail().getCATEGORYDESCENG()
                                    + "\nEconomic Group: " + response.body().getHofDetail().getECONOMICGROUP()
                                    +"\n";
                            int num = response.body().getFamilyDetailss().size();
                            extra = new String[num];
                            for (int i = 0; i < num; i++) {
                                extra[i] = (i + 1) + " Member ID: " + response.body().getFamilyDetailss().get(i).getMID()
                                        + "\nMember Name: " + response.body().getFamilyDetailss().get(i).getNAMEENG()
                                        + "\nGENDER: " + response.body().getFamilyDetailss().get(i).getGENDER()
                                        + "\nRelation: " + response.body().getFamilyDetailss().get(i).getRELATIONENG()
                                        + "\nDOB: " + response.body().getFamilyDetailss().get(i).getDOB()
                                        + "\nEDUCATION: " + response.body().getFamilyDetailss().get(i).getEDUCATIONDESCENG()
                                        + "\n";
                                result = result + extra[i];

                            }



                            edittext = result;
                            try {
                                bitmap = TextToImageEncode(edittext);

                                image.setImageBitmap(bitmap);

                            } catch (WriterException e) {
                                e.printStackTrace();
                            }


                        } else {
                            Toast.makeText(getApplicationContext(), "No such Bhamashah Id", Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onFailure(Call<HofDetailss>call, Throwable t) {
                        // Log error here since request failed
                        Log.e(TAG, t.toString());
                    }
                });





            }
        });



    }
     /*

*/


    Bitmap TextToImageEncode(String Value) throws WriterException {
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(
                    Value,
                    BarcodeFormat.DATA_MATRIX.QR_CODE,
                    QRcodeWidth, QRcodeWidth, null
            );

        } catch (IllegalArgumentException Illegalargumentexception) {

            return null;
        }
        int bitMatrixWidth = bitMatrix.getWidth();

        int bitMatrixHeight = bitMatrix.getHeight();

        int[] pixels = new int[bitMatrixWidth * bitMatrixHeight];

        for (int y = 0; y < bitMatrixHeight; y++) {
            int offset = y * bitMatrixWidth;

            for (int x = 0; x < bitMatrixWidth; x++) {

                pixels[offset + x] = bitMatrix.get(x, y) ?
                        getResources().getColor(R.color.QRCodeBlackColor):getResources().getColor(R.color.QRCodeWhiteColor);
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(bitMatrixWidth, bitMatrixHeight, Bitmap.Config.ARGB_4444);

        bitmap.setPixels(pixels, 0, 500, 0, 0, bitMatrixWidth, bitMatrixHeight);
        return bitmap;
    }





}
