package br.com.alessandrolima.meusgamesromm.viewmodel;

import android.arch.lifecycle.AndroidViewModel;

import br.com.alessandrolima.meusgamesromm.dao.BancoDeDados;
import br.com.alessandrolima.meusgamesromm.model.Game;

import android.app.Application;
import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * Created by ALUNO on 16/01/2018.
 */

public class ListaGameViewModel extends AndroidViewModel {
    private LiveData<List<Game>> games;
    private BancoDeDados bd;

    public ListaGameViewModel(Application application) {
        super(application);
        bd =
                BancoDeDados.getDatabase(application.getApplicationContext());
        carregarDados();
    }

    public LiveData<List<Game>> getGames() {
        return games;
    }

    private void carregarDados() {
//Carregar os dados da nossa Base de dados e armazenar no
        LiveData
                games = bd.gameDAO().lerTarefas();
    }
}