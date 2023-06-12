import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class mainForm extends JFrame {

    private Menu b = new Menu();

    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textIngresoNombre;
    private JButton ingresarPlatoButton;
    private JTextArea textAIngresoPlatos;
    private JButton QuemarDatosButton;
    private JTextField textIngresoPrecio;
    private JTextField textIngresoCalorias;
    private JTextField textIngresoPreparacion;
    private JButton buscarModifButton;
    private JButton modificarModifButton;
    private JTextField textoModifNombre;
    private JTextField textoModifPrecio;
    private JTextField textoModifCalorias;
    private JTextField textoModifPreparacion;
    private JTextArea textAModif;
    private JButton ButtonBuscarEliminar;
    private JTextField textNombreEliminar;
    private JTextArea textAEliminar;
    private JButton eliminarButton;
    private JComboBox comboBoxOrder;
    private JButton mostrarButton;
    private JTextArea textAMostrar;
    private JButton buscarButton;
    private JTextField textBuscarPlatoOrden;

    public mainForm() {

        ingresarPlatoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        modificarModifButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonBuscarEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ingresarPlatoButton.addActionListener(new ActionListener() {

            //El boton para el ingreso de platos solo efectuará solo si los 4 text field estan llenos
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textIngresoNombre.getText () .isEmpty () || textAIngresoPlatos.getText () .isEmpty () || textIngresoCalorias.getText () .isEmpty ()|| textIngresoPreparacion.getText () .isEmpty ()){


                JOptionPane.showMessageDialog (null, "No dejar campos vacios");
                }
            }

        });
        textoModifNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textoModifNombre.getText () .isEmpty () ){


                    JOptionPane.showMessageDialog (null, "Tienes que ingresar el nombre del plato que vas a modificar");
                }
            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPlatoNombRe();
            }
        });
        textAIngresoPlatos.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        QuemarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarPlatos();

            }
        });
    };

    //Get mainPanel
    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void eliminarPlatoNombRe() {
        Plato l = b.eliminarPlatoPorNombre(textNombreEliminar.getText());
        if (l != null) {
            textAEliminar.setText(l.toString());
        } else {
            textAEliminar.setText("No se ha encontrado ningun plato con ese nombre.");
        }
    }

    public void generarPlatos() {
        String text = "Los platos que se han generado son: \n";
        for (Plato plato : b.generarPlatos()) {
            text += plato.toString() + "\n";
        }
        textAIngresoPlatos.setText(text);
    }
}
