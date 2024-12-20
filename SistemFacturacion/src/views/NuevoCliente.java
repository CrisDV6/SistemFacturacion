package views;

import javax.swing.*;

import models.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NuevoCliente extends JFrame {
    private JTextField txtNombre, txtApellidos, txtCedula, txtDireccion, txtTelefono, txtCorreo;
    private JButton btnGuardar, btnCancelar;
    private ListaClientes listaClientes;
    private Cliente clienteEditando;

    public NuevoCliente() {
        setTitle("Nuevo Cliente");
        setLayout(new FlowLayout());
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear los componentes
        txtNombre = new JTextField(20);
        txtApellidos = new JTextField(20);
        txtCedula = new JTextField(20);
        txtDireccion = new JTextField(20);
        txtTelefono = new JTextField(20);
        txtCorreo = new JTextField(20);
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");

        // Agregar los componentes al JFrame
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(new JLabel("Apellidos:"));
        add(txtApellidos);
        add(new JLabel("Cédula:"));
        add(txtCedula);
        add(new JLabel("Dirección:"));
        add(txtDireccion);
        add(new JLabel("Teléfono:"));
        add(txtTelefono);
        add(new JLabel("Correo:"));
        add(txtCorreo);
        add(btnGuardar);
        add(btnCancelar);

        // Acciones de los botones
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (clienteEditando != null) {
                    // Editar cliente existente
                    clienteEditando.setNombre(txtNombre.getText());
                    clienteEditando.setApellidos(txtApellidos.getText());
                    clienteEditando.setCedula(txtCedula.getText());
                    clienteEditando.setDireccion(txtDireccion.getText());
                    clienteEditando.setTelefono(txtTelefono.getText());
                    clienteEditando.setCorreo(txtCorreo.getText());
                    listaClientes.actualizarCliente(clienteEditando);
                } else {
                    // Crear nuevo cliente
                    Cliente nuevoCliente = new Cliente(
                            txtNombre.getText(),
                            txtApellidos.getText(),
                            txtCedula.getText(),
                            txtDireccion.getText(),
                            txtTelefono.getText(),
                            txtCorreo.getText()
                    );
                    listaClientes.agregarCliente(nuevoCliente);
                }
                dispose(); // Cerrar el JFrame
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el JFrame
            }
        });
    }

    // Método para establecer la lista de clientes
    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    // Método para cargar un cliente en el formulario para editarlo
    public void cargarCliente(Cliente cliente) {
        clienteEditando = cliente;
        txtNombre.setText(cliente.getNombre());
        txtApellidos.setText(cliente.getApellidos());
        txtCedula.setText(cliente.getCedula());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(cliente.getTelefono());
        txtCorreo.setText(cliente.getCorreo());
    }
}


