package br.com.contatinhog;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContatoController {
    @GetMapping
    public String mostrarHome() {
        return "index";
    }
    //Dentro do @PostMapping, vc n precisa colocar o que eu coloquei.
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String mostrarResposta(Contato contato, Model model) {
        model.addAttribute("nome", contato.getNome());
        model.addAttribute("email", contato.getEmail());
        return "resposta";
    }
}
