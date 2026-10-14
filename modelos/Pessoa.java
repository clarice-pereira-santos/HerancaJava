package modelos;

public class Pessoa{
  public String nome;
  public Integer idade;
  public Float altura;

  public Pessoa(String nome,Integer idade,Float altura){
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public String apresentar(){
    return "\nAltura: " + this.nome + "\nIdade:" + this.idade + "\nAltura:" + this.altura;
    
  }
}
