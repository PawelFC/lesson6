package com.futurecollars.lesson12;

import java.util.Objects;

public class Book implements Comparable {

  private String title;
  private int pages;

  public Book(String title, int pages) {
    this.title = title;
    this.pages = pages;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Book)) return false;
    Book book = (Book) o;
    return pages == book.pages && Objects.equals(title, book.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, pages);
  }

  @Override
  public String toString() {
    return "Book{" + "title='" + title + '\'' + ", pages=" + pages + '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Book) {
      Book book = (Book) o;

      if (this.getPages() == book.getPages()) {
        return 0;
      } else if (this.getPages() > book.getPages()) {
        return 1;
      } else {
        return -1;
      }
    } else {
      throw new IllegalArgumentException("Cannot compare book with " + o.getClass());
    }
  }
}
