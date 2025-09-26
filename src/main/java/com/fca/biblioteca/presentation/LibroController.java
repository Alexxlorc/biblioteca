package com.fca.biblioteca.presentation;

import com.fca.biblioteca.data.Libro;
import com.fca.biblioteca.domain.LibroDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroDomain libroDomain;

    @RequestMapping(value = "/disponibles", method = RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarLibrosDisponibles(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibroPorTitulo(titulo, edicion);
    }

    @RequestMapping(value = "/todos", method = RequestMethod.RequestMethod.GET)
    @ResponseBody
    public List<Libro> buscarTodosLosLibros(@RequestParam String titulo, @RequestParam String edicion) {
        return libroDomain.buscarLibroTodos(titulo, edicion);
    }

}