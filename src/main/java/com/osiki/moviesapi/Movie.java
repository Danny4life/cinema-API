package com.osiki.moviesapi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "movies")
public class Movie {

    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genre;
    private List<String> backdrops;

}