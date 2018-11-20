package Service;

import Model.Cartao;
import Model.Lista;
import Model.Quadro;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Quadro> quadros = new ArrayList<>();

    public ArrayList<Quadro> getQuadros() {
        return quadros;
    }

    public void criaQuadro(String nome){
        this.quadros.add(new Quadro(nome));
    }


    public void adicionaLista(String titulo, String indexQuadro) {
        int index = Integer.parseInt(indexQuadro);
        this.getQuadros().get(index - 1).getLista().add(new Lista(titulo));
    }

    public void adicionaCartao(String tituloC, String indexQuadro, String indexLista) {
        int indexQ = Integer.parseInt(indexQuadro);
        int indexL = Integer.parseInt(indexLista);
        this.getQuadros().get(indexQ - 1).getLista().get(indexL).getCartoes().add(new Cartao(tituloC));
    }
}
