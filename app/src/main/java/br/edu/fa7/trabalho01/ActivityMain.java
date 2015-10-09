package br.edu.fa7.trabalho01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by osmar on 08/10/2015.
 */
public class ActivityMain extends Activity {

    private Button btnAndroidWeb;
    private Button btnEspelho;
    private Button btnLigar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Associando os componentes da View.
        btnAndroidWeb = (Button) findViewById(R.id.btnAndroidWeb);
        btnEspelho = (Button) findViewById(R.id.btnEspelho);
        btnLigar = (Button) findViewById(R.id.btnLigar);



        // Uso de método anônimo para simplificar o desenvolvimento.
        btnAndroidWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

    }
}
