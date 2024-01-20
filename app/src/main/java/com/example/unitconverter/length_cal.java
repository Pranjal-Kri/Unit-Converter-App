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

public class length_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Meter";
    String toUnit = "Kilometer";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Meter",
            "Kilo Meter",
            "Mile",
            "Yard",
            "Feet", "Inch"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_cal);

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
                String lengthInput = et_fromUnit.getText().toString();
                if (lengthInput.equals("") || lengthInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(lengthInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(meterToKilometer(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(meterToMile(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(meterToYard(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(meterToFeet(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(meterToInch(Double.parseDouble(lengthInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kilometerToMeter(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(lengthInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilometerToMile(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilometerToYard(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilometerToFeet(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilometerToInch(Double.parseDouble(lengthInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(mileToMeter(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(mileToKilometer(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(lengthInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(mileToYard(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(mileToFeet(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(mileToInch(Double.parseDouble(lengthInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(yardToMeter(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(yardToKilometer(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(yardToMile(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(lengthInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(yardToFeet(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(yardToInch(Double.parseDouble(lengthInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(feetToMeter(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(feetToKilometer(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(feetToMile(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(feetToYard(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(lengthInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(feetToInch(Double.parseDouble(lengthInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(inchToMeter(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(inchToKilometer(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(inchToMile(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(inchToYard(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(inchToFeet(Double.parseDouble(lengthInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(lengthInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Meter",
                        "Kilo Meter",
                        "Mile",
                        "Yard",
                        "feet", "Inch",
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Meter",
                        "Kilo Meter",
                        "Mile",
                        "Yard",
                        "Feet", "Inch"
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

    //meter
    private String meterToMile(double meter) {
        double mile = meter / 1609;
        return String.valueOf(mile);
    }

    private String meterToYard(double meter) {
        double yard = meter * 1.904;
        return String.valueOf(yard);
    }

    private String meterToFeet(double meter) {
        double feet = meter * 3.218;
        return String.valueOf(feet);
    }

    private String meterToInch(double meter) {
        double inch = meter * 39.37;
        return String.valueOf(inch);
    }

    private String meterToKilometer(double meter) {
        double kilometer = meter / 1e+3;
        return String.valueOf(kilometer);
    }

    //Kilometer
    private String kilometerToMile(double kilometer) {
        double mile = kilometer / 1.609;
        return String.valueOf(mile);
    }

    private String kilometerToYard(double kilometer) {
        double yard = kilometer * 1094;
        return String.valueOf(yard);
    }

    private String kilometerToFeet(double kilometer) {
        double feet = kilometer * 3281;
        return String.valueOf(feet);
    }

    private String kilometerToInch(double kilometer) {
        double inch = kilometer * 39370;
        return String.valueOf(inch);
    }

    private String kilometerToMeter(double kilometer) {
        double meter = kilometer *1000;
        return String.valueOf(meter);
    }

    //Mile
    private String mileToYard(double mile) {
        double yard = mile * 1760;
        return String.valueOf(yard);
    }

    private String mileToFeet(double mile) {
        double feet = mile * 5280;
        return String.valueOf(feet);
    }

    private String mileToInch(double mile) {
        double inch = mile * 63360;
        return String.valueOf(inch);
    }

    private String mileToMeter(double mile) {
        double meter = mile * 1609;
        return String.valueOf(meter);
    }

    private String mileToKilometer(double mile) {
        double kilometer = mile / 1000;
        return String.valueOf(kilometer);
    }

    //Yard
    private String yardToFeet(double yard) {
        double feet = yard * 3;
        return String.valueOf(feet);
    }

    private String yardToInch(double yard) {
        double inch = yard * 36;
        return String.valueOf(inch);
    }

    private String yardToMeter(double yard) {
        double meter = yard / 1.094;
        return String.valueOf(meter);
    }

    private String yardToKilometer(double yard) {
        double kilometer = yard / 1094;
        return String.valueOf(kilometer);
    }

    private String yardToMile(double yard) {
        double mile = yard / 1760;
        return String.valueOf(mile);
    }

    //Feet
    private String feetToInch(double feet) {
        double inch = feet * 12;
        return String.valueOf(inch);
    }

    private String feetToMeter(double feet) {
        double meter = feet / 3.281;
        return String.valueOf(meter);
    }

    private String feetToKilometer(double feet) {
        double kilometer = feet / 3281;
        return String.valueOf(kilometer);
    }

    private String feetToMile(double feet) {
        double mile = feet / 5280;
        return String.valueOf(mile);
    }

    private String feetToYard(double feet) {
        double yard = feet / 3;
        return String.valueOf(yard);
    }

    //Inch
    private String inchToMeter(double inch) {
        double meter = inch / 39.37;
        return String.valueOf(meter);
    }

    private String inchToKilometer(double inch) {
        double kilometer = inch / 39370;
        return String.valueOf(kilometer);
    }

    private String inchToMile(double inch) {
        double mile = inch / 63360;
        return String.valueOf(mile);
    }

    private String inchToYard(double inch) {
        double yard = inch / 36;
        return String.valueOf(yard);
    }

    private String inchToFeet(double inch) {
        double feet = inch / 12;
        return String.valueOf(feet);
    }

}