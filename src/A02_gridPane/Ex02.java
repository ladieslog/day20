package A02_gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Ex02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gridpane=new GridPane();
		Button button =new Button("Button");
		GridPane.setConstraints(button, 2, 0);
		
		Label label =new Label("Label");
		GridPane.setConstraints(button, 2, 1);
		
		gridpane.getChildren().addAll(button,label);
		Button btn =new Button("1, 0");
		gridpane.add(btn, 1, 0);
		gridpane.add(new Label("0, 1"), 0, 1);
		
		gridpane.setPadding(new Insets(20));
		gridpane.setHgap(90);
		gridpane.setVgap(20);
		
		arg0.setScene(new Scene(gridpane,400,300));	
		
		FlowPane flowPane =new FlowPane();
		flowPane.getChildren().add(new Button("merge col(0),row(2)"));
		flowPane.setStyle("-fx-background-color:black;");
		flowPane.setAlignment(Pos.CENTER);
		//gridpane.add(flowPane, 0, 2,2,1);
		arg0.show();	
	}
}





