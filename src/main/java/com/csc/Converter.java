package com.csc;

public class Converter {

  public String toPounds(int ounces) {
    String ansPhrase = String.format("%.4f", (float) ounces / 16);
    if (ansPhrase.equals("1.0000")) {
      return (ansPhrase + " lb");
    }
    else {
      return (ansPhrase + " lbs");
    }
  }

  public String toPoundsAndOunces(int ounces) {
    int poundsAns = ounces / 16;
    int ouncesAns = ounces % 16;  

    if (poundsAns == 1) {
      return (Integer.toString(poundsAns) + " lb " + Integer.toString(ouncesAns) + " oz");
    }
    else {
      return (Integer.toString(poundsAns) + " lbs " + Integer.toString(ouncesAns) + " oz");
    }
  }
}
