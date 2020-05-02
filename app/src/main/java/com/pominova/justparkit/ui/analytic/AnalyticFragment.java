package com.pominova.justparkit.ui.analytic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.pominova.justparkit.R;

public class AnalyticFragment extends Fragment {

    private AnalyticViewModel analyticViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        analyticViewModel =
                ViewModelProviders.of(this).get(AnalyticViewModel.class);
        View root = inflater.inflate(R.layout.fragment_analytic, container, false);
        final TextView textView = root.findViewById(R.id.text_analytic);
        analyticViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}