package atv01;
import java.util.Scanner;
import myClass.*;
public class main {

    public static void main(String[] args) {
        Paciente john = new Paciente(2022123654, "Plano Bronze","400", "John Lennon", 1559456874, "Masculino", "Rua Hideljundes", 988774455) {};
        Paciente maria = new Paciente(2019852456, "Plano Prata","300", "Maria Joaquina", 1459456874, "Feminino", "Av Roberto Freire", 999774523) {};
        Paciente alex = new Paciente(2022852456, "Plano Ouro","500", "Alex Martins", 1259456874, "Masculino", "Av Ponta Negra", 988774541) {};
        
        Medico wagner = new Medico(254196, "Clinico Geral", "Clinica Macedo Paulino", "Disponivel", "Wagner Moura", 12365478, "Masculino", "Av Jose Ribeiro", 65478932) {};
        Medico vin = new Medico(521458, "Clinico Geral", "Clinica do Norte", "Disponivel", "Vin Santos", 85471236, "Masculino", "Av Joao do Pulo", 96587412) {};
        Medico socorro = new Medico(215478, "Ginecologista", "Clinica da Mulher", "Disponivel", "Socorro do Ceu", 52365478, "Feminino", "Rua do Bigode", 52364478) {};
        
        Scanner entrada = new Scanner(System.in);
        
        
            System.out.println("Selecione a agenda da clinica desejada: ");
            System.out.println("Opcao 1 - Clinica Macedo Paulino");
            System.out.println("Opcao 2 - Clinica da Mulher");
            System.out.println("Opcao 3 - Clinica do Norte");
        
            int agenda = entrada.nextInt();
            
            switch (agenda) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("NOME DO PACIENTE: "+john.getNome());
                    System.out.println("CONVENIO: "+john.getConvenio());
                    System.out.println("CPF: "+john.getCPF());
                    System.out.println("GENERO: "+john.getSexo());
                    System.out.println("ENDERECO: "+john.getEndereco());
                    System.out.println("TELEFONE: "+john.getTelefone());
                    System.out.println("TIPO DO PLANO: "+john.getPlano());
                    System.out.println("VALOR DO PLANO: R$ "+john.getValorPlano());
                    System.out.println("NOME MEDICO: "+wagner.getNome());
                    System.out.println("CRM: "+wagner.getCRM());
                    System.out.println("ESPECIALIDADE: "+wagner.getEspecialidade());
                    System.out.println("DISPONIBILIDADE: "+wagner.getAgenda());
                    john.checkPag();
                    john.pagarOk();
                    System.out.println("-------------------------------");
                break;
            case 2:
                    System.out.println("-------------------------------");
                    System.out.println("NOME DO PACIENTE: "+maria.getNome());
                    System.out.println("CONVENIO: "+maria.getConvenio());
                    System.out.println("CPF: "+maria.getCPF());
                    System.out.println("GENERO: "+maria.getSexo());
                    System.out.println("ENDERECO: "+maria.getEndereco());
                    System.out.println("TELEFONE: "+maria.getTelefone());
                    System.out.println("TIPO DO PLANO: "+maria.getPlano());
                    System.out.println("VALOR DO PLANO: R$ "+maria.getValorPlano());
                    System.out.println("NOME MEDICO: "+socorro.getNome());
                    System.out.println("CRM: "+socorro.getCRM());
                    System.out.println("ESPECIALIDADE: "+socorro.getEspecialidade());
                    System.out.println("DISPONIBILIDADE: "+socorro.getAgenda());
                    maria.checkPag();
                    maria.pagarNeg();
                    System.out.println("-------------------------------");
                break; 
            case 3: 
                    System.out.println("-------------------------------");
                    System.out.println("NOME DO PACIENTE: "+alex.getNome());
                    System.out.println("CONVENIO: "+alex.getConvenio());
                    System.out.println("CPF: "+alex.getCPF());
                    System.out.println("GENERO: "+alex.getSexo());
                    System.out.println("ENDERECO: "+alex.getEndereco());
                    System.out.println("TELEFONE: "+alex.getTelefone());
                    System.out.println("TIPO DO PLANO: "+alex.getPlano());
                    System.out.println("VALOR DO PLANO: R$ "+alex.getValorPlano());
                    System.out.println("NOME MEDICO: "+vin.getNome());
                    System.out.println("CRM: "+vin.getCRM());
                    System.out.println("ESPECIALIDADE: "+vin.getEspecialidade());
                    System.out.println("DISPONIBILIDADE: "+vin.getAgenda());
                    alex.checkPag();
                    alex.pagarOk();
                    System.out.println("-------------------------------");
                break;
            default:
                if(agenda !=1 && agenda !=2 && agenda !=3){
                  System.out.println("Digite um numero valido, tente novamente...");
                   break;
            }
        }
    }
}
        
    
    

