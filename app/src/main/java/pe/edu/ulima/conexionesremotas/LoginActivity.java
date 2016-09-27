package pe.edu.ulima.conexionesremotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    EditText eteUsuario, etePassword;
    Button butLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        eteUsuario = (EditText) findViewById(R.id.eteUsuario);
        etePassword = (EditText) findViewById(R.id.etePassword);
        butLogin = (Button) findViewById(R.id.butLogin);

        butLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONObject jsRoot = new JSONObject();
                try {
                    jsRoot.put("usuario",eteUsuario.getText().toString());
                    jsRoot.put("password",etePassword.getText().toString());
                    Log.i("LoginActivity",jsRoot.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("LoginActivity",e.getMessage());
                }
            }
        });
    }
}
