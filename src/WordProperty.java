import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class WordProperty {
    private final StringProperty wordTarget;
    private final StringProperty wordClass;
    private final StringProperty wordSpelling;
    private final StringProperty wordExplain;
    private final Word word;

    public WordProperty(Word word) {
        wordTarget = new SimpleStringProperty(word.getWordTarget());
        wordClass = new SimpleStringProperty(word.getWordClass());
        wordExplain = new SimpleStringProperty(word.getWordExplain());
        wordSpelling = new SimpleStringProperty(word.getWordSpelling());
        this.word = word;
    }

    public Word getWord() {
        return word;
    }

    public String getWordClass() {
        return wordClass.get();
    }

    public String getWordExplain() {
        return wordExplain.get();
    }

    public String getWordSpelling() {
        return wordSpelling.get();
    }

    public String getWordTarget() {
        return wordTarget.get();
    }

    public void setWordClass(String wordClass) {
        this.wordClass.set(wordClass);
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain.set(wordExplain);
    }

    public void setWordSpelling(String wordSpelling) {
        this.wordSpelling.set(wordSpelling);
    }

    public void setWordTarget(String wordTarget) {
        this.wordTarget.set(wordTarget);
    }

    public StringProperty wordClassProperty() {
        return wordClass;
    }

    public StringProperty wordExplainProperty() {
        return wordExplain;
    }

    public StringProperty wordSpellingProperty() {
        return wordSpelling;
    }

    public StringProperty wordTargetProperty() {
        return wordTarget;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordProperty that = (WordProperty) o;
        return word.equals(that.word);
    }

    public int hashCode() {
        int result = wordTarget.hashCode();
        result = 31 * result + wordClass.hashCode();
        result = 31 * result + wordSpelling.hashCode();
        result = 31 * result + wordExplain.hashCode();
        result = 31 * result + word.hashCode();
        return result;
    }


}
