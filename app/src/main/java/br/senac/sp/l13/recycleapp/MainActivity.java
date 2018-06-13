package br.senac.sp.l13.recycleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.myRecycleView);

        List<Livro> livros = //carrega valores do banco de dados ou do WebService

                recyclerView.setAdapter(new NossoAdapter(livros));

    }
}
