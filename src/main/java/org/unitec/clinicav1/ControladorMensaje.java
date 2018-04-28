package org.unitec.clinicav1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorMensaje {

@Autowired MensajeMongo mongo;
    @PostMapping(path="/mensaje",consumes = "application/json")
    Estatus getPorId(@RequestBody Mensaje mensa)throws Exception{

        System.out.println("Lo que llego "+mensa);

       mongo.save(mensa);
        System.out.println("Deespues de la supuesta insercion");

        Estatus estatus=new Estatus("maloooos ", true);

        return estatus;
    }

}
