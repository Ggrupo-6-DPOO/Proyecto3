package parque.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JPanel panelPrincipal;
    private CardLayout cardLayout;
    private PanelCompraTiquete panelCompra;
    private PanelMostrarTiquete panelMostrar;

    public VentanaPrincipal() {
        setTitle("Sistema de Tiquetes - Parque de Atracciones");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurar el layout de tarjetas
        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        // Crear los paneles
        panelCompra = new PanelCompraTiquete(this);
        panelMostrar = new PanelMostrarTiquete(this);

        // Agregar paneles al cardLayout
        panelPrincipal.add(panelCompra, "compra");
        panelPrincipal.add(panelMostrar, "mostrar");

        add(panelPrincipal);

        // Mostrar el panel de compra inicialmente
        mostrarPanelCompra();
    }

    public void mostrarPanelCompra() {
        cardLayout.show(panelPrincipal, "compra");
    }

    public void mostrarPanelMostrar() {
        cardLayout.show(panelPrincipal, "mostrar");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal();
            ventana.setVisible(true);
        });
    }
}