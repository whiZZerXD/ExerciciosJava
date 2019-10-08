/*
Nome do programa: Lt01_VetMat07
Objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor 
          obs: (utilizar pesquisa binária).
Nome do programador: Lucas Augusto
Data da criação: 01/10/2019
*/

import javax.swing.JOptionPane;
public class Lt01_VetMat07{
    public static void main (String[] args){
        int opc = 0;
        int vetor[] = new int[20];
                
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Ordenar Vetor \n 3 - Pesquisar um valor no Vetor \n 9 - Fim"));
            switch (opc){
                case 1:
                    vetor = CarregaVetor(vetor);
                break;
                case 2:
                    vetor = OrdenaVetor(vetor);
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, PesquisaBinariaVetor(vetor));
                break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    
        public static int[] CarregaVetor(int vt[]){
            int valor;
            for (valor = 0; valor < 20; valor++){
                vt[valor] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
            return vt;
        }
        
        public static int[] OrdenaVetor(int vt[])
        {
            int i, Aux = 0, j = 0;
            String Mostra = "Vetor Ordenado: ";
            for (i = 0; i < 20; i++){
                for (j = i+1; j < 20; j++){
                    if ((vt[i] > vt[j])){
                        Aux = vt[i];
                        vt[i] = vt[j];
                        vt[j] = Aux; 
                    }
                }   
            }
            for (i = 0; i < 20; i++){
                Mostra += ("\nVetor[" + i + "] = " +vt[i]);
            }
            JOptionPane.showMessageDialog(null, Mostra);
            return vt;
        }
        
        public static String PesquisaBinariaVetor(int vt[]){
            int Valor, i = 20, Min = 0, Max = 19;
            String Pesquisa = "";
            Valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser procurado"));
            while (Min <= i){
                i = (Min + Max) / 2;
                if (vt[i] == Valor){
                    Pesquisa = ("Vetor[" + i + "] = "+ (vt[i]));
                    Min = 20+1;
                }
                if (vt[i] < Valor){
                    Min = i;
                }
                else{
                    Max = i;
                }
            }
            return Pesquisa; 
        }
}