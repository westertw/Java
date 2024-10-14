package OOP.bookshelf.books;

public class Book {

    public String title;
    private int pageCount;
    private Author author;





    public void setPageCount(int count) {
        if (count < 10) {
            throw  new IllegalArgumentException("значение не может быть меньше 10"); // программа сгенерирует ошибку
        }
        pageCount = count;
    }

    public int getPageCount() {
        return pageCount;
    }


    public void setAuthor(Author author) {
        if (author == null) {
            throw  new IllegalArgumentException("author не может быть null");
        }
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", author=" + author +
                '}';
    }
}
