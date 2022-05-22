package loja.Presentation.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Model.ClienteModel;
import loja.Dominio.Service.ClienteService;

public class ClienteController {

    public ClienteController() {

    }

    public ClienteController(ClienteModel _cliente) {
        this.cliente = _cliente;
    }

    private ClienteModel cliente;

    public static void Excluir(ClienteModel userDto) {

    }

    public static ClienteModel Pesquisar(ClienteModel userDto) {
        ClienteModel client = new ClienteModel();
        return client;
    }

    public static List<ClienteModel> RetornaLista() {

        List<ClienteModel> clients = new ArrayList<ClienteModel>();

        return clients;
    }

    public static void Salvar(ClienteModel cliModel) {
        try {
            ClienteService cli = new ClienteService();
            cli.save(cliModel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean UsuarioExite(ClienteModel userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }
}
