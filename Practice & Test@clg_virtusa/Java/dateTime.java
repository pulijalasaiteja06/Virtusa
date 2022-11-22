import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class dateTime{
public static void main(String[] args){
LocalDate d=LocalDate.now();
System.out.println(d);
LocalTime t=LocalTime.now();
System.out.println(t);
LocalDateTime dt=LocalDateTime.now();
System.out.println(dt);
DateTimeFormatter n=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
String m=dt.format(n);
System.out.println(m);

}
}