package com.example.esoftwarica.fragments;

import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.esoftwarica.R;
import com.example.esoftwarica.activity.MainActivity;
import com.example.esoftwarica.model.modelStudent;

public class addStudentFragment extends Fragment {

    EditText name, age, address;
    RadioGroup gender;
    Button btnRegister;
    RadioButton btnGender;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.add_student, container, false);
        name = v.findViewById(R.id.etName);
        age = v.findViewById(R.id.etAge);
        address = v.findViewById(R.id.etAddress);
        gender = v.findViewById(R.id.rgGender);
        btnRegister = v.findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Validation
                if (name.getText().toString().length()==0) {
                    name.setError("Please enter your username");
                    return;
                }
                else if (age.getText().toString().length()==0) {
                    age.setError("Please enter your age");
                    return;

                }
                else if (address.getText().toString().length()==0) {
                    address.setError("Please enter your address");
                    return;

                }

                else
                {
                    int selectGender = gender.getCheckedRadioButtonId();
                    btnGender = v.findViewById(selectGender);
                    int pic;
                    // For image of genders
                    switch (btnGender.getText().toString()) {
                        case "Male":
                            pic = R.drawable.male;
                            break;
                        case "Female":
                            pic = R.drawable.female;
                            break;
                        case "Others":
                            pic = R.drawable.ic_person;
                            break;
                        default:
                            pic = R.drawable.ic_person;
                            break;
                    }


                    MainActivity.studentList.add(new modelStudent(name.getText().toString(),  address.getText().toString(), btnGender.getText().toString(),Integer.parseInt(age.getText().toString()), pic));
                    Toast toast = Toast.makeText(getContext(), "Student created", Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });
        return v;
    }
}

