package org.unitec.clinicav1;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RepoReactMensa extends ReactiveMongoRepository<Mensaje, String> {
}
