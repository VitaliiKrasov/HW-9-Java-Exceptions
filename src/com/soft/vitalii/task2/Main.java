package com.soft.vitalii.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < plants.length; i++)
        try {
            System.out.println("Enter size of " + i + " plant");
            int size = Integer.parseInt(br.readLine());
            System.out.println("Enter color of " + i + " plant");
            Color color = Color.getColor(br.readLine());
            System.out.println("Enter type of " + i + " plant");
            Type type = Type.getType(br.readLine());
            plants[i] = new Plant(size, color, type);
            System.out.println(plants[i] + " added");
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }
    }

}
