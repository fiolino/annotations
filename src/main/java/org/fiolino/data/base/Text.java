package org.fiolino.data.base;

import java.io.Serializable;

/**
 * A Text is a searchable text entry.
 * <p>
 * For indexing time, it contains a weight so that the boosting can be adjusted.
 * <p>
 * For query time, it contains snippets for the result.
 * <p>
 * Created by kuli on 29.12.15.
 */
public class Text implements Serializable {
  private static final long serialVersionUID = 4049506539379408699L;

  private String text = "";
  private String[] snippets;

  public static Text valueOf(String t) {
    return new Text(t);
  }

  protected Text() {
  }

  protected Text(String text) {
    setText(text);
  }

  private void setText(String text) {
    if (text == null) {
      text = "";
    }
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public String[] getSnippets() {
    return snippets;
  }

  public void setSnippets(String[] snippets) {
    this.snippets = snippets;
  }

  @Override
  public boolean equals(Object obj) {
    return obj != null && obj.getClass().equals(getClass()) && ((Text) obj).getText().equals(getText());
  }

  @Override
  public int hashCode() {
    return text.hashCode() * 31 + 1356746851;
  }

  @Override
  public String toString() {
    if (snippets == null) {
      return text;
    }
    StringBuilder sb = new StringBuilder();
    for (String s : snippets) {
      if (sb.length() > 0) {
        sb.append(" ... ");
      }
      sb.append(s);
    }

    return sb.toString();
  }
}
