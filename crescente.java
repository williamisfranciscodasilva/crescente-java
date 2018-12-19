import javax.swing.JOptionPane;
class crescente
{
    public static void main(String args[])
    {
        int a,b;
        a = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um valor para A: "));
        b = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um valor para B: "));

        if (a > b)
        {
            JOptionPane.showMessageDialog(null, "Organizando em Ordem Crescente B="+b+" - A="+a);
            System.out.print("Organizando em Ordem Crescente B="+b+" - A"+a);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Organizando em Ordem Crescente A="+a+" - B="+b);
            System.out.print("Organizando em Ordem Crescente A="+a+" - B"+b);
        }
    }
}