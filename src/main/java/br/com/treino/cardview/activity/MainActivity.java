package br.com.treino.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import br.com.treino.cardview.R;
import br.com.treino.cardview.adapter.postagemAdapter;
import br.com.treino.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Postagem> listPost = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        creatPost();

        postagemAdapter adapterP = new postagemAdapter(listPost);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        //LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        recyclerView.setAdapter(adapterP);

    }

    public void creatPost(){

        Postagem post = new Postagem("Palmeiras", "Não tem mundial", R.drawable.palmeiras);
        this.listPost.add(post);

        post = new Postagem("América mineiro", "O time menos odiado de minas", R.drawable.americamineiro);
        this.listPost.add(post);

        post = new Postagem("EC Avenida", "Eu não conhecia, pra mim é uma rua grande", R.drawable.avenida);
        this.listPost.add(post);

        post = new Postagem("Boa vista", "Acho a logo bem bonitinha até", R.drawable.boavista);
        this.listPost.add(post);

        post = new Postagem("Caldense", "A famosa por eliminar certos times", R.drawable.caldense);
        this.listPost.add(post);

        post = new Postagem("Chapecoense", "Grande chapecó, nada contra", R.drawable.chapecoense);
        this.listPost.add(post);

        post = new Postagem("Coritiba", "Não curto muito, mas é melhor que a cap", R.drawable.coritiba);
        this.listPost.add(post);

        post = new Postagem("Gama", "Gama é um time de respeito", R.drawable.gamadf);
        this.listPost.add(post);

        post = new Postagem("Goias", "Revelou o Micha, gostei", R.drawable.goias);
        this.listPost.add(post);

        post = new Postagem("Guarani", "Maior que o palmeiras", R.drawable.guarani);
        this.listPost.add(post);

        post = new Postagem("Nacional de patos", "Não conhecia", R.drawable.nacionaldepatospb);
        this.listPost.add(post);

        post = new Postagem("Ypiranga", "Das margens..", R.drawable.ypirangadeerechim);
        this.listPost.add(post);


    }

}