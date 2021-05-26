package com.example.boilerplate;

import android.util.Log;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class BindingAdapters {
    @BindingAdapter("app:isLogin")
    public static void lockedMode(DrawerLayout view, Boolean isLogin) {
        if (isLogin) {
            view.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        } else {
            view.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
        }
    }
}
