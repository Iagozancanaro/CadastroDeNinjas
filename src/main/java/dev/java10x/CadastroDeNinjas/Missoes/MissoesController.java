package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    // GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar")
    private String listarMissoes(){
        return "Missoes listadas com sucesso";
    }

    // POST -- Mandar uma requisisão para criar uma missão
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada com sucesso";
    }

    // PUT -- Mandar uma requisição para alterar uma missão
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missao alterada com sucesso";
    }

    // DELETE -- Mandar uma requisição para deletar uma missão
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }



}
