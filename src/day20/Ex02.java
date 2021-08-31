package day20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Ex02 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
		Label lb =new Label("hello world!!");
		lb.setFont(new Font(40) );
		Scene scene =new Scene(lb,300,200);
		
		arg0.setScene(scene);
		arg0.setTitle("연습증" );
		arg0.show();
	}
}