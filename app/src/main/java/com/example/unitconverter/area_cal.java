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

import java.text.DecimalFormat;
import java.util.Arrays;

public class area_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Squaremeter";
    String toUnit = "Squarekilometer";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Square Meter",
            "Square Kilometer",
            "Hectares",
            "Square Feet",
            "Acres", "Square Centimeter"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cal);

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
                String areaInput = et_fromUnit.getText().toString();
                if (areaInput.equals("") || areaInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(areaInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(squaremeterToSquarekilometer(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(squaremeterToHectares(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(squaremeterToSquarefeet(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(squaremeterToAcres(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(squaremeterToSquarecentimeter(Double.parseDouble(areaInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(squarekilometerToSquaremeter(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(areaInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(squarekilometerToHectares(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(squarekilometerToSquarefeet(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(squarekilometerToAcres(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(squarekilometerToSquarecentimeter(Double.parseDouble(areaInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(hectaresToSquaremeter(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(hectaresToSquarekilometer(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(areaInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(hectaresToSquarefeet(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(hectaresToAcres(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(hectaresToSquarecentimeter(Double.parseDouble(areaInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(squarefeetToSquaremeter(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(squarefeetToSquarekilometer(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(squarefeetToHectares(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(areaInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(squarefeetToAcres(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(squarefeetToSquarecentimeter(Double.parseDouble(areaInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(acresToSquaremeter(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(acresToSquarekilometer(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(acresToHectares(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(acresToSquarefeet(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(areaInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(acresToSquarecentimeter(Double.parseDouble(areaInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(squarecentimeterToSquaremeter(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(squarecentimeterToSquarekilometer(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(squarecentimeterToHectares(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(squarecentimeterToSquarefeet(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(squarecentimeterToAcres(Double.parseDouble(areaInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(areaInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Square Meter",
                        "Square Kilometer",
                        "Hectares",
                        "Square Feet",
                        "Acres", "Square Centimeter"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Square Meter",
                        "Square Kilometer",
                        "Hectares",
                        "Square Feet",
                        "Acres", "Square Centimeter"
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

    //squaremeter
    private String squaremeterToHectares(double sqmt) {
        double hectares = sqmt/1e+4;
        return String.valueOf(hectares);
    }

    private String squaremeterToSquarefeet(double sqmt) {
        double squarefeet = sqmt *10.764;
        return String.valueOf(squarefeet);
    }

    private String squaremeterToAcres(double sqmt) {
        double acres = sqmt /4047;
        return String.valueOf(acres);
    }

    private String squaremeterToSquarecentimeter(double sqmt) {
        double squarecentimeter = sqmt*1e+4;
        return String.valueOf(squarecentimeter);
    }

    private String squaremeterToSquarekilometer(double sqmt) {
        double squarekilometer = sqmt/ 1e+6;
        return String.valueOf(squarekilometer);
    }

    //squarekilometer
    private String squarekilometerToHectares(double squarekilometer) {
        double hectares = squarekilometer*100;
        return String.valueOf(hectares);
    }

    private String squarekilometerToSquarefeet(double squarekilometer) {
        double squarefeet = squarekilometer* 1.076e+7;
        return String.valueOf(squarefeet);
    }

    private String squarekilometerToAcres(double squarekilometer) {
        double acres = squarekilometer*247.1;
        return String.valueOf(acres);
    }

    private String squarekilometerToSquarecentimeter(double squarekilometer) {
        double squarecentimeter = squarekilometer*1e+10;
        return String.valueOf(squarecentimeter);
    }

    private String squarekilometerToSquaremeter(double squarekilometer) {
        double squaremeter = squarekilometer*1e+6;
        return String.valueOf(squaremeter);
    }

    //Hectares
    private String hectaresToSquarefeet(double hectares) {
        double squarefeet = hectares * 107600;
        return String.valueOf(squarefeet);
    }
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private String hectaresToAcres(double hectares) {
        double acres = Double.parseDouble(df.format(hectares*2.471));
        return String.valueOf(acres);
    }

    private String hectaresToSquarecentimeter(double hectares) {
        double squarecentimeter = hectares*1e+8;
        return String.valueOf(squarecentimeter);
    }

    private String hectaresToSquaremeter(double hectares) {
        double squaremeter = hectares* 10000;
        return String.valueOf(squaremeter);
    }

    private String hectaresToSquarekilometer(double hectares) {
        double squarekilometer = hectares/100;
        return String.valueOf(squarekilometer);
    }

    //Squarefeet
    private String squarefeetToAcres(double squarefeet) {
        double acres = squarefeet/43560;
        return String.valueOf(acres);
    }

    private String squarefeetToSquarecentimeter(double squarefeet) {
        double squarecentimeter = squarefeet*929;
        return String.valueOf(squarecentimeter);
    }

    private String squarefeetToSquaremeter(double squarefeet) {
        double squaremeter = squarefeet/10.764;
        return String.valueOf(squaremeter);
    }

    private String squarefeetToSquarekilometer(double squarefeet) {
        double squarekilometer = squarefeet /1.076e+7;
        return String.valueOf(squarekilometer);
    }

    private String squarefeetToHectares(double squarefeet) {
        double hectares = squarefeet /107600;
        return String.valueOf(hectares);
    }

    //Acres
    private String acresToSquarecentimeter(double acres) {
        double squarecentimeter = acres*4.047e+7;
        return String.valueOf(squarecentimeter);
    }

    private String acresToSquaremeter(double acres) {
        double squaremeter = acres * 4047;
        return String.valueOf(squaremeter);
    }

    private String acresToSquarekilometer(double acres) {
        double squarekilometer = acres /247.1;
        return String.valueOf(squarekilometer);
    }

    private String acresToHectares(double acres) {
        double hectares = acres/2.471;
        return String.valueOf(hectares);
    }

    private String acresToSquarefeet(double acres) {
        double squarefeet = acres *43560;
        return String.valueOf(squarefeet);
    }

    //Squarecentimeter
    private String squarecentimeterToSquaremeter(double squarecentimeter) {
        double squaremeter = squarecentimeter/10000;
        return String.valueOf(squaremeter);
    }

    private String squarecentimeterToSquarekilometer(double squarecentimeter) {
        double squarekilometer = squarecentimeter/1e+10;
        return String.valueOf(squarekilometer);
    }

    private String squarecentimeterToHectares(double squarecentimeter) {
        double hectares = squarecentimeter/1e+8;
        return String.valueOf(hectares);
    }

    private String squarecentimeterToSquarefeet(double squarecentimeter) {
        double squarefeet = squarecentimeter/929;
        return String.valueOf(squarefeet);
    }

    private String squarecentimeterToAcres(double squarecentimeter) {
        double acres = squarecentimeter/4.047e+7;
        return String.valueOf(acres);
    }
}