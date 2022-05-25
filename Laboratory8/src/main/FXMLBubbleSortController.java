/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Esteban
 */
public class FXMLBubbleSortController implements Initializable {
    
    Integer array[];

    @FXML
    private TableView<List<String>> bubbleSortTableView;
    @FXML
    private TextField iteractionsTextField;
    @FXML
    private TableView<List<String>> finalBubbleSortTableView;
    @FXML
    private BorderPane bp;
    @FXML
    private TableColumn<List<String>, String> tableColumn0;
    @FXML
    private TableColumn<List<String>, String> tableColumn1;
    @FXML
    private TableColumn<List<String>, String> tableColumn2;
    @FXML
    private TableColumn<List<String>, String> tableColumn3;
    @FXML
    private TableColumn<List<String>, String> tableColumn4;
    @FXML
    private TableColumn<List<String>, String> tableColumn5;
    @FXML
    private TableColumn<List<String>, String> tableColumn6;
    @FXML
    private TableColumn<List<String>, String> tableColumn7;
    @FXML
    private TableColumn<List<String>, String> tableColumn8;
    @FXML
    private TableColumn<List<String>, String> tableColumn9;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn0;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn1;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn2;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn3;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn4;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn5;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn6;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn7;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn8;
    @FXML
    private TableColumn<List<String>, String> finalTableColumn9;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.array = new Integer[10];
        util.Utility.fill(this.array);
        
        //BubbleSort TableView
        this.tableColumn0.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.tableColumn1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(1));
            }
        });
        this.tableColumn2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(2));
            }
        });
        this.tableColumn3.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(3));
            }
        });
        this.tableColumn4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(4));
            }
        });
        this.tableColumn5.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(5));
            }
        });
        this.tableColumn6.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(6));
            }
        });
        this.tableColumn7.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(7));
            }
        });
        this.tableColumn8.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(8));
            }
        });
        this.tableColumn9.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(9));
            }
        });
        
        if (array!=null) {
            this.bubbleSortTableView.setItems(getData());
        }
        
        //FinalBubbleSort TableView
        this.finalTableColumn0.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(0));
            }
        });
        this.finalTableColumn1.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(1));
            }
        });
        this.finalTableColumn2.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(2));
            }
        });
        this.finalTableColumn3.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(3));
            }
        });
        this.finalTableColumn4.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(4));
            }
        });
        this.finalTableColumn5.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(5));
            }
        });
        this.finalTableColumn6.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(6));
            }
        });
        this.finalTableColumn7.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(7));
            }
        });
        this.finalTableColumn8.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(8));
            }
        });
        this.finalTableColumn9.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<List<String>, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TableColumn.CellDataFeatures<List<String>, String> data) {
                return new ReadOnlyObjectWrapper<>(data.getValue().get(9));
            }
        });
        
    }    
    
    private ObservableList<List<String>> getData() {

        ObservableList<List<String>> data = FXCollections.observableArrayList();
        List<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(String.valueOf(array[i]));
        }
        data.add(arrayList);
        
        return data;
    }
    
    public void bubbleSort(Integer a[]){
        int iteractionCounter=0;//iteractions counter
	for(int i=1;i<a.length;i++)
            for(int j=0;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                    int aux=a[j];
                    a[j]=a[j+1];
                    a[j+1]=aux;
		}//if
                iteractionCounter++; //incremento el num de iteraciones
            }//for j
        this.iteractionsTextField.setText(String.valueOf(iteractionCounter));//metemos el txtfield en el metodo
    }

    @FXML
    private void startButtomOnAction(ActionEvent event) {
        this.bubbleSort(array);
        if (array!=null) {
            this.finalBubbleSortTableView.setItems(getData());
        }
    }

    @FXML
    private void randomButtomOnAction(ActionEvent event) {
        util.Utility.fill(this.array);//volvemos a llenar el arreglo
        this.bubbleSortTableView.setItems(getData());//volvemos a llenar el table view
        this.iteractionsTextField.setText("");
        this.finalBubbleSortTableView.setItems(null);//limpiamos el contenido del tableview
    }
    
}
