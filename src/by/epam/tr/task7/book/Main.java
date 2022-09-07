package by.epam.tr.task7.book;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 9. Создать класс Book, спецификация которого приведена ниже. Определить
		 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
		 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
		 * Задать критерии выбора данных и вывести эти данные на консоль.
		 * 
		 * Book : id, название, автор(ы), издательство, год издания, количество страниц,
		 * цена, тип переплета. Найти и вывести: a ) список книг заданного автора; b )
		 * список книг, выпущенных заданным издательством; c ) список книг, выпущенных
		 * после заданного года.
		 */

		String selectedAuthor = "Кр.Старк";
		String selectedPublisher = "АСТ";
		int selectedYear = 2019;

		Book b1 = new Book(1, "1984", "Дж.Оруэл", "АСТ", 2022, 320, 17, "мягкий");
		Book b2 = new Book(2, "Цианид", "Кр.Старк", "АСТ", 2022, 448, 32, "твердый");
		Book b3 = new Book(3, "Стигмалион", "Кр.Старк", "АСТ", 2019, 480, 34, "твердый");
		Book b4 = new Book(4, "Морфий", "М.Булгаков", "АСТ", 2016, 256, 15, "мягкий");
		Book b5 = new Book(5, "Желание", "Тр.Вульф", "Like book", 2022, 752, 36, "твердый");
		Book b6 = new Book(6, "Аспид", "Кр.Старк", "АСТ", 2020, 480, 34, "твердый");
		Book b7 = new Book(7, "Финансист", "Т.Драйзер", "АСТ", 2019, 576, 31, "твердый");
		Book b8 = new Book(8, "Знак бяды", "В.Быков", "Попурри", 2022, 320, 27, "твердый");
		Book b9 = new Book(9, "Шантарам", "Г.Д.Робертс", "Азбука", 2013, 1088, 25, "мягкий");
		Book b10 = new Book(10, "Сияние", "Ст.Кинг", "АСТ", 2020, 544, 44, "твердый");

		List<Book> catalog = new ArrayList<>();

		catalog.add(b1);
		catalog.add(b2);
		catalog.add(b3);
		catalog.add(b4);
		catalog.add(b5);
		catalog.add(b6);
		catalog.add(b7);
		catalog.add(b8);
		catalog.add(b9);
		catalog.add(b10);

		BookStore bs = new BookStore(catalog);

		System.out.println("Каталог книг:");
		bs.printBook(catalog);

		System.out.println("Книги отсортированные по автору:");
		bs.setSelectedAuthor(selectedAuthor);
		bs.printBook(bs.sortAuthor());

		System.out.println("Книги отсортированные по издательству:");
		bs.setSelectedPublisher(selectedPublisher);
		bs.printBook(bs.sortPublisher());

		System.out.println("Книги отсортированные по году издания:");
		bs.setSelectedYear(selectedYear);
		bs.printBook(bs.sortYear());
	}
}
