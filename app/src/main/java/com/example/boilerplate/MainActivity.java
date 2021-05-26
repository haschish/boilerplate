package com.example.boilerplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewParent;
import android.widget.Toast;

import com.example.boilerplate.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        MyModel viewModel = new ViewModelProvider(this).get(MyModel.class);


        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);
        setContentView(binding.getRoot());

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        NavigationView navigationView = findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener((item) -> {
//            if (item.getItemId() == R.id.logOut) {
//                viewModel.logout();
//                navController.navigate(R.id.startFragment);
//            }
//
//            ViewParent parent = navigationView.getParent();
//            if (parent instanceof Openable) {
//                ((Openable) parent).close();
//            }
//            return true;
//        });

        NavigationUI.setupWithNavController(navigationView, navController);
//        NavigationUI.setupActionBarWithNavController(this, navController);
    }

    public void goTo() {
        Toast.makeText(this, "goTo", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return navController.navigateUp();
    }
}