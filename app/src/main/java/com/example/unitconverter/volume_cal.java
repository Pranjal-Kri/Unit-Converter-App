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

public class volume_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Liter";
    String toUnit = "Milliliter";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "liter",
            "Milliliter",
            "Cubic meter",
            "Fluid ounce",
            "US liquid gallon", "Cubic foot"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_cal);

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
                String volInput = et_fromUnit.getText().toString();
                if (volInput.equals("") || volInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(volInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(literToMilliliter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(literToCubicmeter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(literToFluidounce(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(literToGallon(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(literToCubicfoot(Double.parseDouble(volInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milliliterToLiter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(volInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(milliliterToCubicmeter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milliliterToFluidounce(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milliliterToGallon(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milliliterToCubicfoot(Double.parseDouble(volInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(cubicmeterToLiter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(cubicmeterToMilliliter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(volInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicmeterToFluidounce(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(cubicmeterToGallon(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(cubicmeterToCubicfoot(Double.parseDouble(volInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(fluidounceToLiter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(fluidounceToMilliliter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(fluidounceToCubicmeter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(volInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(fluidounceToGallon(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(fluidounceToCubicfoot(Double.parseDouble(volInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gallonToLiter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gallonToMilliliter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gallonToCubicmeter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gallonToFluidounce(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(volInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gallonToCubicfoot(Double.parseDouble(volInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(cubicfootToLiter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(cubicfootToMilliliter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(cubicfootToCubicmeter(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(cubicfootToFluidounce(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(cubicfootToGallon(Double.parseDouble(volInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(volInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "liter",
                        "Milliliter",
                        "Cubic meter",
                        "Fluid ounce",
                        "US liquid gallon", "Cubic foot"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "liter",
                        "Milliliter",
                        "Cubic meter",
                        "Fluid ounce",
                        "US liquid gallon", "Cubic foot"
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

    //liter
    private String literToCubicmeter(double liter) {
        double cubicmeter = liter /1e+3;
        return String.valueOf(cubicmeter);
    }

    private String literToFluidounce(double liter) {
        double fluidounce = liter * 33.814;
        return String.valueOf(fluidounce);
    }

    private String literToGallon(double liter) {
        double gallon = liter / 3.785;
        return String.valueOf(gallon);
    }

    private String literToCubicfoot(double liter) {
        double cubicfoot = liter /28.317;
        return String.valueOf(cubicfoot);
    }

    private String literToMilliliter(double liter) {
        double milliliter = liter* 1e+3;
        return String.valueOf(milliliter);
    }

    //milliliter
    private String milliliterToCubicmeter(double milliliter) {
        double cubicmeter = milliliter / 1e+6;
        return String.valueOf(cubicmeter);
    }

    private String milliliterToFluidounce(double milliliter) {
        double fluidounce = milliliter / 29.547;
        return String.valueOf(fluidounce);
    }

    private String milliliterToGallon(double milliliter) {
        double gallon = milliliter / 3785;
        return String.valueOf(gallon);
    }

    private String milliliterToCubicfoot(double milliliter) {
        double cubicfoot =milliliter* 28320;
        return String.valueOf(cubicfoot);
    }

    private String milliliterToLiter(double milliliter) {
        double liter = milliliter / 1000;
        return String.valueOf(liter);
    }

    //Cubicmeter
    private String cubicmeterToFluidounce(double cubicmeter) {
        double fluidounce = cubicmeter * 33810;
        return String.valueOf(fluidounce);
    }

    private String cubicmeterToGallon(double cubicmeter) {
        double gallon = cubicmeter*264.2;
        return String.valueOf(gallon);
    }

    private String cubicmeterToCubicfoot(double cubicmeter) {
        double cubicfoot = cubicmeter*35.315;
        return String.valueOf(cubicfoot);
    }

    private String cubicmeterToLiter(double cubicmeter) {
        double liter = cubicmeter*1e+3;
        return String.valueOf(liter);
    }

    private String cubicmeterToMilliliter(double cubicmeter) {
        double milliliter = cubicmeter * 1e+6;
        return String.valueOf(milliliter);
    }

    //Fluidounce
    private String fluidounceToGallon(double fluidounce) {
        double gallon = fluidounce / 128;
        return String.valueOf(gallon);
    }

    private String fluidounceToCubicfoot(double fluidounce) {
        double cubicfoot = fluidounce / 957.5;
        return String.valueOf(cubicfoot);
    }

    private String fluidounceToLiter(double fluidounce) {
        double liter = fluidounce / 33.814;
        return String.valueOf(liter);
    }

    private String fluidounceToMilliliter(double fluidounce) {
        double milliliter = fluidounce * 29.574;
        return String.valueOf(milliliter);
    }

    private String fluidounceToCubicmeter(double fluidounce) {
        double cubicmeter = fluidounce / 33810;
        return String.valueOf(cubicmeter);
    }

    //Gallon
    private String gallonToCubicfoot(double gallon) {
        double cubicfoot = gallon/ 7.48;
        return String.valueOf(cubicfoot);
    }

    private String gallonToLiter(double gallon) {
        double liter = gallon * 3.785;
        return String.valueOf(liter);
    }

    private String gallonToMilliliter(double gallon) {
        double milliliter = gallon * 3785;
        return String.valueOf(milliliter);
    }

    private String gallonToCubicmeter(double gallon) {
        double cubicmeter = gallon / 264.2;
        return String.valueOf(cubicmeter);
    }

    private String gallonToFluidounce(double gallon) {
        double fluidounce = gallon * 128;
        return String.valueOf(fluidounce);
    }

    //Cubicfoot
    private String cubicfootToLiter(double cubicfoot) {
        double liter = cubicfoot*28.317;
        return String.valueOf(liter);

    }

    private String cubicfootToMilliliter(double cubicfoot) {
        double milliliter = cubicfoot * 28320;
        return String.valueOf(milliliter);
    }

    private String cubicfootToCubicmeter(double cubicfoot) {
        double cubicmeter = cubicfoot/ 35.315;
        return String.valueOf(cubicmeter);
    }

    private String cubicfootToFluidounce(double cubicfoot) {
        double fluidounce = cubicfoot * 957.5;
        return String.valueOf(fluidounce);
    }

    private String cubicfootToGallon(double cubicfoot) {
        double gallon = cubicfoot * 7.481;
        return String.valueOf(gallon);
    }

}