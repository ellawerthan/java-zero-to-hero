package ee.itcollage.level11;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> nouns = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWordType() == Word.WordType.NOUN) {
                nouns.add(words.get(i));
            }
        }
        return nouns;
    }

    public Word getFirstVerb(List<Word> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWordType() == Word.WordType.VERB) {
                return words.get(i);
            }
        }
        return null;
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWordType() == type) {
                return words.get(i);
            }
        }
        return null;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        List<Word> notNouns = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).getWordType() != Word.WordType.NOUN) {
                notNouns.add(words.get(i));
            }
        }
        return notNouns;
    }

    public List<String> getNounStrings(List<Word> words){
        List<Word> nouns = getNouns(words);
        List<String> nounStrings = new ArrayList<>();
        for (int i = 0; i < nouns.size(); i++) {
            nounStrings.add(nouns.get(i).getWord());
        }
        return nounStrings;
    }

    public String getFirstVerbString(List<Word> words) {
        Word firstVerb = getFirstVerb(words);
        String firstVerbString = firstVerb.getWord();
        return firstVerbString;
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        Word first = getFirstOfType(words, type);
        return first.getWord();
    }
}
