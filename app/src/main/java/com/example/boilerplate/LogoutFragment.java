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

public class LogoutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyModel viewModel = new ViewModelProvider(requireActivity()).get(MyModel.class);
        NavController controller = Navigation.findNavController(getActivity(), R.id.nav_host_fragment);
        viewModel.logout();
        controller.navigate(R.id.startFragment);
        return new View(getContext());
    }
}
