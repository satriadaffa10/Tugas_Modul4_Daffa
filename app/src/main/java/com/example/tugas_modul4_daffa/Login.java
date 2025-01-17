package com.example.tugas_modul4_daffa;

import android.os.Bundle;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Login extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Login newInstance(String param1, String param2) {
        Login fragment = new Login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        Button btnLogin = view.findViewById(R.id.login);
        EditText user = view.findViewById(R.id.username);
        EditText pass = view.findViewById(R.id.password);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dataLogin = new Intent (getActivity(),com.example.tugas_modul4_daffa.dataLogin.class);
                dataLogin.putExtra("user",user.getText().toString());
                dataLogin.putExtra("pass",pass.getText().toString());
                startActivity(dataLogin);
            }
        });
        Button Register = view.findViewById(R.id.fragRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register targetFragment = new Register();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, targetFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        Button Login = view.findViewById(R.id.fragLogin);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login targetFragment = new Login();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, targetFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;



    }

}