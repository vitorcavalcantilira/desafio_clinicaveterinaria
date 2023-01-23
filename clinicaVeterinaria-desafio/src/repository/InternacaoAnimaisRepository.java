package repository;

import modelos.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InternacaoAnimaisRepository {
    private static List<Animal> animaisInternados;


    public InternacaoAnimaisRepository() {
        animaisInternados = new ArrayList<>();
    }

    public static void ListaInternados() {
        for (Animal animais : animaisInternados) {
            System.out.println(animais.getNome() + " - " + animais.getDono());
        }
    }

    public void adicionarAnimalInternado(Animal animal) {
        if (animal.estaDoente()) {
            animal.setDataHoraInternacao(LocalDateTime.now());
            animaisInternados.add(animal);
            System.out.println("Seu animal: " + animal.getClasse() + animal.getNome() + " foi internado com sucesso. Obrigado!");
        } else {
            System.out.println("Apenas animais doentes podem ser internados.");
            System.out.println();
        }
    }

    public void AltaAnimal(Animal animal) {
        animal.setDataHoraAlta(LocalDateTime.now());
        animaisInternados.remove(animal);
//        animaisAtendidos.add(animal);
        System.out.println("Seu animal " + animal.getNome() + " recebeu alta. Um email com mais informações foi enviado ao dono " + animal.getDono().getNome());
        System.out.println();
    }

}
