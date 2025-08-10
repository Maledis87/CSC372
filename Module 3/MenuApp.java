import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MenuApp extends JFrame {
    private JTextArea textArea;
    private JMenuItem randomColorItem; // store for updating label

    public MenuApp() {
        // Frame setup
        setTitle("Menu Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text area (make it transparent)
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setOpaque(false);            // <-- allow frame background to show
        textArea.setForeground(Color.BLACK);
        textArea.setCaretColor(Color.BLACK);

        // Put textArea in a scroll pane and make the scroll pane and viewport transparent too
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setOpaque(false);                     // <-- very important
        scrollPane.getViewport().setOpaque(false);       // <-- also very important
        add(scrollPane, BorderLayout.CENTER);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");

        // Menu items
        JMenuItem dateTimeItem = new JMenuItem("Show Date & Time");
        JMenuItem saveLogItem = new JMenuItem("Save to log.txt");
        randomColorItem = new JMenuItem("Change Background (Orange Hue)");
        JMenuItem exitItem = new JMenuItem("Exit");

        // Action 1: Show date & time
        dateTimeItem.addActionListener(e -> {
            String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            textArea.setText(dateTime);
        });

        // Action 2: Save to log.txt
        saveLogItem.addActionListener(e -> {
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                writer.write(textArea.getText() + System.lineSeparator());
                JOptionPane.showMessageDialog(this, "Saved to log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
            }
        });

        // Action 3: Random orange hue
        randomColorItem.addActionListener(e -> {
            Color randomOrange = getRandomOrange();
            getContentPane().setBackground(randomOrange);
            String hexCode = String.format("#%02x%02x%02x",
                    randomOrange.getRed(), randomOrange.getGreen(), randomOrange.getBlue());
            randomColorItem.setText("Change Background (Orange Hue: " + hexCode + ")");

            // force repaint so change is visible immediately
            getContentPane().repaint();
        });

        // Action 4: Exit program
        exitItem.addActionListener(e -> System.exit(0));

        // Add items to menu
        menu.add(dateTimeItem);
        menu.add(saveLogItem);
        menu.add(randomColorItem);
        menu.add(exitItem);

        // Add menu to bar
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // initial content pane background
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    private Color getRandomOrange() {
        Random rand = new Random();
        // Use HSB to keep it in orange range
        float hue = (30f + rand.nextInt(20)) / 360f; // 30-49 degrees = orange-ish
        float saturation = 0.8f + rand.nextFloat() * 0.2f; // 0.8 - 1.0
        float brightness = 0.8f + rand.nextFloat() * 0.2f; // 0.8 - 1.0
        return Color.getHSBColor(hue, saturation, brightness);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuApp::new);
    }
}
