
import java.awt.*;
        import javax.swing.*;
        import javax.swing.event.ChangeEvent;
        import javax.swing.event.ChangeListener;
public class Slider {
    public static class MyFrame extends JFrame implements ChangeListener{
        JSlider s1 = new JSlider(0,1000,0);
        JSlider s2 = new JSlider(0,1000,0);
        JTextField box1 = new JTextField(4);
        JTextField box2 = new JTextField(4);

        MyFrame(){// create a default constructor
            this.setTitle("Change Listener");
            this.setSize(500,150);
            this.setResizable(false);
            this.setLayout(new FlowLayout());
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            s1.setPreferredSize(new Dimension(400,50));
            s1.setPaintTicks(true);
            s1.setPaintLabels(true);
            s1.setMajorTickSpacing(100);
            s1.setMinorTickSpacing(50);
            s1.addChangeListener(this);

            s2.setPreferredSize(new Dimension(400,50));
            s2.setPaintLabels(true);
            s2.setPaintTicks(true);
            s2.setMajorTickSpacing(100);
            s2.setMinorTickSpacing(50);
            s2.addChangeListener(this);

            s1.setVisible(true);// set sliders to visible
            s2.setVisible(true);

            //adding components to the frame.
            this.add(box1);
            this.add(s1);
            this.add(box2);
            this.add(s2);

        }//end MyFrame method

        //create the method to change the output of each boxes
        public void stateChanged(ChangeEvent arg0){
            int num1 = s1.getValue();
            int num2 = s2.getValue();

            box1.setText(Integer.toString(num1));
            box2.setText(Integer.toString(num2));
        }//end stateChanged method
    }
    public static void main(String[] args) {//main method
        MyFrame frame = new MyFrame();// Creating an object
        frame.setVisible(true);

    }//end main method

}//end main class