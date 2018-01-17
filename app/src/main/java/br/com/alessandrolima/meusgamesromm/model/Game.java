package br.com.alessandrolima.meusgamesromm.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by ALUNO on 16/01/2018.
 */

//A anotacao @Entity abaixo indica indica que
// a classe sera uma tabela SQL

    @Entity
public class Game {
    //A anotacao PrimaryKey indica que a variável id será chave primária
//da nossa base dados e ativamos o autoGenerate para que o id
//seja gerado automaticamente

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome;
    private String plataforma;
    public Game() {}
    public Game(String nome, String plataforma) {

        this.nome = nome;
        this.plataforma = plataforma;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
