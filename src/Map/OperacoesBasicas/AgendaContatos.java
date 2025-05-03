package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPornome = null;
        if (agendaContatoMap.isEmpty()){
           numeroPornome = agendaContatoMap.get(nome);
        }
        return numeroPornome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila ", 123456);
        agendaContatos.adicionarContato("Evandro ", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante ",11111 );
        agendaContatos.adicionarContato("Camila DIO ", 654987);
        agendaContatos.adicionarContato("MAria Silva ", 1111111);
        agendaContatos.adicionarContato("Camila ", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Evandro");
        agendaContatos.exibirContatos();

        System.out.println("O numero e :" + agendaContatos.pesquisarPorNome("CAmila DIO"));
    }
}

