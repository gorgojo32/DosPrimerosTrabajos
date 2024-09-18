
package primerproyecto1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;




//Estos ejercicios Son los 2dos que dejo

public class Casting {
      public static void main(String[] args) {
  // Ejemplo 1; convertir entero a doble
        int num1 = 10;
        double doubleNum = num1; // conversión implicíta
        System.out.println("Entero:" + num1);
        System.out.println("Doble:" + doubleNum);
        
        //Ejemplo 2: conversión de doble a entero
        double doubleNum2 = 10.05;
        int num2 = (int)doubleNum2; // conversión explicita
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Doble:" + doubleNum2);
        System.out.println("Entero:" + num2);
        
        // Ejemplo 3: conversión de char a entero
        char let = 'A';
        int letraEntero = (int)let; // conversión explicita
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Char:" + let);
        System.out.println("Entero:" + letraEntero);
        
        // Ejemplo 4: conversión de entero a char
        int num4 = 65;
        char le = (char)num4;
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Entero:" + num4);
        System.out.println("Char:" + le);
        
        //Ejemplo 5: conversión de string a entero
        String strnum1 = "123";
        int num5 = Integer.parseInt(strnum1);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("String:" + strnum1);
        System.out.println("Int:" + num5);
        
        //Ejemplo 6: conversión de entero a string
        int num6 = 456;
        String strnum2 = String.valueOf(num6);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Int:" + num6);
        System.out.println("String:" + strnum2);  
        
        //Ejemplo 7: conversión de float a double
        float fNum7 = 10.5f;
        double num7 = fNum7;
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Float:" + fNum7);
        System.out.println("Double:" + num7); 
        
        //Ejemplo 8: conversion de double a float
        double num8 = 12.5f;
        float fnum8 = (float)num8;
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Double:" + num8);
        System.out.println("Float:" + fnum8);
         
        // Ejemplo 9: conversion de string a double
        String string9 = "123.45";
        double num9 = Double.parseDouble(string9);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("String:" + string9);
        System.out.println("Double:" + num9);
        
        // Ejemplo 10: conversion de double a string

        double num10 = 546564.34;
        String string10 = String.valueOf(num10);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Double:" + num9);
        System.out.println("String:" + string9);
        
        // Ejemplo 11: conversion de string a boolean
        String str11 = "true";
        boolean bo11 = Boolean.parseBoolean(str11);
        
        // Ejemplo 12: conversion de boolean a string
        boolean bo12 = true;
        String str12 = String.valueOf(bo12);
        
        /*// Ejemplo 13: conversion de string a BigInteger
        String str13 = "12345678.987654321";
        BigDecimal biDecimal = new BigDecimal(str13);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("BigDecimal:" + biDecimal);
        
        //
        BigInteger biLenger = new BigInteger(str14);*/
        
        // Ejemplo 14: converion de String a localDate
        String str14 = "2024-07-09";
        LocalDate dia = LocalDate.parse(str14);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("LocalDate:" + dia);
        
        // Ejemplo 15: conversion de string a LocalDateTime
        String str15 = "2020-07-09T16:24:10";
        LocalDateTime diaHora = LocalDateTime.parse(str15);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("LocalDateTime:" + diaHora);
        
        // Ejemplo 16: conversion de string a LocalTime
        String str16 = "16:29:12";
        LocalTime tiempo = LocalTime.parse(str16);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("LocalTime:" + tiempo);
        
        // Ejemplo 17: de string a zonedDateTime;
        String str17 = "2024-07-09T16:34:10+01:00";
        ZonedDateTime zona = ZonedDateTime.parse(str17);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("ZonedDateTime:" + zona);
        
        // Ejemplo 18: conversion de string a Instant
        String str18 = "2023-07-09T16:39:10.00Z";
        Instant instant = Instant.parse(str18);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Instant:" + instant);
        
        // Ejemplo 19: conversion de string a period
        String str19 = "P2Y3M5D";
        Period periodo = Period.parse(str19);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Period:" + periodo);
        
        
        // Ejemplo 20: conversion de String a duratin
        String str20 = "PT20.345S";
        Duration duracion = Duration.parse(str20);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Duration:" + duracion);
        
        /*// Ejemplo 21: conversion de String a OffSetTime
        String str21 = "2024-07-10T01:04:20+03:00";
        OffSetTime offdatetime = OffSetTime.*/
       
        // Ejemplo 22: conversion de String a OffSetTime
        String str22 = "01:07:25+03:00";
        OffsetTime offset = OffsetTime.parse(str22);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("OffsetTime:" + offset);
        
        // Ejemplo 23: conversion de String a Year
        String str23 = "2024";
        Year year = Year.parse(str23);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("Year:" + year);
        
        // Ejemplo 24: conversion de String a YearMonth
        String str24 = "2024-07";
        YearMonth yearMonth = YearMonth.parse(str24);
        System.out.println("* * * * * * * * * * * * ");
        System.out.println("YearMonth:" + yearMonth);
          
      } 
}
