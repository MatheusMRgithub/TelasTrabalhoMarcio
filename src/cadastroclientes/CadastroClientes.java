package cadastroclientes;

public class CadastroClientes {
    public static void main(String[] args) {
     CadastroUI formulario = new CadastroUI();
     Pessoa cliente = new Pessoa(formulario.nome, formulario.cpf, formulario.endereço, formulario.cidade, formulario.estado);
    }
    
}
