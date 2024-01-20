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

public class freq_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Hertz";
    String toUnit = "Hertz";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Hertz",
            "Kilohertz",
            "Petahertz",
            "Terahertz",
            "Gigahertz", "Megahertz"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freq_cal);

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
                String freqInput = et_fromUnit.getText().toString();
                if (freqInput.equals("") || freqInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(freqInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(hertzToKilohertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(hertzToPetahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(hertzToTerahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(hertzToGigahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(hertzToMegahertz(Double.parseDouble(freqInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kilohertzToHertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(freqInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kilohertzToPetahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kilohertzToTerahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kilohertzToGigahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kilohertzToMegahertz(Double.parseDouble(freqInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(petahertzToHertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(petahertzToKilohertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(freqInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(petahertzToTerahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(petahertzToGigahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(petahertzToMegahertz(Double.parseDouble(freqInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(terahertzToHertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(terahertzToKilohertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(terahertzToPetahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(freqInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(terahertzToGigahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(terahertzToMegahertz(Double.parseDouble(freqInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(gigahertzToHertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(gigahertzToKilohertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(gigahertzToPetahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(gigahertzToTerahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(freqInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(gigahertzToMegahertz(Double.parseDouble(freqInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(megahertzToHertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(megahertzToKilohertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(megahertzToPetahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(megahertzToTerahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(megahertzToGigahertz(Double.parseDouble(freqInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(freqInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(freq_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Hertz",
                        "Kilohertz",
                        "Petahertz",
                        "Terahertz",
                        "Gigahertz", "Megahertz"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(freq_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Hertz",
                        "Kilohertz",
                        "Petahertz",
                        "Terahertz",
                        "Gigahertz", "Megahertz"
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

    //hertz
    private String hertzToPetahertz(double hertz) {
        double petahertz = hertz/1e+15;
        return String.valueOf(petahertz);
    }

    private String hertzToTerahertz(double hertz) {
        double terahertz = hertz/1e+12;
        return String.valueOf(terahertz);
    }

    private String hertzToGigahertz(double hertz) {
        double gigahertz = hertz/1e+9;
        return String.valueOf(gigahertz);
    }

    private String hertzToMegahertz(double hertz) {
        double megahertz = hertz/1e+6;
        return String.valueOf(megahertz);
    }

    private String hertzToKilohertz(double hertz) {
        double kilohertz = hertz/1e+3;
        return String.valueOf(kilohertz);
    }

    //kilohertz
    private String kilohertzToPetahertz(double kilohertz) {
        double petahertz = kilohertz/1e+12;
        return String.valueOf(petahertz);
    }

    private String kilohertzToTerahertz(double kilohertz) {
        double terahertz = kilohertz/1e+9;
        return String.valueOf(terahertz);
    }

    private String kilohertzToGigahertz(double kilohertz) {
        double gigahertz = kilohertz/1e+6;
        return String.valueOf(gigahertz);
    }

    private String kilohertzToMegahertz(double kilohertz) {
        double megahertz = kilohertz / 1000;
        return String.valueOf(megahertz);
    }

    private String kilohertzToHertz(double kilohertz) {
        double hertz = kilohertz*1e+3;
        return String.valueOf(hertz);
    }

    //Petahertz
    private String petahertzToTerahertz(double petahertz) {
        double terahertz = petahertz * 1000;
        return String.valueOf(terahertz);
    }

    private String petahertzToGigahertz(double petahertz) {
        double gigahertz = petahertz*1e+6;
        return String.valueOf(gigahertz);
    }

    private String petahertzToMegahertz(double petahertz) {
        double megahertz = petahertz*1e+9;
        return String.valueOf(megahertz);
    }

    private String petahertzToHertz(double petahertz) {
        double hertz = petahertz*1e+15;
        return String.valueOf(hertz);
    }

    private String petahertzToKilohertz(double petahertz) {
        double kilohertz = petahertz*1e+12;
        return String.valueOf(kilohertz);
    }

    //Terahertz
    private String terahertzToGigahertz(double terahertz) {
        double gigahertz = terahertz*1000;
        return String.valueOf(gigahertz);
    }

    private String terahertzToMegahertz(double terahertz) {
        double megahertz = terahertz*1e+6;
        return String.valueOf(megahertz);
    }

    private String terahertzToHertz(double terahertz) {
        double hertz = terahertz*1e+12;
        return String.valueOf(hertz);
    }

    private String terahertzToKilohertz(double terahertz) {
        double kilohertz = terahertz*1e+9;
        return String.valueOf(kilohertz);
    }

    private String terahertzToPetahertz(double terahertz) {
        double petahertz = terahertz / 1000;
        return String.valueOf(petahertz);
    }

    //Gigahertz
    private String gigahertzToMegahertz(double gigahertz) {
        double megahertz = gigahertz*1000;
        return String.valueOf(megahertz);
    }

    private String gigahertzToHertz(double gigahertz) {
        double hertz = gigahertz * 1e+9;
        return String.valueOf(hertz);
    }

    private String gigahertzToKilohertz(double gigahertz) {
        double kilohertz = gigahertz *1e+6;
        return String.valueOf(kilohertz);
    }

    private String gigahertzToPetahertz(double gigahertz) {
        double petahertz = gigahertz/ 1e+6;
        return String.valueOf(petahertz);
    }

    private String gigahertzToTerahertz(double gigahertz) {
        double terahertz = gigahertz/1000;
        return String.valueOf(terahertz);
    }

    //Megahertz
    private String megahertzToHertz(double megahertz) {
        double hertz = megahertz*1e+6;
        return String.valueOf(hertz);
    }

    private String megahertzToKilohertz(double megahertz) {
        double kilohertz = megahertz * 1000;
        return String.valueOf(kilohertz);
    }

    private String megahertzToPetahertz(double megahertz) {
        double petahertz = megahertz/1e+9;
        return String.valueOf(petahertz);
    }

    private String megahertzToTerahertz(double megahertz) {
        double terahertz = megahertz/1e+6;
        return String.valueOf(terahertz);
    }

    private String megahertzToGigahertz(double megahertz) {
        double gigahertz = megahertz/1000;
        return String.valueOf(gigahertz);
    }

}