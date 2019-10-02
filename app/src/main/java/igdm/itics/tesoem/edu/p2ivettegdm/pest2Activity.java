package igdm.itics.tesoem.edu.p2ivettegdm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pest2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest2);
    }
    public void cargarpantalla(View v){
        Intent frm3 = new Intent(this,pest3Activity.class);
        startActivity(frm3);
        finish();
    }
}
