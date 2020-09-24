import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Football extends JFrame
{
    int r1=0, r2=0;
    JButton real=new JButton("Real Madrid");
    JButton milan=new JButton("Milan");
    JLabel schet=new JLabel("Result: 0 X 0");
    JLabel lastSc=new JLabel("Last Scorer: N/A");
    JLabel winner=new JLabel("Winner: ");
    Font fnt=new Font("Times new roman", Font.BOLD,15);
    Font fnt2=new Font("Times new roman",Font.BOLD,20);
    public Football(){
        setLayout(null);
        schet.setFont(fnt2);
        real.setFont(fnt);
        milan.setFont(fnt);
        winner.setFont(fnt);
        lastSc.setFont(fnt);
        schet.setBounds(350,0,200,20);
        winner.setBounds(350,50,200,20);
        lastSc.setBounds(350,100,200,20);
        real.setBounds(100,400,200,20);
        milan.setBounds(500,400,200,20);
        add(schet);
        add(real);
        add(milan);
        add(winner);
        add(lastSc);
        setSize(800,500);
        real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                r1++;
                if(r1==5) {
                    winner.setText("Winner: Real Madrid");
                    real.setEnabled(false);
                    milan.setEnabled(false);
                }
                schet.setText("Result: " + r1 + " X " + r2);
                lastSc.setText("Last Scorer: Real Madrid");
            }
        });
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                r2++;
                if(r2==5) {
                    winner.setText("Winner: Milan");
                    real.setEnabled(false);
                    milan.setEnabled(false);
                }
                schet.setText("Result: " + r1 + " X " + r2);
                lastSc.setText("Last Scorer: Milan");
            }
        });
    }

    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}