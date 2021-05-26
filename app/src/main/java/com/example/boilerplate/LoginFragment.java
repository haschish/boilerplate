package com.example.boilerplate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.boilerplate.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {
    FragmentLoginBinding binding;
    MyModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewModel = new ViewModelProvider(requireActivity()).get(MyModel.class);
        binding = FragmentLoginBinding.inflate(getLayoutInflater());
        binding.setLoginFragment(this);
        return binding.getRoot();
    }

    public void login() {
        NavController navController = Navigation.findNavController(binding.getRoot());
        if (viewModel.login()) {
            navController.navigate(R.id.profileFragment);
        }

    }
}
