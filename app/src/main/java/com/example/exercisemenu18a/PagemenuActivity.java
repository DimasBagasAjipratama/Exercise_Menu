package com.example.exercisemenu18a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PagemenuActivity extends AppCompatActivity {
    Button btngmbrpersegi;
    Button btngmbrpersegipanjang;
    Button btngmbrlingkaran;
    Button btngmbrsegitiga;
    Button btngmbrtrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagemenu);

        btngmbrpersegi = (Button) findViewById(R.id.gmbrpersegi);
        btngmbrpersegipanjang = (Button) findViewById(R.id.gmbrpersegipanjang);
        btngmbrlingkaran = (Button) findViewById(R.id.gmbrlingkaran);
        btngmbrsegitiga = (Button) findViewById(R.id.gmbrsegitiga);
        btngmbrtrapesium = (Button) findViewById(R.id.gmbrtrapesium);

        btngmbrpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luas) {
                            startActivity(new Intent(v.getContext(),PersegiActivity.class));
                        } else if (item.getItemId() == R.id.keliling) {
                            startActivity(new Intent(v.getContext(), KelilingpersegiActivity.class));
                        }

                        return true;
                    }
                });

                popupMenu.show();
            }
        });

        btngmbrpersegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu_persegipanjang, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luaspersegipanjang) {
                            startActivity(new Intent(v.getContext(),PersegipanjangActivity.class));
                        } else if (item.getItemId() == R.id.keliling) {
                            startActivity(new Intent(v.getContext(), KelilingpersegipanjangActivity.class));
                        }

                        return true;
                    }
                });

                popupMenu.show();
            }
        });

        btngmbrlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu_lingkaran, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luaslingkaran) {
                            startActivity(new Intent(v.getContext(),LingkaranActivity.class));
                        } else if (item.getItemId() == R.id.keliling) {
                            startActivity(new Intent(v.getContext(), LingkaranActivity.class));
                        }

                        return true;
                    }
                });

                popupMenu.show();
            }
        });

        btngmbrsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu_segitiga, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luassegitiga) {
                            startActivity(new Intent(v.getContext(),SegitigaActivity.class));
                        } else if (item.getItemId() == R.id.kelilingsegitiga) {
                            startActivity(new Intent(v.getContext(), KelilingsegitigaActivity.class));
                        }

                        return true;
                    }
                });

                popupMenu.show();
            }
        });

        btngmbrtrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuActivity.this, btngmbrpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu_trapesium, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.luastrapesium) {
                            startActivity(new Intent(v.getContext(),KelilingtrapesiumActivity.class));
                        } else if (item.getItemId() == R.id.kelilingtrapesium) {
                            startActivity(new Intent(v.getContext(), KelilingtrapesiumActivity.class));
                        }

                        return true;
                    }
                });

                popupMenu.show();
            }
        });

    }
}
