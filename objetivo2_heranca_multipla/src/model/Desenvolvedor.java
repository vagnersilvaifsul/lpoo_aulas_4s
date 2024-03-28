package model;

public class Desenvolvedor extends Funcionario{
    @Override
    public double getBonus() {
        return this.getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{} " + super.toString();
    }
}
