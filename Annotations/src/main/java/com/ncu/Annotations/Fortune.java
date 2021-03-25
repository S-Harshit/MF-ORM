package com.ncu.Annotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Fortune implements Ifortune {

	public void getFortune() throws IOException {

		ArrayList<String> list = new ArrayList<String>();
		File file = new File("D:\\College\\sem 4\\MF&ORM\\Practical\\Annotations\\src\\main\\java\\com\\ncu\\Annotations\\fortune");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			list.add(st);
		}
		Random rand = new Random();
		System.out.println(list.get(rand.nextInt(7)));
	}

}
