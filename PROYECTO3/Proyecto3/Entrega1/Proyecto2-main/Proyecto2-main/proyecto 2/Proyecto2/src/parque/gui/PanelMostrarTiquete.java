package parque.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelMostrarTiquete extends JPanel {
    private VentanaPrincipal ventana;
    private JButton btnVolver;
    private JButton btnImprimir;
    private JLabel lblQR; // Placeholder para el código QR

    public PanelMostrarTiquete(VentanaPrincipal ventana) {
        this.ventana = ventana;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // Panel superior con información del tiquete
        JPanel panelInfo = new JPanel(new GridLayout(4, 1, 10, 10));
        panelInfo.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel lblTitulo = new JLabel("Tiquete Generado", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        panelInfo.add(lblTitulo);

        panelInfo.add(new JLabel("Tipo: DIAMANTE")); // Placeholder
        panelInfo.add(new JLabel("ID: 123456")); // Placeholder
        panelInfo.add(new JLabel("Fecha: " + new java.util.Date())); // Placeholder

        add(panelInfo, BorderLayout.NORTH);

        // Panel central con el QR (placeholder)
        JPanel panelQR = new JPanel(new FlowLayout(FlowLayout.CENTER));
        lblQR = new JLabel("Código QR aparecerá aquí");
        lblQR.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lblQR.setPreferredSize(new Dimension(200, 200));
        panelQR.add(lblQR);
        add(panelQR, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        btnVolver = new JButton("Volver");
        btnVolver.addActionListener(e -> ventana.mostrarPanelCompra());

        btnImprimir = new JButton("Imprimir");
        btnImprimir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imprimirTiquete();
            }
        });

        panelBotones.add(btnVolver);
        panelBotones.add(btnImprimir);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void imprimirTiquete() {
        // Aquí se llamará al GestorTiquetes para imprimir
        // Por ahora es solo un placeholder
        int respuesta = JOptionPane.showConfirmDialog(this, 
            "¿Desea imprimir este tiquete?", 
            "Confirmar Impresión", 
            JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, 
                "Tiquete impreso correctamente", 
                "Impresión Exitosa", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}