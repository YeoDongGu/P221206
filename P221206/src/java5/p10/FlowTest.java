package java5.p10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
	private Frame frame;
	private Button button1, button2, button3, btn4, btn5, btn6;

	public FlowTest() {
		frame = new Frame("Flowlayout exampe");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
		btn4 = new Button("4");
		btn5 = new Button("5");
		btn6 = new Button("6");
	}

	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}
}
