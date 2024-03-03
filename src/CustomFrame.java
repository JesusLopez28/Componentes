import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomFrame extends JFrame implements ActionListener {
    public CustomFrame() {
        super("Ejemplo Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 700);
        setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel("Etiqueta:");
        add(label);

        // JTextField
        JTextField textField = new JTextField(10);
        add(textField);

        // JTextArea
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // JButton
        JButton button = new JButton("Botón");
        button.addActionListener(this);
        add(button);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("CheckBox");
        add(checkBox);

        // JRadioButton
        JRadioButton radioButton = new JRadioButton("RadioButton");
        add(radioButton);

        // JList
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        add(list);

        // JComboBox
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        add(comboBox);

        // JScrollBar
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        add(scrollBar);

        // JTable
        String[][] data = {{"1", "A"}, {"2", "B"}, {"3", "C"}};
        String[] columns = {"Número", "Letra"};
        JTable table = new JTable(data, columns);
        JScrollPane tableScrollPane = new JScrollPane(table);
        add(tableScrollPane);

        // JMenuBar, JMenu, JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menú");
        JMenuItem menuItem = new JMenuItem("Item 1");
        menu.add(menuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        // Ventanas de diálogo
        JButton dialogButton = new JButton("Mostrar Diálogo");
        dialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(CustomFrame.this, "Este es un mensaje de diálogo");
            }
        });
        add(dialogButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "Has hecho clic en el botón");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CustomFrame();
            }
        });
    }
}
