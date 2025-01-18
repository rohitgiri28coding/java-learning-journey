import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class CustomPanel extends JPanel {
    private static final int PANEL_WIDTH = 200;
    private static final int PANEL_HEIGHT = 150;
    
    public CustomPanel() {
        setBackground(Color.WHITE);
        setSize(PANEL_WIDTH, PANEL_HEIGHT);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw a rectangle on the panel
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 50);
    }
}