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

public class torque_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "NewtonMeter";
    String toUnit = "NewtonCm";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Newton meter",
            "Newton centimeter",
            "Newton millimeter",
            "Dyne meter",
            "Dyne centimeter", "Dyne millimeter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torque_cal);

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
                String tempInput = et_fromUnit.getText().toString();
                if (tempInput.equals("") || tempInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(newtonMeterToNewtonCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(newtonMeterToNewtonMm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(newtonMeterToDyneMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(newtonMeterToDyneCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(newtonMeterToDyneMm(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(newtonCmToNewtonMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(newtonCmToNewtonMm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(newtonCmToDyneMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(newtonCmToDyneCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(newtonCmToDyneMm(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(newtonMmToNewtonMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(newtonMmToNewtonCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(newtonMmToDyneMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(newtonMmToDyneCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(newtonMmToDyneMm(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(dyneMeterToNewtonMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(dyneMeterToNewtonCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(dyneMeterToNewtonMm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(dyneMeterToDyneCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(dyneMeterToDyneMm(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(dyneCmToNewtonMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(dyneCmToNewtonCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(dyneCmToNewtonMm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(dyneCmToDyneMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(dyneCmToDyneMm(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(dyneMmToNewtonMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(dyneMmToNewtonCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(dyneMmToNewtonMm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(dyneMmToDyneMeter(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(dyneMmToDyneCm(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(tempInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(torque_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Newton meter",
                        "Newton centimeter",
                        "Newton millimeter",
                        "Dyne meter",
                        "Dyne centimeter", "Dyne millimeter"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(torque_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Newton meter",
                        "Newton centimeter",
                        "Newton millimeter",
                        "Dyne meter",
                        "Dyne centimeter", "Dyne millimeter"
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

    //newtonMeter
    private String newtonMeterToNewtonMm(double newtonMeter) {
        double newtonMm = newtonMeter *1000;
        return String.valueOf(newtonMm);
    }

    private String newtonMeterToDyneMeter(double newtonMeter) {
        double dyneMeter = newtonMeter * 100000;
        return String.valueOf(dyneMeter);
    }

    private String newtonMeterToDyneCm(double newtonMeter) {
        double dyneCm = newtonMeter * 1000;
        return String.valueOf(dyneCm);
    }

    private String newtonMeterToDyneMm(double newtonMeter) {
        double dyneMm = newtonMeter * 1e+8;
        return String.valueOf(dyneMm);
    }

    private String newtonMeterToNewtonCm(double newtonMeter) {
        double newtonCm = newtonMeter * 100;
        return String.valueOf(newtonCm);
    }

    //newtonCm
    private String newtonCmToNewtonMm(double newtonCm) {
        double newtonMm =newtonCm*10;
        return String.valueOf(newtonMm);
    }

    private String newtonCmToDyneMeter(double newtonCm) {
        double dyneMeter = newtonCm*1000;
        return String.valueOf(dyneMeter);
    }

    private String newtonCmToDyneCm(double newtonCm) {
        double dyneCm = newtonCm*100000;
        return String.valueOf(dyneCm);
    }

    private String newtonCmToDyneMm(double newtonCm) {
        double dyneMm = newtonCm*1000000;
        return String.valueOf(dyneMm);
    }

    private String newtonCmToNewtonMeter(double newtonCm) {
        double newtonMeter =newtonCm/100;
        return String.valueOf(newtonMeter);
    }

    //NewtonMm
    private String newtonMmToDyneMeter(double newtonMm) {
        double dyneMeter = newtonMm * 100;
        return String.valueOf(dyneMeter);
    }

    private String newtonMmToDyneCm(double newtonMm) {
        double dyneCm = newtonMm*10000;
        return String.valueOf(dyneCm);
    }

    private String newtonMmToDyneMm(double newtonMm) {
        double dyneMm = newtonMm*100000;
        return String.valueOf(dyneMm);
    }

    private String newtonMmToNewtonMeter(double newtonMm) {
        double newtonMeter = newtonMm /1000;
        return String.valueOf(newtonMeter);
    }

    private String newtonMmToNewtonCm(double newtonMm) {
        double newtonCm =newtonMm/10;
        return String.valueOf(newtonCm);
    }

    //DyneMeter
    private String dyneMeterToDyneCm(double dyneMeter) {
        double dyneCm = dyneMeter*100;
        return String.valueOf(dyneCm);
    }

    private String dyneMeterToDyneMm(double dyneMeter) {
        double dyneMm = dyneMeter*1000;
        return String.valueOf(dyneMm);
    }

    private String dyneMeterToNewtonMeter(double dyneMeter) {
        double newtonMeter = dyneMeter*1.0E-5;
        return String.valueOf(newtonMeter);
    }

    private String dyneMeterToNewtonCm(double dyneMeter) {
        double newtonCm = dyneMeter/1000;
        return String.valueOf(newtonCm);
    }

    private String dyneMeterToNewtonMm(double dyneMeter) {
        double newtonMm = dyneMeter /100;
        return String.valueOf(newtonMm);
    }

    //DyneCm
    private String dyneCmToDyneMm(double dyneCm) {
        double dyneMm = dyneCm*10;
        return String.valueOf(dyneMm);
    }

    private String dyneCmToNewtonMeter(double dyneCm) {
        double newtonMeter = dyneCm/1e+7;
        return String.valueOf(newtonMeter);
    }

    private String dyneCmToNewtonCm(double dyneCm) {
        double newtonCm = dyneCm/100000;
        return String.valueOf(newtonCm);
    }

    private String dyneCmToNewtonMm(double dyneCm) {
        double newtonMm = dyneCm/10000;
        return String.valueOf(newtonMm);
    }

    private String dyneCmToDyneMeter(double dyneCm) {
        double dyneMeter = dyneCm /100;
        return String.valueOf(dyneMeter);
    }

    //DyneMm
    private String dyneMmToNewtonMeter(double dyneMm) {
        double newtonMeter = dyneMm*1.0E-8;
        return String.valueOf(newtonMeter);
    }

    private String dyneMmToNewtonCm(double dyneMm) {
        double newtonCm = dyneMm*1E-6;
        return String.valueOf(newtonCm);
    }

    private String dyneMmToNewtonMm(double dyneMm) {
        double newtonMm = dyneMm*1E-5;
        return String.valueOf(newtonMm);
    }

    private String dyneMmToDyneMeter(double dyneMm) {
        double dyneMeter = dyneMm/1000;
        return String.valueOf(dyneMeter);
    }

    private String dyneMmToDyneCm(double dyneMm) {
        double dyneCm = dyneMm/10;
        return String.valueOf(dyneCm);
    }

}