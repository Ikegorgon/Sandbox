package sandbox.view;

import sandbox.controller.*;
import sandbox.model.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SandboxPanel extends JPanel {
	private SandboxController app;
	private SandboxFrame frame;
	private Sandbox sandbox;
	private SpringLayout appLayout;
	private JLabel name;
	private ArrayList<JButton> buttonList;
	private JButton[] buttons;
	private JButton clear;
	private JButton erase;
	private JButton metal;
	private JButton sand;
	private JButton water;
	private JButton wood;
	private JButton lava;
	private JButton acid;
	private JButton gas;
	private JButton ice;
	
	public SandboxPanel() {
		
	}
	public SandboxPanel(SandboxController app) {
		super();
		setFont(new Font("Times New Roman", Font.PLAIN, 12));
		this.app = app;
		sandbox = new Sandbox(100, 100);
		appLayout = new SpringLayout();
		name = new JLabel("Sandbox");
		clear = new JButton("Clear");
		erase = new JButton("Erase");
		metal = new JButton("Metal");
		sand = new JButton("Sand");
		water = new JButton("Water");
		wood = new JButton("Wood");
		lava = new JButton("Lava");
		acid = new JButton("Acid");
		gas = new JButton("Gas");
		ice = new JButton("Ice");
		buttonList = new ArrayList<JButton>();
		buttonList.add(clear);
		buttonList.add(erase);
		buttonList.add(metal);
		buttonList.add(sand);
		buttonList.add(water);
		buttonList.add(wood);
		buttonList.add(lava);
		buttonList.add(acid);
		buttonList.add(gas);
		buttonList.add(ice);
		buttons = new JButton[buttonList.size()];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = buttonList.get(i);
		}
		setupLayout();
		setupPanel();
		setupListeners();
	}
	private void setupLayout()  {
		
	}
	private void setupPanel() {
		this.setBackground(Color.DARK_GRAY);
		this.setLayout(appLayout);
		this.add(name);
		this.add(clear);
		this.add(erase);
		this.add(metal);
		this.add(sand);
		this.add(water);
		this.add(wood);
		this.add(lava);
		this.add(acid);
		this.add(gas);
		this.add(ice);
	}
	private void setupListeners() {
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		erase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		metal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		sand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		wood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		lava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		acid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		gas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
		ice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
	}
}
