package com.example.unitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class pressure_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Pascal";
    String toUnit = "Bar";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Pascal",
            "Bar",
            "Pound per square inch",
            "Standard Atmosphere",
            "Torr", "Megapascal"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure_cal);

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
                String presInput = et_fromUnit.getText().toString();
                if (presInput.equals("") || presInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(presInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(pascalToBar(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(pascalToPoundpsi(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(pascalToStandardAtmos(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(pascalToTorr(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(pascalToMegaPascal(Double.parseDouble(presInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(barToPascal(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(presInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(barToPoundpsi(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(barToStandardAtmos(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(barToTorr(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(barToMegaPascal(Double.parseDouble(presInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(poundpsiToPascal(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(poundpsiToBar(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(presInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(poundpsiToStandardAtmos(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(poundpsiToTorr(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(poundpsiToMegaPascal(Double.parseDouble(presInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(standardAtmosToPascal(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(standardAtmosToBar(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(standardAtmosToPoundpsi(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(presInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(standardAtmosToTorr(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(standardAtmosToMegaPascal(Double.parseDouble(presInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(torrToPascal(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(torrToBar(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(torrToPoundpsi(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(torrToStandardAtmos(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(presInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(torrToMegaPascal(Double.parseDouble(presInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(megaPascalToPascal(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(megaPascalToBar(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(megaPascalToPoundpsi(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(megaPascalToStandardAtmos(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(megaPascalToTorr(Double.parseDouble(presInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(presInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(pressure_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Pascal",
                        "Bar",
                        "Pound per square inch",
                        "Standard Atmosphere",
                        "Torr", "Megapascal"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(pressure_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Pascal",
                        "Bar",
                        "Pound per square inch",
                        "Standard Atmosphere",
                        "Torr", "Megapascal"
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

    //pascal
    private String pascalToPoundpsi(double pascal) {
        double poundpsi = pascal /6895;
        return String.valueOf(poundpsi);
    }

    private String pascalToStandardAtmos(double pascal) {
        double standardAtmos = pascal /101300;
        return String.valueOf(standardAtmos);
    }

    private String pascalToTorr(double pascal) {
        double torr = pascal /133.3;
        return String.valueOf(torr);
    }

    private String pascalToMegaPascal(double pascal) {
        double megaPascal = pascal /1e+6;
        return String.valueOf(megaPascal);
    }

    private String pascalToBar(double pascal) {
        double bar = pascal/1e+5;
        return String.valueOf(bar);
    }

    //bar
    private String barToPoundpsi(double bar) {
        double poundpsi = bar*14.504;
        return String.valueOf(poundpsi);
    }

    private String barToStandardAtmos(double bar) {
        double standardAtmos = bar / 1.013;
        return String.valueOf(standardAtmos);
    }

    private String barToTorr(double bar) {
        double torr = bar*750.1;
        return String.valueOf(torr);
    }

    private String barToMegaPascal(double bar) {
        double megaPascal = bar/10;
        return String.valueOf(megaPascal);
    }

    private String barToPascal(double bar) {
        double pascal = bar*1e+5;
        return String.valueOf(pascal);
    }

    //Poundpsi
    private String poundpsiToStandardAtmos(double poundpsi) {
        double standardAtmos = poundpsi / 14.696;
        return String.valueOf(standardAtmos);
    }

    private String poundpsiToTorr(double poundpsi) {
        double torr = poundpsi* 51.715;
        return String.valueOf(torr);
    }

    private String poundpsiToMegaPascal(double poundpsi) {
        double megaPascal = poundpsi*145;
        return String.valueOf(megaPascal);
    }

    private String poundpsiToPascal(double poundpsi) {
        double pascal = poundpsi *6895;
        return String.valueOf(pascal);
    }

    private String poundpsiToBar(double poundpsi) {
        double bar = poundpsi/14.504;
        return String.valueOf(bar);
    }

    //StandardAtmos
    private String standardAtmosToTorr(double standardAtmos) {
        double torr = standardAtmos*760;
        return String.valueOf(torr);
    }

    private String standardAtmosToMegaPascal(double standardAtmos) {
        double megaPascal = standardAtmos/ 9.869;
        return String.valueOf(megaPascal);
    }

    private String standardAtmosToPascal(double standardAtmos) {
        double pascal = standardAtmos*101300;
        return String.valueOf(pascal);
    }

    private String standardAtmosToBar(double standardAtmos) {
        double bar = standardAtmos*1.013;
        return String.valueOf(bar);
    }

    private String standardAtmosToPoundpsi(double standardAtmos) {
        double poundpsi = standardAtmos * 14.696;
        return String.valueOf(poundpsi);
    }

    //Torr
    private String torrToMegaPascal(double torr) {
        double megaPascal = torr / 7501;
        return String.valueOf(megaPascal);
    }

    private String torrToPascal(double torr) {
        double pascal = torr * 133.3;
        return String.valueOf(pascal);
    }

    private String torrToBar(double torr) {
        double bar = torr /750.1;
        return String.valueOf(bar);
    }

    private String torrToPoundpsi(double torr) {
        double poundpsi = torr /51.715;
        return String.valueOf(poundpsi);
    }

    private String torrToStandardAtmos(double torr) {
        double standardAtmos = torr /760;
        return String.valueOf(standardAtmos);
    }

    //MegaPascal
    private String megaPascalToPascal(double megaPascal) {
        double pascal = megaPascal*1e+6;
        return String.valueOf(pascal);
    }

    private String megaPascalToBar(double megaPascal) {
        double bar = megaPascal*10;
        return String.valueOf(bar);
    }

    private String megaPascalToPoundpsi(double megaPascal) {
        double poundpsi = megaPascal*145;
        return String.valueOf(poundpsi);
    }

    private String megaPascalToStandardAtmos(double megaPascal) {
        double standardAtmos = megaPascal*9.869;
        return String.valueOf(standardAtmos);
    }

    private String megaPascalToTorr(double megaPascal) {
        double torr = megaPascal*7501;
        return String.valueOf(torr);
    }

}