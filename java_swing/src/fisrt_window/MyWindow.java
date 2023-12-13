// tao cua so chuong trinh java dau tien

package fisrt_window;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	// them so seria version 
	private static final long serialVersionUID = 1L;

	public MyWindow() {
		
	}
	
	public void showWindow(String title, int width, int height) {
		
		//set tiltle
		this.setTitle(title);
		
		//set kich thuoc cua so
		this.setSize(width, width);
		
		// set vi tri xuat hien
		this.setLocation(200, 100);
		
		//set mac dinh an nut close de thoat chuong trinh
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// cho phep hien thi hien thi
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		// tao doi tuong window
		MyWindow w = new MyWindow();
		w.showWindow("Window Title", 300, 400);
	}
}
