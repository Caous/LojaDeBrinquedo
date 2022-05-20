package loja.Presentation.Controller;

import java.sql.SQLException;
import loja.Presentation.Dto.ClienteDto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import loja.Dominio.Service.ClienteService;

public class ClienteController {

    public ClienteController() {

    }

    public ClienteController(ClienteDto _cliente) {
        this.cliente = _cliente;
    }

    private ClienteDto cliente;

    public static void Excluir(ClienteDto userDto) {

    }

    public static ClienteDto Pesquisar(ClienteDto userDto) {
        ClienteDto client = new ClienteDto();
        return client;
    }

    public static List<ClienteDto> RetornaLista() {

        List<ClienteDto> clients = new ArrayList<ClienteDto>();

        return clients;
    }

    public static void Salvar(ClienteDto userDto) {
        try {
            ClienteService cli = new ClienteService();
            //cli.save(userDto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    public static boolean UsuarioExite(ClienteDto userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }
}
