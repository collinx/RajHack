package in.gov.rajasthan.doitc.rajhack;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
                                   ;
                            int num = response.body().getFamilyDetailss().size();
                            extra = new String[num];
                            for (int i = 0; i < num; i++) {
                                extra[i] = (i + 1) + " Member ID: " + response.body().getFamilyDetailss().get(i).getMID()
                                        + "\nMember Name: " + response.body().getFamilyDetailss().get(i).getNAMEENG()
                                        + "\nGENDER: " + response.body().getFamilyDetailss().get(i).getGENDER()
                                        + "\nRelation: " + response.body().getFamilyDetailss().get(i).getRELATIONENG()
                                        + "\nDOB: " + response.body().getFamilyDetailss().get(i).getDOB()
                                        + "\nEDUCATION: " + response.body().getFamilyDetailss().get(i).getEDUCATIONDESCENG()
                                       ;
                                result = result + '\n' + extra[i] + '\n';

                            }



                            edittext = result;
                            try {
                                bitmap = TextToImageEncode(edittext);

                                image.setImageBitmap(bitmap);
                                Button imagee = (Button) findViewById(R.id.button5);
                                imagee.setVisibility(View.VISIBLE);

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
        Button imagee = (Button) findViewById(R.id.button5);
        imagee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = (ImageView) findViewById(R.id.image1);
                 Bitmap bitmap1 = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                    if(Build.VERSION.SDK_INT>Build.VERSION_CODES.LOLLIPOP_MR1){
                        String[] perms = {"android.permission. WRITE_EXTERNAL_STORAGE"};

                        int permsRequestCode = 200;

                        requestPermissions(perms, permsRequestCode);
                    }
                 String path = Environment.getExternalStorageDirectory().getPath().toString();
                OutputStream fOutputStream = null;
                String dirPath = path+"/DCIM/BhamashahCode/";
                File dirFile = new File(dirPath);
                if(!dirFile.exists()){
                    dirFile.mkdirs();
                }
                String namee = ""+(new SimpleDateFormat("yyyyMMdd_HHmmss", Locale
                        .getDefault())).format(new Date())+ ".jpg";
                File file = new File(dirFile,namee);

                        try {

                            fOutputStream = new FileOutputStream(file);

                            bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, fOutputStream);

                            fOutputStream.flush();
                            fOutputStream.close();
                            Toast.makeText(getApplicationContext(), "Image Saved: "+ dirPath, Toast.LENGTH_SHORT).show();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                            return;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return;
                        }



            }

        });


    }
     /*

*/
     @Override
     public void onRequestPermissionsResult(int permsRequestCode, String[] permissions, int[] grantResults){

         switch(permsRequestCode){

             case 200:

                 boolean writeAccepted = grantResults[0]== PackageManager.PERMISSION_GRANTED;

                 break;

         }

     }



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
