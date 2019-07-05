package com.example.asus.admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.asus.admin.helper.Buka;
import com.example.asus.admin.shared.SharedLogin;
import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.asus.admin.shared.SharedLogin.SP_SUDAH_LOGIN2;

public class MainActivity extends AppCompatActivity {
    SharedLogin sharedLogin;
    FloatingActionMenu materialDesignFAM;
    @BindView(R.id.material_design_floating_action_menu_item1)
    FloatingActionButton materialDesignFloatingActionMenuItem1;
    @BindView(R.id.material_design_floating_action_menu_item2)
    FloatingActionButton materialDesignFloatingActionMenuItem2;
    @BindView(R.id.material_design_floating_action_menu_item3)
    FloatingActionButton materialDesignFloatingActionMenuItem3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
    }

    @OnClick({R.id.material_design_floating_action_menu_item1, R.id.material_design_floating_action_menu_item2, R.id.material_design_floating_action_menu_item3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.material_design_floating_action_menu_item1:
                Buka.buka(MainActivity.this, Berita.class);
                break;
            case R.id.material_design_floating_action_menu_item2:
                Buka.buka(MainActivity.this, Chat.class);
                break;
            case R.id.material_design_floating_action_menu_item3:
                Buka.buka(MainActivity.this, Akun.class);
                break;
        }
    }
}



