package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;
    private final String myMessage;


    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes, String theMessage) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
        this.myMessage = theMessage;
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote() + this.myMessage;
    }
}
