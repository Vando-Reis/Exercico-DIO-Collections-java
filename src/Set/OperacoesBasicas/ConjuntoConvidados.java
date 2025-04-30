package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributos
    private Set<Convidado> convidadoSet;

    // construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do set convidados ");

         conjuntoConvidados.adicionarConvidado("Convidado 1" , 1234);
         conjuntoConvidados.adicionarConvidado("Convidado 1" , 1235);
         conjuntoConvidados.adicionarConvidado("Convidado 1" , 1235);
         conjuntoConvidados.adicionarConvidado("Convidado 1" , 1236);

        System.out.println("Existem " +  conjuntoConvidados.contarConvidados() + "Dentro do set de convidados ");

         conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("Existem " +  conjuntoConvidados.contarConvidados() + " convidado(s) dentro do set de convidados ");


        // conjntoConvidado.exibirConvidado();

    }
}