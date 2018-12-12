package com.example.shlomo.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    Button btn_clear;
    Button btn_slash;
    Button btn_multiple;
    Button btn_delete;
    Button btn_seven;
    Button btn_eight;
    Button btn_nine;
    Button btn_minus;
    Button btn_four;
    Button btn_five;
    Button btn_six;
    Button btn_plus;
    Button btn_one;
    Button btn_two;
    Button btn_three;
    Button btn_equal;
    Button btn_precent;
    Button btn_zero;
    Button btn_dot;
    int calculations = 0;
    int ezer = 0;
    TextView tv_calculation_field = null;
    boolean partial = false;
    boolean multyple = false;
    boolean plus = false;
    boolean minus = false;
    boolean precent = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tal = (Button) findViewById(R.id.tal);
        tal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome to the best calculator in the world", Toast.LENGTH_SHORT).show();
            }
        });
        tv_calculation_field = findViewById(R.id.calculation_field);
        btn_clear = findViewById(R.id.btn_clear);
        btn_slash = findViewById(R.id.btn_slash);
        btn_multiple = findViewById(R.id.btn_multiple);
        btn_delete = findViewById(R.id.btn_delete);
        btn_seven = findViewById(R.id.btn_seven);

        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_minus = findViewById(R.id.btn_minus);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_plus = findViewById(R.id.btn_plus);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_equal = findViewById(R.id.btn_equal);
        btn_precent = findViewById(R.id.btn_precent);
        btn_zero = findViewById(R.id.btn_zero);
        btn_dot = findViewById(R.id.btn_dot);
    }

    @Override
    public void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Welcome to the best calculator in the world", Toast.LENGTH_SHORT).show();
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("test","test");

            }
        });
        btn_two.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_clear:
                tv_calculation_field.setText(null);
                break;

            case R.id.btn_slash:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    if (partial == true) {
                        ezer = ((calculations) / (ezer));
                        partial = true;
                        calculations = ezer;
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        break;
                    } else {
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        partial = true;
                        tv_calculation_field = null;
                        break;
                    }
                }

            case R.id.btn_multiple:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    if (multyple == true) {
                        ezer = ((calculations) * (ezer));
                        multyple = true;
                        calculations = ezer;
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        break;
                    } else {
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        multyple = true;
                        tv_calculation_field = null;
                        break;
                    }

                }

            case R.id.btn_delete:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    ezer = calculations;
                    calculations = calculations % 10;
                    tv_calculation_field.setText(calculations);
                    break;
                }

            case R.id.btn_minus:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    if (minus == true) {
                        ezer = ((calculations) - (ezer));
                        minus = true;
                        calculations = ezer;
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        break;
                    } else {
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        minus = true;
                        tv_calculation_field = null;
                        break;
                    }

                }

            case R.id.btn_plus:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    if (plus == true) {
                        ezer = ((calculations) + (ezer));
                        plus = true;
                        calculations = ezer;
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        break;
                    } else {
                        ezer = calculations;
                        tv_calculation_field.setText(calculations);
                        plus = true;
                        tv_calculation_field = null;
                        break;
                    }

                }

            case R.id.btn_precent:
                Toast.makeText(this, "You have nothing to do with this option", Toast.LENGTH_SHORT).show();
                precent = false;
                break;

            case R.id.btn_dot:
                Toast.makeText(this, "You have nothing to do with this option", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_one:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                tv_calculation_field.setText(calculations + "1");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_two:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                tv_calculation_field.setText(calculations + "2");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_three:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                tv_calculation_field.setText(calculations + "3");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_four:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                tv_calculation_field.setText(calculations + "4");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_five:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                tv_calculation_field.setText(calculations + "5");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_six:
                tv_calculation_field.setText(tv_calculation_field.toString() + "6");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_seven:
                tv_calculation_field.setText(tv_calculation_field.toString() + "7");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_eight:
                tv_calculation_field.setText(tv_calculation_field.toString() + "8");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_nine:
                tv_calculation_field.setText(tv_calculation_field.toString() + "9");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_zero:
                tv_calculation_field.setText(tv_calculation_field.toString() + "0");
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                break;

            case R.id.btn_equal:
                calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                if (tv_calculation_field == null) {
                    break;
                } else {
                    if (minus == true) {
                        calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                        ezer = ((calculations) - (ezer));
                        calculations = ezer;
                        tv_calculation_field.setText(calculations);
                        break;
                    }
                    if (plus == true) {
                        calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                        ezer = ((calculations) + (ezer));
                        calculations = ezer;
                        tv_calculation_field.setText(calculations);
                        break;
                    }
                    if (partial == true) {
                        calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                        ezer = ((calculations) / (ezer));
                        calculations = ezer;
                        tv_calculation_field.setText(calculations);
                        break;
                    }
                    if (multyple == true) {
                        calculations = Integer.parseInt(tv_calculation_field.getText().toString());
                        ezer = ((calculations) * (ezer));
                        calculations = ezer;
                        tv_calculation_field.setText(calculations);
                        break;
                    } else {
                        calculations = 0;
                        tv_calculation_field.setText(calculations);
                        break;
                    }
                }
        }
    }
}

