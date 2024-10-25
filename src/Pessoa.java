//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Pessoa {
        private String nome;
        private int idade;

   public Pessoa(String nome, int idade){
       this.nome = nome;
       this.idade = idade;
   }

    @Override
    public String toString() {
        return "Pessoa: " + nome + "(Idade: " + idade + ")";
    }
}