package controllers;

import javax.swing.*;

import views.ListaClientes;

public class Main {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Gestión de Clientes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la lista de clientes
        ListaClientes listaClientesPanel = new ListaClientes();

        // Establecer el panel de la lista de clientes
        frame.setContentPane(listaClientesPanel);

        // Ajustar el tamaño y mostrar la ventana
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}


