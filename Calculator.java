import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.lang.Character;

public class Calculator extends Application {
	
	private TextField number1 = new TextField();
	private TextField number2 = new TextField();
	private TextField result = new TextField();
	
	private Label equation = new Label();
	
	private Button btAdd = new Button("+");
	private Button btSub = new Button("-");
	private Button btMult = new Button("*");
	private Button btDivi = new Button("/");
	private Button btExpo = new Button("^");
	
	@Override
	public void start(Stage primaryStage) {
			
		GridPane pane = new GridPane();
		
		internalGUI(pane);
		setWidth();
		actions();
		
		Scene scene = new Scene(pane, 500, 250);
		primaryStage.setTitle("Object Oriented Programming - Calculator Project");
		primaryStage.setScene(scene); 
		primaryStage.show();
	}
	
	private void internalGUI(GridPane pane) {
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		pane.add(number1, 0, 0);
		pane.add(number2, 1, 0);
		pane.add(result, 2, 0);
			result.setEditable(false);
		
		pane.add(btAdd, 0, 2);
		pane.add(btSub, 1, 2);
		pane.add(btMult, 0, 3);
		pane.add(btDivi, 1, 3);
		pane.add(btExpo, 0, 4);
		
		pane.add(equation, 0, 5);
		equation.setAlignment(Pos.BOTTOM_CENTER);
		equation.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
	}
	
	private void setWidth() {
		btAdd.setPrefWidth(140);
		btSub.setPrefWidth(140);
		btMult.setPrefWidth(140);
		btDivi.setPrefWidth(140);
		btExpo.setPrefWidth(140);
		
		number1.setPrefWidth(70);
		number2.setPrefWidth(70);
		result.setPrefWidth(105);
		
		equation.setPrefWidth(140);
	}
	
	private void add() {
		result.setText(String.valueOf(Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText())));
	}
	
	private void sub() {
		result.setText(String.valueOf(Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText())));
	}
	
	private void mult() {
		result.setText(String.valueOf(Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText())));
	}
	
	private void divi() {
		result.setText(String.valueOf(Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText())));
	}
	
	private void expo() {
		result.setText(String.valueOf(Math.pow(Double.parseDouble(number1.getText()), Double.parseDouble(number2.getText()))));
	}
	
	private void actions() {
		btAdd.setOnAction(e -> add());
		btSub.setOnAction(e -> sub());
		btDivi.setOnAction(e -> divi());
		btMult.setOnAction(e -> mult());
		btExpo.setOnAction(e -> expo());
	}
}