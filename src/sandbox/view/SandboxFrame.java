package sandbox.view;

import sandbox.controller.*;
import java.awt.*;
import javax.swing.*;

public class SandboxFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private SandboxController app;
	private SandboxPanel appPanel;
	public SandboxFrame() {
		
	}
	public SandboxFrame(SandboxController app) {
		super();
		this.app = app;
		appPanel = new SandboxPanel(app);
		setupFrame();
	}
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setTitle("Sandbox");
		this.setSize(750, 750);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setName("Sandbox");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass()
				.getResource("/sandbox/view/images/sandboxIcon.png")));
	}
	public SandboxController getController() {
		return app;
	}
}
