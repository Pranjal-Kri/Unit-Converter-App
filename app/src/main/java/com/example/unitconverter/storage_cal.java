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

public class storage_cal extends AppCompatActivity {

    CardView cv_fromUnit, cv_toUnit, cv_convert;
    RelativeLayout mCLayout;
    String fromUnit = "Bit";
    String toUnit = "Nibble";
    TextView tv_fromUnit, tv_toUnit;
    EditText et_fromUnit, et_toUnit;
    final String[] values = new String[]{
            "Bit",
            "Nibble",
            "Byte",
            "Character",
            "Word", "Block"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_cal);

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
                String storInput = et_fromUnit.getText().toString();
                if (storInput.equals("") || storInput == null) {
                    et_fromUnit.setError("Please enter some value");
                } else {
                    if (tv_fromUnit.getText().toString().equals(values[0])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(storInput);
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(bitToNibble(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(bitToByte(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(bitToCharacter(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(bitToWord(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(bitToBlock(Double.parseDouble(storInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(nibbleToBit(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(storInput);
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(nibbleToByte(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(nibbleToCharacter(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(nibbleToWord(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(nibbleToBlock(Double.parseDouble(storInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(byteToBit(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(byteToNibble(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(storInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(byteToCharacter(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(byteToWord(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(byteToBlock(Double.parseDouble(storInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(characterToBit(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(characterToNibble(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(characterToByte(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(storInput);
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(characterToWord(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(characterToBlock(Double.parseDouble(storInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(wordToBit(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(wordToNibble(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(wordToByte(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(wordToCharacter(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(storInput);
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(wordToBlock(Double.parseDouble(storInput)));
                        }
                    } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(blockToBit(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(blockToNibble(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(blockToByte(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(blockToCharacter(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(blockToWord(Double.parseDouble(storInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(storInput);
                        }
                    }
                }
            }
        });

        cv_toUnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final AlertDialog.Builder builder = new AlertDialog.Builder(storage_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Bit",
                        "Nibble",
                        "Byte",
                        "Character",
                        "Word", "Block"
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

                final AlertDialog.Builder builder = new AlertDialog.Builder(storage_cal.this);
                builder.setTitle("choose Unit");

                final String[] flowers = new String[]{
                        "Bit",
                        "Nibble",
                        "Byte",
                        "Character",
                        "Word", "Block"
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

    //bit
    private String bitToByte(double bit) {
        double byt = bit / 8;
        return String.valueOf(byt);
    }

    private String bitToCharacter(double bit) {
        double character = bit * .125;
        return String.valueOf(character);
    }

    private String bitToWord(double bit) {
        double word = bit * 0.0625;
        return String.valueOf(word);
    }

    private String bitToBlock(double bit) {
        double block = bit *  0.000244140625;
        return String.valueOf(block);
    }

    private String bitToNibble(double bit) {
        double nibble = bit / 4;
        return String.valueOf(nibble);
    }

    //nibble
    private String nibbleToByte(double nibble) {
        double byt = nibble/2;
        return String.valueOf(byt);
    }

    private String nibbleToCharacter(double nibble) {
        double character = nibble *0.5;
        return String.valueOf(character);
    }

    private String nibbleToWord(double nibble) {
        double word = nibble*0.25;
        return String.valueOf(word);
    }

    private String nibbleToBlock(double nibble) {
        double block = nibble*0.0009765625;
        return String.valueOf(block);
    }

    private String nibbleToBit(double nibble) {
        double bit = nibble*4;
        return String.valueOf(bit);
    }

    //Byte
    private String byteToCharacter(double byt) {
        double character = byt ;
        return String.valueOf(character);
    }

    private String byteToWord(double byt) {
        double word = byt*0.5;
        return String.valueOf(word);
    }

    private String byteToBlock(double byt) {
        double block = byt*0.001953125;
        return String.valueOf(block);
    }

    private String byteToBit(double byt) {
        double bit = byt *8;
        return String.valueOf(bit);
    }

    private String byteToNibble(double byt) {
        double nibble = byt*2;
        return String.valueOf(nibble);
    }

    //Character
    private String characterToWord(double character) {
        double word = character*0.5;
        return String.valueOf(word);
    }

    private String characterToBlock(double character) {
        double block = character*0.001953125;
        return String.valueOf(block);
    }

    private String characterToBit(double character) {
        double bit = character*8;
        return String.valueOf(bit);
    }

    private String characterToNibble(double character) {
        double nibble = character *2;
        return String.valueOf(nibble);
    }

    private String characterToByte(double character) {
        double byt = character;
        return String.valueOf(byt);
    }

    //Word
    private String wordToBlock(double word) {
        double block = word*0.00390625;
        return String.valueOf(block);
    }

    private String wordToBit(double word) {
        double bit = word * 16;
        return String.valueOf(bit);
    }

    private String wordToNibble(double word) {
        double nibble = word * 4;
        return String.valueOf(nibble);
    }

    private String wordToByte(double word) {
        double byt = word *2;
        return String.valueOf(byt);
    }

    private String wordToCharacter(double word) {
        double character = word *2;
        return String.valueOf(character);
    }

    //Block
    private String blockToBit(double block) {
        double bit = block/0.000244140625;
        return String.valueOf(bit);
    }

    private String blockToNibble(double block) {
        double nibble = block*1024;
        return String.valueOf(nibble);
    }

    private String blockToByte(double block) {
        double byt = block*512;
        return String.valueOf(byt);
    }

    private String blockToCharacter(double block) {
        double character = block/0.001953125;
        return String.valueOf(character);
    }

    private String blockToWord(double block) {
        double word = block*256;
        return String.valueOf(word);
    }


}