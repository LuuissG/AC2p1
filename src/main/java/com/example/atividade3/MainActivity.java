import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.atividade3.Filme;
import com.example.atividade3.FilmeAdapter;
import com.example.atividade3.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewFilmes);

        List<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(new Filme("Homem-Aranha: Sem Volta para Casa", 2021, "Peter Parker tem a sua identidade secreta revelada e pede ajuda ao Doutor Estranho. Quando um feitiço para reverter o evento não sai como o esperado, o Homem-Aranha e seu companheiro dos Vingadores precisam enfrentar inimigos de todo o multiverso.", "Jon Watts", R.mipmap.filme1));
        listaFilmes.add(new Filme("Nós", 2019, "Adelaide e Gabe levam a família para passar um fim de semana na praia e descansar. Eles começam a aproveitar o ensolarado local, mas a chegada de um grupo misterioso muda tudo e a família se torna refém de seres com aparências iguais às suas.", "Jordan Peele", R.mipmap.filme2));
        listaFilmes.add(new Filme("Interestelar", 2014, "As reservas naturais da Terra estão chegando ao fim e um grupo de astronautas recebe a missão de verificar possíveis planetas para receberem a população mundial, possibilitando a continuação da espécie. Cooper é chamado para liderar o grupo e aceita a missão sabendo que pode nunca mais ver os filhos. Ao lado de Brand, Jenkins e Doyle, ele seguirá em busca de um novo lar.", "Christopher Nolan", R.mipmap.filme3));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FilmeAdapter filmeAdapter = new FilmeAdapter(listaFilmes, this);
        recyclerView.setAdapter(filmeAdapter);

        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
