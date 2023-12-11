package Day3_29_11_23;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7_loops {
    public static void main(String[] args) {
        // 1
        String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        for (String weekday : arr) {
//            System.out.println(weekday);
//        }

        // 2
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
        String dayOfWeek = currentDate.format(formatter);
//        for(int i=0; i<arr.length; i++){
//            if(dayOfWeek.equals(arr[i])){
//                continue;
//            }
//            System.out.println(arr[i]);
//        }

        // 3
         formatter = DateTimeFormatter.ofPattern("MMM-dd");
         LocalDate startDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1);

         do{
             System.out.println(startDate.format(formatter));
             startDate = startDate.plusDays(1);
         } while (startDate.isBefore(currentDate.plusDays(1)));
    }
}
