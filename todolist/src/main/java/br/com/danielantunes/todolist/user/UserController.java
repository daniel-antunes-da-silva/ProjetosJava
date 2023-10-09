package br.com.danielantunes.todolist.user;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Integer (int)
     * Double (double) números: 0.0000
     * Float (float) nº de caracteres 0.000
     * char (A C)
     * Date (data)
     * void (quando não tem um retorno do método, apenas quer q algo seja executado.
     */

    /*
     * Body
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
