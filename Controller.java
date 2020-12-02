package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;


public class Controller {
    ArrayList<Train> list = new ArrayList<>();
    ArrayList<Train> temp_list = new ArrayList<>();
    @FXML
    private TextField destination_a;
    @FXML
    private TextField destination_b;
    @FXML
    private TextField destination_c;
    @FXML
    private TextField time_b;
    @FXML
    private TextField input;
    @FXML
    private TextArea text_area_a;
    @FXML
    private TextField name_file_a;
    @FXML
    private TextArea text_area_b;
    @FXML
    private TextField name_file_b;
    @FXML
    private TextArea text_area_c;
    @FXML
    private TextField name_file_c;


    @FXML
    public void clickInput(ActionEvent actionEvent) {
            try (BufferedReader reader = new BufferedReader(new FileReader(input.getText()))) {
                String currentLine;
                Train a;
                list.clear();
                while ((currentLine = reader.readLine()) != null) {
                    String[] split;
                    split = currentLine.trim().split(" +");
                    a = new Train(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]));
                    list.add(a);
                }
            } catch (IOException e) {
                System.err.println("File don`t read!");
            }
    }

    @FXML
    public void searchListTrain(ActionEvent actionEvent) {
        temp_list.clear();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDestination().equalsIgnoreCase(destination_a.getText())) {
                temp_list.add(list.get(i));
            }
        }
        text_area_a.clear();
        text_area_a.appendText(temp_list.toString());
    }

    @FXML
    public void searchListTrainTime(ActionEvent actionEvent) {
        temp_list.clear();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDestination().equalsIgnoreCase(destination_b.getText())) {
                if (list.get(i).getDepartureTime() >= Integer.parseInt(time_b.getText()))
                    temp_list.add(list.get(i));
            }
        }
        text_area_b.clear();
        text_area_b.appendText(temp_list.toString());
    }

    @FXML
    public void searchListTrainSeats(ActionEvent actionEvent) {
        temp_list.clear();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDestination().equalsIgnoreCase(destination_c.getText())) {
                if (list.get(i).getNumberOfSeatsCommon() > 0)
                    temp_list.add(list.get(i));
            }
        }
        text_area_c.clear();
        text_area_c.appendText(temp_list.toString());
    }

    @FXML
    public void save_a(ActionEvent actionEvent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name_file_a.getText()))){
             writer.write(text_area_a.getText());
        }catch(IOException e){
            System.err.println("File don`t write!");
        }
    }

    @FXML
    public void save_b(ActionEvent actionEvent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name_file_b.getText()))){
             writer.write(text_area_b.getText());
        }catch(IOException e){
            System.err.println("File don`t write!");
        }
    }

    @FXML
    public void save_c(ActionEvent actionEvent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(name_file_c.getText()))){
             writer.write(text_area_c.getText());
        }catch(IOException e){
            System.err.println("File don`t write!");
        }
    }
}
