import java.util.Arrays;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SortMain extends Application {

	public void start(Stage primaryStage) {
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Array sorted");
		dialog.setContentText("Enter the lenght of the array");
		dialog.showAndWait();
		String size = dialog.getResult();
		final int SIZE = Integer.parseInt(size);
		String[] input = new String[SIZE];
		String[] unsortedArray = new String[SIZE];
		VBox box = new VBox();
		box.setSpacing(6);
		box.setPadding(new Insets(10, 10, 10, 10));
		Font font = new Font("Times New Roman", 20);
		TextField[] text = new TextField[SIZE];
		Label label = new Label("Input " + SIZE + " numbers");
		label.setFont(font);
		box.getChildren().add(label);
		int i = 0;
		for (i = 0; i < SIZE; i++) {
			text[i] = new TextField();
			box.getChildren().add(text[i]);

		}
		Button button = new Button("Sort");
		box.getChildren().addAll(button);
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Array Sorter");
		primaryStage.sizeToScene();
		primaryStage.show();
		button.setOnAction(e -> {
			primaryStage.close();
			for (int l = 0; l < text.length; l++) {
				unsortedArray[l] = text[l].getText();
				input[l] = text[l].getText();
			}
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText("The unsorted Array is:\n" + Arrays.toString(unsortedArray)
					+ "\nThe sorted Array is:\n" + Arrays.toString(Sort.sortArray(input)));
			alert.showAndWait();
		});

	}

}
