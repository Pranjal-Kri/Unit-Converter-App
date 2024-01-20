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

public class power_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Watt";
    String toUnit = "Exawatt";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Watt",
            "Exawatt",
            "Petawatt",
            "Terawatt",
            "Gigawatt", "Horsepower"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_cal);

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
                            et_toUnit.setText(wattToExawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(wattToPetawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(wattToTerawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(wattToGigawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(wattToHorsePower(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(exawattToWatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(exawattToPetawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(exawattToTerawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(exawattToGigawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(exawattToHorsePower(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(petawattToWatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(petawattToExawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(petawattToTerawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(petawattToGigawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(petawattToHorsePower(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(terawattToWatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(terawattToExawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(terawattToPetawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(terawattToGigawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(terawattToHorsePower(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gigawattToWatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gigawattToExawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gigawattToPetawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gigawattToTerawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gigawattToHorsePower(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(horsePowerToWatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(horsePowerToExawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(horsePowerToPetawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(horsePowerToTerawatt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(horsePowerToGigawatt(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(power_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Watt",
                        "Exawatt",
                        "Petawatt",
                        "Terawatt",
                        "Gigawatt", "Horsepower"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(power_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Watt",
                        "Exawatt",
                        "Petawatt",
                        "Terawatt",
                        "Gigawatt", "Horsepower"
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

    //watt
    private String wattToPetawatt(double watt) {
        double petawatt = watt /1e+15;
        return String.valueOf(petawatt);
    }

    private String wattToTerawatt(double watt) {
        double terawatt = watt /1e+12;
        return String.valueOf(terawatt);
    }

    private String wattToGigawatt(double watt) {
        double gigawatt = watt /1e+9;
        return String.valueOf(gigawatt);
    }

    private String wattToHorsePower(double watt) {
        double horsePower = watt /746;
        return String.valueOf(horsePower);
    }

    private String wattToExawatt(double watt) {
        double exawatt = watt/1e+18;
        return String.valueOf(exawatt);
    }

    //exawatt
    private String exawattToPetawatt(double exawatt) {
        double petawatt = exawatt*1000;
        return String.valueOf(petawatt);
    }

    private String exawattToTerawatt(double exawatt) {
        double terawatt = exawatt*1e+6;
        return String.valueOf(terawatt);
    }

    private String exawattToGigawatt(double exawatt) {
        double gigawatt = exawatt*1e+9;
        return String.valueOf(gigawatt);
    }

    private String exawattToHorsePower(double exawatt) {
        double horsePower = exawatt*1.341e+15;
        return String.valueOf(horsePower);
    }

    private String exawattToWatt(double exawatt) {
        double watt = exawatt*1e+18;
        return String.valueOf(watt);
    }

    //Petawatt
    private String petawattToTerawatt(double petawatt) {
        double terawatt = petawatt * 1000;
        return String.valueOf(terawatt);
    }

    private String petawattToGigawatt(double petawatt) {
        double gigawatt = petawatt*1e+6;
        return String.valueOf(gigawatt);
    }

    private String petawattToHorsePower(double petawatt) {
        double horsePower = petawatt*1.36e+12;
        return String.valueOf(horsePower);
    }

    private String petawattToWatt(double petawatt) {
        double watt = petawatt * 1e+15;
        return String.valueOf(watt);
    }

    private String petawattToExawatt(double petawatt) {
        double exawatt = petawatt/1000;
        return String.valueOf(exawatt);
    }

    //Terawatt
    private String terawattToGigawatt(double terawatt) {
        double gigawatt = terawatt*1000;
        return String.valueOf(gigawatt);
    }

    private String terawattToHorsePower(double terawatt) {
        double horsePower = terawatt*1.341e+9;
        return String.valueOf(horsePower);
    }

    private String terawattToWatt(double terawatt) {
        double watt = terawatt*1e+12;
        return String.valueOf(watt);
    }

    private String terawattToExawatt(double terawatt) {
        double exawatt = terawatt /1e+6;
        return String.valueOf(exawatt);
    }

    private String terawattToPetawatt(double terawatt) {
        double petawatt = terawatt /1000;
        return String.valueOf(petawatt);
    }

    //Gigawatt
    private String gigawattToHorsePower(double gigawatt) {
        double horsePower = gigawatt*1.36e+6;
        return String.valueOf(horsePower);
    }

    private String gigawattToWatt(double gigawatt) {
        double watt = gigawatt * 1e+9;
        return String.valueOf(watt);
    }

    private String gigawattToExawatt(double gigawatt) {
        double exawatt = gigawatt/ 1e+9;
        return String.valueOf(exawatt);
    }

    private String gigawattToPetawatt(double gigawatt) {
        double petawatt = gigawatt /1e+6;
        return String.valueOf(petawatt);
    }

    private String gigawattToTerawatt(double gigawatt) {
        double terawatt = gigawatt/1000;
        return String.valueOf(terawatt);
    }

    //HorsePower
    private String horsePowerToWatt(double horsePower) {
        double watt = horsePower*746;
        return String.valueOf(watt);
    }

    private String horsePowerToExawatt(double horsePower) {
        double exawatt = horsePower/1.341e+15;
        return String.valueOf(exawatt);
    }

    private String horsePowerToPetawatt(double horsePower) {
        double petawatt = horsePower/1.341e+12;
        return String.valueOf(petawatt);
    }

    private String horsePowerToTerawatt(double horsePower) {
        double terawatt = horsePower/1.341e+9;
        return String.valueOf(terawatt);
    }

    private String horsePowerToGigawatt(double horsePower) {
        double gigawatt = horsePower/1.341e+6;
        return String.valueOf(gigawatt);
    }

}