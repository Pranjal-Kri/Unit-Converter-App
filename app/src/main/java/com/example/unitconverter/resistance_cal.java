package com.example.unitconverter;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class resistance_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Ohm";
    String toUnit = "MegaOhm";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Ohm",
            "Megaohm",
            "Microhm",
            "Volt/ampere",
            "Reciprocal Siemens", "abohm"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resistance_cal);

        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.temp_relativeLayout);

        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);

        tv_fromUnit.setText(values[0]);
        tv_toUnit.setText(values[0]);

        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);

        cv_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resisInput = et_fromUnit.getText().toString();
                if (resisInput.equals("") || resisInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(resisInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(ohmToMegaOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(ohmToMicroOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(ohmToVoltPamp(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(ohmToSiemens(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(ohmToAbohm(Double.parseDouble(resisInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(megaOhmToOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(resisInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(megaOhmToMicroOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(megaOhmToVoltPamp(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(megaOhmToSiemens(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(megaOhmToAbohm(Double.parseDouble(resisInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(microOhmToOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(microOhmToMegaOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(resisInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(microOhmToVoltPamp(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(microOhmToSiemens(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(microOhmToAbohm(Double.parseDouble(resisInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(voltPampToOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(voltPampToMegaOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(voltPampToMicroOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(resisInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(voltPampToSiemens(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(voltPampToAbohm(Double.parseDouble(resisInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(siemensToOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(siemensToMegaOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(siemensToMicroOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(siemensToVoltPamp(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(resisInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(siemensToAbohm(Double.parseDouble(resisInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(abohmToOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(abohmToMegaOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(abohmToMicroOhm(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(abohmToVoltPamp(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(abohmToSiemens(Double.parseDouble(resisInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(resisInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(resistance_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Ohm",
                        "Megaohm",
                        "Microhm",
                        "Volt/ampere",
                        "Reciprocal Siemens", "abohm"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                toUnit = selectedItem;
                                tv_toUnit.setText(toUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

        cv_fromUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(resistance_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Ohm",
                        "Megaohm",
                        "Microhm",
                        "Volt/ampere",
                        "Reciprocal Siemens", "abohm"
                };

                builder.setSingleChoiceItems(
                        flowers, // Items list
                        -1, // Index of checked item (-1 = no selection)
                        new DialogInterface.OnClickListener() // Item click listener
                        {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // Get the alert dialog selected item's text
                                String selectedItem = Arrays.asList(flowers).get(i);
                                fromUnit = selectedItem;
                                tv_fromUnit.setText(fromUnit);

                            }
                        });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // Just dismiss the alert dialog after selection
                        // Or do something now
                        dialogInterface.dismiss();
                    }
                });

                AlertDialog dialog = builder.create();

                // Finally, display the alert dialog
                dialog.show();

            }
        });

    }

    //ohm
    private String ohmToMicroOhm(double ohm) {
        double microOhm = ohm * 1000000;
        return String.valueOf(microOhm);
    }

    private String ohmToVoltPamp(double ohm) {
        double voltPamp = ohm ;
        return String.valueOf(voltPamp);
    }

    private String ohmToSiemens(double ohm) {
        double siemens = ohm;
        return String.valueOf(siemens);
    }

    private String ohmToAbohm(double ohm) {
        double abohm = ohm * 1e+9;
        return String.valueOf(abohm);
    }

    private String ohmToMegaOhm(double ohm) {
        double megaOhm = ohm / 1000000;
        return String.valueOf(megaOhm);
    }

    //megaOhm
    private String megaOhmToMicroOhm(double megaOhm) {
        double microOhm = megaOhm * 1000000000000.;
        return String.valueOf(microOhm);
    }

    private String megaOhmToVoltPamp(double megaOhm) {
        double voltPamp = megaOhm * 1000000;
        return String.valueOf(voltPamp);
    }

    private String megaOhmToSiemens(double megaOhm) {
        double siemens = megaOhm * 1000000;
        return String.valueOf(siemens);
    }

    private String megaOhmToAbohm(double megaOhm) {
        double abohm = megaOhm * 1.0E+15;
        return String.valueOf(abohm);
    }

    private String megaOhmToOhm(double megaOhm) {
        double ohm = megaOhm * 1000000;
        return String.valueOf(ohm);
    }

    //MicroOhm
    private String microOhmToVoltPamp(double microOhm) {
        double voltPamp = microOhm / 1000000;
        return String.valueOf(voltPamp);
    }

    private String microOhmToSiemens(double microOhm) {
        double siemens = microOhm / 1000000;
        return String.valueOf(siemens);
    }

    private String microOhmToAbohm(double microOhm) {
        double abohm = microOhm * 1000;
        return String.valueOf(abohm);
    }

    private String microOhmToOhm(double microOhm) {
        double ohm = microOhm / 1000000.;
        return String.valueOf(ohm);
    }

    private String microOhmToMegaOhm(double microOhm) {
        double megaOhm = microOhm / 1e+12;
        return String.valueOf(megaOhm);
    }

    //VoltPamp
    private String voltPampToSiemens(double voltPamp) {
        double siemens = voltPamp;
        return String.valueOf(siemens);
    }

    private String voltPampToAbohm(double voltPamp) {
        double abohm = voltPamp * 1000000000;
        return String.valueOf(abohm);
    }

    private String voltPampToOhm(double voltPamp) {
        double ohm = voltPamp;
        return String.valueOf(ohm);
    }

    private String voltPampToMegaOhm(double voltPamp) {
        double megaOhm = voltPamp / 1000000;
        return String.valueOf(megaOhm);
    }

    private String voltPampToMicroOhm(double voltPamp) {
        double microOhm = voltPamp * 1000000;
        return String.valueOf(microOhm);
    }

    //Siemens
    private String siemensToAbohm(double siemens) {
        double abohm = siemens * 1000000000;
        return String.valueOf(abohm);
    }

    private String siemensToOhm(double siemens) {
        double ohm = siemens;
        return String.valueOf(ohm);
    }

    private String siemensToMegaOhm(double siemens) {
        double megaOhm = siemens / 1000000;
        return String.valueOf(megaOhm);
    }

    private String siemensToMicroOhm(double siemens) {
        double microOhm = siemens * 1000000;
        return String.valueOf(microOhm);
    }

    private String siemensToVoltPamp(double siemens) {
        double voltPamp = siemens;
        return String.valueOf(voltPamp);
    }

    //Abohm
    private String abohmToOhm(double abohm) {
        double ohm = abohm / 1000000000;
        return String.valueOf(ohm);
    }

    private String abohmToMegaOhm(double abohm) {
        double megaOhm = abohm / 1.0E+15;
        return String.valueOf(megaOhm);
    }

    private String abohmToMicroOhm(double abohm) {
        double microOhm = abohm / 1000;
        return String.valueOf(microOhm);
    }

    private String abohmToVoltPamp(double abohm) {
        double voltPamp = abohm / 1000000000;
        return String.valueOf(voltPamp);
    }

    private String abohmToSiemens(double abohm) {
        double siemens = abohm / 1000000000;
        return String.valueOf(siemens);
    }

}