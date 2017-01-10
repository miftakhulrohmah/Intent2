package id.sch.smktelkom_mlg.learn.intent2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;


public class InputActivity extends AppCompatActivity {

    private static String nama;
    private static Integer Lhr;
    public static final String NAMA = "nama";
    static final Integer TAHUN_LAHIR = Lhr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        findViewById(R.id.buttonFinish).setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        EditText etNama = (EditText) findViewById(R.id.editTextNama);
                        EditText etThnlhr = (EditText) findViewById(R.id.editTextTahunlhr);
                        String nama = etNama.getText().toString();
                        String tahunStr = etThnlhr.getText().toString();


                        int Lhr = tahunStr.isEmpty()?
                                Calendar.getInstance().get(Calendar.YEAR): Integer.parseInt(tahunStr);

                        Intent intent = new Intent();
                        intent.putExtra(NAMA, nama);
                        intent.putExtra(String.valueOf(TAHUN_LAHIR), Lhr);

                        setResult(RESULT_OK,intent);
                        finish();
                    }
                }
        );


    }
}
