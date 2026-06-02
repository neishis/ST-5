package com.mycompany.app;

public class Sqrt
{
   double delta = 0.00000001;
   double arg;

   public Sqrt(double arg) {
      this.arg = arg;
   }

   public double average(double x, double y) {
      return 0.5 * (x + y);
   }

   public boolean good(double guess, double x) {
      return Math.abs(guess * guess - x) < delta;
   }

   public double improve(double guess, double x) {
      double improvedValue = x / guess;
      return average(guess, improvedValue);
   }

   public double iter(double guess, double x) {
      if (good(guess, x)) {
         return guess;
      } else {
         return iter(improve(guess, x), x);
      }
   }

   public double calc() {
      return iter(1.0, this.arg);
   }
}
