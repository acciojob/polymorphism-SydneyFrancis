package com.driver;

public class Main {
  public static void main(String[] args) {
    Product p = new Product();
    System.out.println(p.product(10,15));
    System.out.println(p.product(10.3,2.5));
    System.out.println(p.product(10,20,50));
  }
  public static class Product{
    public Product(){

    }
    public static int product(int x,int y){
      return x*y;
    }
    public static int product(int x,int y,int z){
      return x*y*z;
    }

    public static double product(double x,double y){
      return  x*y;
    }

  }
    
}