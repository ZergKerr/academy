package by.academy.classwork.lesson3;

public class Task4_HoursMinSec {

	// Продолжить пример, добавить расчет и вывод суток и недель.

	public static void main(String[] args) {
		int s = 5423000;
		int sec;
		int m;
		int min, h;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		int hours = h % 24;
		int d = (h - hours) / 24;
		int days = d % 7;
		int week = (d - days) / 7;

		System.out.println(week + " недель " + days + " дней " + hours + " часов " + min + " минут " + sec + " секунд");
	}
}
