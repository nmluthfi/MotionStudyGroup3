package com.example.motionstudygroup3;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMenuActivity extends AppCompatActivity {

    private TextInputEditText etNamaMenu, etHargaMenu, etDetailMenu;
    private Button btnAdd;

    private FirebaseDatabase db;
    private DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_menu);

        etDetailMenu = findViewById(R.id.et_detail_menu);
        etHargaMenu = findViewById(R.id.et_harga_menu);
        etNamaMenu = findViewById(R.id.et_nama_menu);
        btnAdd = findViewById(R.id.btn_add);

        db = FirebaseDatabase.getInstance();
        dbRef = db.getReference("menu_makanan");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaMenu = etNamaMenu.getText().toString().trim();
                String detailMenu = etDetailMenu.getText().toString().trim();
                int hargaMenu = Integer.parseInt(etHargaMenu.getText().toString().trim());

                MenuModel menuModel = new MenuModel(namaMenu, detailMenu, hargaMenu);
                saveToDatabase(menuModel);
            }
        });
    }

    public void saveToDatabase(MenuModel menuModel) {
        String key = dbRef.push().getKey();
        dbRef.child(key).setValue(menuModel);
    }
}
