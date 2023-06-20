package My.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import My.books.name.Books;

public interface Repository extends JpaRepository<Books, Integer>{

}
