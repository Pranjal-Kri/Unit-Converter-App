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

public class force_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Newton";
    String toUnit = "Dyne";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Newton",
            "Dyne",
            "Joule/meter",
            "Gram-Force",
            "ExaNewton", "PetaNewton"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force_cal);

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
                String forceInput = et_fromUnit.getText().toString();
                if (forceInput.equals("") || forceInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(forceInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(newtonToDyne(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(newtonToJoulePm(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(newtonToGramForce(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(newtonToExaNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(newtonToPetaNewton(Double.parseDouble(forceInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(dyneToNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(forceInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(dyneToJoulePm(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(dyneToGramForce(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(dyneToExaNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(dyneToPetaNewton(Double.parseDouble(forceInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(joulePmToNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(joulePmToDyne(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(forceInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(joulePmToGramForce(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(joulePmToExaNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(joulePmToPetaNewton(Double.parseDouble(forceInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gramForceToNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gramForceToDyne(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gramForceToJoulePm(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(forceInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(gramForceToExaNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gramForceToPetaNewton(Double.parseDouble(forceInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(exaNewtonToNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(exaNewtonToDyne(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(exaNewtonToJoulePm(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(exaNewtonToGramForce(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(forceInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(exaNewtonToPetaNewton(Double.parseDouble(forceInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(petaNewtonToNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(petaNewtonToDyne(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(petaNewtonToJoulePm(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(petaNewtonToGramForce(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(petaNewtonToExaNewton(Double.parseDouble(forceInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(forceInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(force_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Newton",
                        "Dyne",
                        "Joule/meter",
                        "Gram-Force",
                        "ExaNewton", "PetaNewton"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(force_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Newton",
                        "Dyne",
                        "Joule/meter",
                        "Gram-Force",
                        "ExaNewton", "PetaNewton"
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

    //newton
    private String newtonToJoulePm(double newton) {
        double joulePm = newton ;
        return String.valueOf(joulePm);
    }

    private String newtonToGramForce(double newton) {
        double gramForce = newton * 101.97;
        return String.valueOf(gramForce);
    }

    private String newtonToExaNewton(double newton) {
        double exaNewton = newton / 1e+18;
        return String.valueOf(exaNewton);
    }

    private String newtonToPetaNewton(double newton) {
        double petaNewton = newton /1e+15;
        return String.valueOf(petaNewton);
    }

    private String newtonToDyne(double newton) {
        double dyne = newton*1e+5;
        return String.valueOf(dyne);
    }

    //dyne
    private String dyneToJoulePm(double dyne) {
        double joulePm = dyne*1.0E-5;
        return String.valueOf(joulePm);
    }

    private String dyneToGramForce(double dyne) {
        double gramForce = dyne *0.00102;
        return String.valueOf(gramForce);
    }

    private String dyneToExaNewton(double dyne) {
        double exaNewton = dyne/9.223e+18;
        return String.valueOf(exaNewton);
    }

    private String dyneToPetaNewton(double dyne) {
        double petaNewton = dyne/9.223e+18;
        return String.valueOf(petaNewton);
    }

    private String dyneToNewton(double dyne) {
        double newton = dyne/100000;
        return String.valueOf(newton);
    }

    //JoulePm
    private String joulePmToGramForce(double joulePm) {
        double gramForce = joulePm * 101.9716212978;
        return String.valueOf(gramForce);
    }

    private String joulePmToExaNewton(double joulePm) {
        double exaNewton = joulePm*1.0E-18;
        return String.valueOf(exaNewton);
    }

    private String joulePmToPetaNewton(double joulePm) {
        double petaNewton = joulePm*1E-15;
        return String.valueOf(petaNewton);
    }

    private String joulePmToNewton(double joulePm) {
        double newton = joulePm ;
        return String.valueOf(newton);
    }

    private String joulePmToDyne(double joulePm) {
        double dyne = joulePm*10000;
        return String.valueOf(dyne);
    }

    //GramForce
    private String gramForceToExaNewton(double gramForce) {
        double exaNewton = gramForce*9.80665E-21;
        return String.valueOf(exaNewton);
    }

    private String gramForceToPetaNewton(double gramForce) {
        double petaNewton = gramForce*9.80665E-18;
        return String.valueOf(petaNewton);
    }

    private String gramForceToNewton(double gramForce) {
        double newton = gramForce*0.00980665;
        return String.valueOf(newton);
    }

    private String gramForceToDyne(double gramForce) {
        double dyne = gramForce*980.665;
        return String.valueOf(dyne);
    }

    private String gramForceToJoulePm(double gramForce) {
        double joulePm = gramForce * 0.00980665;
        return String.valueOf(joulePm);
    }

    //ExaNewton
    private String exaNewtonToPetaNewton(double exaNewton) {
        double petaNewton = exaNewton*1000;
        return String.valueOf(petaNewton);
    }

    private String exaNewtonToNewton(double exaNewton) {
        double newton = exaNewton *1e+18;
        return String.valueOf(newton);
    }

    private String exaNewtonToDyne(double exaNewton) {
        double dyne = exaNewton * 9.223e+18;
        return String.valueOf(dyne);
    }

    private String exaNewtonToJoulePm(double exaNewton) {
        double joulePm = exaNewton * 1.0E+18;
        return String.valueOf(joulePm);
    }

    private String exaNewtonToGramForce(double exaNewton) {
        double gramForce = exaNewton *1.01971621297793E+20;
        return String.valueOf(gramForce);
    }

    //PetaNewton
    private String petaNewtonToNewton(double petaNewton) {
        double newton = petaNewton* 1e+15;
        return String.valueOf(newton);
    }

    private String petaNewtonToDyne(double petaNewton) {
        double dyne = petaNewton *9.223e+18;
        return String.valueOf(dyne);
    }

    private String petaNewtonToJoulePm(double petaNewton) {
        double joulePm = petaNewton*1.0E+15;
        return String.valueOf(joulePm);
    }

    private String petaNewtonToGramForce(double petaNewton) {
        double gramForce = petaNewton* 1.0197162129779E+17 ;
        return String.valueOf(gramForce);
    }

    private String petaNewtonToExaNewton(double petaNewton) {
        double exaNewton = petaNewton/1000;
        return String.valueOf(exaNewton);
    }
}