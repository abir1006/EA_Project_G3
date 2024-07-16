package musicStreaming;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/music")
public class MusicController {

        @RequestMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to the Music API!";
        }

        @RequestMapping("/goodbye")
        public String sayGoodbye() {
            return "Goodbye, thank you for using the Music API!";
        }

        @RequestMapping("/info")
        public String getInfo() {
            return "This is the Music API. It is used to manage music tracks and playlists in a music streaming application.";
        }

        @RequestMapping("/play")
        public String playMusic() {
            return "Playing music!";
        }

        @RequestMapping("/pause")
        public String pauseMusic() {
            return "Music paused!";
        }

        @RequestMapping("/skip")
        public String skipTrack() {
            return "Track skipped!";
        }

        @RequestMapping("/like")
        public String likeTrack() {
            return "Track liked!";
        }

        @RequestMapping("/dislike")
        public String dislikeTrack() {
            return "Track disliked!";
        }
}
