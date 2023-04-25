package alura.com.app_imc;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtPeso, edtAltura, edtImc, edtSituacao;
    int idade=0;// declaração da variável subescapular
 // atribuição do valor da variável subescapular

// atribuição do valor da variável triceps

    RadioButton rbFeminino, rbMasculino;
    CheckBox chkIdade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtPeso= (EditText) findViewById(R.id.editTextPeso);
        edtAltura=(EditText) findViewById(R.id.editTextAltura);
        edtImc=(EditText) findViewById(R.id.editTextImc);
        edtSituacao=(EditText) findViewById(R.id.editTextSituacao);
        rbFeminino=(RadioButton) findViewById(R.id.radioFeminino);
        rbMasculino=(RadioButton) findViewById(R.id.radioMasculino);
        chkIdade=(CheckBox) findViewById(R.id.checkIdade);


    }



    public void verificar(View v) {
        //entrada
        double peso, altura, imc = 0;
        boolean idade;// true - marcado false desmarcado
        int sexo;// 1- feminino 2- masculino
        String situacao = "";
        peso = Double.parseDouble(edtPeso.getText().toString());
        altura = Double.parseDouble(edtAltura.getText().toString());
        imc = peso / Math.pow(altura, 2);
        if (chkIdade.isChecked()) {
            idade = true;
        } else {
            idade = false;
        }
        if (rbFeminino.isChecked()) {
            sexo = 1;
            if ( 19.1<imc && imc<=25.8) {
                situacao = "Peso normal";
            } else if (25.8<imc &&imc <=27.3) {
                situacao = "Marginalmente acima do peso";
            } else if (27.3<imc&&imc <=32.3) {
                situacao ="Acima do peso ideal" ;

            } else if (imc > 32.3) {
                situacao = "Obesa";
            } else {
                situacao = "Abaixo do Peso";
            }
            edtImc.setText(String.format("%.2f", imc));
            edtSituacao.setText(situacao);
        } else {
            sexo = 2;
            if ( 20.7<imc && imc<=26.4) {
                situacao = "Peso normal";
            } else if (26.4<imc &&imc <=27.8) {
                situacao = "Marginalmente acima do peso";
            } else if (27.8<imc&&imc <=31.1) {
                situacao ="Acima do peso ideal" ;

            } else if (imc > 31.1) {
                situacao = "Obesa";
            } else {
                situacao = "Abaixo do Peso";
            }
            edtImc.setText(String.format("%.2f", imc));
            edtSituacao.setText(situacao);
        }


    }
        // processamento
        // Aluno deve completar o código

        // saída



    }

