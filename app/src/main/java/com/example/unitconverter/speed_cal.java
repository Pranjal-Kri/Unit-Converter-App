package com.example.unitconverter;

import androidx.annotation.NonNull;
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

public class speed_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "meter/second";
    String toUnit = "meter/hour";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "meter/second",
            "meter/hour",
            "mile/hour",
            "kilometer/hour",
            "kilometer/second", "Knot"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_cal);

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
                String speedInput = et_fromUnit.getText().toString();
                if (speedInput.equals("") || speedInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(speedInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(meterPsToMeterPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(meterPsToMilesPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(meterPsToKilometerPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(meterPsToKilometerPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(meterPsToKnot(Double.parseDouble(speedInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(meterPhToMeterPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(speedInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(meterPhToMilesPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(meterPhToKilometerPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(meterPhToKilometerPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(meterPhToKnot(Double.parseDouble(speedInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milesPhToMeterPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(milesPhToMeterPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(speedInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milesPhToKilometerPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milesPhToKilometerPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milesPhToKnot(Double.parseDouble(speedInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kilometerPhToMeterPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kilometerPhToMeterPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilometerPhToMilesPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(speedInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilometerPhToKilometerPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilometerPhToKnot(Double.parseDouble(speedInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kilometerPsToMeterPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(kilometerPsToMeterPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilometerPsToMilesPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilometerPsToKilometerPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(speedInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilometerPsToKnot(Double.parseDouble(speedInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(knotToMeterPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(knotToMeterPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(knotToMilesPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(knotToKilometerPh(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(knotToKilometerPs(Double.parseDouble(speedInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(speedInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "meter/second",
                        "meter/hour",
                        "mile/hour",
                        "kilometer/hour",
                        "kilometer/second", "Knot"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "meter/second",
                        "meter/hour",
                        "mile/hour",
                        "kilometer/hour",
                        "kilometer/second", "Knot"
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

    //meter per second
    private String meterPsToMilesPh(double meterPs) {
        double milesPh = meterPs * 2.237;
        return String.valueOf(milesPh);
    }

    private String meterPsToKilometerPh(double meterPs) {
        double kilometerPh = meterPs * 3.6;
        return String.valueOf(kilometerPh);
    }


    private String meterPsToKilometerPs(double meterPs) {
        double kilometerPs = meterPs / 1000;
        return String.valueOf(kilometerPs);
    }
    private String meterPsToKnot(double meterPs) {
        double knot = meterPs * 1.944;
        return String.valueOf(knot);
    }

    private String meterPsToMeterPh(double meterPs) {
        double meterPh = meterPs * 3600;
        return String.valueOf(meterPh);
    }

    //meter per hour
    private String meterPhToMilesPh(double meterPh) {
        double milesPh = meterPh/ 1609;
        return String.valueOf(milesPh);
    }

    private String meterPhToKilometerPh(double meterPh) {
        double kilometerPh = meterPh /1000;
        return String.valueOf(kilometerPh);
    }

    private String meterPhToKilometerPs(double meterPh) {
        double kilometerPs = meterPh/3.6e+6;
        return String.valueOf(kilometerPs);
    }

    private String meterPhToKnot(double meterPh) {
        double knot = meterPh/1852;
        return String.valueOf(knot);
    }

    private String meterPhToMeterPs(double meterPh) {
        double meterPs = meterPh/3600;
        return String.valueOf(meterPs);
    }

    //Miles per hour
    private String milesPhToKilometerPh(double milesPh) {
        double kilometerPh = milesPh * 1.609;
        return String.valueOf(kilometerPh);
    }

    private String milesPhToKilometerPs(double milesPh) {
        double kilometerPs = milesPh/2237;
        return String.valueOf(kilometerPs);
    }

    private String milesPhToKnot(double milesPh) {
        double knot = milesPh/1.151;
        return String.valueOf(knot);
    }

    private String milesPhToMeterPs(double milesPh) {
        double meterPs = milesPh /2.237;
        return String.valueOf(meterPs);
    }

    private String milesPhToMeterPh(double milesPh) {
        double meterPh = milesPh*1609;
        return String.valueOf(meterPh);
    }

    //Kilometer per hour
    private String kilometerPhToKilometerPs(double kilometerPh) {
        double kilometerPs = kilometerPh/3600;
        return String.valueOf(kilometerPs);
    }

    private String kilometerPhToKnot(double kilometerPh) {
        double knot = kilometerPh/1.852;
        return String.valueOf(knot);
    }

    private String kilometerPhToMeterPs(double kilometerPh) {
        double meterPs = kilometerPh/3.6;
        return String.valueOf(meterPs);
    }

    private String kilometerPhToMeterPh(double kilometerPh) {
        double meterPh = kilometerPh *1000;
        return String.valueOf(meterPh);
    }

    private String kilometerPhToMilesPh(double kilometerPh) {
        double milesPh = kilometerPh / 1.609;
        return String.valueOf(milesPh);
    }

    //Kilometer per second
    private String kilometerPsToKnot(double kilometerPs) {
        double knot = kilometerPs*1944;
        return String.valueOf(knot);
    }

    private String kilometerPsToMeterPs(double kilometerPs) {
        double meterPs = kilometerPs*1000;
        return String.valueOf(meterPs);
    }

    private String kilometerPsToMeterPh(double kilometerPs) {
        double meterPh = kilometerPs*3.6e+6;
        return String.valueOf(meterPh);
    }

    private String kilometerPsToMilesPh(double kilometerPs) {
        double milesPh = kilometerPs * 2237;
        return String.valueOf(milesPh);
    }

    private String kilometerPsToKilometerPh(double kilometerPs) {
        double kilometerPh = kilometerPs * 3600 ;
        return String.valueOf(kilometerPh);
    }

    //Knot
    private String knotToMeterPs(double knot) {
        double meterPs = knot / 1.994;
        return String.valueOf(meterPs);
    }

    private String knotToMeterPh(double knot) {
        double meterPh = knot* 1852;
        return String.valueOf(meterPh);
    }

    private String knotToMilesPh(double knot) {
        double milesPh = knot * 1.151;
        return String.valueOf(milesPh);
    }

    private String knotToKilometerPh(double knot) {
        double kilometerPh = knot*1.852;
        return String.valueOf(kilometerPh);
    }

    private String knotToKilometerPs(double knot) {
        double kilometerPs = knot / 1944;
        return String.valueOf(kilometerPs);
    }

}