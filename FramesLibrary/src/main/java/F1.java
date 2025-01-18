import javax.swing.SwingUtilities;

public class F1 {

    javax.swing.JFrame f;
    public F1(){
        f = new javax.swing.JFrame("Library");
        f.setSize(785, 740);
        f.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        new P1(f);
    }
    public static void main(String[] args) {
      /*   The main method is added to demonstrate the 
      usage of the F1 class by creating an instance 
      and making it visible using SwingUtilities.invokeLater() 
      to ensure proper Swing thread safety.      
      */
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            new F1();
                }
            });

    }
} 