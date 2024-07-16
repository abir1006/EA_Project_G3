package app.demoapppost;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    @GetMapping
    public ResponseEntity<String> getPosts() {
        return new ResponseEntity<>("This is collection of posts", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addPost() {
        return new ResponseEntity<>("A post is added", HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePost(@PathVariable int id) {
        return new ResponseEntity<>("A post with id#"+id+" is deleted", HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updatePost(@PathVariable int id) {
        return new ResponseEntity<>("A post with id#"+id+" is updated", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getPost(@PathVariable int id) {
        return new ResponseEntity<>("A post with id#"+id+" is found", HttpStatus.OK);
    }
}
