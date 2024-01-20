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

public class energy_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Joule";
    String toUnit = "Calorie";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Joule",
            "Calorie",
            "Watt hour",
            "Electron Volt",
            "Megajoule", "Gigajoule"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy_cal);

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
                            et_toUnit.setText(jouleToCalorie(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(jouleToWattHour(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(jouleToElectronVolt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(jouleToMegaJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(jouleToGigaJoule(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(calorieToJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(calorieToWattHour(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(calorieToElectronVolt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(calorieToMegaJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(calorieToGigaJoule(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(wattHourToJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(wattHourToCalorie(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(wattHourToElectronVolt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(wattHourToMegaJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(wattHourToGigaJoule(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(electronVoltToJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(electronVoltToCalorie(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(electronVoltToWattHour(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(electronVoltToMegaJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(electronVoltToGigaJoule(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(megaJouleToJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(megaJouleToCalorie(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(megaJouleToWattHour(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(megaJouleToElectronVolt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(tempInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(megaJouleToGigaJoule(Double.parseDouble(tempInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gigaJouleToJoule(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gigaJouleToCalorie(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gigaJouleToWattHour(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gigaJouleToElectronVolt(Double.parseDouble(tempInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gigaJouleToMegaJoule(Double.parseDouble(tempInput)));
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(energy_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Joule",
                        "Calorie",
                        "Watt hour",
                        "Electron Volt",
                        "Megajoule", "Gigajoule"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(energy_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Joule",
                        "Calorie",
                        "Watt hour",
                        "Electron Volt",
                        "Megajoule", "Gigajoule"
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

    //joule
    private String jouleToWattHour(double joule) {
        double wattHour = joule / 3600;
        return String.valueOf(wattHour);
    }

    private String jouleToElectronVolt(double joule) {
        double electronVolt = joule * 6.242e+18;
        return String.valueOf(electronVolt);
    }

    private String jouleToMegaJoule(double joule) {
        double megaJoule = joule / 1e+6;
        return String.valueOf(megaJoule);
    }

    private String jouleToGigaJoule(double joule) {
        double gigaJoule = joule / 1e+9;
        return String.valueOf(gigaJoule);
    }

    private String jouleToCalorie(double joule) {
        double calorie = joule / 4184;
        return String.valueOf(calorie);
    }

    //calorie
    private String calorieToWattHour(double calorie) {
        double wattHour = calorie * 1.162;
        return String.valueOf(wattHour);
    }

    private String calorieToElectronVolt(double calorie) {
        double electronVolt = calorie * 9.223e+18;
        return String.valueOf(electronVolt);
    }

    private String calorieToMegaJoule(double calorie) {
        double megaJoule = calorie / 239;
        return String.valueOf(megaJoule);
    }

    private String calorieToGigaJoule(double calorie) {
        double gigaJoule = calorie / 239006;
        return String.valueOf(gigaJoule);
    }

    private String calorieToJoule(double calorie) {
        double joule = calorie * 4184;
        return String.valueOf(joule);
    }

    //WattHour
    private String wattHourToElectronVolt(double wattHour) {
        double electronVolt = wattHour * 9.223e+18;
        return String.valueOf(electronVolt);
    }

    private String wattHourToMegaJoule(double wattHour) {
        double megaJoule = wattHour / 278;
        return String.valueOf(megaJoule);
    }

    private String wattHourToGigaJoule(double wattHour) {
        double gigaJoule = wattHour / 277778;
        return String.valueOf(gigaJoule);
    }

    private String wattHourToJoule(double wattHour) {
        double joule = wattHour * 3600;
        return String.valueOf(joule);
    }

    private String wattHourToCalorie(double wattHour) {
        double calorie = wattHour / 1.162;
        return String.valueOf(calorie);
    }

    //ElectronVolt
    private String electronVoltToMegaJoule(double electronVolt) {
        double megaJoule = electronVolt / 9.223e+18;
        return String.valueOf(megaJoule);
    }

    private String electronVoltToGigaJoule(double electronVolt) {
        double gigaJoule = electronVolt / 9.223e+18;
        return String.valueOf(gigaJoule);
    }

    private String electronVoltToJoule(double electronVolt) {
        double joule = electronVolt / 6.242e+18;
        return String.valueOf(joule);
    }

    private String electronVoltToCalorie(double electronVolt) {
        double calorie = electronVolt / 9.223e+18;
        return String.valueOf(calorie);
    }

    private String electronVoltToWattHour(double electronVolt) {
        double wattHour = electronVolt / 9.223e+18;
        return String.valueOf(wattHour);
    }

    //MegaJoule
    private String megaJouleToGigaJoule(double megaJoule) {
        double gigaJoule = megaJoule / 1000;
        return String.valueOf(gigaJoule);
    }

    private String megaJouleToJoule(double megaJoule) {
        double joule = megaJoule * 1e+6;
        return String.valueOf(joule);
    }

    private String megaJouleToCalorie(double megaJoule) {
        double calorie = megaJoule * 239;
        return String.valueOf(calorie);
    }

    private String megaJouleToWattHour(double megaJoule) {
        double wattHour = megaJoule * 278;
        return String.valueOf(wattHour);
    }

    private String megaJouleToElectronVolt(double megaJoule) {
        double electronVolt = megaJoule * 9.223e+18;
        return String.valueOf(electronVolt);
    }

    //GigaJoule
    private String gigaJouleToJoule(double gigaJoule) {
        double joule = gigaJoule * 1e+9;
        return String.valueOf(joule);
    }

    private String gigaJouleToCalorie(double gigaJoule) {
        double calorie = gigaJoule * 239006;
        return String.valueOf(calorie);
    }

    private String gigaJouleToWattHour(double gigaJoule) {
        double wattHour = gigaJoule * 77778;
        return String.valueOf(wattHour);
    }

    private String gigaJouleToElectronVolt(double gigaJoule) {
        double electronVolt = gigaJoule * 9.223e+18;
        return String.valueOf(electronVolt);
    }

    private String gigaJouleToMegaJoule(double gigaJoule) {
        double megaJoule = gigaJoule * 1000;
        return String.valueOf(megaJoule);
    }


}