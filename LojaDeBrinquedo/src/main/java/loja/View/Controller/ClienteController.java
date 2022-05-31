package loja.View.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.ClienteModel;
import loja.Dominio.DAO.ClienteService;

public class ClienteController {

    public ClienteController() {

    }

    public ClienteController(ClienteModel _cliente) {
        this.cliente = _cliente;
    }

    private ClienteModel cliente;

    public static void delete(ClienteModel userDto) {

    }

    public static ClienteModel findId(int id) {

        ClienteModel cliente = new ClienteModel();

        try {

            ClienteService cli = new ClienteService();
            cliente = cli.findId(id);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }

    public static List<ClienteModel> findAll(ClienteModel entity) {

        List<ClienteModel> clientes = new ArrayList<ClienteModel>();

        try {

            ClienteService cli = new ClienteService();
            clientes = cli.findAll(entity);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    public static boolean save(ClienteModel cliModel) {
        try {
            ClienteService cli = new ClienteService();
            return cli.save(cliModel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean UsuarioExite(ClienteModel userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }

    public static boolean update(ClienteModel user) {
        try {
            ClienteService cli = new ClienteService();
            cli.update(user);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static boolean finishValidity(ClienteModel cli) {
        try {
            ClienteService cliserive = new ClienteService();
            cliserive.finishValidity(cli);
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}