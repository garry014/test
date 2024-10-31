package csd.week6.book;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public BookNotFoundException(Long id) {
        super("Could not find book " + id);
    }
    
}
