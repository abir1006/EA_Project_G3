package app.webflix;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
public class FlixController {
    @GetMapping
    public ResponseEntity<String> getMovies() {
        return new ResponseEntity<>("All movies Listed", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addFavorites() {
        return new ResponseEntity<>("Movie added to favorites", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeFavorites(@PathVariable int id) {
        return new ResponseEntity<>("Movie with id#"+id+" is removed", HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMovies(@PathVariable int id) {
        return new ResponseEntity<>("A movie rating with id#"+id+" is updated", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getMovie(@PathVariable int id) {
        return new ResponseEntity<>("The with id#"+id+" is found", HttpStatus.OK);
    }
}
