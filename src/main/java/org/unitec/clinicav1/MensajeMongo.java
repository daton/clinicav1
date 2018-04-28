package org.unitec.clinicav1;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajeMongo extends MongoRepository<Mensaje, String> {
}
