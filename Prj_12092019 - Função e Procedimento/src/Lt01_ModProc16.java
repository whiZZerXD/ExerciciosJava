/*
Nome do programa: Lt01_ModProc16
Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= SalárioBruto – desconto). 
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
Nome do programador: Lucas Augusto
Data da criação: 12/09/2019
*/

import javax.swing.JOptionPane;
public class Lt01_ModProc16 {
    static double HT, VH, PD, ND, SB, SL;
        public static void main (String[] args){
            HT = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de horas trabalhadas:"));
            VH = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
            PD = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do percentual de desconto:"));
            ND = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dependentes:"));
            CalcSalario();
            JOptionPane.showMessageDialog(null,"Salário a receber: R$"+SL);
        }

    static void CalcSalario(){
        SB = HT * VH;
        SL = SB - (SB*(PD/100));
        SL = SL + (ND *100);
    }
}