package br.unitins.biblioteca.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    LivroService livroService;

    @GetMapping
    List<Livro> pegarLivros() {
        return livroService.getLivros();
    }

    @PostMapping
    public Livro salvarlivro(@RequestBody Livro livro) {
        return livroService.criarLivro(livro);
    }
}