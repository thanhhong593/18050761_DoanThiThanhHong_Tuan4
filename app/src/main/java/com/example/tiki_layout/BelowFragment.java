package com.example.tiki_layout;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BelowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BelowFragment extends Fragment {
    SendingData sendingData;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";


    // TODO: Rename and change types of parameters
    private String mParam1;


    public BelowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     *
     * @return A new instance of fragment BelowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BelowFragment newInstance(String param1) {
        BelowFragment fragment = new BelowFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData = (SendingData) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_below, container, false);
        TextView txtTamTinh = view.findViewById(R.id.txtTamTinh);
        txtTamTinh.setText("");
        txtTamTinh.setText(mParam1);



        return view;
    }
}