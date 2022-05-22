package loja.Presentation.Controller;

import java.util.ArrayList;
import java.util.List;
import loja.Dominio.Model.UserModel;

public class UserController {

    public UserController() {
    }

    public UserController(UserModel userDto) {
        this._user = userDto;
    }

    UserModel _user;

    public static void Excluir(UserModel userDto) {

    }

    public static UserModel Pesquisar(UserModel userDto) {
        UserModel user = new UserModel();
        return user;
    }

    public static List<UserModel> RetornaLista() {

        List<UserModel> users = new ArrayList<UserModel>();

        return users;
    }

    public static void Salvar(UserModel userDto) {

    }

    public static boolean UsuarioExite(UserModel userDto) {
        if (userDto == null) {
            return true;
        }
        return false;
    }
}
