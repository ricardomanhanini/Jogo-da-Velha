package manhanini.jogovelha;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String jogada = "X";

    public Button botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9;

    public TextView rotInf;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rotInf = (TextView)findViewById(R.id.rotulo_informacoes);
        rotInf.setText("Jogada do " + jogada);

        botao1 = (Button) findViewById(R.id.button_1);
        botao2 = (Button) findViewById(R.id.button_2);
        botao3 = (Button) findViewById(R.id.button_3);
        botao4 = (Button) findViewById(R.id.button_4);
        botao5 = (Button) findViewById(R.id.button_5);
        botao6 = (Button) findViewById(R.id.button_6);
        botao7 = (Button) findViewById(R.id.button_7);
        botao8 = (Button) findViewById(R.id.button_8);
        botao9 = (Button) findViewById(R.id.button_9);

        botao1.setBackgroundColor(Color.LTGRAY);
        botao2.setBackgroundColor(Color.LTGRAY);
        botao3.setBackgroundColor(Color.LTGRAY);
        botao4.setBackgroundColor(Color.LTGRAY);
        botao5.setBackgroundColor(Color.LTGRAY);
        botao6.setBackgroundColor(Color.LTGRAY);
        botao7.setBackgroundColor(Color.LTGRAY);
        botao8.setBackgroundColor(Color.LTGRAY);
        botao9.setBackgroundColor(Color.LTGRAY);

            }
    public void selecao (View buttonSelecao){
        Button botao = (Button)buttonSelecao;

        String idBotao = buttonSelecao.getResources().getResourceName(buttonSelecao.getId());
        idBotao = idBotao.substring(idBotao.indexOf("_") + 1, idBotao.length());

        botao.setText(jogada);
        botao.setEnabled(false);
        analisaJogada(idBotao);
        if (analisaJogada(idBotao) == false){
            if (jogada.equalsIgnoreCase("X"))
                jogada = "0";
            else
                jogada = "X";
            rotInf.setText("Jogada do " + jogada);
            }
    }

    public boolean analisaJogada(String idBotao){
        String txtB1 = botao1.getText().toString();
        String txtB2 = botao2.getText().toString();
        String txtB3 = botao3.getText().toString();
        String txtB4 = botao4.getText().toString();
        String txtB5 = botao5.getText().toString();
        String txtB6 = botao6.getText().toString();
        String txtB7 = botao7.getText().toString();
        String txtB8 = botao8.getText().toString();
        String txtB9 = botao9.getText().toString();

        if (txtB1 == "X" && txtB2 == "X" && txtB3 == "X"){
            botao1.setBackgroundColor(Color.BLUE);
            botao2.setBackgroundColor(Color.BLUE);
            botao3.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB4 == "X" && txtB5 == "X" && txtB6 == "X"){
            botao4.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao6.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB7 == "X" && txtB8 == "X" && txtB9 == "X"){
            botao7.setBackgroundColor(Color.BLUE);
            botao8.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB1 == "X" && txtB4 == "X" && txtB7 == "X"){
            botao1.setBackgroundColor(Color.BLUE);
            botao4.setBackgroundColor(Color.BLUE);
            botao7.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB2 == "X" && txtB5 == "X" && txtB8 == "X"){
            botao2.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao8.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB3 == "X" && txtB6 == "X" && txtB9 == "X"){
            botao3.setBackgroundColor(Color.BLUE);
            botao6.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB1 == "X" && txtB5 == "X" && txtB9 == "X"){
            botao1.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }
        else if (txtB3 == "X" && txtB5 == "X" && txtB7 == "X"){
            botao3.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao7.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }


        if (txtB1 == "0" && txtB2 == "0" && txtB3 == "0"){
            botao1.setBackgroundColor(Color.BLUE);
            botao2.setBackgroundColor(Color.BLUE);
            botao3.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB4 == "0" && txtB5 == "0" && txtB6 == "0"){
            botao4.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao6.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB7 == "0" && txtB8 == "0" && txtB9 == "0"){
            botao7.setBackgroundColor(Color.BLUE);
            botao8.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB1 == "0" && txtB4 == "0" && txtB7 == "0"){
            botao1.setBackgroundColor(Color.BLUE);
            botao4.setBackgroundColor(Color.BLUE);
            botao7.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB2 == "0" && txtB5 == "0" && txtB8 == "0"){
            botao2.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao8.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB3 == "0" && txtB5 == "0" && txtB9 == "0"){
            botao3.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB1 == "0" && txtB5 == "0" && txtB9 == "0"){
            botao1.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao9.setBackgroundColor(Color.BLUE);
            return fimDeJogo("0");
        }
        else if (txtB3 == "X" && txtB5 == "X" && txtB7 == "X"){
            botao3.setBackgroundColor(Color.BLUE);
            botao5.setBackgroundColor(Color.BLUE);
            botao7.setBackgroundColor(Color.BLUE);
            return fimDeJogo("X");
        }

        return false;

    }

    public boolean fimDeJogo(String Ganhador){
        rotInf.setText("Jogador " + Ganhador + " Ganhou!");
        botao1.setEnabled(false);
        botao2.setEnabled(false);
        botao3.setEnabled(false);
        botao4.setEnabled(false);
        botao5.setEnabled(false);
        botao6.setEnabled(false);
        botao7.setEnabled(false);
        botao8.setEnabled(false);
        botao9.setEnabled(false);
        return true;

    }


    public void reiniciar (View buttonreset){

        botao1.setText("");
        botao1.setEnabled(true);
        botao2.setText("");
        botao2.setEnabled(true);
        botao3.setText("");
        botao3.setEnabled(true);
        botao4.setText("");
        botao4.setEnabled(true);
        botao5.setText("");
        botao5.setEnabled(true);
        botao6.setText("");
        botao6.setEnabled(true);
        botao7.setText("");
        botao7.setEnabled(true);
        botao8.setText("");
        botao8.setEnabled(true);
        botao9.setText("");
        botao9.setEnabled(true);

        botao1.setBackgroundColor(Color.LTGRAY);
        botao2.setBackgroundColor(Color.LTGRAY);
        botao3.setBackgroundColor(Color.LTGRAY);
        botao4.setBackgroundColor(Color.LTGRAY);
        botao5.setBackgroundColor(Color.LTGRAY);
        botao6.setBackgroundColor(Color.LTGRAY);
        botao7.setBackgroundColor(Color.LTGRAY);
        botao8.setBackgroundColor(Color.LTGRAY);
        botao9.setBackgroundColor(Color.LTGRAY);

        Button reset = (Button)buttonreset;
    }
}
