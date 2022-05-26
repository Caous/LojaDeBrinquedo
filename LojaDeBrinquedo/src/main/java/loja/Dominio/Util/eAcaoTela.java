/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package loja.Dominio.Util;

/**
 *
 * @author Gustavo Nascimento
 */
public enum eAcaoTela {
    
    SALVAR(1), ABRIR(2), VISUALIZAR(3), FECHAR(4), EDITAR(5), EXCLUIR(6);
    
    private final int valor;

    eAcaoTela(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }
}
