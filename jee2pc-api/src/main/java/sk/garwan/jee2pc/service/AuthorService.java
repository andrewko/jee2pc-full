package sk.garwan.jee2pc.service;

import java.util.List;

import javax.ejb.Remote;

import sk.garwan.jee2pc.domain.Author;

@Remote
public interface AuthorService {

	Author createAuthor(String name);

	List<Author> loadAllAuthors();

}
