package br.edu.fa7.trabalho01;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by osmar on 08/10/2015.
 */
public class ActivityMain extends Activity {

    private Button btnAndroidWeb;
    private Button btnLocalizacaoFA7;
    private Button btnLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associando os componentes da View.
        btnAndroidWeb = (Button) findViewById(R.id.btnAndroidWeb);
        btnLocalizacaoFA7 = (Button) findViewById(R.id.btnLocalizacaoFA7);
        btnLigar = (Button) findViewById(R.id.btnLigar);



        // Uso de método anônimo para simplificar o desenvolvimento.
        btnAndroidWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_SEARCH);
                intent.putExtra(SearchManager.QUERY, "android");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btnLocalizacaoFA7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com/maps/place/Faculdade+7+de+Setembro/@-3.7710261,-38.4857209,17z/data=!3m1!4b1!4m2!3m1!1s0x0:0x3d5127cdeb3dde1d"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        // Passando parâmetro diretamente na instância do Intent
        btnLigar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:999825832"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}
