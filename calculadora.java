/**
 * calculadora
 */
import javax.swing.JOptionPane;// biblioteca para caixa de dialogo
public class Calculadora {

    /**
     * @andresa.lidia
     */
    public static void main(String[] args) {
        /**caixa de dialogo da biblioteca JOptionPane para a entrada de dados. 
        *o metodo aceita variaveis do tipo String.
        *os dados recolhidos entrarão em um switch
        */
        String escolha = JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO..."+
        "\n 1 - SOMA,"+
        "\n 2 - SUBTRAÇÃO,"+
        "\n 3 - MULTIPLICAÇÃO,"+
        "\n 4 - DIVISÃO"); 

        // convertendo a variavel escolha de string para int
        int opcao = Integer.parseInt(escolha);

        //caso para cada escolha do usuário
        switch (opcao){
            case 1:
                String firstsoma  = JOptionPane.showInputDialog("Insira o primeiro número"); //caixa de dialogo para entrada de dados.
                String secondsoma  = JOptionPane.showInputDialog("Insira o segundo número");
            
                int soma1 = Integer.parseInt(firstsoma);
                int soma2 = Integer.parseInt(secondsoma);
            
                int soma = soma1 + soma2;
        
                JOptionPane.showMessageDialog(null,"A soma é: "+soma, "SOMA dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
                break;
                /**Moostra uma mensagem para o usuário, 
                *o primeiro argumento diz onde a caixa será posicionada na hora que for exibida, null significa que será no meio;
                *o segundo argumento é a mensagem exibida;
                *O terceiro é o título da caixa de mensagem;
                *e o último é o tipo de caixa de mensagem que será exibida.
                 */
            case 2:
                String firstsub  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                String secondsub  = JOptionPane.showInputDialog("Insira o segundo número");
           
                int sub1 = Integer.parseInt(firstsub);
                int sub2 = Integer.parseInt(secondsub);
           
                int sub = sub1 - sub2;
       
                JOptionPane.showMessageDialog(null,"A subtração é: "+sub, "dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                String firstmult  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                String secondmult  = JOptionPane.showInputDialog("Insira o segundo número");

                int mult1 = Integer.parseInt(firstmult);
                int mult2 = Integer.parseInt(secondmult);

                int mult = mult1 * mult2;

                JOptionPane.showMessageDialog(null,"A multiplicação é: "+mult, "dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                String firstdiv  = JOptionPane.showInputDialog("Insira o primeiro número"); 
                String seconddiv  = JOptionPane.showInputDialog("Insira o segundo número");

                double div1 = Integer.parseInt(firstdiv);
                double div2 = Integer.parseInt(seconddiv);

                double div = div1 / div2;
                JOptionPane.showMessageDialog(null,"divisao é: "+div, "dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
                break;
        
            default:
            JOptionPane.showMessageDialog(null,"Opção não encontrada!","Aviso!!!" ,JOptionPane.WARNING_MESSAGE);
                break;
        }
        
    }
}
