import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MagicFrame extends JFrame{
    public MagicFrame(String title){
        super(title);

        setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        JButton button = new JButton("Clicketh me");

        Container cPane = getContentPane();

        cPane.add(textArea, BorderLayout.CENTER);
        cPane.add(button, BorderLayout.SOUTH);

        button.addActionListener(e -> {
            textArea.append("Hello\n");
        });

    }
}
