package exercicio04;

public class Funcionario {
    String nome;
    String cargo;
    double salario;
    String novoCargo;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;

    }
    public void aumentarSalario(double percentual) {

        salario += salario * (percentual / 100);

    }

    public void aumentarSalariocargo(String cargo, double percentual) {
        if (this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * (percentual / 100);

        }
    }
        public void promover(String novoCargo) {
            cargo = novoCargo;

        }




    }
