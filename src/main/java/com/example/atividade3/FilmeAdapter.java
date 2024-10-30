package com.example.atividade3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeAdapter.FilmeViewHolder> {
    private List<Filme> filmes;
    private Context context;

    public FilmeAdapter(List<Filme> filmes, Context context) {
        this.filmes = filmes;
        this.context = context;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_filme, parent, false);
        return new FilmeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder holder, int position) {
        Filme filme = filmes.get(position);
        holder.imageView.setImageResource(filme.getImagem());
        holder.titulo.setText(filme.getTitulo());
        holder.ano.setText(String.valueOf(filme.getAno()));
        holder.diretor.setText(filme.getDiretor());

        holder.buttonSinopse.setOnClickListener(v ->
                Toast.makeText(context, filme.getSinopse(), Toast.LENGTH_LONG).show()
        );
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public static class FilmeViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titulo;
        TextView ano;
        TextView diretor;
        Button buttonSinopse;

        public FilmeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewPoster);
            titulo = itemView.findViewById(R.id.textViewTitulo);
            ano = itemView.findViewById(R.id.textViewAno);
            diretor = itemView.findViewById(R.id.textViewDiretor);
            buttonSinopse = itemView.findViewById(R.id.buttonSinopse);
        }
    }
}
