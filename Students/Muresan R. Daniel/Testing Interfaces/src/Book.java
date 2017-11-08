
public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int nrOfPages;

	public Book(String title, String author, int nrOfPages) {
		this.title = title;
		this.author = author;
		this.nrOfPages = nrOfPages;
	}

	public int compareTo(Book otherbook) {
		if (this.nrOfPages < otherbook.getNrOfPages()) {
			return -1;
		} else if (this.nrOfPages == otherbook.getNrOfPages()) {
			return 0;
		} else {
			return 1;
		}
	}

	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getNrOfPages() {
		return this.nrOfPages;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setNrOfPages(int nrOfPages) {
		this.nrOfPages = nrOfPages;
	}
}
