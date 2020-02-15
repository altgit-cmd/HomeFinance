package model;

import exception.ModelException;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Article extends Common {
    private  String title;

    public Article(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return getTitle().equals(article.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle());
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Article (@NotNull String title) throws ModelException{
        if (title.length() == 0) throw new  ModelException(ModelException.TITLE_EMPTY);
        this.title = title;
    }

    @Override
    public String getValueFromComboBox() {
        return title;
    }
}
