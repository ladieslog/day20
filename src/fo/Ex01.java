package fo;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ex01 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		int i;
		FlowPane flowpane =new FlowPane();
		for (i=1;i<=3;i++) {
		
			Button btn =new Button("버튼"+i);
			flowpane.getChildren().add(btn);
		}
		
		/*
		Button btn01 =new Button("버튼01");
		Button btn02 =new Button("버튼02");
		Button btn03 =new Button("버튼03");
		
		flowpane.getChildren().add(btn01);
		flowpane.getChildren().add(btn02);
		flowpane.getChildren().add(btn03);*/
		
		Scene sc=new Scene(flowpane,200,100); 
		
		arg0.setScene(sc);
		arg0.show();
	}
}
