/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package rc.tvseriesapp;

import java.util.Scanner;

public class TVseriesApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Series series = new Series();

        System.out.println("LATEST SERIE - 2025");
        System.out.println("----------------------------------");
        System.out.print("Etner (1) to launch menu or other key to exit: ");

        int start = input.nextInt();
        input.nextLine();

        if (start != 1) {
            System.out.println("Exiting application...");
            return;
        }

        int option = 0;

        while (option != 6) {
            System.out.println("\nMENU");
            System.out.println("(1) Capture a new series");
            System.out.println("(2) Search for a series");
            System.out.println("(3) Update series");
            System.out.println("(4) Delete a series");
            System.out.println("(5) Print report");
            System.out.println("(6) Exit");

            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {

                case 1:
                    series.captureSeries(input);
                    System.out.print("Enter  (1) to launch the menu or enter any other key to exit ");
                    int ch = input.nextInt();
                    if (ch == 1) {

                    } else {
                        break;
                    }
                    break;
                case 2:
                    series.searchSeries(input);
                    break;

                case 3:
                    series.updateSeries(input);
                    break;

                case 4:
                    series.deleteSeries(input);
                    break;

                case 5:
                    series.printReport();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
