package com.pominova.justparkit.ui.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.pominova.justparkit.MenuActivity;
import com.pominova.justparkit.R;

public class SettingsFragment extends Fragment {

    public static final String IS_DARK_THEME = "isDarkTheme";
    private Switch themeSwitch;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_settings, container, false);

        changeTheme(root);

        return root;
    }

    private void changeTheme(View root) {
        themeSwitch = root.findViewById(R.id.darkThemeSwitch);
        SharedPreferences settings = ((MenuActivity) getActivity()).getSettings();
        themeSwitch.setChecked(settings.getBoolean(IS_DARK_THEME, false));
        themeSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ((MenuActivity) getActivity()).ToggleTheme(isChecked);
                } else {
                    ((MenuActivity) getActivity()).ToggleTheme(isChecked);
                }
            }
        });
    }
}