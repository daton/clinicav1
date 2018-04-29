package org.unitec.clinicav1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api-react")
public class ReactControMensa {

@Autowired RepoReactMensa reactivoMensaje;
    /*
    GET TODOS
     */
    @GetMapping("/mensaje")
    Flux<Mensaje> getTodos() {


        Flux<Mensaje> flux = reactivoMensaje.findAll();
        System.out.println("SE activo el metodo get todos");

        return flux.map(it -> it);
    }


    /*
    Buscar por Id
     */

    @GetMapping("/mensaje/{id}")
    Mono<Mensaje> getPorId(@PathVariable String id) {


        Mono<Mensaje> monito = reactivoMensaje.findById(id);
        System.out.println("SE activo el metodo get todos");

        return monito.map(it -> it);
    }



    /*

    Post para insertar
     */

    @PostMapping(path="/mensaje",consumes = "application/json")
    Mono<Estatus>  getPorId(@RequestBody Mensaje mensa)throws Exception{

        System.out.println("Lo que llego "+mensa);

        reactivoMensaje.save(mensa);
        System.out.println("Deespues de la supuesta insercion");
        Estatus estatus=new Estatus("maloooos ", true);
        Mono<Estatus> monito=Mono.just(new Estatus("bien todo", true));
        return monito.map(este->este);
    }

    /*
    ACTUALIZAR
     */
    @PutMapping(path = "/mensaje" , consumes = "application/json")
    Mono<Estatus> actualizar(@RequestBody Mensaje mensa)throws Exception{

        System.out.println("LLego bien "+mensa);
        Mensaje men=mensa;
        reactivoMensaje.save(mensa);
        Mono<Estatus> monito=Mono.just(new Estatus("Mensaje Actualizado", true));

        return monito.map(topo->topo);
    }

}
