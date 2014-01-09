package sk.garwan.jee2pc.service;

import java.util.List;

import javax.ejb.Remote;

import sk.garwan.jee2pc.domain.Book;

@Remote
public interface BookService {

	Book createBook(String name);

	List<Book> loadAllBooks();
}
