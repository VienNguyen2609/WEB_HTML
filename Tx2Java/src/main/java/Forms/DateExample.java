/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Forms;

import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class DateExample {
   public static void main(String[] args) {
        JFrame frame = new JFrame("Date Format Example");
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField dateField = new JFormattedTextField(format);
        dateField.setColumns(10);

        frame.add(dateField);
        frame.setVisible(true);
    }
}
