package model;

public class Pets {
    // atributos privados
    private int id;
    private String nome;
    private String porte;
    private String raca;
    
    public Pets(){

    }
    
    // construtores
    public Pets(int id, String nome, String porte, String raca) {
        this.id = id;
        this.nome = nome;
        this.porte = porte;
        this.raca = raca;
    }

    // getters e setters

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

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}