package repository;

import modelos.Animal;
import modelos.Dono;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private static final List<Animal> animaisAtentidos = new ArrayList<>();
    private static final List<Dono> donos = new ArrayList<>();

    public static void SearchCpf(String cpf) {
        for (Dono d : donos) {
            if (d.getCpf().equals(cpf)) {
                System.out.println("CPF encontrado -> Dono: " + d.getNome());
                System.out.println();
                return;
            }
        }
        System.out.println("CPF não encontrado");
    }

    public static void AtendeAnimal(Animal animal, Dono dono) {
        animal.setDono(dono);
        animaisAtentidos.add(animal);
    }

    public static void AtualizaAnimal(Animal animal) {
        for (Animal a : animaisAtentidos) {
            if (a.getIdentificador() == animal.getIdentificador()) {
                a = animal;
                System.out.println("Animal " + animal + " atualizado");
                break;
            }
        }
    }

    public static void ExcluiAnimal(int identificador) {
        for (Animal a : animaisAtentidos) {
            if (a.getIdentificador() == identificador) {
                animaisAtentidos.remove(a);
                break;
            }
        }
    }

    public static Animal SearchAnimalId(int identificador) {
        for (Animal a : animaisAtentidos) {
            if (a.getIdentificador() == identificador) {
                return a;
            }
        }
        return null;
    }

    public static void AnimaisAtendidosLista() {
        System.out.println();
        for (Animal animais : animaisAtentidos) {
            System.out.println(animais.toString());
        }
    }

    public void AnimalRepository() {
    }

    public Dono SearchId(int identificador) {
        for (Dono d : donos) {
            if (d.getIdentificador() == identificador) {
                return d;
            }
        }
        return null;
    }

}
