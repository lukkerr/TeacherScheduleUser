package com.pdist.user.Controller;

import com.pdist.user.Model.Usuario;
import com.pdist.user.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/message")
    public List<Usuario> read(){
        return this.usuarioService.read();
    }

    @GetMapping("/message/{id}")
    public Usuario readById(@PathVariable("id") Long id){
        return this.usuarioService.readById(id);
    }

    @PostMapping("/message")
    public Usuario create(@RequestBody Usuario usuario){
        return this.usuarioService.push(usuario);
    }

    @PutMapping("/message/{id}")
    public Usuario update(@RequestBody Usuario usuario){
        return this.usuarioService.push(usuario);
    }

    @DeleteMapping("/message/{id}")
    public void delete(@PathVariable("id") Long id){
        this.usuarioService.delete(id);
    }
}
