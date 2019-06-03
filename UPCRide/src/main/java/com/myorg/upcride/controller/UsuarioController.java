package com.myorg.upcride.controller;



import com.myorg.upcride.model.Usuario;
import com.myorg.upcride.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @RequestMapping
    public List<Usuario> listarUsuarios() throws Exception
    {
        return usuarioService.list();
    }
/*   @RequestMapping(method = RequestMethod.POST)
    Product createProduct(@RequestBody Product product){
        System.out.println(product.getNombre());
        product.setId(119);
        return product;
    }*/

    @RequestMapping(method = RequestMethod.POST)
    public List<Usuario> registrarCuenta(@RequestBody Usuario usuario) throws Exception {
        System.out.println(usuario.getNombres());
        usuario.setCodigoUsuario("U201711033");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = usuarioService.list();
        usuarios.add(usuario);
        return usuarios;
    }
}
