package My.books.mycontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import My.books.name.Books;
import My.books.repository.Repository;

@RestController
@RequestMapping("/api")

public class Controller {

	@Autowired
	private  Repository bookRepository;
	
	@PostMapping("/books")
	public void addbook(@RequestBody Books book) {
	 bookRepository.save(book);
	
}
}
