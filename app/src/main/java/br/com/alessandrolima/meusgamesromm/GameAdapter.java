package br.com.alessandrolima.meusgamesromm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.alessandrolima.meusgamesromm.model.Game;

/**
 * Created by ALUNO on 16/01/2018.
 */

public class GameAdapter extends
        RecyclerView.Adapter<GameAdapter.GameViewHolder> {
    private List<Game> games;

    public GameAdapter(List<Game> games) {
        this.games = games;
    }

    public void setList(List<Game> games) {
        this.games = games;
    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int
            viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_game, parent, false);
        return new GameViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GameViewHolder holder, int i) {
        Game game = games.get(i);
        holder.tvGame.setText(game.getNome());
        holder.tvPlataforma.setText(game.getPlataforma());
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public static class GameViewHolder extends
            RecyclerView.ViewHolder {
        TextView tvGame, tvPlataforma;

        public GameViewHolder(View v) {
            super(v);
            tvGame = (TextView) v.findViewById(R.id.tvGame);
            tvPlataforma = (TextView)
                    v.findViewById(R.id.tvPlataforma);
        }
    }
}

