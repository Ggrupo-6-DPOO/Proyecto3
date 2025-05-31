package parque.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parque.ventas.TipoTiquete;

public class PanelCompraTiquete extends JPanel {
    private VentanaPrincipal ventana;
    private JComboBox<TipoTiquete> comboBoxTipo;
    private JButton btnGenerar;

    public PanelCompraTiquete(VentanaPrincipal ventana) {
        this.ventana = ventana;
        initComponents();
    }

    private void initComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Título
        JLabel lblTitulo = new JLabel("Seleccione el tipo de tiquete");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(lblTitulo, gbc);

        // Combo box para tipos de tiquete
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        add(new JLabel("Tipo de tiquete:"), gbc);

        gbc.gridx = 1;
        comboBoxTipo = new JComboBox<>(TipoTiquete.values());
        add(comboBoxTipo, gbc);

        // Botón generar
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.CENTER;
        btnGenerar = new JButton("Generar Tiquete");
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarTiquete();
            }
        });
        add(btnGenerar, gbc);
    }

    private void generarTiquete() {
        TipoTiquete tipoSeleccionado = (TipoTiquete) comboBoxTipo.getSelectedItem();
        
        // Aquí se llamará al GestorTiquetes para generar el tiquete
        // Por ahora es solo un placeholder
        JOptionPane.showMessageDialog(this, 
            "Generando tiquete tipo: " + tipoSeleccionado, 
            "Tiquete Generado", 
            JOptionPane.INFORMATION_MESSAGE);
        
        ventana.mostrarPanelMostrar();
    }
}