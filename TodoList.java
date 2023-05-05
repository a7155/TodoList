import java.util.Queue;
import java.util.LinkedList;

public class TodoList {
  public static void main(String[] args) {
    // Inisialisasi queue
    Queue<String> todolist = new LinkedList<String>();

    // Menambahkan kegiatan ke dalam queue
    todolist.add("Bangun tidur");
    todolist.add("Mandi");
    todolist.add("Sholat Shubuh");
    todolist.add("Sarapan");
    todolist.add("Bekerja");
    todolist.add("Sholat Dzuhur");
    todolist.add("Makan siang");
    todolist.add("Bekerja");
    todolist.add("Pulang Kerja");
    todolist.add("Mandi");
    todolist.add("Sembahyang Ashar");
    todolist.add("Berolahraga");
    todolist.add("Mandi");
    todolist.add("Sholat Magrib");
    todolist.add("Makan malam");
    todolist.add("Istirahat");
    todolist.add("Sholat Isya");
    todolist.add("Tidur");

    // Menampilkan kegiatan dari queue
    System.out.println("Rutinitas harian:");
    while (!todolist.isEmpty()) {
      System.out.println(todolist.poll());
    }
  }
}