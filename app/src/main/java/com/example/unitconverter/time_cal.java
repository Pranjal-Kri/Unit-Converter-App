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

public class time_cal extends AppCompatActivity {
    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Second";
    String toUnit = "Millisecond";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Second",
            "Millisecond",
            "Microsecond",
            "Nanosecond",
            "Picoseconds", "Femtosecond"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_cal);

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
                String timeInput = et_fromUnit.getText().toString();
                if (timeInput.equals("") || timeInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(timeInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(secondToMillisecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(secondToMicrosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(secondToNanosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(secondToPicosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(secondToFemtosecond(Double.parseDouble(timeInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(millisecondToSecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(timeInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(millisecondToMicrosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(millisecondToNanosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(millisecondToPicosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(millisecondToFemtosecond(Double.parseDouble(timeInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(microsecondToSecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(microsecondToMillisecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(timeInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(microsecondToNanosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(microsecondToPicoseconds(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(microsecondToFemtosecond(Double.parseDouble(timeInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(nanosecondTosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(nanosecondTomillisecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(nanosecondTomicrosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(timeInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(nanosecondToPicoseconds(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(nanosecondTofemtosecond(Double.parseDouble(timeInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(picosecondsTosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(picosecondsTomillisecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(picosecondsTomicrosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(picosecondsTonanosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(timeInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(picosecondsTofemtosecond(Double.parseDouble(timeInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(femtosecondTosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(femtosecondTomillisecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(femtosecondTomicrosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(femtosecondTonanosecond(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(femtosecondToPicoseconds(Double.parseDouble(timeInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(timeInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(time_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Second",
                        "Millisecond",
                        "Microsecond",
                        "Nanosecond",
                        "Picosecond", "Femtosecond"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(time_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Second",
                        "Millisecond",
                        "Microsecond",
                        "Nanosecond",
                        "Picosecond", "Femtosecond"
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

    //From Second Conversions
    private String secondToMillisecond(double second) {
        double millisecond = second *1000;
        return String.valueOf(millisecond);
    }
    private String secondToMicrosecond(double second) {
        double microsecond = second *1e6;
        return String.valueOf(microsecond);
    }

    private String secondToNanosecond(double second) {
        double nanosecond = second *1e+9;
        return String.valueOf(nanosecond);
    }

    private String secondToPicosecond(double second) {
        double picosecond = second * 1e+12;
        return String.valueOf(picosecond);
    }

    private String secondToFemtosecond(double second) {
        double femtosecond = second *1e+15;
        return String.valueOf(femtosecond);
    }


    //From Millisecond Conversions
    private String millisecondToMicrosecond(double millisecond) {
        double microsecond = millisecond *1000;
        return String.valueOf(microsecond);
    }

    private String millisecondToNanosecond(double millisecond) {
        double nanosecond = millisecond*1e+6;
        return String.valueOf(nanosecond);
    }

    private String millisecondToPicosecond(double millisecond) {
        double picosecond = millisecond *1e+9;
        return String.valueOf(picosecond);
    }

    private String millisecondToFemtosecond(double millisecond) {
        double femtosecond = millisecond*1e+12;
        return String.valueOf(femtosecond);
    }

    private String millisecondToSecond(double millisecond) {
        double second = millisecond /1000;
        return String.valueOf(second);
    }

    //From Microsecond Conversions
    private String microsecondToNanosecond(double microsecond) {
        double nanosecond = microsecond * 1000;
        return String.valueOf(nanosecond);
    }

    private String microsecondToPicoseconds(double microsecond) {
        double picosecond = microsecond *1e+6;
        return String.valueOf(picosecond);
    }

    private String microsecondToFemtosecond(double microsecond) {
        double femtosecond = microsecond *1e+9;
        return String.valueOf(femtosecond);
    }

    private String microsecondToSecond(double microsecond) {
        double second = microsecond /1e+6;
        return String.valueOf(second);
    }

    private String microsecondToMillisecond(double microsecond) {
        double millisecond = microsecond/1000;
        return String.valueOf(millisecond);
    }

    //From Nanosecond Conversions
    private String nanosecondToPicoseconds(double nanosecond) {
        double picoseconds = nanosecond*1000;
        return String.valueOf(picoseconds);
    }

    private String nanosecondTofemtosecond(double nanosecond) {
        double femtosecond = nanosecond*1e+6;
        return String.valueOf(femtosecond);
    }

    private String nanosecondTosecond(double nanosecond) {
        double second = nanosecond/ 1e+9;
        return String.valueOf(second);
    }

    private String nanosecondTomillisecond(double nanosecond) {
        double millisecond = nanosecond/ 1e+6;
        return String.valueOf(millisecond);
    }

    private String nanosecondTomicrosecond(double nanosecond) {
        double microsecond = nanosecond /1000;
        return String.valueOf(microsecond);
    }

    //From Picoseconds Conversions
    private String picosecondsTofemtosecond(double picoseconds) {
        double femtosecond = picoseconds*1000;
        return String.valueOf(femtosecond);
    }

    private String picosecondsTosecond(double picoseconds) {
        double second = picoseconds/1e+12;
        return String.valueOf(second);
    }

    private String picosecondsTomillisecond(double picoseconds) {
        double millisecond = picoseconds /1e+9;
        return String.valueOf(millisecond);
    }

    private String picosecondsTomicrosecond(double picoseconds) {
        double microsecond = picoseconds/ 1e+6;
        return String.valueOf(microsecond);
    }

    private String picosecondsTonanosecond(double picoseconds) {
        double nanosecond = picoseconds /1000;
        return String.valueOf(nanosecond);
    }

    //From Femtosecond Conversions
    private String femtosecondTosecond(double femtosecond) {
        double second = femtosecond/1e+15;
        return String.valueOf(second);
    }

    private String femtosecondTomillisecond(double femtosecond) {
        double millisecond = femtosecond/1e+12;
        return String.valueOf(millisecond);
    }

    private String femtosecondTomicrosecond(double femtosecond) {
        double microsecond = femtosecond/1e+9;
        return String.valueOf(microsecond);
    }

    private String femtosecondTonanosecond(double femtosecond) {
        double nanosecond = femtosecond/1e+6;
        return String.valueOf(nanosecond);
    }

    private String femtosecondToPicoseconds(double femtosecond) {
        double picoseconds = femtosecond/1000;
        return String.valueOf(picoseconds);
    }

}