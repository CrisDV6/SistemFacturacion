package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import models.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ListaClientes extends JPanel {
    private JTable table;
    private DefaultTableModel modelo;
    private JButton btnAgregar;
    private List<Cliente> clientes;
    private NuevoCliente nuevoClienteFrame;

    public ListaClientes() {
        clientes = new ArrayList<>();
        setLayout(new BorderLayout());

        // Configurar la tabla
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Cédula");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Correo");
        modelo.addColumn("Acciones");

        table = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Botón para agregar un cliente nuevo
        btnAgregar = new JButton("Agregar Cliente");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nuevoClienteFrame = new NuevoCliente();
                nuevoClienteFrame.setListaClientes(ListaClientes.this);
                nuevoClienteFrame.setVisible(true);
            }
        });
        add(btnAgregar, BorderLayout.SOUTH);

        // Cargar la tabla con los clientes
        cargarTabla();
    }

    // Agregar un cliente a la lista
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        cargarTabla();
    }

    // Actualizar un cliente en la lista
    public void actualizarCliente(Cliente cliente) {
        int index = clientes.indexOf(cliente);
        if (index != -1) {
            clientes.set(index, cliente);
        }
        cargarTabla();
    }

    // Cargar los datos de los clientes en la tabla
    private void cargarTabla() {
        modelo.setRowCount(0);
        for (Cliente cliente : clientes) {
            Object[] row = {
                cliente.getNombre(),
                cliente.getApellidos(),
                cliente.getCedula(),
                cliente.getTelefono(),
                cliente.getCorreo(),
                "Editar"
            };
            modelo.addRow(row);
        }
    }

    // Método para obtener el cliente seleccionado para editar
    public Cliente getClienteSeleccionado(int rowIndex) {
        return clientes.get(rowIndex);
    }
}

