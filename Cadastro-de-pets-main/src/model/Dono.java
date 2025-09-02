package model;

public class Dono {
    private int donoId;
    private String nomeDono;
    private String telefone;

//atributos privados

public Dono(){
    
}

public Dono(int donoId, String nomeDono){
    this.donoId = donoId;
    this.nomeDono = nomeDono;
}
//contrutores

public int getDonoId(){
    return donoId;
}

public void setDonoId(int donoId){
    this.donoId = donoId;
}

public String nomeDono(){
    return nomeDono;
}

public void setNome(String nomeDono){
    this.nomeDono = nomeDono;
}

public String getTelefone(){
    return telefone;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
}



}
