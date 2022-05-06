package Presentation.Controller;

import Presentation.Dto.UserDto;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    public UserController() {
    }

    public UserController(UserDto userDto) {
        this._userDto = userDto;
    }

    UserDto _userDto;

    public static void Excluir(UserDto userDto) {

    }

    public static UserDto Pesquisar(UserDto userDto) {
        UserDto user = new UserDto();
        return user;
    }

    public static List<UserDto> RetornaLista() {

        List<UserDto> users = new ArrayList<UserDto>();

        return users;
    }

    public static void Salvar(UserDto userDto) {

    }

    public static boolean UsuarioExite(UserDto userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }
}
