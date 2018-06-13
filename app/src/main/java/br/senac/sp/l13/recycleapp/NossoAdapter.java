package br.senac.sp.l13.recycleapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

class NossoAdapter extends RecyclerView.Adapter {

    private Livro livros;


    public NossoAdapter(List<Livro> livros) {
        this.livros = livros;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}
