package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adcionar ninja (Create)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // Mostra todos os ninjas (Read)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "Mostrar todos os ninjas";
    }

    // Mostra ninja por ID (Read)
    @GetMapping("/todosID")
    public String mostrarNinjasPorId() {
        return "Mostrar ninjas por ID";
    }

    // Alterar dodos dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar ninja por ID";
    }

    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Deletar ninja por ID";
    }
}
