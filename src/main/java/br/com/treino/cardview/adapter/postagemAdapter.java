package br.com.treino.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.treino.cardview.R;
import br.com.treino.cardview.model.Postagem;

public class postagemAdapter extends RecyclerView.Adapter<postagemAdapter.MyViewHolder> {

    List<Postagem> listP;

    public postagemAdapter(List<Postagem> list) {
        this.listP = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_itens, parent, false);

        return new MyViewHolder(adapterList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem post = listP.get(position);
        holder.nome.setText(post.getNome());
        holder.textPostagem.setText(post.getPostagem());
        holder.postagem.setImageResource(post.getImagem());

    }

    @Override
    public int getItemCount() {
        return listP.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        ImageView postagem;
        TextView textPostagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textNome);
            postagem = itemView.findViewById(R.id.imagePost);
            textPostagem = itemView.findViewById(R.id.textPostagem);


        }
    }
}
