/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nitro V
 */
public class DataStorage {
    // Limits
    public static final int MAX = 100;
    
    // Inventory Arrays
    public static String[] products = {"Rice", "Sugar", "Coffee", "Milk"};
    public static double[] prices = {50.0, 45.0, 30.0, 25.0};
    public static int[] stock = {20, 20, 20, 20};

    // Log Arrays
    public static String[] logNames = new String[MAX];
    public static int[] logQtys = new int[MAX];
    public static double[] logTotals = new double[MAX];
    public static int logIndex = 0; 
}