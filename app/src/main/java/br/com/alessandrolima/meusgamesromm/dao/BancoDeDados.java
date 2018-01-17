package br.com.alessandrolima.meusgamesromm.dao;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import br.com.alessandrolima.meusgamesromm.model.Game;

/**
 * Created by ALUNO on 16/01/2018.
 */

@Database(entities = {Game.class}, version = 1)
public abstract class BancoDeDados extends RoomDatabase {
    private static BancoDeDados INSTANCE;
    public static BancoDeDados getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(),
                            BancoDeDados.class,
                            "gamesdbs")
                            .build();
        }
        return INSTANCE;
    }
    public abstract GameDAO gameDAO();


}
