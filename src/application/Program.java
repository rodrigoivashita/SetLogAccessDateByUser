package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Data;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the path of file: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<Data> set = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String[] field = line.split(" ");
				String userName = field[0];
				Date moment = Date.from(Instant.parse(field[1]));

				line = br.readLine();
			}

			System.out.println(set.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());

		}

	}
}
