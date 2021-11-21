package com.flettieri.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.flettieri.cardview.R;
import com.flettieri.cardview.adapter.PostagemAdapter;
import com.flettieri.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<Postagem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
//        RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(
//                getApplicationContext(),
//                2);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        postagens.addAll(
                Arrays.asList(
                        new Postagem("Fabio Lettieri", "#TBT Viagem legal!", R.drawable.imagem1),
                        new Postagem("Hotel JM", "Viaje, aproveite nossos descontos", R.drawable.imagem2),
                        new Postagem("Maria Luiza", "#Paris", R.drawable.imagem3),
                        new Postagem("Marcos Paulo", "Que foto linda!", R.drawable.imagem4)
                )
        );
    }
}