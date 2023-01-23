package testes;

import modelos.*;
import modelos.builders.CachorroBuilder;
import modelos.builders.DonoBuilder;
import modelos.builders.EnderecoBuilder;
import modelos.builders.PassaroBuilder;
import modelos.enuns.EnumTamanhoCachorro;
import modelos.enuns.EnumTipoAnimal;
import repository.AnimalRepository;
import repository.InternacaoAnimaisRepository;

import static repository.AnimalRepository.AnimaisAtendidosLista;
import static repository.InternacaoAnimaisRepository.ListaInternados;

public class Teste {
    public static void main(String[] args) {
        InternacaoAnimaisRepository internacao = new InternacaoAnimaisRepository();

        // Primeiro objeto
        Endereco enderecoDono1 = new EnderecoBuilder()
                .bairro("Paiva")
                .cep("54.470-052")
                .cidade("Jaboatao")
                .estado("PE")
                .rua("rua Jundiai")
                .numero("309")
                .build();
        Dono dono1 = new DonoBuilder()
                .cpf("095.321.662-20")
                .nome("Bruno Gabriel")
                .email("bruno.teste@gmail.com")
                .endereco(enderecoDono1)
                .telefone("5581999887766")
                .build();
        Cachorro animal1 = new CachorroBuilder()
                .nome("Cookie")
                .raca("SRD")
                .corPelo("Preto")
                .dono(dono1)
                .idade("7 anos")
                .estaDoente(true)
                .sintomas("Vomitando diariamente")
                .tipo(EnumTipoAnimal.CACHORRO)
                .tamanho(EnumTamanhoCachorro.TRES)
                .build();

        //Segundo objeto
        Endereco enderecoDono2 = new EnderecoBuilder()
                .bairro("Prazeres")
                .cep("54.470-053")
                .cidade("Jaboatao")
                .estado("PE")
                .numero("66")
                .rua("rua Um")
                .build();
        Dono dono2 = new DonoBuilder()
                .cpf("233.444.555-78")
                .nome("Reginaldo Rossi")
                .email("rossi.email@gmail.com")
                .endereco(enderecoDono2)
                .telefone("5581998745622")
                .build();
        Cachorro animal2 = new CachorroBuilder()
                .nome("Bruno")
                .raca("SRD")
                .corPelo("Preto")
                .dono(dono2)
                .idade("5 anos")
                .estaDoente(true)
                .sintomas("Vomitando bastante")
                .tipo(EnumTipoAnimal.CACHORRO)
                .tamanho(EnumTamanhoCachorro.DOIS)
                .build();

        //Terceiro objeto
        Endereco enderecoDono3 = new EnderecoBuilder()
                .bairro("Socorro")
                .cep("55.882-400")
                .cidade("Jaboatao")
                .estado("PE")
                .numero("01")
                .rua("rua dois")
                .build();
        Dono dono3 = new DonoBuilder()
                .cpf("555.478.720-55")
                .nome("Maria das dores")
                .email("maria.dores@gmail.com")
                .endereco(enderecoDono3)
                .telefone("558162355489")
                .build();

        Passaro animal3 = new PassaroBuilder()
                .nome("LECO-LECO")
                .raca("SRD")
                .corPenas("Laranja")
                .dono(dono3)
                .idade("5 meses")
                .estaDoente(true)
                .sintomas("Vermelhidao nos olhos")
                .tipo(EnumTipoAnimal.PASSARO)
                .build();


        // Criando animais
        AnimalRepository.AtendeAnimal(animal1, dono1);
        AnimalRepository.AtendeAnimal(animal2, dono2);
        AnimalRepository.AtendeAnimal(animal3, dono3);
        AnimalRepository.AtendeAnimal(animal4, dono4);
        AnimalRepository.AtendeAnimal(animal5, dono4);

        //Listandos tos os animais que já foram atendidos
        System.out.println("Animais já atendidos");
        AnimaisAtendidosLista();


        // Internando animais
        internacao.adicionarAnimalInternado(animal1);
        internacao.adicionarAnimalInternado(animal2);
        internacao.adicionarAnimalInternado(animal3);
        internacao.adicionarAnimalInternado(animal4);

        //Lista Animais internados
        System.out.println("Animais internados");
        ListaInternados();

        //Alta animais
        internacao.AltaAnimal(animal2);
        internacao.AltaAnimal(animal3);

        //Lista animais internados
        System.out.println("Lista com os animais internados");
        ListaInternados();


        // Busca animal pelo id
        Animal animalEncontrado = AnimalRepository.SearchAnimalId(2);
        System.out.println("O ID informado refere-se ao Animal" + animalEncontrado.getNome());

        // Dono cpf
        AnimalRepository.SearchCpf("105.095.544-74");

        AnimalRepository.ExcluiAnimal(4);

        AnimaisAtendidosLista();


    }
}
