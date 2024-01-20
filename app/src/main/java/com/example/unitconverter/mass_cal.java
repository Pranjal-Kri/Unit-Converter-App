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

public class mass_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Kilogram";
    String toUnit = "Kilogram";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Kilogram",
            "Gram",
            "Milligram",
            "Pound",
            "Tonne", "Ounce"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_cal);

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
                String massInput = et_fromUnit.getText().toString();
                if (massInput.equals("") || massInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(massInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kilogramToGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilogramToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilogramToPound(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilogramToTonne(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilogramToOunce(Double.parseDouble(massInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gramToKiloGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(massInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gramToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gramToPound(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gramToTonne(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gramToOunce(Double.parseDouble(massInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milligramToKiloGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(milligramToGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(massInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milligramToPound(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milligramToTonne(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milligramToOunce(Double.parseDouble(massInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(poundToKiloGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(poundToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(poundToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(massInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(poundToTonne(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(poundToOunce(Double.parseDouble(massInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tonneToKiloGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tonneToGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tonneToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tonneToPound(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(massInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tonneToOunce(Double.parseDouble(massInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(ounceToKiloGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(ounceToGram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(ounceToMilligram(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(ounceToPound(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(ounceToTonne(Double.parseDouble(massInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(massInput);
                        }
                    }
                }
            }
        });


        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(mass_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Milligram",
                        "Pound",
                        "Tonne", "Ounce"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(mass_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Kilogram",
                        "Gram",
                        "Milligram",
                        "Pound",
                        "Tonne", "Ounce"
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

    //Kilogram
    private String kilogramToGram(double kilogram) {
        double gram = kilogram * 1000;
        return String.valueOf(gram);
    }

    private String kilogramToMilligram(double kilogram) {
        double milligram = kilogram * 1.0E+6;
        return String.valueOf(milligram);
    }

    private String kilogramToPound(double kilogram) {
        double pound = kilogram *2.205;
        return String.valueOf(pound);
    }

    private String kilogramToTonne(double kilogram) {
        double tonne = kilogram / 1.0E3;
        return String.valueOf(tonne);
    }

    private String kilogramToOunce(double kilogram) {
        double ounce = kilogram * 35.274;
        return String.valueOf(ounce);
    }

    //Gram
    private String gramToMilligram(double gram) {
        double milligram = gram * 1.0E3;
        return String.valueOf(milligram);
    }

    private String gramToPound(double gram) {
        double pound = gram / 453.6;
        return String.valueOf(pound);
    }

    private String gramToTonne(double gram) {
        double tonne = gram / 1.0E6;
        return String.valueOf(tonne);
    }

    private String gramToOunce(double gram) {
        double ounce = gram / 28.35;
        return String.valueOf(ounce);
    }

    private String gramToKiloGram(double gram) {
        double kiloGram = gram * 0.001;
        return String.valueOf(kiloGram);
    }

    //Milli Gram
    private String milligramToPound(double milligram) {
        double pound = milligram / 453600;
        return String.valueOf(pound);
    }

    private String milligramToTonne(double milligram) {
        double tonne = milligram / 1e+9;
        return String.valueOf(tonne);
    }

    private String milligramToOunce(double milligram) {
        double ounce = milligram / 28350;
        return String.valueOf(ounce);
    }

    private String milligramToKiloGram(double milligram) {
        double kiloGram = milligram * 1.0E+6;
        return String.valueOf(kiloGram);
    }

    private String milligramToGram(double milligram) {
        double gram = milligram / 1000;
        return String.valueOf(gram);
    }

    //Pound
    private String poundToTonne(double pound) {
        double tonne = pound / 2205;
        return String.valueOf(tonne);
    }

    private String poundToOunce(double pound) {
        double ounce = pound * 16;
        return String.valueOf(ounce);
    }

    private String poundToKiloGram(double pound) {
        double kiloGram = pound / 2.205;
        return String.valueOf(kiloGram);
    }

    private String poundToGram(double pound) {
        double Gram = pound * 453.6;
        return String.valueOf(Gram);
    }

    private String poundToMilligram(double pound) {
        double milligram = pound * 453600;
        return String.valueOf(milligram);
    }

    //Tonne
    private String tonneToOunce(double tonne) {
        double ounce = tonne * 35270;
        return String.valueOf(ounce);
    }

    private String tonneToKiloGram(double tonne) {
        double kiloGram = tonne * 1e+3;
        return String.valueOf(kiloGram);
    }

    private String tonneToGram(double tonne) {
        double Gram = tonne * 1e+6;
        return String.valueOf(Gram);
    }

    private String tonneToMilligram(double tonne) {
        double milligram = tonne / 1e+9;
        return String.valueOf(milligram);
    }

    private String tonneToPound(double tonne) {
        double pound = tonne * 2205;
        return String.valueOf(pound);
    }

    //Ounce
    private String ounceToKiloGram(double ounce) {
        double kiloGram = ounce / 35.274;
        return String.valueOf(kiloGram);
    }

    private String ounceToGram(double ounce) {
        double Gram = ounce * 28.35;
        return String.valueOf(Gram);
    }

    private String ounceToMilligram(double ounce) {
        double milligram = ounce * 28350;
        return String.valueOf(milligram);
    }

    private String ounceToPound(double ounce) {
        double pound = ounce / 16;
        return String.valueOf(pound);
    }

    private String ounceToTonne(double ounce) {
        double tonne = ounce / 35270;
        return String.valueOf(tonne);
    }

}