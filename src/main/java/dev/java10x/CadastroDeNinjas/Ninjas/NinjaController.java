package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    // Injeçaõ de dependencia
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostra ninja por ID (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId (@PathVariable Long id) {
        return ninjaService.listarNinjaPorId(id);
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
