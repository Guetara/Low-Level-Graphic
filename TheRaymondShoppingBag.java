import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TheRaymondShoppingBag extends JFrame implements ActionListener{
    MyCanvas canvas;
    JButton whatsInBag;


    public static void main(String[] args) {
        new TheRaymondShoppingBag();
    } // end main

    public TheRaymondShoppingBag() {
        this.setLayout(new BorderLayout());

        canvas = new MyCanvas();
        this.add(canvas, BorderLayout.CENTER);

        whatsInBag = new JButton("What's in the bag?");
        whatsInBag.addActionListener(this);
        this.add(whatsInBag, BorderLayout.NORTH);



        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // end constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        if (canvas.inBag) {
            whatsInBag.setText("What's in the bag?");
            canvas.setInBag(false);
        }
        else {
            whatsInBag.setText("Leave the bag");
            canvas.setInBag(true);
        }
    }
}// end drawPanel

class MyCanvas extends JPanel {
    public boolean inBag = false;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color myOrange = new Color(255, 91, 0);
        Color mySilver = new Color(192, 192, 192);
        Color myGreen = new Color(133, 187, 101);
        Color myLighterGreen = new Color(169, 234, 126);
        if (inBag) {
            g.setColor(myOrange);
            g.fillRect(0, 0, 1000, 1000);

            //Zippo Lighter
            g.setColor(mySilver);
            g.fillRect(45, 100, 50, 50);
            g.fillRect(20, 50, 25, 50);
            g.setColor(Color.RED);
            g.fillOval(70, 50, 20, 50);
            g.setColor(Color.YELLOW);
            g.fillOval(75, 70, 10, 25);

            //Blue phone
            g.setColor(Color.BLUE);
            g.fillRect(500, 500, 200, 300);
            g.setColor(Color.BLACK);
            g.fillOval(520, 520, 35, 35);
            g.fillOval(520, 560, 35, 35);
            g.setColor(Color.GRAY);
            g.fillOval(560, 540, 20, 20);

            //Ladybug
            g.setColor(Color.BLACK);
            g.fillOval(730, 210, 30, 30);
            g.drawArc(730, 205, 10, 10, 180, 90);
            g.drawArc(730, 235, 10, 10, 90, 90);
            g.setColor(Color.RED);
            g.fillOval(750, 200, 50, 50);
            g.setColor(Color.BLACK);
            g.drawLine(750, 225, 800, 225);
            g.fillOval(760, 210, 10, 10);
            g.fillOval(780, 210, 10, 10);
            g.fillOval(760, 230, 10, 10);
            g.fillOval(780, 230, 10, 10);
            g.drawArc(750, 240, 20, 20, 100, 90);
            g.drawArc(775, 240, 20, 20, 180, 90);
            g.drawArc(790, 225, 20, 20, 220, 90);
            g.drawArc(750, 190, 20, 20, 180, 90);
            g.drawArc(775, 190, 20, 20, 90, 90);
            g.drawArc(790, 205, 20, 20, 50, 90);

            //1 Dollar Bill
            g.setColor(myGreen);
            g.fillRect(40, 600, 200, 100);
            g.setColor(myLighterGreen);
            g.fillOval(105, 615, 70, 70);
            g.setColor(Color.BLACK);
            g.setFont(new Font("Helvetica", Font.PLAIN, 30));
            g.drawString("1", 132, 660);
        }
        else{
            g.setColor(myOrange);
            g.fillRect(100, 250, 800, 700);
            g.fillArc(300, 25, 400, 500, 0, 180);

            g.setColor(Color.WHITE);
            g.fillArc(350, 75, 300, 350, 0, 180);
            g.setFont(new Font("Helvetica", Font.PLAIN, 100));
            g.drawString("the", 300, 500);
            g.drawString("Raymond", 300, 600);
            g.drawString("Shopping", 300, 700);
            g.drawString("bag", 300, 800);
        }
    } // end paintComponent

    public void setInBag (boolean bool) {
        this.inBag = bool;
        repaint();
    }
}