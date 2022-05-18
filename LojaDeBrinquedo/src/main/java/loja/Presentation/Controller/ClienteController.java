package loja.Presentation.Controller;

import loja.Presentation.Dto.ClienteDto;
import java.util.ArrayList;
import java.util.List;

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

    }

    public static boolean UsuarioExite(ClienteDto userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }
}
