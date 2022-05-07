package by.epam.training.module5.main;

import by.epam.training.module5.bean.Cave;
import by.epam.training.module5.bean.Dragon;
import by.epam.training.module5.menu.Menu;

/*
 *  Задача 4. 
 *	Создать консольное приложение, удовлетворяющее следующим требованиям:  
 *	• Приложение должно быть объектно-, а не процедурно-ориентированным.  
 *	• Каждый класс должен иметь отражающее смысл название и информативный состав.  
 *	• Наследование должно применяться только тогда, когда это имеет смысл.  
 *	• При кодировании должны быть использованы соглашения об оформлении кода java code convention.  
 *  • Классы должны быть грамотно разложены по пакетам.  
 *	• Консольное меню должно быть минимальным.  
 *  • Для хранения данных можно использовать файлы. 
 *
 *	Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере 
 *	дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
 *	выбора сокровищ на заданную сумму.
 */
public class Main {

	public static void main(String[] args) {
		Dragon dragon = new Dragon("Drogon", 123);
		Cave cave = new Cave("Drogon's cave", dragon);
		Menu menu = Menu.getInstance();
		
		menu.runMenu(cave);
		
		
	}

}
