package com.osiki.moviesapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // to find movie by id using imdbId instead of objectId so as not expose our user id to the public

    Optional<Movie> findMovieByImdbId(String imdbId);
}
