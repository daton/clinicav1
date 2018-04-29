package org.unitec.clinicav1;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepoMongo extends MongoRepository<Mensaje, String> {
}
