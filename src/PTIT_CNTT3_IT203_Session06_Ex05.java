public class PTIT_CNTT3_IT203_Session06_Ex05 {
	static class Book {
		private String id;
		private String title;
		private double price;

		public Book(String id, String title, double price) {
			this.id = id;
			this.title = title;
			this.price = price;
		}

		public void displayInfo() {
			System.out.println("ID: " + id);
			System.out.println("Title: " + title);
			System.out.println("Price: " + price);
			System.out.println("--------------------");
		}
	}

	public static void main(String[] args) {

		Book b1 = new Book("B01", "Java Basic", 120000);
		Book b2 = new Book("B02", "OOP with Java", 150000);

		b1.displayInfo();
		b2.displayInfo();
	}
}
