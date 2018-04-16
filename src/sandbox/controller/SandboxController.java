package sandbox.controller;

import sandbox.view.*;
import sandbox.model.*;

public class SandboxController {
	private SandboxFrame appFrame;
	private Sandbox sandbox;
	public void start() {
		appFrame = new SandboxFrame(this);
		sandbox = new Sandbox(100, 100);
	}
	public SandboxFrame getFrame() {
		return appFrame;
	}
	public Sandbox getSandbox() {
		return sandbox;
	}
}
