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

public class current_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Ampere";
    String toUnit = "KiloAmpere";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Ampere",
            "Kiloampere",
            "Milliampere",
            "Biot",
            "Abampere", "EMU"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_cal);

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
                String currentInput = et_fromUnit.getText().toString();
                if (currentInput.equals("") || currentInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(currentInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(ampereToKiloAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(ampereToMilliAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(ampereToBiot(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(ampereToAbampere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(ampereToEmu(Double.parseDouble(currentInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(kiloAmpereToAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(currentInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(kiloAmpereToMilliAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(kiloAmpereToBiot(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(kiloAmpereToAbampere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(kiloAmpereToEmu(Double.parseDouble(currentInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(milliAmpereToAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(milliAmpereToKiloAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(currentInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(milliAmpereToBiot(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(milliAmpereToAbampere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(milliAmpereToEmu(Double.parseDouble(currentInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(biotToAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(biotToKiloAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(biotToMilliAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(currentInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(biotToAbampere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(biotToEmu(Double.parseDouble(currentInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(abampereToAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(abampereToKiloAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(abampereToMilliAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(abampereToBiot(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(currentInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(abampereToEmu(Double.parseDouble(currentInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(emuToAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(emuToKiloAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(emuToMilliAmpere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(emuToBiot(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(emuToAbampere(Double.parseDouble(currentInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(currentInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(current_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Ampere",
                        "Kiloampere",
                        "Milliampere",
                        "Biot",
                        "Abampere", "EMU"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(current_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Ampere",
                        "Kiloampere",
                        "Milliampere",
                        "Biot",
                        "Abampere", "EMU"
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

    //ampere
    private String ampereToMilliAmpere(double ampere) {
        double milliAmpere = ampere * 1000;
        return String.valueOf(milliAmpere);
    }

    private String ampereToBiot(double ampere) {
        double biot = ampere / 10;
        return String.valueOf(biot);
    }

    private String ampereToAbampere(double ampere) {
        double abampere = ampere /10;
        return String.valueOf(abampere);
    }

    private String ampereToEmu(double ampere) {
        double emu = ampere/10;
        return String.valueOf(emu);
    }

    private String ampereToKiloAmpere(double ampere) {
        double kiloAmpere = ampere/1000 ;
        return String.valueOf(kiloAmpere);
    }

    //kiloAmpere
    private String kiloAmpereToMilliAmpere(double kiloAmpere) {
        double milliAmpere = kiloAmpere*1e+6;
        return String.valueOf(milliAmpere);
    }

    private String kiloAmpereToBiot(double kiloAmpere) {
        double biot = kiloAmpere *100;
        return String.valueOf(biot);
    }

    private String kiloAmpereToAbampere(double kiloAmpere) {
        double abampere = kiloAmpere*100;
        return String.valueOf(abampere);
    }

    private String kiloAmpereToEmu(double kiloAmpere) {
        double emu = kiloAmpere*100;
        return String.valueOf(emu);
    }

    private String kiloAmpereToAmpere(double kiloAmpere) {
        double ampere = kiloAmpere*1000;
        return String.valueOf(ampere);
    }

    //MilliAmpere
    private String milliAmpereToBiot(double milliAmpere) {
        double biot = milliAmpere / 10000;
        return String.valueOf(biot);
    }

    private String milliAmpereToAbampere(double milliAmpere) {
        double abampere = milliAmpere/10000;
        return String.valueOf(abampere);
    }

    private String milliAmpereToEmu(double milliAmpere) {
        double emu = milliAmpere*0.0001;
        return String.valueOf(emu);
    }

    private String milliAmpereToAmpere(double milliAmpere) {
        double ampere = milliAmpere *1000;
        return String.valueOf(ampere);
    }

    private String milliAmpereToKiloAmpere(double milliAmpere) {
        double kiloAmpere = milliAmpere/1e+6;
        return String.valueOf(kiloAmpere);
    }

    //Biot
    private String biotToAbampere(double biot) {
        double abampere = biot;
        return String.valueOf(abampere);
    }

    private String biotToEmu(double biot) {
        double emu = biot;
        return String.valueOf(emu);
    }

    private String biotToAmpere(double biot) {
        double ampere = biot*10;
        return String.valueOf(ampere);
    }

    private String biotToKiloAmpere(double biot) {
        double kiloAmpere = biot/100;
        return String.valueOf(kiloAmpere);
    }

    private String biotToMilliAmpere(double biot) {
        double milliAmpere = biot * 10000;
        return String.valueOf(milliAmpere);
    }

    //Abampere
    private String abampereToEmu(double abampere) {
        double emu =abampere;
        return String.valueOf(emu);
    }

    private String abampereToAmpere(double abampere) {
        double ampere = abampere*10;
        return String.valueOf(ampere);
    }

    private String abampereToKiloAmpere(double abampere) {
        double kiloAmpere = abampere / 100;
        return String.valueOf(kiloAmpere);
    }

    private String abampereToMilliAmpere(double abampere) {
        double milliAmpere = abampere*10000;
        return String.valueOf(milliAmpere);
    }

    private String abampereToBiot(double abampere) {
        double biot = abampere ;
        return String.valueOf(biot);
    }

    //Emu
    private String emuToAmpere(double emu) {
        double ampere = emu*10;
        return String.valueOf(ampere);
    }

    private String emuToKiloAmpere(double emu) {
        double kiloAmpere = emu/100;
        return String.valueOf(kiloAmpere);
    }

    private String emuToMilliAmpere(double emu) {
        double milliAmpere = emu*10000 ;
        return String.valueOf(milliAmpere);
    }

    private String emuToBiot(double emu) {
        double biot =emu;
        return String.valueOf(biot);
    }

    private String emuToAbampere(double emu) {
        double abampere = emu;
        return String.valueOf(abampere);
    }

}