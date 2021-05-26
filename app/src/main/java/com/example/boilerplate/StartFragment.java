package com.example.boilerplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.boilerplate.databinding.FragmentStartBinding;

public class StartFragment extends Fragment {
    MyModel viewModel;
    FragmentStartBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentStartBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(requireActivity()).get(MyModel.class);
        binding.setStartFragment(this);

        return binding.getRoot();
    }

    public void onLoginClick() {
        Navigation.findNavController(binding.getRoot()).navigate(R.id.loginFragment);
    }
}
