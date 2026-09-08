package salario;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        String inputSalario = JOptionPane.showInputDialog(null, "Digite o salário antigo:", "Calculadora de Reajuste", JOptionPane.QUESTION_MESSAGE);
        if (inputSalario == null) return;
        double salarioAntigo = Double.parseDouble(inputSalario);

        String inputCodigo = JOptionPane.showInputDialog(null, "Códigos:\n101 - Administrador\n102 - Engenheiro\n103 - Médico\n104 - Outro\n\nDigite o código:", "Calculadora de Reajuste", JOptionPane.QUESTION_MESSAGE);
        if (inputCodigo == null) return;
        int codigo = Integer.parseInt(inputCodigo);

        String cargo = "";
        double percentual = 0.0;

        switch (codigo) {
            case 101 -> { cargo = "Administrador"; percentual = 0.0080; }
            case 102 -> { cargo = "Engenheiro"; percentual = 0.0065; }
            case 103 -> { cargo = "Médico"; percentual = 0.0060; }
            case 104 -> { cargo = "Outro cargo"; percentual = 0.0055; }
            default -> {
                JOptionPane.showMessageDialog(null, "Código inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        double diferenca = salarioAntigo * percentual;
        double novoSalario = salarioAntigo + diferenca;

        String resultado = String.format(
            "Cargo: %s\n" +
            "Salário Antigo: R$ %.2f\n" +
            "Novo Salário: R$ %.2f\n" +
            "Diferença: R$ %.2f", 
            cargo, salarioAntigo, novoSalario, diferenca
        );

        JOptionPane.showMessageDialog(null, resultado, "Resultado do Reajuste", JOptionPane.INFORMATION_MESSAGE);
    }
}
