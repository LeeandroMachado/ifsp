import javax.swing.JOptionPane;

class Exercicio8 {
    public static void main(String[] args) {
        int input;
        double average, grade, times = 0, totalGrades = 0;
        
        do {
            grade = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
            input = JOptionPane.showConfirmDialog(null, "Deseja informar a nota de mais um aluno ?");
            
            totalGrades = totalGrades + grade;
            times = times + 1;
            average = totalGrades / times;
        } while(input == 0);

        JOptionPane.showMessageDialog(null, "A média das notas é: " + average);
    }
}