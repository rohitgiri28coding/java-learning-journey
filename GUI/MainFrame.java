import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    
    public MainFrame() {
        setTitle("Main Frame");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create an instance of the JPanel subclass
        CustomPanel customPanel = new CustomPanel();
        
        // Add the customPanel to the content pane of the JFrame
        getContentPane().add(customPanel);
    }
    
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}